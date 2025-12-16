package com.avito.android.payment.di.module;

import com.avito.android.payment.form.C32999b;
import com.avito.android.payment.form.InterfaceC33000c;

/* compiled from: PaymentGenericFormModule_ProvideDelegateItemConverter$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32982i implements dagger.internal.h<InterfaceC33000c> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214271a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214272b;

    public C32982i(C32977d c32977d, dagger.internal.u uVar) {
        this.f214271a = c32977d;
        this.f214272b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.category_parameters.a aVar = (com.avito.android.category_parameters.a) this.f214272b.get();
        this.f214271a.getClass();
        return new C32999b(aVar);
    }
}
