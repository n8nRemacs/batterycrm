package com.avito.android.trx_promo_goods.screens.configure.di;

import com.avito.android.trx_promo_goods.deeplink.TrxPromoGoodsConfigureLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TrxPromoGoodsConfigureFragmentMappingsModule_ProvideTrxPromoMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<A50.a> {

    /* compiled from: TrxPromoGoodsConfigureFragmentMappingsModule_ProvideTrxPromoMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f303459a = new i();
    }

    public static i a() {
        return a.f303459a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h.f303458a.getClass();
        return new A50.a(m0.f406844a.b(TrxPromoGoodsConfigureLink.class), new com.avito.android.trx_promo_goods.screens.configure.e());
    }
}
