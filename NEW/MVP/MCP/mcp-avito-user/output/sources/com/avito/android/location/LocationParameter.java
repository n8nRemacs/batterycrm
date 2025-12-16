package com.avito.android.location;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationInfoProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/LocationParameter;", "", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocationParameter {

    /* renamed from: b, reason: collision with root package name */
    public static final LocationParameter f181708b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ LocationParameter[] f181709c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f181710d;

    static {
        LocationParameter locationParameter = new LocationParameter("USER_FORCED_LOCATION_IN_SETTINGS", 0);
        f181708b = locationParameter;
        LocationParameter[] locationParameterArr = {locationParameter};
        f181709c = locationParameterArr;
        f181710d = kotlin.enums.c.a(locationParameterArr);
    }

    public LocationParameter() {
        throw null;
    }

    public static LocationParameter valueOf(String str) {
        return (LocationParameter) Enum.valueOf(LocationParameter.class, str);
    }

    public static LocationParameter[] values() {
        return (LocationParameter[]) f181709c.clone();
    }
}
