package com.avito.android.str_seller_orders.orders.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrOrdersScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersFragmentModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f288860a;

    public e(l lVar) {
        this.f288860a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f288860a.f393949a;
        c.f288859a.getClass();
        return new C28478k(StrOrdersScreen.f90516d, rVar, null, 4, null);
    }
}
