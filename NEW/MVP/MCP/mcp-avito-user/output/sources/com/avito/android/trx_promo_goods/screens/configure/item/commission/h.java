package com.avito.android.trx_promo_goods.screens.configure.item.commission;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoGoodsConfigureCommissionPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f303500a;

    /* renamed from: b, reason: collision with root package name */
    public final l f303501b;

    public h(l lVar, l lVar2) {
        this.f303500a = lVar;
        this.f303501b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.l) this.f303500a.f393949a, (Y41.l) this.f303501b.f393949a);
    }
}
