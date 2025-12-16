package com.avito.android.remote.model;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import j.P;
import java.util.Collections;
import java.util.List;

/* loaded from: classes17.dex */
public class YandexTargetingParams implements Parcelable {
    public static final Parcelable.Creator<YandexTargetingParams> CREATOR = new Parcelable.Creator<YandexTargetingParams>() { // from class: com.avito.android.remote.model.YandexTargetingParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public YandexTargetingParams createFromParcel(Parcel parcel) {
            return new YandexTargetingParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public YandexTargetingParams[] newArray(int i12) {
            return new YandexTargetingParams[i12];
        }
    };

    @P
    private Category mCategory;

    @P
    private List<String> mItemTitles;

    @P
    private String mSearchQuery;

    public YandexTargetingParams() {
        this.mItemTitles = Collections.emptyList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @P
    public Category getCategory() {
        return this.mCategory;
    }

    @P
    public List<String> getItemTitles() {
        return this.mItemTitles;
    }

    @P
    public String getSearchQuery() {
        return this.mSearchQuery;
    }

    public YandexTargetingParams setCategory(@P Category category) {
        if (category == null || category.isNull()) {
            this.mCategory = null;
        } else {
            this.mCategory = category;
        }
        return this;
    }

    public YandexTargetingParams setItemTitles(@P List<String> list) {
        this.mItemTitles = list;
        return this;
    }

    public YandexTargetingParams setSearchQuery(@P String str) {
        this.mSearchQuery = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.mSearchQuery);
        parcel.writeParcelable(this.mCategory, i12);
        parcel.writeStringList(this.mItemTitles);
    }

    public YandexTargetingParams(@N TargetingParams targetingParams) {
        this.mItemTitles = Collections.emptyList();
        setCategory(targetingParams.getCategory());
        setSearchQuery(targetingParams.getSearchQuery());
    }

    public YandexTargetingParams(Parcel parcel) {
        this.mItemTitles = Collections.emptyList();
        this.mSearchQuery = parcel.readString();
        this.mCategory = (Category) parcel.readParcelable(Category.class.getClassLoader());
        this.mItemTitles = parcel.createStringArrayList();
    }
}
