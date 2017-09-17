package project.budgetmanager.bumadevelopers.buma.core.map.data;

/**
 * Created by HARES on 20/04/2017.
 */

public class C_Place {

    private Double latitude;
    private Double longitude;
    private String placeName;
    private String subject;
    private Double pay;
    private String photo;
    private String date;
    private int rating;

    public C_Place(Double latitude, Double longitude, String placeName, String subject, Double pay,
                   String photo, String date, int rating) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.placeName = placeName;
        this.subject = subject;
        this.pay = pay;
        this.photo = photo;
        this.date = date;
        this.rating = rating;
    }

    public C_Place() {

    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getRating() {return rating; }

    public void setRating(int rating) {this.rating = rating;}


}
