package com.avito.android.onboarding;

import com.avito.android.onboarding.model.BxOnboardingStep;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BxOnboardingChainHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/n;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface n {
    void c(@Y61.k BxOnboardingStep.OnBoardingSheet onBoardingSheet);

    void d(@Y61.k BxOnboardingStep.View.Tooltip tooltip);

    @Y61.k
    InterfaceC43160i<BxOnboardingStep> e();

    @Y61.k
    InterfaceC43160i<BxOnboardingStep> getQueue();
}
