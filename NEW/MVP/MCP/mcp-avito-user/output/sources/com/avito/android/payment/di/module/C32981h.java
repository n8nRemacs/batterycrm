package com.avito.android.payment.di.module;

import javax.inject.Provider;

/* compiled from: PaymentGenericFormModule_ProvideDataAwareAdapterPresenter$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32981h implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214267a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<androidx.recyclerview.widget.C> f214268b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f214269c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f214270d;

    public C32981h(C32977d c32977d, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f214267a = c32977d;
        this.f214268b = provider;
        this.f214269c = provider2;
        this.f214270d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f214268b);
        com.avito.konveyor.adapter.a aVar = this.f214269c.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f214270d.get();
        this.f214267a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
