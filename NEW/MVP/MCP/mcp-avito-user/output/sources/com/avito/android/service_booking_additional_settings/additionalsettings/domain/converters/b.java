package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdditionalSettingsAppBarConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/b;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/a;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.a
    @Y61.k
    public final ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent.AdditionalSettingsAppBar a(@Y61.k String str, boolean z12) {
        return new ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent.AdditionalSettingsAppBar(str, z12);
    }
}
