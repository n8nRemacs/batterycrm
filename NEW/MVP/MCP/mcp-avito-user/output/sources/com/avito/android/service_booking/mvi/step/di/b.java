package com.avito.android.service_booking.mvi.step.di;

import android.content.Context;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.C;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.service_booking.BookingFlowSource;
import com.avito.android.service_booking.mvi.di.v;
import com.avito.android.service_booking.mvi.step.ServiceBookingMviStepFragment;
import cv.InterfaceC39417a;
import h31.d;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ServiceBookingMviStepComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/di/b;", "", "a", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
@B
@C
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ServiceBookingMviStepComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/di/b$a;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@Y61.k c cVar, @Y61.k InterfaceC39417a interfaceC39417a, @Y61.k C31138n0 c31138n0, @h31.b @Y61.k Context context, @h31.b @v @Y61.k String str, @h31.b @Y61.l @com.avito.android.service_booking.mvi.di.a String str2, @h31.b @Y61.l @com.avito.android.service_booking.mvi.di.b String str3, @h31.b @Y61.k @com.avito.android.service_booking.mvi.di.e BookingFlowSource bookingFlowSource, @h31.b @Y61.k Resources resources, @h31.b @Y61.k C28478k c28478k, @h31.b @Y61.k Map map, @h31.b @Y61.k Y41.l lVar);
    }

    void a(@Y61.k ServiceBookingMviStepFragment serviceBookingMviStepFragment);
}
