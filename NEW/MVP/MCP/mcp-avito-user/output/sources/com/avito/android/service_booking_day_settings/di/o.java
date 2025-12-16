package com.avito.android.service_booking_day_settings.di;

import android.content.Context;
import android.content.Intent;
import com.avito.android.service_booking_day_settings.DaySettingsActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import tt0.InterfaceC48717c;

/* compiled from: ServiceBookingDaySettingsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/di/o;", "Ltt0/c;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements InterfaceC48717c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f277160a;

    @Inject
    public o(@Y61.k Context context) {
        this.f277160a = context;
    }

    @Override // tt0.InterfaceC48717c
    @Y61.k
    public final Intent a(@Y61.k String str) {
        DaySettingsActivity.f276682n.getClass();
        return new Intent(this.f277160a, (Class<?>) DaySettingsActivity.class).putExtra("key_day_id", str);
    }
}
