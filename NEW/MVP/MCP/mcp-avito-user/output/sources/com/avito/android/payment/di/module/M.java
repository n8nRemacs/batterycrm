package com.avito.android.payment.di.module;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PaymentStatusFormModule_ProvidePaymentStatusFormPresenter$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class M implements dagger.internal.h<com.avito.android.payment.form.status.j> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214219a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.payment.form.status.e> f214220b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f214221c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f214222d;

    public M(F f12, Provider provider, Provider provider2, dagger.internal.u uVar) {
        this.f214219a = f12;
        this.f214220b = provider;
        this.f214221c = provider2;
        this.f214222d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.payment.form.status.e eVar = this.f214220b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f214221c.get();
        com.avito.android.payment.form.status.h hVar = (com.avito.android.payment.form.status.h) this.f214222d.get();
        this.f214219a.getClass();
        return new com.avito.android.payment.form.status.k(eVar, hVar, interfaceC35745a5);
    }
}
