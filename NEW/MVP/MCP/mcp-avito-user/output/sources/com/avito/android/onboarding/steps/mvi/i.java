package com.avito.android.onboarding.steps.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingStepsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding.steps.l> f209352a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f209353b;

    public i(dagger.internal.l lVar, Provider provider) {
        this.f209352a = provider;
        this.f209353b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f209352a.get(), (String) this.f209353b.f393949a);
    }
}
