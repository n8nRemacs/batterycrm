package com.avito.android.location;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/LocationSource;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocationSource {

    /* renamed from: c, reason: collision with root package name */
    public static final LocationSource f181711c;

    /* renamed from: d, reason: collision with root package name */
    public static final LocationSource f181712d;

    /* renamed from: e, reason: collision with root package name */
    public static final LocationSource f181713e;

    /* renamed from: f, reason: collision with root package name */
    public static final LocationSource f181714f;

    /* renamed from: g, reason: collision with root package name */
    public static final LocationSource f181715g;

    /* renamed from: h, reason: collision with root package name */
    public static final LocationSource f181716h;

    /* renamed from: i, reason: collision with root package name */
    public static final LocationSource f181717i;

    /* renamed from: j, reason: collision with root package name */
    public static final LocationSource f181718j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ LocationSource[] f181719k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f181720l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f181721b;

    /* compiled from: LocationSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LocationSource.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LocationSource locationSource = LocationSource.f181711c;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LocationSource locationSource2 = LocationSource.f181711c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LocationSource locationSource3 = LocationSource.f181711c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LocationSource locationSource4 = LocationSource.f181711c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LocationSource locationSource5 = LocationSource.f181711c;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                LocationSource locationSource6 = LocationSource.f181711c;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                LocationSource locationSource7 = LocationSource.f181711c;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        LocationSource locationSource = new LocationSource("LOCATION_FROM_COORDS", 0, "location_from_coords");
        f181711c = locationSource;
        LocationSource locationSource2 = new LocationSource("LOCATION_FROM_LIST", 1, "location_from_list");
        f181712d = locationSource2;
        LocationSource locationSource3 = new LocationSource("LOCATION_FROM_FILTERS", 2, "location_from_filters");
        f181713e = locationSource3;
        LocationSource locationSource4 = new LocationSource("LOCATION_FROM_FILTERS_WITH_RENAMING", 3, "location_from_filters_with_renaming");
        f181714f = locationSource4;
        LocationSource locationSource5 = new LocationSource("LOCATION_FROM_DEEPLINK", 4, "location_from_deeplink");
        f181715g = locationSource5;
        LocationSource locationSource6 = new LocationSource("LOCATION_FROM_EXTERNAL_LINK", 5, "location_from_external_link");
        f181716h = locationSource6;
        LocationSource locationSource7 = new LocationSource("LOCATION_FROM_LAAS", 6, "location_from_laas");
        f181717i = locationSource7;
        LocationSource locationSource8 = new LocationSource("LOCATION_FOR_SEARCH", 7, "location_for_search");
        f181718j = locationSource8;
        LocationSource[] locationSourceArr = {locationSource, locationSource2, locationSource3, locationSource4, locationSource5, locationSource6, locationSource7, locationSource8};
        f181719k = locationSourceArr;
        f181720l = kotlin.enums.c.a(locationSourceArr);
    }

    public LocationSource(String str, int i12, String str2) {
        this.f181721b = str2;
    }

    public static LocationSource valueOf(String str) {
        return (LocationSource) Enum.valueOf(LocationSource.class, str);
    }

    public static LocationSource[] values() {
        return (LocationSource[]) f181719k.clone();
    }
}
