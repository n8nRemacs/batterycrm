package com.avito.android.service_booking_day_settings.di;

import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.C;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.service_booking_day_settings.daysettings.DaySettingsFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: DaySettingsComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/di/g;", "Lcom/avito/android/di/h;", "a", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
@B
@C
/* loaded from: classes3.dex */
public interface g extends InterfaceC29971h {

    /* compiled from: DaySettingsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/di/g$a;", "", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        g a(@h31.b @Y61.k C28478k c28478k, @Y61.k InterfaceC39417a interfaceC39417a, @Y61.k i iVar, @h31.b @Y61.k Y41.l lVar, @h31.b @Y61.k @b Y41.q qVar, @h31.b @com.avito.android.service_booking_day_settings.di.a @Y61.k Y41.q qVar2, @d @h31.b @Y61.k String str, @h31.b @Y61.k FragmentManager fragmentManager);
    }

    void Z9(@Y61.k DaySettingsFragment daySettingsFragment);
}
