package com.avito.android.payment.di.module;

import com.avito.android.payment.processing.C33028a;
import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import u60.InterfaceC48808a;

/* compiled from: PaymentProcessingModule_ProvidePaymentGenericFactory$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class C implements dagger.internal.h<C33028a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48808a> f214194a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f214195b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f214196c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f214197d;

    public C(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f214194a = provider;
        this.f214195b = provider2;
        this.f214196c = provider3;
        this.f214197d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48808a interfaceC48808a = this.f214194a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f214195b.get();
        com.avito.android.deep_linking.x xVar = this.f214196c.get();
        PaymentSessionTypeMarker paymentSessionTypeMarker = (PaymentSessionTypeMarker) this.f214197d.f393949a;
        int i12 = B.f214193a;
        return new C33028a(interfaceC48808a, interfaceC35745a5, xVar, paymentSessionTypeMarker);
    }
}
