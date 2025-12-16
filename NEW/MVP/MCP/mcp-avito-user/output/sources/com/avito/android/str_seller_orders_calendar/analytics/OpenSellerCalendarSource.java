package com.avito.android.str_seller_orders_calendar.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OpenSellerCalendarEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/analytics/OpenSellerCalendarSource;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OpenSellerCalendarSource {

    /* renamed from: c, reason: collision with root package name */
    public static final OpenSellerCalendarSource f290360c;

    /* renamed from: d, reason: collision with root package name */
    public static final OpenSellerCalendarSource f290361d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ OpenSellerCalendarSource[] f290362e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f290363f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f290364b;

    static {
        OpenSellerCalendarSource openSellerCalendarSource = new OpenSellerCalendarSource("ITEM", 0, "item");
        f290360c = openSellerCalendarSource;
        OpenSellerCalendarSource openSellerCalendarSource2 = new OpenSellerCalendarSource("SELECT_DATES", 1, "select_dates");
        f290361d = openSellerCalendarSource2;
        OpenSellerCalendarSource[] openSellerCalendarSourceArr = {openSellerCalendarSource, openSellerCalendarSource2};
        f290362e = openSellerCalendarSourceArr;
        f290363f = c.a(openSellerCalendarSourceArr);
    }

    public OpenSellerCalendarSource(String str, int i12, String str2) {
        this.f290364b = str2;
    }

    public static OpenSellerCalendarSource valueOf(String str) {
        return (OpenSellerCalendarSource) Enum.valueOf(OpenSellerCalendarSource.class, str);
    }

    public static OpenSellerCalendarSource[] values() {
        return (OpenSellerCalendarSource[]) f290362e.clone();
    }
}
