package com.avito.android.service_booking_calendar.analytics;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FromPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/analytics/FromPage;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FromPage {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ FromPage[] f275243b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f275244c;

    static {
        FromPage[] fromPageArr = {new FromPage("CALENDAR_DAY", 0, "Календарь (день)"), new FromPage("CALENDAR_MONTH", 1, "Календарь (месяц)")};
        f275243b = fromPageArr;
        f275244c = c.a(fromPageArr);
    }

    public FromPage(String str, int i12, String str2) {
    }

    public static FromPage valueOf(String str) {
        return (FromPage) Enum.valueOf(FromPage.class, str);
    }

    public static FromPage[] values() {
        return (FromPage[]) f275243b.clone();
    }
}
