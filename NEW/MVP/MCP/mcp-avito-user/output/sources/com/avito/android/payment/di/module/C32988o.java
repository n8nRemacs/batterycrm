package com.avito.android.payment.di.module;

import com.avito.android.payment.form.C33007j;
import com.avito.android.payment.form.InterfaceC33000c;
import com.avito.android.payment.form.InterfaceC33006i;
import javax.inject.Provider;

/* compiled from: PaymentGenericFormModule_ProvideItemConverter$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32988o implements dagger.internal.h<InterfaceC33006i> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214285a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214286b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f214287c;

    public C32988o(C32977d c32977d, dagger.internal.u uVar, Provider provider) {
        this.f214285a = c32977d;
        this.f214286b = uVar;
        this.f214287c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33000c interfaceC33000c = (InterfaceC33000c) this.f214286b.get();
        com.avito.android.util.text.a aVar = this.f214287c.get();
        this.f214285a.getClass();
        return new C33007j(interfaceC33000c, aVar);
    }
}
