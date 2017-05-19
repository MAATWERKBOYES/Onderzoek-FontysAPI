
package nl.sm422.fontysfatoe;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "url",
        "givenName",
        "surName",
        "initials",
        "displayName",
        "mail",
        "office",
        "telephoneNumber",
        "mobileNumber",
        "photo",
        "department",
        "title",
        "personalTitle",
        "groups",
        "lat",
        "long",
        "affiliations",
        "updatedAt",
        "uid",
        "thumbnailData",
        "employeeId"
})
public class Teacher {

    @JsonProperty("id")
    private String id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("givenName")
    private String givenName;
    @JsonProperty("surName")
    private String surName;
    @JsonProperty("initials")
    private String initials;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("mail")
    private String mail;
    @JsonProperty("office")
    private String office;
    @JsonProperty("telephoneNumber")
    private String telephoneNumber;
    @JsonProperty("mobileNumber")
    private String mobileNumber;
    @JsonProperty("photo")
    private String photo;
    @JsonProperty("department")
    private String department;
    @JsonProperty("title")
    private String title;
    @JsonProperty("personalTitle")
    private String personalTitle;
    @JsonProperty("groups")
    private List<Group> groups = null;
    @JsonProperty("lat")
    private Integer lat;
    @JsonProperty("long")
    private Integer _long;
    @JsonProperty("affiliations")
    private List<String> affiliations = null;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("thumbnailData")
    private String thumbnailData;
    @JsonProperty("employeeId")
    private String employeeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("surName")
    public String getSurName() {
        return surName;
    }

    @JsonProperty("surName")
    public void setSurName(String surName) {
        this.surName = surName;
    }

    @JsonProperty("initials")
    public String getInitials() {
        return initials;
    }

    @JsonProperty("initials")
    public void setInitials(String initials) {
        this.initials = initials;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("mail")
    public String getMail() {
        return mail;
    }

    @JsonProperty("mail")
    public void setMail(String mail) {
        this.mail = mail;
    }

    @JsonProperty("office")
    public String getOffice() {
        return office;
    }

    @JsonProperty("office")
    public void setOffice(String office) {
        this.office = office;
    }

    @JsonProperty("telephoneNumber")
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    @JsonProperty("telephoneNumber")
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @JsonProperty("mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    @JsonProperty("mobileNumber")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @JsonProperty("photo")
    public String getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("personalTitle")
    public String getPersonalTitle() {
        return personalTitle;
    }

    @JsonProperty("personalTitle")
    public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }

    @JsonProperty("groups")
    public List<Group> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @JsonProperty("lat")
    public Integer getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Integer lat) {
        this.lat = lat;
    }

    @JsonProperty("long")
    public Integer getLong() {
        return _long;
    }

    @JsonProperty("long")
    public void setLong(Integer _long) {
        this._long = _long;
    }

    @JsonProperty("affiliations")
    public List<String> getAffiliations() {
        return affiliations;
    }

    @JsonProperty("affiliations")
    public void setAffiliations(List<String> affiliations) {
        this.affiliations = affiliations;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("thumbnailData")
    public String getThumbnailData() {
        return thumbnailData;
    }

    @JsonProperty("thumbnailData")
    public void setThumbnailData(String thumbnailData) {
        this.thumbnailData = thumbnailData;
    }

    @JsonProperty("employeeId")
    public String getEmployeeId() {
        return employeeId;
    }

    @JsonProperty("employeeId")
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
