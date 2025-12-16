package com.avito.android.service_booking_settings.domain.converters;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingWorkHoursLicenseAgreementConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/domain/converters/k;", "Lcom/avito/android/service_booking_settings/domain/converters/j;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f277882a;

    @Inject
    public k(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f277882a = interfaceC35863o4;
    }

    @Override // com.avito.android.service_booking_settings.domain.converters.j
    @Y61.l
    public final Ut0.e a(@Y61.l AttributedText attributedText) {
        if (attributedText != null) {
            return new Ut0.e(this.f277882a.a(), attributedText);
        }
        return null;
    }
}
