package com.avito.android.str_seller_orders.orders_seller.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.str_seller_orders.orders_seller.mvi.StrOrdersSellerScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersPerfModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f289320a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f289321b;

    public m(l lVar, dagger.internal.l lVar2) {
        this.f289320a = lVar;
        this.f289321b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f289321b.f393949a;
        this.f289320a.getClass();
        return new C28478k(StrOrdersSellerScreen.f289530d, rVar, null, 4, null);
    }
}
