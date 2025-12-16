package com.avito.android.trx_promo_goods.screens.configure;

import com.avito.android.trx_promo_goods.screens.configure.mvi.l;
import com.avito.android.trx_promo_goods.screens.configure.mvi.m;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TrxPromoGoodsConfigureViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final m f303480a;

    public h(m mVar) {
        this.f303480a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f303480a.get();
        i2.f411430a.getClass();
        return new g(lVar, i2.a.f411433c);
    }
}
