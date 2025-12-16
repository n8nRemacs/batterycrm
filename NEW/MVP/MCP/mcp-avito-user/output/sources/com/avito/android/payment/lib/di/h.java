package com.avito.android.payment.lib.di;

import com.avito.android.payment.lib.C33020e;
import com.avito.android.payment.lib.di.a;
import com.avito.android.payment.lib.di.d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u60.InterfaceC48808a;

/* compiled from: PaymentMethodsModule_Declarations_ProvidePaymentGenericInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<C33020e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48808a> f214634a;

    public h(Provider<InterfaceC48808a> provider) {
        this.f214634a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48808a interfaceC48808a = (InterfaceC48808a) ((a.c.d) this.f214634a).get();
        int i12 = d.a.f214620a;
        return new C33020e(interfaceC48808a);
    }
}
