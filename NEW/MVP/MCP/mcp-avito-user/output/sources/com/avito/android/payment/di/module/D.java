package com.avito.android.payment.di.module;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import u60.InterfaceC48808a;

/* compiled from: PaymentProcessingModule_ProvidePaymentStatusFactory$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class D implements dagger.internal.h<com.avito.android.payment.processing.r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48808a> f214198a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f214199b;

    public D(Provider<InterfaceC48808a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f214198a = provider;
        this.f214199b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48808a interfaceC48808a = this.f214198a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f214199b.get();
        int i12 = B.f214193a;
        return new com.avito.android.payment.processing.r(interfaceC48808a, interfaceC35745a5);
    }
}
