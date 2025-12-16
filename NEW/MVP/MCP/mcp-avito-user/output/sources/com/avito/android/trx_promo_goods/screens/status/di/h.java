package com.avito.android.trx_promo_goods.screens.status.di;

import com.avito.android.trx_promo_goods.screens.status.deeplink.TrxPromoGoodsConfigureSuccessLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TrxPromoGoodsStatusFragmentMappingsModule_ProvideTrxPromoFragmentStatusSuccessMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<A50.a> {

    /* compiled from: TrxPromoGoodsStatusFragmentMappingsModule_ProvideTrxPromoFragmentStatusSuccessMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f303816a = new h();
    }

    public static h a() {
        return a.f303816a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f.f303814a.getClass();
        return new A50.a(m0.f406844a.b(TrxPromoGoodsConfigureSuccessLink.class), new com.avito.android.trx_promo_goods.screens.status.h());
    }
}
