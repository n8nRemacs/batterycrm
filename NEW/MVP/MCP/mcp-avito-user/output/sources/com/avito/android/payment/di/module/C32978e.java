package com.avito.android.payment.di.module;

import javax.inject.Provider;

/* compiled from: PaymentGenericFormModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32978e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214256a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f214257b;

    public C32978e(C32977d c32977d, Provider<com.avito.konveyor.a> provider) {
        this.f214256a = c32977d;
        this.f214257b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f214257b.get();
        this.f214256a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
