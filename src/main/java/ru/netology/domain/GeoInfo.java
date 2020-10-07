package ru.netology.domain;

public class GeoInfo {
    private String type;
    private String coordinates;

    private int placeId;
    private String placeTitle;
    private int placeLatitude;
    private int placeLongitude;
    private int placeCreated;
    private String placeIcon;
    private String placeCountryName;
    private String placeCityName;

    // if place ID is added as a checkin:

    private int checkinType;
    private int groupId;
    private String groupPhotoUrl;
    private int checkins;
    private int updated;
    private int address;

    //    + get/set на все поля
}
