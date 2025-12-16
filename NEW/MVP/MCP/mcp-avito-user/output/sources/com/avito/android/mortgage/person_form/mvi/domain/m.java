package com.avito.android.mortgage.person_form.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UpdateMortgageFormInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f201130a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<IZ.a> f201131b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f201132c;

    /* renamed from: d, reason: collision with root package name */
    public final u f201133d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.domain.check_access.b> f201134e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.person_form.mvi.domain.formatters.a> f201135f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.person_form.mvi.domain.formatters.d> f201136g;

    public m(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f201130a = provider;
        this.f201131b = provider2;
        this.f201132c = provider3;
        this.f201133d = uVar;
        this.f201134e = provider4;
        this.f201135f = provider5;
        this.f201136g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f201130a.get(), this.f201131b.get(), this.f201132c.get(), (com.avito.android.mortgage.person_form.mvi.domain.validators.c) this.f201133d.get(), this.f201134e.get(), this.f201135f.get(), this.f201136g.get());
    }
}
