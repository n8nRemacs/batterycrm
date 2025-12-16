package com.avito.android.str_calendar.seller.calendar.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StrSellerCalendarItemState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/Status;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Status {

    /* renamed from: b, reason: collision with root package name */
    public static final Status f287687b;

    /* renamed from: c, reason: collision with root package name */
    public static final Status f287688c;

    /* renamed from: d, reason: collision with root package name */
    public static final Status f287689d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f287690e;

    /* renamed from: f, reason: collision with root package name */
    public static final Status f287691f;

    /* renamed from: g, reason: collision with root package name */
    public static final Status f287692g;

    /* renamed from: h, reason: collision with root package name */
    public static final Status f287693h;

    /* renamed from: i, reason: collision with root package name */
    public static final Status f287694i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ Status[] f287695j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f287696k;

    static {
        Status status = new Status("SELECTED", 0);
        f287687b = status;
        Status status2 = new Status("CURRENT", 1);
        f287688c = status2;
        Status status3 = new Status("BOOKED", 2);
        f287689d = status3;
        Status status4 = new Status("PENDING", 3);
        f287690e = status4;
        Status status5 = new Status("UNAVAILABLE", 4);
        f287691f = status5;
        Status status6 = new Status("PAST", 5);
        f287692g = status6;
        Status status7 = new Status("NORMAL", 6);
        f287693h = status7;
        Status status8 = new Status("NONE", 7);
        f287694i = status8;
        Status[] statusArr = {status, status2, status3, status4, status5, status6, status7, status8};
        f287695j = statusArr;
        f287696k = c.a(statusArr);
    }

    public Status() {
        throw null;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) f287695j.clone();
    }
}
