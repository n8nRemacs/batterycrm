package com.avito.android.checkout.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckoutBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.checkout.domain.k f118383a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f118384b;

    public j(com.avito.android.checkout.domain.k kVar, dagger.internal.l lVar) {
        this.f118383a = kVar;
        this.f118384b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.checkout.domain.j) this.f118383a.get(), (String) this.f118384b.f393949a);
    }
}
