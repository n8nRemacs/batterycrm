package com.avito.android.widget_filters.analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationSelectMethod.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/analytics/LocationSelectMethod;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocationSelectMethod {

    /* renamed from: c, reason: collision with root package name */
    public static final LocationSelectMethod f329697c;

    /* renamed from: d, reason: collision with root package name */
    public static final LocationSelectMethod f329698d;

    /* renamed from: e, reason: collision with root package name */
    public static final LocationSelectMethod f329699e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ LocationSelectMethod[] f329700f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f329701g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f329702b;

    static {
        LocationSelectMethod locationSelectMethod = new LocationSelectMethod("MANUAL", 0, "manual");
        f329697c = locationSelectMethod;
        LocationSelectMethod locationSelectMethod2 = new LocationSelectMethod("SUGGEST", 1, "suggest");
        f329698d = locationSelectMethod2;
        LocationSelectMethod locationSelectMethod3 = new LocationSelectMethod("RECENT_SEARCH", 2, "recent search");
        f329699e = locationSelectMethod3;
        LocationSelectMethod[] locationSelectMethodArr = {locationSelectMethod, locationSelectMethod2, locationSelectMethod3};
        f329700f = locationSelectMethodArr;
        f329701g = kotlin.enums.c.a(locationSelectMethodArr);
    }

    public LocationSelectMethod(String str, int i12, String str2) {
        this.f329702b = str2;
    }

    public static LocationSelectMethod valueOf(String str) {
        return (LocationSelectMethod) Enum.valueOf(LocationSelectMethod.class, str);
    }

    public static LocationSelectMethod[] values() {
        return (LocationSelectMethod[]) f329700f.clone();
    }
}
