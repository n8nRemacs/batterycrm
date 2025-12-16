package com.avito.android.service_booking_details;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServiceBookingItemDetailsUxfLinksFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/BookingEditFlow;", "", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookingEditFlow {

    /* renamed from: c, reason: collision with root package name */
    public static final BookingEditFlow f277170c;

    /* renamed from: d, reason: collision with root package name */
    public static final BookingEditFlow f277171d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BookingEditFlow[] f277172e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f277173f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f277174b;

    static {
        BookingEditFlow bookingEditFlow = new BookingEditFlow("SUCCESS", 0, "srv_booking_details_edit_success");
        f277170c = bookingEditFlow;
        BookingEditFlow bookingEditFlow2 = new BookingEditFlow("FAILURE", 1, "srv_booking_details_edit_failure");
        f277171d = bookingEditFlow2;
        BookingEditFlow[] bookingEditFlowArr = {bookingEditFlow, bookingEditFlow2};
        f277172e = bookingEditFlowArr;
        f277173f = kotlin.enums.c.a(bookingEditFlowArr);
    }

    public BookingEditFlow(String str, int i12, String str2) {
        this.f277174b = str2;
    }

    public static BookingEditFlow valueOf(String str) {
        return (BookingEditFlow) Enum.valueOf(BookingEditFlow.class, str);
    }

    public static BookingEditFlow[] values() {
        return (BookingEditFlow[]) f277172e.clone();
    }
}
