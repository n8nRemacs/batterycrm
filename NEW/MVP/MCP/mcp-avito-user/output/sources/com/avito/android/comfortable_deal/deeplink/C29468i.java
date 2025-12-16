package com.avito.android.comfortable_deal.deeplink;

import Ip.C14141a;
import Wp.InterfaceC15788a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: ComfortableDealClientsDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.comfortable_deal.deeplink.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29468i implements dagger.internal.h<C29466g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f121948a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f121949b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f121950c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f121951d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f121952e;

    /* renamed from: f, reason: collision with root package name */
    public final Wp.c f121953f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.repository.l f121954g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.clients.use_case.e f121955h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.di.m f121956i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<R0> f121957j;

    public C29468i(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, dv.b bVar3, dv.b bVar4, Wp.c cVar, com.avito.android.comfortable_deal.repository.l lVar, com.avito.android.comfortable_deal.clients.use_case.e eVar, com.avito.android.comfortable_deal.di.m mVar, Provider provider) {
        this.f121948a = fVar;
        this.f121949b = bVar;
        this.f121950c = bVar2;
        this.f121951d = bVar3;
        this.f121952e = bVar4;
        this.f121953f = cVar;
        this.f121954g = lVar;
        this.f121955h = eVar;
        this.f121956i = mVar;
        this.f121957j = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29466g((com.avito.android.deeplink_handler.handler.composite.a) this.f121948a.get(), (a.InterfaceC4053a) this.f121949b.get(), (a.b) this.f121950c.get(), (a.g) this.f121951d.get(), (a.i) this.f121952e.get(), (InterfaceC15788a) this.f121953f.get(), (com.avito.android.comfortable_deal.repository.a) this.f121954g.get(), (com.avito.android.comfortable_deal.clients.use_case.c) this.f121955h.get(), (C14141a) this.f121956i.get(), this.f121957j.get());
    }
}
