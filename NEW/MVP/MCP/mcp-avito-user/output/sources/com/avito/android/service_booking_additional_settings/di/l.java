package com.avito.android.service_booking_additional_settings.di;

import android.content.Context;
import android.content.Intent;
import com.avito.android.service_booking_additional_settings.ServiceBookingAdditionalSettingsActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingAdditionalSettingsFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/di/l;", "Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/a;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f275218a;

    @Inject
    public l(@Y61.k Context context) {
        this.f275218a = context;
    }

    @Override // com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.a
    @Y61.k
    public final Intent a() {
        ServiceBookingAdditionalSettingsActivity.f274815m.getClass();
        return new Intent(this.f275218a, (Class<?>) ServiceBookingAdditionalSettingsActivity.class);
    }
}
