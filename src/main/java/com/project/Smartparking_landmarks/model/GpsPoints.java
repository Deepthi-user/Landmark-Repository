/*
 * @(#)GpsPoints.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.model;

import com.project.Smartparking_landmarks.annotation.Latitude;
import com.project.Smartparking_landmarks.annotation.Longitude;
import javax.validation.constraints.NotNull;

/**
 * GpsPoints class uses for storing Gps points information.
 * @author Deepthi N
 * @version 1.0
 */

public class GpsPoints {

    //North-East latitude of Gps points of Landmark
    @NotNull(message = "NorthEast latitude point cannot be empty")
    @Latitude(message = "Latitude is invalid")
    private Double northEastlat;

    //North-East Longitude of Gps points of Landmark
    @NotNull(message = "NorthEast longitude cannot be empty")
    @Longitude(message = "Longitude is invalid")
    private Double northEastlng;

    //South-West Longitude of Gps points of Landmark
    @NotNull(message = "southWest longitude cannot be empty")
    @Longitude(message = "Longitude is invalid")
    private Double southWestlng;

    //South-West Latitude of Gps points of Landmark
    @NotNull(message = "southWest latitude cannot be empty")
    @Latitude(message = "Latitude is invalid")
    private Double southWestlat;

    // This is a constructor to initialize GpsPoints object.
    public GpsPoints( Double northEastlat, Double northEastlng, Double southWestlng, Double southWestlat) {
        this.northEastlat = northEastlat;
        this.northEastlng = northEastlng;
        this.southWestlng = southWestlng;
        this.southWestlat = southWestlat;
    }

    /**
     * To get North-East Latitude
     * @return Double type
     */
    public Double getNorthEastlat() {
        return northEastlat;
    }

    /**
     *  To set North-East Latitude
     * @param northEastlat Double type
     */
    public void setNorthEastlat(Double northEastlat) {
        this.northEastlat = northEastlat;
    }

    /**
     *  To get North-East Longitude
     * @return double type
     */
    public Double getNorthEastlng() {
        return northEastlng;
    }

    /**
     * To set North-East Longitude
     * @param northEastlng Double type
     */
    public void setNorthEastlng(Double northEastlng) {
        this.northEastlng = northEastlng;
    }

    /**
     *  To get South-West Longitude
     * @return Double type
     */
    public Double getSouthWestlng() {
        return southWestlng;
    }

    /**
     * To set South-West Longitude
     * @param southWestlng Double type
     */
    public void setSouthWestlng(Double southWestlng) {
        this.southWestlng = southWestlng;
    }

    /**
     * To get South-West Latitude
     * @return Double type
     */
    public Double getSouthWestlat() {
        return southWestlat;
    }

    /**
     * To set South-West Latitude
     * @param southWestlat Double type
     */
    public void setSouthWestlat(Double southWestlat) {
        this.southWestlat = southWestlat;
    }
}
