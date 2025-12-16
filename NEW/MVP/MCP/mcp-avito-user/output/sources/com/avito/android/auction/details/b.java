package com.avito.android.auction.details;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuctionDetailsDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f92334a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f92335b;

    public b(h hVar, dv.b bVar) {
        this.f92334a = hVar;
        this.f92335b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f92334a.get(), (a.InterfaceC4053a) this.f92335b.get());
    }
}
