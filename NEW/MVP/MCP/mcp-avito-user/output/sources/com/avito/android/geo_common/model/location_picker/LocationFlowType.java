package com.avito.android.geo_common.model.location_picker;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationFlowType.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/geo_common/model/location_picker/LocationFlowType;", "", "Landroid/os/Parcelable;", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LocationFlowType implements Parcelable {

    @k
    public static final Parcelable.Creator<LocationFlowType> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    public static final LocationFlowType f159415c;

    /* renamed from: d, reason: collision with root package name */
    public static final LocationFlowType f159416d;

    /* renamed from: e, reason: collision with root package name */
    public static final LocationFlowType f159417e;

    /* renamed from: f, reason: collision with root package name */
    public static final LocationFlowType f159418f;

    /* renamed from: g, reason: collision with root package name */
    public static final LocationFlowType f159419g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ LocationFlowType[] f159420h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159421i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f159422b;

    static {
        LocationFlowType locationFlowType = new LocationFlowType("Other", 0, PluralsKeys.OTHER);
        f159415c = locationFlowType;
        LocationFlowType locationFlowType2 = new LocationFlowType("Publish", 1, "publish");
        f159416d = locationFlowType2;
        LocationFlowType locationFlowType3 = new LocationFlowType("Filters", 2, "filters");
        f159417e = locationFlowType3;
        LocationFlowType locationFlowType4 = new LocationFlowType("InlineFilters", 3, "inline-filters");
        f159418f = locationFlowType4;
        LocationFlowType locationFlowType5 = new LocationFlowType("Profile", 4, "profile");
        f159419g = locationFlowType5;
        LocationFlowType[] locationFlowTypeArr = {locationFlowType, locationFlowType2, locationFlowType3, locationFlowType4, locationFlowType5};
        f159420h = locationFlowTypeArr;
        f159421i = c.a(locationFlowTypeArr);
        CREATOR = new Parcelable.Creator<LocationFlowType>() { // from class: com.avito.android.geo_common.model.location_picker.LocationFlowType.a
            @Override // android.os.Parcelable.Creator
            public final LocationFlowType createFromParcel(Parcel parcel) {
                return LocationFlowType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LocationFlowType[] newArray(int i12) {
                return new LocationFlowType[i12];
            }
        };
    }

    public LocationFlowType(String str, int i12, String str2) {
        this.f159422b = str2;
    }

    public static LocationFlowType valueOf(String str) {
        return (LocationFlowType) Enum.valueOf(LocationFlowType.class, str);
    }

    public static LocationFlowType[] values() {
        return (LocationFlowType[]) f159420h.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
