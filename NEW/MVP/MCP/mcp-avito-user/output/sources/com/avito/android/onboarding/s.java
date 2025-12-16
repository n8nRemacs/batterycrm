package com.avito.android.onboarding;

import javax.inject.Provider;

/* compiled from: BxOnboardingChainInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f209144a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n> f209145b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32919c> f209146c;

    public s(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f209144a = uVar;
        this.f209145b = provider;
        this.f209146c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((t) this.f209144a.get(), this.f209145b.get(), this.f209146c.get());
    }
}
