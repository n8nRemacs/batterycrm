package com.avito.android.autoteka.data.order;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yj0.InterfaceC50257a;

/* compiled from: AutotekaLoadPaymentInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50257a> f96183a;

    public o(Provider<InterfaceC50257a> provider) {
        this.f96183a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f96183a.get());
    }
}
