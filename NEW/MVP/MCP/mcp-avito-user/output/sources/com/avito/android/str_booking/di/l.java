package com.avito.android.str_booking.di;

import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.remote.model.AnimationOverlayUrl;
import com.avito.android.str_booking.ui.ScreenType;
import com.avito.android.str_booking.ui.StrBookingFragment;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: StrBookingComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/di/l;", "", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface l {

    /* compiled from: StrBookingComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/di/l$a;", "", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        l a(@Y61.k InterfaceC39417a interfaceC39417a, @Y61.k m mVar, @h31.b @Y61.k FragmentManager fragmentManager, @h31.b @Y61.k C28478k c28478k, @h31.b @Y61.l AnimationOverlayUrl animationOverlayUrl, @h31.b @Y61.k @Named("order_id") String str, @h31.b @Y61.k @Named("screen_type") ScreenType screenType, @h31.b @Y61.l @Named("ux_feedback_event_name") String str2, @h31.b @Named("first_launch") boolean z12, @h31.b @Y61.k Y41.l lVar);
    }

    void a(@Y61.k StrBookingFragment strBookingFragment);
}
