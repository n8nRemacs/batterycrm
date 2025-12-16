package com.avito.android.onboarding.step;

import javax.inject.Provider;

/* compiled from: BxOnboardingNotificationStepInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.G> f209226a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P30.a> f209227b;

    public r(Provider<com.avito.android.permissions.G> provider, Provider<P30.a> provider2) {
        this.f209226a = provider;
        this.f209227b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f209226a.get(), this.f209227b.get());
    }
}
