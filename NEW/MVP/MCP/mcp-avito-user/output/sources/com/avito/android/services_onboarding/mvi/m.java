package com.avito.android.services_onboarding.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesOnboardingReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "LZu0/c;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements u<ServicesOnboardingInternalAction, Zu0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f279965b;

    @Inject
    public m(@Y61.k c cVar) {
        this.f279965b = cVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Zu0.c a(ServicesOnboardingInternalAction servicesOnboardingInternalAction, Zu0.c cVar) {
        ServicesOnboardingInternalAction servicesOnboardingInternalAction2 = servicesOnboardingInternalAction;
        Zu0.c cVar2 = cVar;
        this.f279965b.a(servicesOnboardingInternalAction2, cVar2);
        if (servicesOnboardingInternalAction2 instanceof ServicesOnboardingInternalAction.LoadContentFirstTime) {
            return ((ServicesOnboardingInternalAction.LoadContentFirstTime) servicesOnboardingInternalAction2).f279943b;
        }
        if (servicesOnboardingInternalAction2 instanceof ServicesOnboardingInternalAction.ShowError) {
            return Zu0.c.a(cVar2, null, ((ServicesOnboardingInternalAction.ShowError) servicesOnboardingInternalAction2).f279946b, false, 15);
        }
        if (servicesOnboardingInternalAction2 instanceof ServicesOnboardingInternalAction.VisiblePositionChanged) {
            return ((ServicesOnboardingInternalAction.VisiblePositionChanged) servicesOnboardingInternalAction2).f279949b < cVar2.f20557b.size() - 1 ? Zu0.c.a(cVar2, cVar2.f20560e, null, false, 61) : Zu0.c.a(cVar2, cVar2.f20559d, null, false, 61);
        }
        return servicesOnboardingInternalAction2 instanceof ServicesOnboardingInternalAction.Loading ? Zu0.c.a(cVar2, null, null, true, 15) : servicesOnboardingInternalAction2 instanceof ServicesOnboardingInternalAction.RestoreStep ? cVar2 : Zu0.c.a(cVar2, null, null, false, 63);
    }
}
