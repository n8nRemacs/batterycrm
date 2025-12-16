package com.avito.android.hotel_booking.mvi;

import RI.d;
import com.avito.android.R;
import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.hotel_booking.mvi.entity.HotelBookingInternalAction;
import com.avito.android.remote.error.ApiError;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HotelBookingOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/w;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "LRI/d;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class w implements com.avito.android.arch.mvi.t<HotelBookingInternalAction, RI.d> {
    @Inject
    public w() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final RI.d b(HotelBookingInternalAction hotelBookingInternalAction) {
        String onAppearToastMessage;
        HotelBookingInternalAction hotelBookingInternalAction2 = hotelBookingInternalAction;
        if (hotelBookingInternalAction2 instanceof HotelBookingInternalAction.ContentLoaded) {
            HotelBookingFormResponse hotelBookingFormResponse = ((HotelBookingInternalAction.ContentLoaded) hotelBookingInternalAction2).f163856b;
            HotelBookingFormResponse.Form form = hotelBookingFormResponse instanceof HotelBookingFormResponse.Form ? (HotelBookingFormResponse.Form) hotelBookingFormResponse : null;
            if (form == null || (onAppearToastMessage = form.getOnAppearToastMessage()) == null) {
                return null;
            }
            return new d.C0949d(com.avito.android.printable_text.b.f(onAppearToastMessage));
        }
        if (hotelBookingInternalAction2 instanceof HotelBookingInternalAction.ContentError) {
            HotelBookingInternalAction.ContentError contentError = (HotelBookingInternalAction.ContentError) hotelBookingInternalAction2;
            if ((contentError.f163853b instanceof ApiError.IncorrectData) || !contentError.f163854c) {
                return null;
            }
            return new d.C0949d(com.avito.android.printable_text.b.c(R.string.hotel_booking_error_toast_message, new Serializable[0]));
        }
        if (hotelBookingInternalAction2 instanceof HotelBookingInternalAction.ShowInfoToast) {
            return new d.e(((HotelBookingInternalAction.ShowInfoToast) hotelBookingInternalAction2).f163864b);
        }
        if (hotelBookingInternalAction2 instanceof HotelBookingInternalAction.ClickDeeplink) {
            HotelBookingInternalAction.ClickDeeplink clickDeeplink = (HotelBookingInternalAction.ClickDeeplink) hotelBookingInternalAction2;
            return new d.b(clickDeeplink.f163850b, clickDeeplink.f163851c);
        }
        if (hotelBookingInternalAction2 instanceof HotelBookingInternalAction.BookingCreated) {
            HotelBookingInternalAction.BookingCreated bookingCreated = (HotelBookingInternalAction.BookingCreated) hotelBookingInternalAction2;
            return new d.b(bookingCreated.f163841b, bookingCreated.f163842c);
        }
        if (hotelBookingInternalAction2 instanceof HotelBookingInternalAction.ClickBookingDescription) {
            return new d.c(((HotelBookingInternalAction.ClickBookingDescription) hotelBookingInternalAction2).f163849b);
        }
        if (hotelBookingInternalAction2 instanceof HotelBookingInternalAction.BookingErrors) {
            return new d.c(((HotelBookingInternalAction.BookingErrors) hotelBookingInternalAction2).f163844c);
        }
        if (hotelBookingInternalAction2 instanceof HotelBookingInternalAction.CloseScreen) {
            return d.a.f14294a;
        }
        return null;
    }
}
