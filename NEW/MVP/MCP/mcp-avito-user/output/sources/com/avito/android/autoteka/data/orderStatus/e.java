package com.avito.android.autoteka.data.orderStatus;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yj0.InterfaceC50257a;

/* compiled from: AutotekaPaymentStatusInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50257a> f96192a;

    public e(Provider<InterfaceC50257a> provider) {
        this.f96192a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f96192a.get());
    }
}
