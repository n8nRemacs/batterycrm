package com.avito.android.auction;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: AuctionDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final n f92417a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f92418b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f92419c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f92420d;

    public i(n nVar, dv.b bVar, dv.b bVar2, dv.b bVar3) {
        this.f92417a = nVar;
        this.f92418b = bVar;
        this.f92419c = bVar2;
        this.f92420d = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((k) this.f92417a.get(), (a.InterfaceC4053a) this.f92418b.get(), (a.b) this.f92419c.get(), (a.g) this.f92420d.get());
    }
}
