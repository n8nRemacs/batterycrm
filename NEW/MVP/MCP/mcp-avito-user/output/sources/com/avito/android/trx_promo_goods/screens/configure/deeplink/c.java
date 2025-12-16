package com.avito.android.trx_promo_goods.screens.configure.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoGoodsConfigureApplyDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IF0.a> f303391a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f303392b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f303393c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f303394d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f303395e;

    public c(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f303391a = provider;
        this.f303392b = bVar;
        this.f303393c = bVar2;
        this.f303394d = fVar;
        this.f303395e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f303391a.get(), (a.i) this.f303392b.get(), (a.g) this.f303393c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f303394d.get(), this.f303395e.get());
    }
}
