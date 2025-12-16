package com.avito.android.onboarding.steps.mvi;

import H40.a;
import com.avito.android.arch.mvi.u;
import com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OnboardingStepsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/onboarding/steps/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "LH40/d;", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements u<OnboardingStepsInternalAction, H40.d> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final H40.d a(OnboardingStepsInternalAction onboardingStepsInternalAction, H40.d dVar) {
        OnboardingStepsInternalAction onboardingStepsInternalAction2 = onboardingStepsInternalAction;
        H40.d dVar2 = dVar;
        return onboardingStepsInternalAction2 instanceof OnboardingStepsInternalAction.ShowLoading ? H40.d.a(dVar2, a.c.f6935a, null, null, 6) : onboardingStepsInternalAction2 instanceof OnboardingStepsInternalAction.ShowLoadedPage ? H40.d.a(dVar2, a.b.f6934a, ((OnboardingStepsInternalAction.ShowLoadedPage) onboardingStepsInternalAction2).f209340b, null, 4) : onboardingStepsInternalAction2 instanceof OnboardingStepsInternalAction.ShowError ? H40.d.a(dVar2, new a.C0394a(((OnboardingStepsInternalAction.ShowError) onboardingStepsInternalAction2).f209338b), null, null, 6) : onboardingStepsInternalAction2 instanceof OnboardingStepsInternalAction.OnPageSelected ? H40.d.a(dVar2, null, null, Integer.valueOf(((OnboardingStepsInternalAction.OnPageSelected) onboardingStepsInternalAction2).f209337b), 3) : dVar2;
    }
}
