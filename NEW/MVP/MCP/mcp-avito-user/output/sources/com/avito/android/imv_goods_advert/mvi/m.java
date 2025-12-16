package com.avito.android.imv_goods_advert.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvGoodsAdvertReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.imv_goods_advert.b f170572a;

    public m(com.avito.android.imv_goods_advert.b bVar) {
        this.f170572a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.imv_goods_advert.a) this.f170572a.get());
    }
}
