package com.avito.android.onboarding;

import com.avito.android.onboarding.model.BxOnboardingStep;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BxOnboardingChainInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/onboarding/r;", "Lcom/avito/android/onboarding/q;", "Lcom/avito/android/onboarding/t;", "Lcom/avito/android/onboarding/n;", "Lcom/avito/android/onboarding/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements q, t, n, InterfaceC32919c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final t f209141a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f209142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32919c f209143c;

    @Inject
    public r(@Y61.k t tVar, @Y61.k n nVar, @Y61.k InterfaceC32919c interfaceC32919c) {
        this.f209141a = tVar;
        this.f209142b = nVar;
        this.f209143c = interfaceC32919c;
    }

    @Override // com.avito.android.onboarding.t
    @Y61.k
    public final InterfaceC43160i<BxOnboardingStep> a() {
        return this.f209141a.a();
    }

    @Override // com.avito.android.onboarding.InterfaceC32919c
    @Y61.k
    public final N0 b(boolean z12, boolean z13) {
        return this.f209143c.b(z12, z13);
    }

    @Override // com.avito.android.onboarding.n
    public final void c(@Y61.k BxOnboardingStep.OnBoardingSheet onBoardingSheet) {
        this.f209142b.c(onBoardingSheet);
    }

    @Override // com.avito.android.onboarding.n
    public final void d(@Y61.k BxOnboardingStep.View.Tooltip tooltip) {
        this.f209142b.d(tooltip);
    }

    @Override // com.avito.android.onboarding.n
    @Y61.k
    public final InterfaceC43160i<BxOnboardingStep> e() {
        return this.f209142b.e();
    }

    @Override // com.avito.android.onboarding.InterfaceC32919c
    @Y61.k
    public final InterfaceC43160i<BxOnboardingStep> f(@Y61.k InterfaceC43160i<? extends BxOnboardingStep> interfaceC43160i, @Y61.k InterfaceC43160i<? extends BxOnboardingStep> interfaceC43160i2, @Y61.k InterfaceC43160i<? extends BxOnboardingStep> interfaceC43160i3) {
        return this.f209143c.f(interfaceC43160i, interfaceC43160i2, interfaceC43160i3);
    }

    @Override // com.avito.android.onboarding.InterfaceC32919c
    @Y61.k
    public final N0 g(boolean z12) {
        return this.f209143c.g(z12);
    }

    @Override // com.avito.android.onboarding.n
    @Y61.k
    public final InterfaceC43160i<BxOnboardingStep> getQueue() {
        return this.f209142b.getQueue();
    }

    @Override // com.avito.android.onboarding.InterfaceC32919c
    @Y61.k
    public final N0 unlock() {
        return this.f209143c.unlock();
    }
}
