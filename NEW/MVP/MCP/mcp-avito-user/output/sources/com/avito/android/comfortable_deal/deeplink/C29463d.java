package com.avito.android.comfortable_deal.deeplink;

import Uq0.InterfaceC15559a;
import Wp.InterfaceC15788a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: ComfortableDealClientRoomDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.comfortable_deal.deeplink.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29463d implements dagger.internal.h<C29462c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f121907a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f121908b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f121909c;

    /* renamed from: d, reason: collision with root package name */
    public final Wp.c f121910d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.seller_room.b f121911e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.repository.l f121912f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.domain.c f121913g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f121914h;

    public C29463d(dv.b bVar, dv.b bVar2, dv.b bVar3, Wp.c cVar, com.avito.android.seller_room.b bVar4, com.avito.android.comfortable_deal.repository.l lVar, com.avito.android.comfortable_deal.domain.c cVar2, Provider provider) {
        this.f121907a = bVar;
        this.f121908b = bVar2;
        this.f121909c = bVar3;
        this.f121910d = cVar;
        this.f121911e = bVar4;
        this.f121912f = lVar;
        this.f121913g = cVar2;
        this.f121914h = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29462c((a.InterfaceC4053a) this.f121907a.get(), (a.g) this.f121908b.get(), (a.i) this.f121909c.get(), (InterfaceC15788a) this.f121910d.get(), (InterfaceC15559a) this.f121911e.get(), (com.avito.android.comfortable_deal.repository.a) this.f121912f.get(), (com.avito.android.comfortable_deal.domain.a) this.f121913g.get(), this.f121914h.get());
    }
}
