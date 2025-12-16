package com.avito.android.service_booking_utils;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BookingSettingsStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/BookingSettingsStatus;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookingSettingsStatus {

    /* renamed from: c, reason: collision with root package name */
    public static final BookingSettingsStatus f278277c;

    /* renamed from: d, reason: collision with root package name */
    public static final BookingSettingsStatus f278278d;

    /* renamed from: e, reason: collision with root package name */
    public static final BookingSettingsStatus f278279e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ BookingSettingsStatus[] f278280f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f278281g;

    /* renamed from: b, reason: collision with root package name */
    public final int f278282b;

    static {
        BookingSettingsStatus bookingSettingsStatus = new BookingSettingsStatus("SAVED", 0, 3);
        f278277c = bookingSettingsStatus;
        BookingSettingsStatus bookingSettingsStatus2 = new BookingSettingsStatus("CHANGED", 1, 1);
        f278278d = bookingSettingsStatus2;
        BookingSettingsStatus bookingSettingsStatus3 = new BookingSettingsStatus("NOT_CHANGED", 2, 0);
        f278279e = bookingSettingsStatus3;
        BookingSettingsStatus[] bookingSettingsStatusArr = {bookingSettingsStatus, bookingSettingsStatus2, bookingSettingsStatus3};
        f278280f = bookingSettingsStatusArr;
        f278281g = c.a(bookingSettingsStatusArr);
    }

    public BookingSettingsStatus(String str, int i12, int i13) {
        this.f278282b = i13;
    }

    public static BookingSettingsStatus valueOf(String str) {
        return (BookingSettingsStatus) Enum.valueOf(BookingSettingsStatus.class, str);
    }

    public static BookingSettingsStatus[] values() {
        return (BookingSettingsStatus[]) f278280f.clone();
    }
}
