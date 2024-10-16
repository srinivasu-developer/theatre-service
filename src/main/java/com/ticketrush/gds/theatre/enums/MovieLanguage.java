package com.ticketrush.gds.theatre.enums;

/**
 *
 * Author: srinivasun
 * Since: 15/10/24
 */
public enum MovieLanguage {

    HINDI("Hindi"),
    TELUGU("Telugu"),
    ENGLISH("English");

    private final String language;

    MovieLanguage(final String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}