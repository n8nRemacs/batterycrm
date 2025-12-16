package com.avito.android.onboarding.step;

import javax.inject.Provider;
import nM.InterfaceC44291a;

/* compiled from: BxOnboardingMiuiStepInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44291a> f209223a;

    public p(Provider<InterfaceC44291a> provider) {
        this.f209223a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f209223a.get());
    }
}
