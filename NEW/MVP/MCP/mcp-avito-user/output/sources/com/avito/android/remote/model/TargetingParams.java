package com.avito.android.remote.model;

import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes17.dex */
public class TargetingParams {

    @P
    private Category mCategory;

    @P
    private Location mLocation;

    @N
    private final String mPageType;

    @P
    private String mSearchQuery;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PageType {
        public static final String ITEM = "item";
        public static final String SEARCH = "search_page";
    }

    public TargetingParams(@N String str) {
        this.mPageType = str;
    }

    @P
    public Category getCategory() {
        return this.mCategory;
    }

    @P
    public Location getLocation() {
        return this.mLocation;
    }

    @N
    public String getPageType() {
        return this.mPageType;
    }

    @P
    public String getSearchQuery() {
        return this.mSearchQuery;
    }

    public TargetingParams setCategory(@P Category category) {
        this.mCategory = category;
        return this;
    }

    public TargetingParams setLocation(@P Location location) {
        this.mLocation = location;
        return this;
    }

    public TargetingParams setSearchQuery(@P String str) {
        this.mSearchQuery = str;
        return this;
    }
}
