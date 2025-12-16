package com.avito.android.str_seller_orders.orders_filters.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.str_seller_orders.orders_filters.mvi.StrOrdersFiltersScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersFiltersModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f289151a;

    public j(l lVar) {
        this.f289151a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f289151a.f393949a;
        f.f289145a.getClass();
        return new C28478k(StrOrdersFiltersScreen.f289184d, rVar, null, 4, null);
    }
}
