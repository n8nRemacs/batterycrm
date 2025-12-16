package com.avito.android.services_onboarding.mvi;

import Zu0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.services_onboarding.mvi.entity.ServicesOnboardingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesOnboardingOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "LZu0/b;", "<init>", "()V", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements t<ServicesOnboardingInternalAction, Zu0.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Zu0.b b(ServicesOnboardingInternalAction servicesOnboardingInternalAction) {
        ServicesOnboardingInternalAction servicesOnboardingInternalAction2 = servicesOnboardingInternalAction;
        if (servicesOnboardingInternalAction2 instanceof ServicesOnboardingInternalAction.RestoreStep) {
            return new b.C1470b(((ServicesOnboardingInternalAction.RestoreStep) servicesOnboardingInternalAction2).f279945b);
        }
        if (servicesOnboardingInternalAction2 instanceof ServicesOnboardingInternalAction.SwipeToNextPage) {
            return b.c.f20554a;
        }
        if (servicesOnboardingInternalAction2 instanceof ServicesOnboardingInternalAction.OpenDeeplink) {
            return new b.a(((ServicesOnboardingInternalAction.OpenDeeplink) servicesOnboardingInternalAction2).f279944b);
        }
        return null;
    }
}
