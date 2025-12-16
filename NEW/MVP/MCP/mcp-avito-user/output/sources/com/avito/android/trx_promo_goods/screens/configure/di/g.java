package com.avito.android.trx_promo_goods.screens.configure.di;

import com.avito.android.trx_promo_goods.screens.configure.deeplink.TrxPromoGoodsConfigureResetLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoGoodsConfigureDeeplinkMappingsModule_ProvideConfigureResetMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.configure.deeplink.m f303457a;

    public g(com.avito.android.trx_promo_goods.screens.configure.deeplink.m mVar) {
        this.f303457a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f303453a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoGoodsConfigureResetLink.class, new com.avito.android.trx_promo_goods.screens.configure.deeplink.n(), new C43834a.b.C11809b(this.f303457a));
    }
}
