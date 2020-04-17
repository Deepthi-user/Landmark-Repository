/*
 * @(#)Constant.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking_landmarks.constant;

/**
 * Creation of constants
 * @author Deepthi N
 * @version 1.0
 */

public interface Constant {
    // Pattern for Latitude
    public static final String REGEX_FOR_LATITUDE = "^-?([1]?[1-7][1-9]|[1-8]?[1-9]|[1-9])\\.{1}\\d{1,6}";

    // Pattern for Longitude
    public static final String REGEX_FOR_LONGITUDE = "^-?([1]?[1-7][1-9]|[1]?[1-8][0]|[1-9]?[0-9])\\.{1}\\d{1,6}";
}
