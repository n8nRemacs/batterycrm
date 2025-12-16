package com.avito.android.service_booking;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BookingFlow.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/BookingFlow;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookingFlow {

    /* renamed from: b, reason: collision with root package name */
    public static final BookingFlow f274120b;

    /* renamed from: c, reason: collision with root package name */
    public static final BookingFlow f274121c;

    /* renamed from: d, reason: collision with root package name */
    public static final BookingFlow f274122d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BookingFlow[] f274123e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f274124f;

    static {
        BookingFlow bookingFlow = new BookingFlow("BUYER_CREATION", 0);
        f274120b = bookingFlow;
        BookingFlow bookingFlow2 = new BookingFlow("SELLER_EDIT", 1);
        f274121c = bookingFlow2;
        BookingFlow bookingFlow3 = new BookingFlow("SELLER_CREATION", 2);
        f274122d = bookingFlow3;
        BookingFlow[] bookingFlowArr = {bookingFlow, bookingFlow2, bookingFlow3};
        f274123e = bookingFlowArr;
        f274124f = c.a(bookingFlowArr);
    }

    public BookingFlow() {
        throw null;
    }

    public static BookingFlow valueOf(String str) {
        return (BookingFlow) Enum.valueOf(BookingFlow.class, str);
    }

    public static BookingFlow[] values() {
        return (BookingFlow[]) f274123e.clone();
    }
}
