package com.avito.android.checkout.deeplink.handlers;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckoutPromoCodeV2DeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.checkout.domain.c f118209a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f118210b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f118211c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f118212d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f118213e;

    public f(com.avito.android.checkout.domain.c cVar, dv.b bVar, dv.b bVar2, dagger.internal.f fVar, Provider provider) {
        this.f118209a = cVar;
        this.f118210b = bVar;
        this.f118211c = bVar2;
        this.f118212d = fVar;
        this.f118213e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.checkout.domain.a) this.f118209a.get(), (a.i) this.f118210b.get(), (a.g) this.f118211c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f118212d.get(), this.f118213e.get());
    }
}
