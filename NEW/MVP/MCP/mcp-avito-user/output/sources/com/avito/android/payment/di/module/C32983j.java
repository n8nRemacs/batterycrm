package com.avito.android.payment.di.module;

import com.avito.android.payment.form.C33008k;

/* compiled from: PaymentGenericFormModule_ProvideDiffCalculator$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32983j implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214273a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214274b;

    public C32983j(C32977d c32977d, dagger.internal.u uVar) {
        this.f214273a = c32977d;
        this.f214274b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C33008k c33008k = (C33008k) this.f214274b.get();
        this.f214273a.getClass();
        return new com.avito.android.recycler.data_aware.i(c33008k, new com.avito.android.recycler.data_aware.j(), true, null, 8, null);
    }
}
