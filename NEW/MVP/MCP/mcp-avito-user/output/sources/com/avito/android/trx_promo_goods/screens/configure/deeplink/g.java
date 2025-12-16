package com.avito.android.trx_promo_goods.screens.configure.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoGoodsConfigureCancelDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IF0.a> f303404a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f303405b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f303406c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f303407d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f303408e;

    public g(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f303404a = provider;
        this.f303405b = bVar;
        this.f303406c = bVar2;
        this.f303407d = fVar;
        this.f303408e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f303404a.get(), (a.i) this.f303405b.get(), (a.g) this.f303406c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f303407d.get(), this.f303408e.get());
    }
}
