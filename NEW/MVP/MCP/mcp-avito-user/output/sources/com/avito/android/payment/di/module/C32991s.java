package com.avito.android.payment.di.module;

import com.avito.android.validation.d1;
import com.avito.android.validation.e1;
import com.avito.android.validation.g1;
import javax.inject.Provider;

/* compiled from: PaymentGenericFormModule_ProvideParametersValidatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32991s implements dagger.internal.h<d1> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214293a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214294b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<hJ.i> f214295c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<hJ.e> f214296d;

    public C32991s(C32977d c32977d, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f214293a = c32977d;
        this.f214294b = uVar;
        this.f214295c = provider;
        this.f214296d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g1 g1Var = (g1) this.f214294b.get();
        hJ.i iVar = this.f214295c.get();
        hJ.e eVar = this.f214296d.get();
        this.f214293a.getClass();
        return new e1(g1Var, iVar, eVar);
    }
}
