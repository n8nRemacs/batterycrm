package com.avito.android.onboarding;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: BxOnboardingChainObserverImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<F> f209404a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32927k> f209405b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<n> f209406c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f209407d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f209408e;

    public v(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f209404a = provider;
        this.f209405b = provider2;
        this.f209406c = provider3;
        this.f209407d = uVar;
        this.f209408e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f209404a.get(), this.f209405b.get(), this.f209406c.get(), (InterfaceC32919c) this.f209407d.get(), this.f209408e.get());
    }
}
