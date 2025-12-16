package com.avito.android.trx_promo_impl.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoConfigureCancelDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.data.c f304089a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f304090b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f304091c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f304092d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f304093e;

    public g(com.avito.android.trx_promo_impl.data.c cVar, dv.b bVar, dv.b bVar2, dagger.internal.f fVar, Provider provider) {
        this.f304089a = cVar;
        this.f304090b = bVar;
        this.f304091c = bVar2;
        this.f304092d = fVar;
        this.f304093e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.trx_promo_impl.data.a) this.f304089a.get(), (a.i) this.f304090b.get(), (a.g) this.f304091c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f304092d.get(), this.f304093e.get());
    }
}
