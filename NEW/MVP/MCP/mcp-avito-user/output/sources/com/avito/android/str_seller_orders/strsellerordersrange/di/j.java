package com.avito.android.str_seller_orders.strsellerordersrange.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrSellerOrdersRangeScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerOrdersRangeModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f290241a;

    public j(l lVar) {
        this.f290241a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f290241a.f393949a;
        f.f290236a.getClass();
        return new C28478k(StrSellerOrdersRangeScreen.f90521d, rVar, null, 4, null);
    }
}
