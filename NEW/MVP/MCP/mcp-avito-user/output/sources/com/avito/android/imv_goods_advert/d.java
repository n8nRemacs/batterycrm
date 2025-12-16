package com.avito.android.imv_goods_advert;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvGoodsAdvertDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f170332a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f170333b;

    public d(l lVar, dv.b bVar) {
        this.f170332a = lVar;
        this.f170333b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((j) this.f170332a.get(), (a.InterfaceC4053a) this.f170333b.get());
    }
}
