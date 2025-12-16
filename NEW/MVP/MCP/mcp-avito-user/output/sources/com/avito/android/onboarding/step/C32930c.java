package com.avito.android.onboarding.step;

import javax.inject.Provider;

/* compiled from: BxOnboardingAskNotificationStepInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.onboarding.step.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32930c implements dagger.internal.h<C32929b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f209195a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding.E> f209196b;

    public C32930c(dagger.internal.u uVar, Provider provider) {
        this.f209195a = uVar;
        this.f209196b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32929b((com.avito.android.notification.h) this.f209195a.get(), this.f209196b.get());
    }
}
