package com.avito.android.payment.lib.di;

import com.avito.android.payment.lib.di.d;
import com.avito.android.payment.processing.z;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u60.InterfaceC48808a;

/* compiled from: PaymentMethodsModule_Declarations_ProvidePaymentStatusInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<com.avito.android.payment.processing.y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48808a> f214636a;

    public j(Provider<InterfaceC48808a> provider) {
        this.f214636a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48808a interfaceC48808a = this.f214636a.get();
        int i12 = d.a.f214620a;
        return new z(interfaceC48808a);
    }
}
