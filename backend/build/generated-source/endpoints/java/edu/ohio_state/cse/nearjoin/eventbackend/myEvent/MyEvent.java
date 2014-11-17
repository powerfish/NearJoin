/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-10-28 17:08:27 UTC)
 * on 2014-11-17 at 14:24:56 UTC 
 * Modify at your own risk.
 */

package edu.ohio_state.cse.nearjoin.eventbackend.myEvent;

/**
 * Service definition for MyEvent (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link MyEventRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class MyEvent extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.19.0 of the myEvent library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://eternal-calling-763.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "myEvent/v1/eventrecord/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public MyEvent(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  MyEvent(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "addEvent".
   *
   * This request holds the parameters needed by the myEvent server.  After setting any optional
   * parameters, call the {@link AddEvent#execute()} method to invoke the remote operation.
   *
   * @param category
   * @param description
   * @param endDate
   * @param extraContactInfo
   * @param host
   * @param hostUrl
   * @param location
   * @param startDate
   * @param title
   * @return the request
   */
  public AddEvent addEvent(java.lang.Integer category, java.lang.String description, java.lang.String endDate, java.lang.String extraContactInfo, java.lang.String host, java.lang.String hostUrl, java.lang.String location, java.lang.String startDate, java.lang.String title) throws java.io.IOException {
    AddEvent result = new AddEvent(category, description, endDate, extraContactInfo, host, hostUrl, location, startDate, title);
    initialize(result);
    return result;
  }

  public class AddEvent extends MyEventRequest<Void> {

    private static final String REST_PATH = "addEvent";

    /**
     * Create a request for the method "addEvent".
     *
     * This request holds the parameters needed by the the myEvent server.  After setting any optional
     * parameters, call the {@link AddEvent#execute()} method to invoke the remote operation. <p>
     * {@link
     * AddEvent#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param category
     * @param description
     * @param endDate
     * @param extraContactInfo
     * @param host
     * @param hostUrl
     * @param location
     * @param startDate
     * @param title
     * @since 1.13
     */
    protected AddEvent(java.lang.Integer category, java.lang.String description, java.lang.String endDate, java.lang.String extraContactInfo, java.lang.String host, java.lang.String hostUrl, java.lang.String location, java.lang.String startDate, java.lang.String title) {
      super(MyEvent.this, "POST", REST_PATH, null, Void.class);
      this.category = com.google.api.client.util.Preconditions.checkNotNull(category, "Required parameter category must be specified.");
      this.description = com.google.api.client.util.Preconditions.checkNotNull(description, "Required parameter description must be specified.");
      this.endDate = com.google.api.client.util.Preconditions.checkNotNull(endDate, "Required parameter endDate must be specified.");
      this.extraContactInfo = com.google.api.client.util.Preconditions.checkNotNull(extraContactInfo, "Required parameter extraContactInfo must be specified.");
      this.host = com.google.api.client.util.Preconditions.checkNotNull(host, "Required parameter host must be specified.");
      this.hostUrl = com.google.api.client.util.Preconditions.checkNotNull(hostUrl, "Required parameter hostUrl must be specified.");
      this.location = com.google.api.client.util.Preconditions.checkNotNull(location, "Required parameter location must be specified.");
      this.startDate = com.google.api.client.util.Preconditions.checkNotNull(startDate, "Required parameter startDate must be specified.");
      this.title = com.google.api.client.util.Preconditions.checkNotNull(title, "Required parameter title must be specified.");
    }

    @Override
    public AddEvent setAlt(java.lang.String alt) {
      return (AddEvent) super.setAlt(alt);
    }

    @Override
    public AddEvent setFields(java.lang.String fields) {
      return (AddEvent) super.setFields(fields);
    }

    @Override
    public AddEvent setKey(java.lang.String key) {
      return (AddEvent) super.setKey(key);
    }

    @Override
    public AddEvent setOauthToken(java.lang.String oauthToken) {
      return (AddEvent) super.setOauthToken(oauthToken);
    }

    @Override
    public AddEvent setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (AddEvent) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public AddEvent setQuotaUser(java.lang.String quotaUser) {
      return (AddEvent) super.setQuotaUser(quotaUser);
    }

    @Override
    public AddEvent setUserIp(java.lang.String userIp) {
      return (AddEvent) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer category;

    /**

     */
    public java.lang.Integer getCategory() {
      return category;
    }

    public AddEvent setCategory(java.lang.Integer category) {
      this.category = category;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String description;

    /**

     */
    public java.lang.String getDescription() {
      return description;
    }

    public AddEvent setDescription(java.lang.String description) {
      this.description = description;
      return this;
    }

    @com.google.api.client.util.Key("end_date")
    private java.lang.String endDate;

    /**

     */
    public java.lang.String getEndDate() {
      return endDate;
    }

    public AddEvent setEndDate(java.lang.String endDate) {
      this.endDate = endDate;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String extraContactInfo;

    /**

     */
    public java.lang.String getExtraContactInfo() {
      return extraContactInfo;
    }

    public AddEvent setExtraContactInfo(java.lang.String extraContactInfo) {
      this.extraContactInfo = extraContactInfo;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String host;

    /**

     */
    public java.lang.String getHost() {
      return host;
    }

    public AddEvent setHost(java.lang.String host) {
      this.host = host;
      return this;
    }

    @com.google.api.client.util.Key("host_url")
    private java.lang.String hostUrl;

    /**

     */
    public java.lang.String getHostUrl() {
      return hostUrl;
    }

    public AddEvent setHostUrl(java.lang.String hostUrl) {
      this.hostUrl = hostUrl;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String location;

    /**

     */
    public java.lang.String getLocation() {
      return location;
    }

    public AddEvent setLocation(java.lang.String location) {
      this.location = location;
      return this;
    }

    @com.google.api.client.util.Key("start_date")
    private java.lang.String startDate;

    /**

     */
    public java.lang.String getStartDate() {
      return startDate;
    }

    public AddEvent setStartDate(java.lang.String startDate) {
      this.startDate = startDate;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String title;

    /**

     */
    public java.lang.String getTitle() {
      return title;
    }

    public AddEvent setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    @Override
    public AddEvent set(String parameterName, Object value) {
      return (AddEvent) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "addParticipant".
   *
   * This request holds the parameters needed by the myEvent server.  After setting any optional
   * parameters, call the {@link AddParticipant#execute()} method to invoke the remote operation.
   *
   * @param participant
   * @param title
   * @return the request
   */
  public AddParticipant addParticipant(java.lang.String participant, java.lang.String title) throws java.io.IOException {
    AddParticipant result = new AddParticipant(participant, title);
    initialize(result);
    return result;
  }

  public class AddParticipant extends MyEventRequest<Void> {

    private static final String REST_PATH = "addParticipant";

    /**
     * Create a request for the method "addParticipant".
     *
     * This request holds the parameters needed by the the myEvent server.  After setting any optional
     * parameters, call the {@link AddParticipant#execute()} method to invoke the remote operation.
     * <p> {@link AddParticipant#initialize(com.google.api.client.googleapis.services.AbstractGoogleCl
     * ientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param participant
     * @param title
     * @since 1.13
     */
    protected AddParticipant(java.lang.String participant, java.lang.String title) {
      super(MyEvent.this, "POST", REST_PATH, null, Void.class);
      this.participant = com.google.api.client.util.Preconditions.checkNotNull(participant, "Required parameter participant must be specified.");
      this.title = com.google.api.client.util.Preconditions.checkNotNull(title, "Required parameter title must be specified.");
    }

    @Override
    public AddParticipant setAlt(java.lang.String alt) {
      return (AddParticipant) super.setAlt(alt);
    }

    @Override
    public AddParticipant setFields(java.lang.String fields) {
      return (AddParticipant) super.setFields(fields);
    }

    @Override
    public AddParticipant setKey(java.lang.String key) {
      return (AddParticipant) super.setKey(key);
    }

    @Override
    public AddParticipant setOauthToken(java.lang.String oauthToken) {
      return (AddParticipant) super.setOauthToken(oauthToken);
    }

    @Override
    public AddParticipant setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (AddParticipant) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public AddParticipant setQuotaUser(java.lang.String quotaUser) {
      return (AddParticipant) super.setQuotaUser(quotaUser);
    }

    @Override
    public AddParticipant setUserIp(java.lang.String userIp) {
      return (AddParticipant) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String participant;

    /**

     */
    public java.lang.String getParticipant() {
      return participant;
    }

    public AddParticipant setParticipant(java.lang.String participant) {
      this.participant = participant;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String title;

    /**

     */
    public java.lang.String getTitle() {
      return title;
    }

    public AddParticipant setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    @Override
    public AddParticipant set(String parameterName, Object value) {
      return (AddParticipant) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "deleteEvent".
   *
   * This request holds the parameters needed by the myEvent server.  After setting any optional
   * parameters, call the {@link DeleteEvent#execute()} method to invoke the remote operation.
   *
   * @param title
   * @return the request
   */
  public DeleteEvent deleteEvent(java.lang.String title) throws java.io.IOException {
    DeleteEvent result = new DeleteEvent(title);
    initialize(result);
    return result;
  }

  public class DeleteEvent extends MyEventRequest<Void> {

    private static final String REST_PATH = "deleteEvent";

    /**
     * Create a request for the method "deleteEvent".
     *
     * This request holds the parameters needed by the the myEvent server.  After setting any optional
     * parameters, call the {@link DeleteEvent#execute()} method to invoke the remote operation. <p>
     * {@link
     * DeleteEvent#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param title
     * @since 1.13
     */
    protected DeleteEvent(java.lang.String title) {
      super(MyEvent.this, "DELETE", REST_PATH, null, Void.class);
      this.title = com.google.api.client.util.Preconditions.checkNotNull(title, "Required parameter title must be specified.");
    }

    @Override
    public DeleteEvent setAlt(java.lang.String alt) {
      return (DeleteEvent) super.setAlt(alt);
    }

    @Override
    public DeleteEvent setFields(java.lang.String fields) {
      return (DeleteEvent) super.setFields(fields);
    }

    @Override
    public DeleteEvent setKey(java.lang.String key) {
      return (DeleteEvent) super.setKey(key);
    }

    @Override
    public DeleteEvent setOauthToken(java.lang.String oauthToken) {
      return (DeleteEvent) super.setOauthToken(oauthToken);
    }

    @Override
    public DeleteEvent setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeleteEvent) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeleteEvent setQuotaUser(java.lang.String quotaUser) {
      return (DeleteEvent) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeleteEvent setUserIp(java.lang.String userIp) {
      return (DeleteEvent) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String title;

    /**

     */
    public java.lang.String getTitle() {
      return title;
    }

    public DeleteEvent setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    @Override
    public DeleteEvent set(String parameterName, Object value) {
      return (DeleteEvent) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "deleteParticipant".
   *
   * This request holds the parameters needed by the myEvent server.  After setting any optional
   * parameters, call the {@link DeleteParticipant#execute()} method to invoke the remote operation.
   *
   * @param participant
   * @param title
   * @return the request
   */
  public DeleteParticipant deleteParticipant(java.lang.String participant, java.lang.String title) throws java.io.IOException {
    DeleteParticipant result = new DeleteParticipant(participant, title);
    initialize(result);
    return result;
  }

  public class DeleteParticipant extends MyEventRequest<Void> {

    private static final String REST_PATH = "deleteParticipant";

    /**
     * Create a request for the method "deleteParticipant".
     *
     * This request holds the parameters needed by the the myEvent server.  After setting any optional
     * parameters, call the {@link DeleteParticipant#execute()} method to invoke the remote operation.
     * <p> {@link DeleteParticipant#initialize(com.google.api.client.googleapis.services.AbstractGoogl
     * eClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param participant
     * @param title
     * @since 1.13
     */
    protected DeleteParticipant(java.lang.String participant, java.lang.String title) {
      super(MyEvent.this, "DELETE", REST_PATH, null, Void.class);
      this.participant = com.google.api.client.util.Preconditions.checkNotNull(participant, "Required parameter participant must be specified.");
      this.title = com.google.api.client.util.Preconditions.checkNotNull(title, "Required parameter title must be specified.");
    }

    @Override
    public DeleteParticipant setAlt(java.lang.String alt) {
      return (DeleteParticipant) super.setAlt(alt);
    }

    @Override
    public DeleteParticipant setFields(java.lang.String fields) {
      return (DeleteParticipant) super.setFields(fields);
    }

    @Override
    public DeleteParticipant setKey(java.lang.String key) {
      return (DeleteParticipant) super.setKey(key);
    }

    @Override
    public DeleteParticipant setOauthToken(java.lang.String oauthToken) {
      return (DeleteParticipant) super.setOauthToken(oauthToken);
    }

    @Override
    public DeleteParticipant setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeleteParticipant) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeleteParticipant setQuotaUser(java.lang.String quotaUser) {
      return (DeleteParticipant) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeleteParticipant setUserIp(java.lang.String userIp) {
      return (DeleteParticipant) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String participant;

    /**

     */
    public java.lang.String getParticipant() {
      return participant;
    }

    public DeleteParticipant setParticipant(java.lang.String participant) {
      this.participant = participant;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String title;

    /**

     */
    public java.lang.String getTitle() {
      return title;
    }

    public DeleteParticipant setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    @Override
    public DeleteParticipant set(String parameterName, Object value) {
      return (DeleteParticipant) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listEvents".
   *
   * This request holds the parameters needed by the myEvent server.  After setting any optional
   * parameters, call the {@link ListEvents#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListEvents listEvents() throws java.io.IOException {
    ListEvents result = new ListEvents();
    initialize(result);
    return result;
  }

  public class ListEvents extends MyEventRequest<edu.ohio_state.cse.nearjoin.eventbackend.myEvent.model.CollectionResponseEventRecord> {

    private static final String REST_PATH = "listEvents";

    /**
     * Create a request for the method "listEvents".
     *
     * This request holds the parameters needed by the the myEvent server.  After setting any optional
     * parameters, call the {@link ListEvents#execute()} method to invoke the remote operation. <p>
     * {@link
     * ListEvents#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListEvents() {
      super(MyEvent.this, "GET", REST_PATH, null, edu.ohio_state.cse.nearjoin.eventbackend.myEvent.model.CollectionResponseEventRecord.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListEvents setAlt(java.lang.String alt) {
      return (ListEvents) super.setAlt(alt);
    }

    @Override
    public ListEvents setFields(java.lang.String fields) {
      return (ListEvents) super.setFields(fields);
    }

    @Override
    public ListEvents setKey(java.lang.String key) {
      return (ListEvents) super.setKey(key);
    }

    @Override
    public ListEvents setOauthToken(java.lang.String oauthToken) {
      return (ListEvents) super.setOauthToken(oauthToken);
    }

    @Override
    public ListEvents setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListEvents) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListEvents setQuotaUser(java.lang.String quotaUser) {
      return (ListEvents) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListEvents setUserIp(java.lang.String userIp) {
      return (ListEvents) super.setUserIp(userIp);
    }

    @Override
    public ListEvents set(String parameterName, Object value) {
      return (ListEvents) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listEventsByCategory".
   *
   * This request holds the parameters needed by the myEvent server.  After setting any optional
   * parameters, call the {@link ListEventsByCategory#execute()} method to invoke the remote
   * operation.
   *
   * @param category
   * @return the request
   */
  public ListEventsByCategory listEventsByCategory(java.lang.Integer category) throws java.io.IOException {
    ListEventsByCategory result = new ListEventsByCategory(category);
    initialize(result);
    return result;
  }

  public class ListEventsByCategory extends MyEventRequest<edu.ohio_state.cse.nearjoin.eventbackend.myEvent.model.CollectionResponseEventRecord> {

    private static final String REST_PATH = "listEventsByCategory";

    /**
     * Create a request for the method "listEventsByCategory".
     *
     * This request holds the parameters needed by the the myEvent server.  After setting any optional
     * parameters, call the {@link ListEventsByCategory#execute()} method to invoke the remote
     * operation. <p> {@link ListEventsByCategory#initialize(com.google.api.client.googleapis.services
     * .AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param category
     * @since 1.13
     */
    protected ListEventsByCategory(java.lang.Integer category) {
      super(MyEvent.this, "GET", REST_PATH, null, edu.ohio_state.cse.nearjoin.eventbackend.myEvent.model.CollectionResponseEventRecord.class);
      this.category = com.google.api.client.util.Preconditions.checkNotNull(category, "Required parameter category must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListEventsByCategory setAlt(java.lang.String alt) {
      return (ListEventsByCategory) super.setAlt(alt);
    }

    @Override
    public ListEventsByCategory setFields(java.lang.String fields) {
      return (ListEventsByCategory) super.setFields(fields);
    }

    @Override
    public ListEventsByCategory setKey(java.lang.String key) {
      return (ListEventsByCategory) super.setKey(key);
    }

    @Override
    public ListEventsByCategory setOauthToken(java.lang.String oauthToken) {
      return (ListEventsByCategory) super.setOauthToken(oauthToken);
    }

    @Override
    public ListEventsByCategory setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListEventsByCategory) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListEventsByCategory setQuotaUser(java.lang.String quotaUser) {
      return (ListEventsByCategory) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListEventsByCategory setUserIp(java.lang.String userIp) {
      return (ListEventsByCategory) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer category;

    /**

     */
    public java.lang.Integer getCategory() {
      return category;
    }

    public ListEventsByCategory setCategory(java.lang.Integer category) {
      this.category = category;
      return this;
    }

    @Override
    public ListEventsByCategory set(String parameterName, Object value) {
      return (ListEventsByCategory) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listEventsByHost".
   *
   * This request holds the parameters needed by the myEvent server.  After setting any optional
   * parameters, call the {@link ListEventsByHost#execute()} method to invoke the remote operation.
   *
   * @param host
   * @return the request
   */
  public ListEventsByHost listEventsByHost(java.lang.String host) throws java.io.IOException {
    ListEventsByHost result = new ListEventsByHost(host);
    initialize(result);
    return result;
  }

  public class ListEventsByHost extends MyEventRequest<edu.ohio_state.cse.nearjoin.eventbackend.myEvent.model.CollectionResponseEventRecord> {

    private static final String REST_PATH = "listEventsByHost";

    /**
     * Create a request for the method "listEventsByHost".
     *
     * This request holds the parameters needed by the the myEvent server.  After setting any optional
     * parameters, call the {@link ListEventsByHost#execute()} method to invoke the remote operation.
     * <p> {@link ListEventsByHost#initialize(com.google.api.client.googleapis.services.AbstractGoogle
     * ClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param host
     * @since 1.13
     */
    protected ListEventsByHost(java.lang.String host) {
      super(MyEvent.this, "GET", REST_PATH, null, edu.ohio_state.cse.nearjoin.eventbackend.myEvent.model.CollectionResponseEventRecord.class);
      this.host = com.google.api.client.util.Preconditions.checkNotNull(host, "Required parameter host must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListEventsByHost setAlt(java.lang.String alt) {
      return (ListEventsByHost) super.setAlt(alt);
    }

    @Override
    public ListEventsByHost setFields(java.lang.String fields) {
      return (ListEventsByHost) super.setFields(fields);
    }

    @Override
    public ListEventsByHost setKey(java.lang.String key) {
      return (ListEventsByHost) super.setKey(key);
    }

    @Override
    public ListEventsByHost setOauthToken(java.lang.String oauthToken) {
      return (ListEventsByHost) super.setOauthToken(oauthToken);
    }

    @Override
    public ListEventsByHost setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListEventsByHost) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListEventsByHost setQuotaUser(java.lang.String quotaUser) {
      return (ListEventsByHost) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListEventsByHost setUserIp(java.lang.String userIp) {
      return (ListEventsByHost) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String host;

    /**

     */
    public java.lang.String getHost() {
      return host;
    }

    public ListEventsByHost setHost(java.lang.String host) {
      this.host = host;
      return this;
    }

    @Override
    public ListEventsByHost set(String parameterName, Object value) {
      return (ListEventsByHost) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listParticipants".
   *
   * This request holds the parameters needed by the myEvent server.  After setting any optional
   * parameters, call the {@link ListParticipants#execute()} method to invoke the remote operation.
   *
   * @param title
   * @return the request
   */
  public ListParticipants listParticipants(java.lang.String title) throws java.io.IOException {
    ListParticipants result = new ListParticipants(title);
    initialize(result);
    return result;
  }

  public class ListParticipants extends MyEventRequest<edu.ohio_state.cse.nearjoin.eventbackend.myEvent.model.CollectionResponseString> {

    private static final String REST_PATH = "listParticipants";

    /**
     * Create a request for the method "listParticipants".
     *
     * This request holds the parameters needed by the the myEvent server.  After setting any optional
     * parameters, call the {@link ListParticipants#execute()} method to invoke the remote operation.
     * <p> {@link ListParticipants#initialize(com.google.api.client.googleapis.services.AbstractGoogle
     * ClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param title
     * @since 1.13
     */
    protected ListParticipants(java.lang.String title) {
      super(MyEvent.this, "GET", REST_PATH, null, edu.ohio_state.cse.nearjoin.eventbackend.myEvent.model.CollectionResponseString.class);
      this.title = com.google.api.client.util.Preconditions.checkNotNull(title, "Required parameter title must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListParticipants setAlt(java.lang.String alt) {
      return (ListParticipants) super.setAlt(alt);
    }

    @Override
    public ListParticipants setFields(java.lang.String fields) {
      return (ListParticipants) super.setFields(fields);
    }

    @Override
    public ListParticipants setKey(java.lang.String key) {
      return (ListParticipants) super.setKey(key);
    }

    @Override
    public ListParticipants setOauthToken(java.lang.String oauthToken) {
      return (ListParticipants) super.setOauthToken(oauthToken);
    }

    @Override
    public ListParticipants setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListParticipants) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListParticipants setQuotaUser(java.lang.String quotaUser) {
      return (ListParticipants) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListParticipants setUserIp(java.lang.String userIp) {
      return (ListParticipants) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String title;

    /**

     */
    public java.lang.String getTitle() {
      return title;
    }

    public ListParticipants setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    @Override
    public ListParticipants set(String parameterName, Object value) {
      return (ListParticipants) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link MyEvent}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link MyEvent}. */
    @Override
    public MyEvent build() {
      return new MyEvent(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link MyEventRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setMyEventRequestInitializer(
        MyEventRequestInitializer myeventRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(myeventRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
