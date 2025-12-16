package com.avito.android.mortgage.person_form.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationBannerInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f201166a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<IZ.a> f201167b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f201168c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.mortgage.util.e f201169d;

    public q(com.avito.android.mortgage.util.e eVar, Provider provider, Provider provider2, Provider provider3) {
        this.f201166a = provider;
        this.f201167b = provider2;
        this.f201168c = provider3;
        this.f201169d = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f201166a.get();
        h31.e eVarB = dagger.internal.g.b(this.f201167b);
        a aVar = this.f201168c.get();
        this.f201169d.getClass();
        return new o(r02, eVarB, aVar, new com.avito.android.mortgage.util.d());
    }
}
