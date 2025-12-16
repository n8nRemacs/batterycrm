package com.avito.android.onboarding.steps.mvi;

import com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OnboardingStepsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/steps/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements com.avito.android.arch.mvi.b<OnboardingStepsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding.steps.l f209350a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f209351b;

    @Inject
    public h(@Y61.k com.avito.android.onboarding.steps.l lVar, @Y61.k String str) {
        this.f209350a = lVar;
        this.f209351b = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<OnboardingStepsInternalAction> a() {
        return C43175k.G(new g(this, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
