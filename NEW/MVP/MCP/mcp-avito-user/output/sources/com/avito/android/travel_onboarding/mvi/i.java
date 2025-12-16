package com.avito.android.travel_onboarding.mvi;

import ZE0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.travel_onboarding.mvi.entity.TravelOnboardingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TravelOnboardingOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "LZE0/b;", "<init>", "()V", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements t<TravelOnboardingInternalAction, ZE0.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final ZE0.b b(TravelOnboardingInternalAction travelOnboardingInternalAction) {
        ZE0.b cVar;
        TravelOnboardingInternalAction travelOnboardingInternalAction2 = travelOnboardingInternalAction;
        if (travelOnboardingInternalAction2 instanceof TravelOnboardingInternalAction.CloseScreen) {
            return b.a.f20005a;
        }
        if (travelOnboardingInternalAction2 instanceof TravelOnboardingInternalAction.OpenAuthWithRedirectDeeplink) {
            cVar = new b.C1429b(((TravelOnboardingInternalAction.OpenAuthWithRedirectDeeplink) travelOnboardingInternalAction2).f302312b);
        } else {
            if (!(travelOnboardingInternalAction2 instanceof TravelOnboardingInternalAction.OpenDeeplink)) {
                return null;
            }
            cVar = new b.c(((TravelOnboardingInternalAction.OpenDeeplink) travelOnboardingInternalAction2).f302313b);
        }
        return cVar;
    }
}
