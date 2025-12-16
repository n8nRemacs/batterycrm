package com.avito.android.trx_promo_goods.screens.configure.di;

import com.avito.android.trx_promo_goods.screens.configure.deeplink.TrxPromoGoodsConfigureCancelLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoGoodsConfigureDeeplinkMappingsModule_ProvideConfigureCancelMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.deeplink.g f303455a;

    public e(com.avito.android.trx_promo_goods.screens.configure.deeplink.g gVar) {
        this.f303455a = gVar;
    }

    public static C43834a a(com.avito.android.trx_promo_goods.screens.configure.deeplink.g gVar) {
        c.f303453a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoGoodsConfigureCancelLink.class, new com.avito.android.trx_promo_goods.screens.configure.deeplink.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TrxPromoGoodsConfigureCancelLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f303455a);
    }
}
