package com.avito.android.service_booking_calendar.flexible.di;

import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.C;
import com.avito.android.service_booking_calendar.flexible.ServiceBookingFlexibleCalendarFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: FlexibleCalendarComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/di/c;", "Lcom/avito/android/service_booking_calendar/day/schedule/di/o;", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
@B
@C
/* loaded from: classes3.dex */
public interface c extends com.avito.android.service_booking_calendar.day.schedule.di.o {

    /* compiled from: FlexibleCalendarComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/di/c$a;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        c a(@h31.b @Y61.k C28478k c28478k, @Y61.k d dVar, @Y61.k InterfaceC39417a interfaceC39417a, @h31.b @Y61.k ServiceBookingFlexibleCalendarFragment serviceBookingFlexibleCalendarFragment, @h31.b @Y61.k FragmentManager fragmentManager, @h31.b @Y61.l @b String str);
    }

    void Rf(@Y61.k ServiceBookingFlexibleCalendarFragment serviceBookingFlexibleCalendarFragment);
}
