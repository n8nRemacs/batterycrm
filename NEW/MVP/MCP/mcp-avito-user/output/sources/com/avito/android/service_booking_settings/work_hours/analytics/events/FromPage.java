package com.avito.android.service_booking_settings.work_hours.analytics.events;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FromPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/analytics/events/FromPage;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FromPage {

    /* renamed from: b, reason: collision with root package name */
    public static final FromPage f277921b;

    /* renamed from: c, reason: collision with root package name */
    public static final FromPage f277922c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ FromPage[] f277923d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f277924e;

    static {
        FromPage fromPage = new FromPage("SUMMARY", 0);
        f277921b = fromPage;
        FromPage fromPage2 = new FromPage("TIME_SCREEN", 1);
        f277922c = fromPage2;
        FromPage[] fromPageArr = {fromPage, fromPage2, new FromPage("SCHEDULE_PERIOD", 2)};
        f277923d = fromPageArr;
        f277924e = c.a(fromPageArr);
    }

    public FromPage() {
        throw null;
    }

    public static FromPage valueOf(String str) {
        return (FromPage) Enum.valueOf(FromPage.class, str);
    }

    public static FromPage[] values() {
        return (FromPage[]) f277923d.clone();
    }
}
