package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersRangeReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final u f290319a;

    public n(u uVar) {
        this.f290319a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((o) this.f290319a.get());
    }
}
