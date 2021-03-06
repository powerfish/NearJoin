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
 * on 2014-11-18 at 02:52:29 UTC 
 * Modify at your own risk.
 */

package edu.ohio_state.cse.nearjoin.eventbackend.myEvent.model;

/**
 * Model definition for EventRecord.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the myEvent. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EventRecord extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attendanceCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer category;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("end_date")
  private java.lang.String endDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String extraContactInfo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("host_url")
  private java.lang.String hostUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> participants;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("start_date")
  private java.lang.String startDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer status;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long timeStamp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> validatedParticipants;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAttendanceCode() {
    return attendanceCode;
  }

  /**
   * @param attendanceCode attendanceCode or {@code null} for none
   */
  public EventRecord setAttendanceCode(java.lang.String attendanceCode) {
    this.attendanceCode = attendanceCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCategory() {
    return category;
  }

  /**
   * @param category category or {@code null} for none
   */
  public EventRecord setCategory(java.lang.Integer category) {
    this.category = category;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public EventRecord setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDate() {
    return endDate;
  }

  /**
   * @param endDate endDate or {@code null} for none
   */
  public EventRecord setEndDate(java.lang.String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getExtraContactInfo() {
    return extraContactInfo;
  }

  /**
   * @param extraContactInfo extraContactInfo or {@code null} for none
   */
  public EventRecord setExtraContactInfo(java.lang.String extraContactInfo) {
    this.extraContactInfo = extraContactInfo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * @param host host or {@code null} for none
   */
  public EventRecord setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHostUrl() {
    return hostUrl;
  }

  /**
   * @param hostUrl hostUrl or {@code null} for none
   */
  public EventRecord setHostUrl(java.lang.String hostUrl) {
    this.hostUrl = hostUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * @param location location or {@code null} for none
   */
  public EventRecord setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getParticipants() {
    return participants;
  }

  /**
   * @param participants participants or {@code null} for none
   */
  public EventRecord setParticipants(java.util.List<java.lang.String> participants) {
    this.participants = participants;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDate() {
    return startDate;
  }

  /**
   * @param startDate startDate or {@code null} for none
   */
  public EventRecord setStartDate(java.lang.String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStatus() {
    return status;
  }

  /**
   * @param status status or {@code null} for none
   */
  public EventRecord setStatus(java.lang.Integer status) {
    this.status = status;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getTimeStamp() {
    return timeStamp;
  }

  /**
   * @param timeStamp timeStamp or {@code null} for none
   */
  public EventRecord setTimeStamp(java.lang.Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public EventRecord setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValidatedParticipants() {
    return validatedParticipants;
  }

  /**
   * @param validatedParticipants validatedParticipants or {@code null} for none
   */
  public EventRecord setValidatedParticipants(java.util.List<java.lang.String> validatedParticipants) {
    this.validatedParticipants = validatedParticipants;
    return this;
  }

  @Override
  public EventRecord set(String fieldName, Object value) {
    return (EventRecord) super.set(fieldName, value);
  }

  @Override
  public EventRecord clone() {
    return (EventRecord) super.clone();
  }

}
