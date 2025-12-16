package com.avito.android.location_picker.view;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationPickerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/LocationPickerChooseButtonLocation;", "", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocationPickerChooseButtonLocation {

    /* renamed from: b, reason: collision with root package name */
    public static final LocationPickerChooseButtonLocation f182519b;

    /* renamed from: c, reason: collision with root package name */
    public static final LocationPickerChooseButtonLocation f182520c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ LocationPickerChooseButtonLocation[] f182521d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f182522e;

    static {
        LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = new LocationPickerChooseButtonLocation("APPBAR", 0);
        f182519b = locationPickerChooseButtonLocation;
        LocationPickerChooseButtonLocation locationPickerChooseButtonLocation2 = new LocationPickerChooseButtonLocation("FOOTER", 1);
        f182520c = locationPickerChooseButtonLocation2;
        LocationPickerChooseButtonLocation[] locationPickerChooseButtonLocationArr = {locationPickerChooseButtonLocation, locationPickerChooseButtonLocation2};
        f182521d = locationPickerChooseButtonLocationArr;
        f182522e = kotlin.enums.c.a(locationPickerChooseButtonLocationArr);
    }

    public LocationPickerChooseButtonLocation() {
        throw null;
    }

    public static LocationPickerChooseButtonLocation valueOf(String str) {
        return (LocationPickerChooseButtonLocation) Enum.valueOf(LocationPickerChooseButtonLocation.class, str);
    }

    public static LocationPickerChooseButtonLocation[] values() {
        return (LocationPickerChooseButtonLocation[]) f182521d.clone();
    }
}
