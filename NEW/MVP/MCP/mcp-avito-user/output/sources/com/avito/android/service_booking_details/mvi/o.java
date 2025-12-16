package com.avito.android.service_booking_details.mvi;

import Bt0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.service_booking_details.mvi.entity.ServiceBookingItemDetailsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingItemDetailsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "LBt0/b;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements t<ServiceBookingItemDetailsInternalAction, Bt0.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_details.domain.preferences.a f277451b;

    @Inject
    public o(@Y61.k com.avito.android.service_booking_details.domain.preferences.a aVar) {
        this.f277451b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Bt0.b b(ServiceBookingItemDetailsInternalAction serviceBookingItemDetailsInternalAction) {
        ServiceBookingItemDetailsInternalAction serviceBookingItemDetailsInternalAction2 = serviceBookingItemDetailsInternalAction;
        if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.Close) {
            return new b.a(((ServiceBookingItemDetailsInternalAction.Close) serviceBookingItemDetailsInternalAction2).f277364b);
        }
        if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.HandleDeeplink) {
            return new b.c(((ServiceBookingItemDetailsInternalAction.HandleDeeplink) serviceBookingItemDetailsInternalAction2).f277369b);
        }
        if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.OnShowOnboarding) {
            com.avito.android.service_booking_details.domain.preferences.a aVar = this.f277451b;
            if (!aVar.b()) {
                aVar.a();
                return new b.c(((ServiceBookingItemDetailsInternalAction.OnShowOnboarding) serviceBookingItemDetailsInternalAction2).f277371b);
            }
        } else {
            if (serviceBookingItemDetailsInternalAction2.equals(ServiceBookingItemDetailsInternalAction.ShowUxFeedbackOrderCancellation.f277382b)) {
                return b.e.f1764a;
            }
            if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.CopyPhoneToClipboard) {
                return new b.C0075b(((ServiceBookingItemDetailsInternalAction.CopyPhoneToClipboard) serviceBookingItemDetailsInternalAction2).f277366b);
            }
            if (serviceBookingItemDetailsInternalAction2 instanceof ServiceBookingItemDetailsInternalAction.PhoneNumberErrorToast) {
                return new b.d(((ServiceBookingItemDetailsInternalAction.PhoneNumberErrorToast) serviceBookingItemDetailsInternalAction2).f277375b);
            }
        }
        return null;
    }
}
