package com.avito.android.service_booking.mvi.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.BookingFlowSource;
import com.avito.android.service_booking.mvi.ServiceBookingMviActivity;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: ServiceBookingMviComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/mvi/di/q;", "Lcom/avito/android/service_booking/mvi/step/di/c;", "a", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes3.dex */
public interface q extends com.avito.android.service_booking.mvi.step.di.c {

    /* compiled from: ServiceBookingMviComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/di/q$a;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        q a(@h31.b @f @Y61.k String str, @h31.b @Y61.l @com.avito.android.service_booking.mvi.di.a String str2, @h @h31.b @Y61.l String str3, @g @h31.b @Y61.l String str4, @h31.b @Y61.l @b String str5, @d @h31.b @Y61.k BookingFlow bookingFlow, @h31.b @Y61.k @e BookingFlowSource bookingFlowSource, @h31.b @Y61.k Resources resources, @h31.b @Y61.k C28478k c28478k, @Y61.k r rVar, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void ii(@Y61.k ServiceBookingMviActivity serviceBookingMviActivity);

    @Y61.k
    com.avito.android.service_booking.mvi.f n9();
}
