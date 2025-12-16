package com.avito.android.trx_promo_goods.screens.configure.di;

import com.avito.android.trx_promo_goods.screens.configure.deeplink.TrxPromoGoodsConfigureApplyLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoGoodsConfigureDeeplinkMappingsModule_ProvideConfigureApplyMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.deeplink.c f303454a;

    public d(com.avito.android.trx_promo_goods.screens.configure.deeplink.c cVar) {
        this.f303454a = cVar;
    }

    public static C43834a a(com.avito.android.trx_promo_goods.screens.configure.deeplink.c cVar) {
        c.f303453a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoGoodsConfigureApplyLink.class, new com.avito.android.trx_promo_goods.screens.configure.deeplink.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TrxPromoGoodsConfigureApplyLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f303454a);
    }
}
