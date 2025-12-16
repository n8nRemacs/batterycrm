package com.avito.android.payment.di.module;

import com.avito.android.payment.form.C33004g;
import com.avito.android.payment.form.InterfaceC33003f;
import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.validation.InterfaceC36020m;
import javax.inject.Provider;
import u60.InterfaceC48808a;

/* compiled from: PaymentGenericFormModule_ProvidePaymentGenericFormInteractor$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32992t implements dagger.internal.h<InterfaceC33003f> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214297a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48808a> f214298b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC36020m> f214299c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f214300d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f214301e;

    public C32992t(C32977d c32977d, Provider provider, Provider provider2, Provider provider3, dagger.internal.l lVar) {
        this.f214297a = c32977d;
        this.f214298b = provider;
        this.f214299c = provider2;
        this.f214300d = provider3;
        this.f214301e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48808a interfaceC48808a = this.f214298b.get();
        InterfaceC36020m interfaceC36020m = this.f214299c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f214300d.get();
        PaymentSessionTypeMarker paymentSessionTypeMarker = (PaymentSessionTypeMarker) this.f214301e.f393949a;
        C32977d c32977d = this.f214297a;
        return new C33004g(interfaceC48808a, interfaceC36020m, c32977d.f214253c, c32977d.f214254d, interfaceC35745a5, paymentSessionTypeMarker, c32977d.f214251a);
    }
}
