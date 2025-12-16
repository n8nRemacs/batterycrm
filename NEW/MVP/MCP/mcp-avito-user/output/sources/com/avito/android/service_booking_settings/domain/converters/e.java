package com.avito.android.service_booking_settings.domain.converters;

import Ut0.C15566a;
import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingWorkHoursContentDescriptionConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/domain/converters/e;", "Lcom/avito/android/service_booking_settings/domain/converters/d;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f277879a;

    @Inject
    public e(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f277879a = interfaceC35863o4;
    }

    @Override // com.avito.android.service_booking_settings.domain.converters.d
    @Y61.l
    public final C15566a a(@Y61.l ServiceBookingWorkHours.ServiceBookingContentDescription serviceBookingContentDescription) {
        if (serviceBookingContentDescription != null) {
            return new C15566a(this.f277879a.a(), serviceBookingContentDescription.getTitle(), serviceBookingContentDescription.getDescription());
        }
        return null;
    }
}
