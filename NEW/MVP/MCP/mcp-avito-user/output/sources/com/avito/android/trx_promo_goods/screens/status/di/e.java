package com.avito.android.trx_promo_goods.screens.status.di;

import com.avito.android.trx_promo_goods.screens.status.deeplink.TrxPromoGoodsConfigureSuccessLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoGoodsStatusDeeplinkMappingsModule_ProvideConfigureSuccessMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.status.deeplink.e f303813a;

    public e(com.avito.android.trx_promo_goods.screens.status.deeplink.e eVar) {
        this.f303813a = eVar;
    }

    public static C43834a a(com.avito.android.trx_promo_goods.screens.status.deeplink.e eVar) {
        c.f303811a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoGoodsConfigureSuccessLink.class, new com.avito.android.trx_promo_goods.screens.status.deeplink.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TrxPromoGoodsConfigureSuccessLink.class), eVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f303813a);
    }
}
