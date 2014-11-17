package edu.osu.cse.nearjoin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import edu.ohio_state.cse.nearjoin.eventbackend.myEvent.model.EventRecord;

/**
 * Created by Fish on 11/14/2014.
 */
public class EventDetailsActivity extends Activity {

    private Button cancelButton;
    private Button postButton;
    private EditText titleEditText;
    private EditText timeEditText;
    private EditText durationEditText;
    private EditText locationEditText;
    private EditText categoryEditText;
    private EditText phoneEditText;
    private EditText descriptionEditText;
    private EditText participantsEditText;

    private boolean isHost;
    private boolean isJoined;

    EventRecord event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        event = new EventRecord();
        getIntentExtra();

        if (event.getHost().equals(MainActivity.userName) )
            isHost = true;
        else
            isHost = false;

        cancelButton = (Button) findViewById(R.id.cancel_browse_event_button);
        postButton = (Button) findViewById(R.id.post_browse_event_button);
        titleEditText = (EditText) findViewById(R.id.title_browse_event_editText);
        titleEditText.setText(event.getTitle());
        durationEditText = (EditText) findViewById(R.id.duration_browse_event_editText);
        durationEditText.setText(event.getEndDate());
        timeEditText = (EditText) findViewById(R.id.time_browse_event_editText);
        timeEditText.setText(event.getStartDate());
        locationEditText = (EditText) findViewById(R.id.location_browse_event_editText);
        locationEditText.setText(event.getLocation());
        categoryEditText = (EditText) findViewById(R.id.category_browse_event_editText);
        categoryEditText.setText(event.getCategory().toString());
        phoneEditText = (EditText) findViewById(R.id.phone_browse_event_editText);
        phoneEditText.setText(event.getExtraContactInfo());
        descriptionEditText = (EditText)findViewById(R.id.description_browse_event_editText);
        descriptionEditText.setText(event.getDescription());
        participantsEditText = (EditText)findViewById(R.id.participants_browse_event_editText);

        List<String> participants = event.getParticipants();
        StringBuilder builder = new StringBuilder(512);
        for(String participant: participants ){
            builder.append(participant);    builder.append(",");
        }
        participantsEditText.setText(builder.toString());
        participantsEditText.setEnabled(false);

        if(!isHost)
        {
            titleEditText.setEnabled(false);
            durationEditText.setEnabled(false);
            timeEditText.setEnabled(false);
            locationEditText.setEnabled(false);
            categoryEditText.setEnabled(false);
            phoneEditText.setEnabled(false);
            descriptionEditText.setEnabled(false);
            cancelButton.setEnabled(false);

            if(participants.contains(MainActivity.userName))
            {
                isJoined = true;
                postButton.setText("Drop");
            }
            else
            {
                isJoined = false;

                postButton.setText("Join");
            }

        }
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.cancel_browse_event_button:
                new AlertDialog.Builder(this)
                        .setTitle("Warning")
                        .setMessage("Do you really want to delete the event?")
                        .setNeutralButton("Delete It", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                GcmApiWrapper.deleteEvent(event.getTitle());
                                Toast.makeText(getApplicationContext(), "Event "+ event.getTitle() + "is deleted.", Toast.LENGTH_LONG).show();
                            }
                        })
                        .show();
                break;
            case R.id.post_browse_event_button:
                if(isHost)
                    updateEvent();
                else
                    if(isJoined)
                        dropEvent();
                    else
                        joinEvent();
                break;
            default:
                break;
        }
    }

    private void dropEvent()
    {
        GcmApiWrapper.deleteParticipant(event.getTitle(), MainActivity.userName);
    }
    private void joinEvent()
    {
        GcmApiWrapper.addParticipant(event.getTitle(), MainActivity.userName);
    }

    private void updateEvent()
    {
        String title = titleEditText.getText().toString();
        String time = timeEditText.getText().toString();
        String duration = durationEditText.getText().toString();
        String location = locationEditText.getText().toString();
        int category = Integer.parseInt(categoryEditText.getText().toString());
        String phone = phoneEditText.getText().toString();
        String description = descriptionEditText.getText().toString();

        // try to use Date picker and Time picker to get start time and duration
        //Calendar calendar = new GregorianCalendar();
        // TimeZone timeZone = calendar.getTimeZone();//TimeZone.getTimeZone("UTC")
/*
        Date startDate=new Date();
        startDate.setYear(2014 - 1900);
        startDate.setMonth(11 - 1);
        startDate.setDate(31);
        startDate.setHours(18 + 0);
        startDate.setMinutes(34);
        //Date endDate=new Date(startDate.getTime() + 20 * 3600000);
        DateTime start_date=new DateTime(startDate, timeZone);

        Date endDate = new Date();
        endDate.setYear (2014 - 1900);
        endDate.setMonth(11-1);
        endDate.setDate(31);
        endDate.setHours(21 + 0);
        endDate.setMinutes(20);
        DateTime end_date = new DateTime(endDate,timeZone);
*/

        EventRecord e = new EventRecord();
        e.setHost(MainActivity.userName);
        e.setHostUrl("");
        e.setTitle(title);
        e.setStartDate(time);
        e.setEndDate(duration);
        e.setLocation(location);
        e.setCategory(category);
        e.setExtraContactInfo(phone);
        e.setDescription(description);
        GcmApiWrapper.addEvent(e);
    }

    private void getIntentExtra() {
        Intent intent = getIntent();
        if (intent == null) {
            return ;
        }

        Bundle extras = intent.getExtras();
        if (extras == null) {
            return ;
        }

        event.setTitle(extras.getString("title"));
        event.setStartDate(extras.getString("time"));
        event.setLocation(extras.getString("location"));
        event.setHost(extras.getString("host"));
        event.setHostUrl(extras.getString("host_url"));
        event.setEndDate(extras.getString("duration"));
        event.setDescription(extras.getString("description"));
        event.setStatus(Integer.parseInt(extras.getString("status")));
        event.setExtraContactInfo(extras.getString("extraContactInfo"));
        String[] participantsArray = extras.getString("participants").split(",; ");
        ArrayList<String> participantsList = new ArrayList<String>();
        for(int i=0;i<participantsArray.length;i++)
            participantsList.add(participantsArray[i]);
        event.setParticipants(participantsList);
        event.setCategory(extras.getInt("category"));
    }
}