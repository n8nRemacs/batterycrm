package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideParametersValidatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class U implements dagger.internal.h<d1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f319301a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f319302b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<hJ.e> f319303c;

    public U(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f319301a = uVar;
        this.f319302b = uVar2;
        this.f319303c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g1 g1Var = (g1) this.f319301a.get();
        hJ.i iVar = (hJ.i) this.f319302b.get();
        hJ.e eVar = this.f319303c.get();
        A.f319242a.getClass();
        return new e1(g1Var, iVar, eVar);
    }
}
