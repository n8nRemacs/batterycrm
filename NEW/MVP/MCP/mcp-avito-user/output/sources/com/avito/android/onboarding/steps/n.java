package com.avito.android.onboarding.steps;

import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingStepsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34389t0> f209366a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f209367b;

    public n(Provider<InterfaceC34389t0> provider, Provider<R0> provider2) {
        this.f209366a = provider;
        this.f209367b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f209366a.get(), this.f209367b.get());
    }
}
