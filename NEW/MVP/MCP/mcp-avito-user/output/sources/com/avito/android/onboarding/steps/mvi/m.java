package com.avito.android.onboarding.steps.mvi;

import H40.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OnboardingStepsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/onboarding/steps/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "LH40/c;", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements t<OnboardingStepsInternalAction, H40.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final H40.c b(OnboardingStepsInternalAction onboardingStepsInternalAction) {
        if (onboardingStepsInternalAction instanceof OnboardingStepsInternalAction.CloseScreen) {
            return c.a.f6940a;
        }
        return null;
    }
}
