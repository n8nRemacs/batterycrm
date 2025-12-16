package com.avito.android.services_onboarding.domain.cpx_onboarding;

import Bs0.InterfaceC13182a;
import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LoadServicesCpxOnboardingUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13182a> f279915a;

    /* renamed from: b, reason: collision with root package name */
    public final Yu0.f f279916b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f279917c;

    /* renamed from: d, reason: collision with root package name */
    public final l f279918d;

    public b(Provider provider, Yu0.f fVar, Provider provider2, l lVar) {
        this.f279915a = provider;
        this.f279916b = fVar;
        this.f279917c = provider2;
        this.f279918d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(dagger.internal.g.b(this.f279915a), (Yu0.d) this.f279916b.get(), this.f279917c.get(), (ServicesOnboardingTarget) this.f279918d.f393949a);
    }
}
