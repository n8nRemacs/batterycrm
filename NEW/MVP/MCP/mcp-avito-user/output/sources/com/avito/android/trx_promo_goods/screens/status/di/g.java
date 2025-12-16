package com.avito.android.trx_promo_goods.screens.status.di;

import com.avito.android.trx_promo_goods.screens.status.deeplink.TrxPromoGoodsConfigureForbiddenLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TrxPromoGoodsStatusFragmentMappingsModule_ProvideTrxPromoFragmentStatusForbiddenMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<A50.a> {

    /* compiled from: TrxPromoGoodsStatusFragmentMappingsModule_ProvideTrxPromoFragmentStatusForbiddenMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f303815a = new g();
    }

    public static g a() {
        return a.f303815a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f.f303814a.getClass();
        return new A50.a(m0.f406844a.b(TrxPromoGoodsConfigureForbiddenLink.class), new com.avito.android.trx_promo_goods.screens.status.a());
    }
}
