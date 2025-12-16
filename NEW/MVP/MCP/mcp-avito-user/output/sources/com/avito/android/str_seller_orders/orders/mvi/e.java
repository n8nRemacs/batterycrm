package com.avito.android.str_seller_orders.orders.mvi;

import com.avito.android.str_seller_orders.orders.StrOrdersOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f288886a;

    public e(dagger.internal.l lVar) {
        this.f288886a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((StrOrdersOpenParams) this.f288886a.f393949a);
    }
}
