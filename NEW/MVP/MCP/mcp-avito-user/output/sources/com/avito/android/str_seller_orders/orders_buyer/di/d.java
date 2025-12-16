package com.avito.android.str_seller_orders.orders_buyer.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrOrdersBuyerScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.str_seller_orders.orders_buyer.di.c;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersBuyerFragmentModule_StrOrdersBuyerSupportModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f288955a;

    public d(l lVar) {
        this.f288955a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f288955a.f393949a;
        c.a.f288954a.getClass();
        return new C28478k(StrOrdersBuyerScreen.f90515d, rVar, null, 4, null);
    }
}
