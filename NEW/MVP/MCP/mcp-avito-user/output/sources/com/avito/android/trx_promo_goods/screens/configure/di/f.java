package com.avito.android.trx_promo_goods.screens.configure.di;

import com.avito.android.trx_promo_goods.deeplink.TrxPromoGoodsConfigureLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoGoodsConfigureDeeplinkMappingsModule_ProvideConfigureMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.deeplink.j f303456a;

    public f(com.avito.android.trx_promo_goods.screens.configure.deeplink.j jVar) {
        this.f303456a = jVar;
    }

    public static C43834a a(com.avito.android.trx_promo_goods.screens.configure.deeplink.j jVar) {
        c.f303453a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoGoodsConfigureLink.class, new com.avito.android.trx_promo_goods.screens.configure.deeplink.k(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TrxPromoGoodsConfigureLink.class), jVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f303456a);
    }
}
