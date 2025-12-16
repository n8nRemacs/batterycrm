package com.avito.android.mortgage.person_form.mvi.domain;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetMortgageFormUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f201050a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.person_form.mvi.domain.formatters.a> f201051b;

    /* renamed from: c, reason: collision with root package name */
    public final u f201052c;

    public d(u uVar, Provider provider, Provider provider2) {
        this.f201050a = provider;
        this.f201051b = provider2;
        this.f201052c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f201050a.get(), this.f201051b.get(), (com.avito.android.mortgage.person_form.mvi.domain.formatters.d) this.f201052c.get());
    }
}
