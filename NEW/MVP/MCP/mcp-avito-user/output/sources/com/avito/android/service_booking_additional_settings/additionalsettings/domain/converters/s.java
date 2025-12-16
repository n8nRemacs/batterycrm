package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import Rs0.C15078a;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdditionalSettingsHelpButtonConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/s;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/r;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements r {
    @Inject
    public s() {
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.r
    @Y61.l
    public final ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent.AdditionalSettingsHelpButton a(@Y61.l C15078a.C0989a c0989a) {
        if (c0989a != null) {
            return new ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent.AdditionalSettingsHelpButton(c0989a.getText(), c0989a.getUrl(), c0989a.getTextColor());
        }
        return null;
    }
}
