package com.avito.android.imv_goods_advert.di;

import com.avito.android.deep_linking.links.ImvGoodsAdvertLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ImvGoodsAdvertDeeplinkHandlerModule_ProvideImvGoodsAdvertDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.imv_goods_advert.d f170495a;

    public d(com.avito.android.imv_goods_advert.d dVar) {
        this.f170495a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.imv_goods_advert.d dVar = this.f170495a;
        c.f170494a.getClass();
        return new C43834a(ImvGoodsAdvertLink.class, null, new C43834a.b.C11809b(dVar));
    }
}
