package com.avito.android.payment.lib.di;

import com.avito.android.payment.lib.D;
import com.avito.android.payment.lib.di.a;
import com.avito.android.payment.lib.di.d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u60.InterfaceC48808a;

/* compiled from: PaymentMethodsModule_Declarations_ProvidePaymentMethodsInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48808a> f214635a;

    public i(Provider<InterfaceC48808a> provider) {
        this.f214635a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48808a interfaceC48808a = (InterfaceC48808a) ((a.c.d) this.f214635a).get();
        int i12 = d.a.f214620a;
        return new D(interfaceC48808a);
    }
}
