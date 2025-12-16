package com.avito.android.service_booking.mvi.step.mvi;

import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.avito.android.service_booking.mvi.step.mvi.entity.a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingMviStepOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/a;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements com.avito.android.arch.mvi.t<ServiceBookingMviStepInternalAction, com.avito.android.service_booking.mvi.step.mvi.entity.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking.storage.preferences.a f274785b;

    @Inject
    public n(@Y61.k com.avito.android.service_booking.storage.preferences.a aVar) {
        this.f274785b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final com.avito.android.service_booking.mvi.step.mvi.entity.a b(ServiceBookingMviStepInternalAction serviceBookingMviStepInternalAction) {
        ServiceBookingMviStepInternalAction serviceBookingMviStepInternalAction2 = serviceBookingMviStepInternalAction;
        if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.Finish) {
            return new a.C8153a(((ServiceBookingMviStepInternalAction.Finish) serviceBookingMviStepInternalAction2).f274674b);
        }
        if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OpenPreviousStep) {
            return new a.c(((ServiceBookingMviStepInternalAction.OpenPreviousStep) serviceBookingMviStepInternalAction2).f274692b);
        }
        if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OpenNextStep) {
            ServiceBookingMviStepInternalAction.OpenNextStep openNextStep = (ServiceBookingMviStepInternalAction.OpenNextStep) serviceBookingMviStepInternalAction2;
            return new a.e(openNextStep.f274689b, openNextStep.f274690c);
        }
        if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnServiceInfoClicked) {
            return new a.d(((ServiceBookingMviStepInternalAction.OnServiceInfoClicked) serviceBookingMviStepInternalAction2).f274684b.f429410f);
        }
        if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OpenDeeplink) {
            return new a.d(((ServiceBookingMviStepInternalAction.OpenDeeplink) serviceBookingMviStepInternalAction2).f274688b);
        }
        if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnShowOnboarding) {
            com.avito.android.service_booking.storage.preferences.a aVar = this.f274785b;
            if (!aVar.b()) {
                aVar.a();
                return new a.d(((ServiceBookingMviStepInternalAction.OnShowOnboarding) serviceBookingMviStepInternalAction2).f274686b);
            }
        } else {
            if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.OnShowAnimationOverlay) {
                return new a.b(((ServiceBookingMviStepInternalAction.OnShowAnimationOverlay) serviceBookingMviStepInternalAction2).f274685b);
            }
            if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.ShowToastError) {
                ServiceBookingMviStepInternalAction.ShowToastError showToastError = (ServiceBookingMviStepInternalAction.ShowToastError) serviceBookingMviStepInternalAction2;
                return new a.g(showToastError.f274699b, showToastError.f274700c, showToastError.f274702e);
            }
            if (serviceBookingMviStepInternalAction2 instanceof ServiceBookingMviStepInternalAction.ProcessJsonView) {
                return new a.f(((ServiceBookingMviStepInternalAction.ProcessJsonView) serviceBookingMviStepInternalAction2).f274693b);
            }
        }
        return null;
    }
}
