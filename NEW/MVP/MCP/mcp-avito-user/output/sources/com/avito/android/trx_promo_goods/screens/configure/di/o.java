package com.avito.android.trx_promo_goods.screens.configure.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.trx_promo_goods.TrxPromoGoodsConfigureScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoGoodsConfigureModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f303470a;

    public o(dagger.internal.l lVar) {
        this.f303470a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f303470a.f393949a;
        j.f303460a.getClass();
        TrxPromoGoodsConfigureScreen trxPromoGoodsConfigureScreen = TrxPromoGoodsConfigureScreen.f303318d;
        trxPromoGoodsConfigureScreen.getClass();
        return new C28478k(trxPromoGoodsConfigureScreen, rVar, TrxPromoGoodsConfigureScreen.f303319e);
    }
}
