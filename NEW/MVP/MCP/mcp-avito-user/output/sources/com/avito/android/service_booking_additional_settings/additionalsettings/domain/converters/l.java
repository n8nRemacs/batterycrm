package com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters;

import Rs0.C15078a;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdditionalSettingsConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/l;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/converters/k;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f274841a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f274842b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n f274843c;

    @Inject
    public l(@Y61.k a aVar, @Y61.k r rVar, @Y61.k n nVar) {
        this.f274841a = aVar;
        this.f274842b = rVar;
        this.f274843c = nVar;
    }

    @Override // com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.k
    @Y61.k
    public final ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent a(@Y61.k C15078a c15078a) {
        return new ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent(this.f274841a.a(c15078a.getTitle(), c15078a.getHasCloseButton()), this.f274842b.a(c15078a.getHelpButton()), c15078a.getLicenseAgreement(), this.f274843c.a(c15078a.a()));
    }
}
