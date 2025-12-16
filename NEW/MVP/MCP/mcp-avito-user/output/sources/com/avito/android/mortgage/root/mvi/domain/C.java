package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import javax.inject.Provider;

/* compiled from: MortgageApplicationInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class C implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f202982a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41203a> f202983b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.mortgage.util.e f202984c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f202985d;

    public C(com.avito.android.mortgage.util.e eVar, Provider provider, Provider provider2, Provider provider3) {
        this.f202982a = provider;
        this.f202983b = provider2;
        this.f202984c = eVar;
        this.f202985d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f202982a));
        h31.e eVarA2 = dagger.internal.g.a(dagger.internal.w.a(this.f202983b));
        this.f202984c.getClass();
        return new A(eVarA, eVarA2, new com.avito.android.mortgage.util.d(), this.f202985d.get());
    }
}
