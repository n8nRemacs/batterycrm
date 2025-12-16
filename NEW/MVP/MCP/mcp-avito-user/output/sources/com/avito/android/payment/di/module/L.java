package com.avito.android.payment.di.module;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import u60.InterfaceC48808a;

/* compiled from: PaymentStatusFormModule_ProvidePaymentStatusFormInteractor$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class L implements dagger.internal.h<com.avito.android.payment.form.status.e> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214216a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48808a> f214217b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f214218c;

    public L(F f12, Provider<InterfaceC48808a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f214216a = f12;
        this.f214217b = provider;
        this.f214218c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48808a interfaceC48808a = this.f214217b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f214218c.get();
        F f12 = this.f214216a;
        return new com.avito.android.payment.form.status.f(interfaceC48808a, f12.f214203c, interfaceC35745a5, f12.f214201a);
    }
}
