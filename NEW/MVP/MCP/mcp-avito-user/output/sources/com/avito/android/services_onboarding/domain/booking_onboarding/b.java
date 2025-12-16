package com.avito.android.services_onboarding.domain.booking_onboarding;

import Bs0.InterfaceC13182a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LoadServicesOnboardingUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13182a> f279875a;

    /* renamed from: b, reason: collision with root package name */
    public final Yu0.f f279876b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f279877c;

    public b(Provider provider, Yu0.f fVar, Provider provider2) {
        this.f279875a = provider;
        this.f279876b = fVar;
        this.f279877c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(dagger.internal.g.b(this.f279875a), (Yu0.d) this.f279876b.get(), this.f279877c.get());
    }
}
