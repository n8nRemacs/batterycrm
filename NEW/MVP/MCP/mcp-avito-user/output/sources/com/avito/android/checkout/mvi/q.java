package com.avito.android.checkout.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckoutReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.checkout.data.c f118397a;

    public q(com.avito.android.checkout.data.c cVar) {
        this.f118397a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f118397a.getClass();
        return new p(new com.avito.android.checkout.data.a());
    }
}
