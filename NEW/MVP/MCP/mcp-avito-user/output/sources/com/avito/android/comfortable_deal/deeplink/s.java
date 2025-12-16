package com.avito.android.comfortable_deal.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: ComfortableDealRouteDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f121984a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f121985b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.repository.l f121986c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f121987d;

    public s(dagger.internal.f fVar, dv.b bVar, com.avito.android.comfortable_deal.repository.l lVar, Provider provider) {
        this.f121984a = fVar;
        this.f121985b = bVar;
        this.f121986c = lVar;
        this.f121987d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((com.avito.android.deeplink_handler.handler.composite.a) this.f121984a.get(), (a.g) this.f121985b.get(), (com.avito.android.comfortable_deal.repository.a) this.f121986c.get(), this.f121987d.get());
    }
}
