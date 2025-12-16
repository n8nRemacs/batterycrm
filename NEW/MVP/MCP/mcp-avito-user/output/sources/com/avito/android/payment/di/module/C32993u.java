package com.avito.android.payment.di.module;

import com.avito.android.payment.form.C33012o;
import com.avito.android.payment.form.InterfaceC33003f;
import com.avito.android.payment.form.InterfaceC33006i;
import com.avito.android.payment.form.InterfaceC33009l;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PaymentGenericFormModule_ProvidePaymentGenericFormPresenter$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32993u implements dagger.internal.h<InterfaceC33009l> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214302a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC33003f> f214303b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f214304c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33006i> f214305d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f214306e;

    public C32993u(C32977d c32977d, Provider provider, Provider provider2, Provider provider3, dagger.internal.f fVar) {
        this.f214302a = c32977d;
        this.f214303b = provider;
        this.f214304c = provider2;
        this.f214305d = provider3;
        this.f214306e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33003f interfaceC33003f = this.f214303b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f214304c.get();
        return new C33012o((com.avito.android.recycler.data_aware.c) this.f214306e.get(), interfaceC33003f, this.f214305d.get(), interfaceC35745a5, this.f214302a.f214252b);
    }
}
