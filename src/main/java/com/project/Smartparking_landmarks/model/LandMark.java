/*
 * @(#)LandMark.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * LandMark class uses for storing landmark information.
 * @author Deepthi N
 * @version 1.0
 */

@Document(collection = "landmarks")
public class LandMark {

    // landmarkId of Landmark and the size must be equal to or greater than 5 characters and less than 14 characters
    @Id
    @NotEmpty(message = "LandmarkId cannot be empty")
    @Size(min=5,max=14, message = "LandmarkId must be equal to or greater than 5 characters and less than 14 characters")
    private String landmarkId;

    //Image name of Landmark and the size must be equal to or greater than 4 characters and less than 25 characters
    @NotEmpty(message = "image cannot be empty")
    @Pattern(message= "Invalid image format", regexp = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)" )
    @Size(min=6,max=25, message = "image must be equal to or greater than 4 characters and less than 25 characters")
    private String image;

    //Gps points of Landmark
    @Valid
    private  GpsPoints gpsPoints;

    //scale of Landmark and the size must be equal to or greater than 7 characters and less than 10 characters
    @NotEmpty(message = "Scale cannot be empty")
    @Size(min=7,max=10, message = "Scale must be equal to or greater than 7 characters and less than 10 characters")
    private String scale;

    //anchor of Landmark and the size must be equal to or greater than 1 character and less than 2 characters
    @NotEmpty(message = "Anchor cannot be empty")
    @Size(min = 1, max=2, message = "Anchor must be equal to or greater than 1 character and less than 2 characters")
    private String anchor;

    // This is a constructor to initialize LandMark object.
    public LandMark(String landmarkId, String image, GpsPoints gpsPoints, String scale, String anchor) {
        this.landmarkId = landmarkId;
        this.image = image;
        this.gpsPoints = gpsPoints;
        this.scale = scale;
        this.anchor = anchor;
    }

    /**
     * To get landmarkId
     * @return String type
     */
    public String getLandmarkId() {
        return landmarkId;
    }

    /**
     * To set landmarkId
     * @param landmarkId String type
     */
    public void setLandmarkId(String landmarkId) {
        this.landmarkId = landmarkId;
    }

    /**
     * To get image name
     * @return String type
     */
    public String getImage() {
        return image;
    }

    /**
     * To set image name
     * @param image String type
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * To get scale
     * @return String type
     */
    public String getScale() {
        return scale;
    }

    /**
     *  To set scale
     * @param scale String type
     */
    public void setScale(String scale) {
        this.scale = scale;
    }

    /**
     * To get Gps points
     * @return Object of GpsPoints class
     */
    public GpsPoints getGpsPoints() {
        return gpsPoints;
    }

    /**
     * To set Gps points
     * @param gpsPoints Object of GpsPoints class
     */
    public void setGpsPoints(GpsPoints gpsPoints) {
        this.gpsPoints = gpsPoints;
    }

    /**
     * To get anchor
     * @return String type
     */
    public String getAnchor() {
        return anchor;
    }

    /**
     * To set anchor
     * @param anchor String type
     */
    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }
}

