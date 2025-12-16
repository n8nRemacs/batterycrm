package com.avito.android.trx_promo_impl.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoConfigureApplyDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.data.c f304076a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f304077b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f304078c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f304079d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f304080e;

    public c(com.avito.android.trx_promo_impl.data.c cVar, dv.b bVar, dv.b bVar2, dagger.internal.f fVar, Provider provider) {
        this.f304076a = cVar;
        this.f304077b = bVar;
        this.f304078c = bVar2;
        this.f304079d = fVar;
        this.f304080e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.trx_promo_impl.data.a) this.f304076a.get(), (a.i) this.f304077b.get(), (a.g) this.f304078c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f304079d.get(), this.f304080e.get());
    }
}
