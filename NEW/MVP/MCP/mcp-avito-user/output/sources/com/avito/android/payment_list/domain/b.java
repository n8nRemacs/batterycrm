package com.avito.android.payment_list.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import eG.InterfaceC40001a;
import javax.inject.Provider;

/* compiled from: PaymentListInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.payment_list.mvi.b f214978a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40001a> f214979b;

    public b(com.avito.android.payment_list.mvi.b bVar, Provider provider) {
        this.f214978a = bVar;
        this.f214979b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f214978a.getClass();
        return new a(new com.avito.android.payment_list.mvi.a(), this.f214979b.get());
    }
}
