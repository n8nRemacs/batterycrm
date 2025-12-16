package com.avito.android.verification.links.vtb;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationVTBAsyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f324715a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324716b;

    /* renamed from: c, reason: collision with root package name */
    public final vM0.d f324717c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.verification.links.open.b f324718d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<e> f324719e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.verification.storage.c f324720f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f324721g;

    /* renamed from: h, reason: collision with root package name */
    public final dv.b f324722h;

    /* renamed from: i, reason: collision with root package name */
    public final vM0.g f324723i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.f f324724j;

    /* renamed from: k, reason: collision with root package name */
    public final i f324725k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<R0> f324726l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.f f324727m;

    public d(dv.b bVar, dv.b bVar2, vM0.d dVar, com.avito.android.verification.links.open.b bVar3, Provider provider, com.avito.android.verification.storage.c cVar, dv.b bVar4, dv.b bVar5, vM0.g gVar, dagger.internal.f fVar, i iVar, Provider provider2, dagger.internal.f fVar2) {
        this.f324715a = bVar;
        this.f324716b = bVar2;
        this.f324717c = dVar;
        this.f324718d = bVar3;
        this.f324719e = provider;
        this.f324720f = cVar;
        this.f324721g = bVar4;
        this.f324722h = bVar5;
        this.f324723i = gVar;
        this.f324724j = fVar;
        this.f324725k = iVar;
        this.f324726l = provider2;
        this.f324727m = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.b bVar = (a.b) this.f324715a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f324716b.get();
        com.avito.android.verification.b bVar2 = (com.avito.android.verification.b) this.f324717c.get();
        this.f324718d.getClass();
        return new c(bVar, interfaceC4053a, bVar2, new com.avito.android.verification.links.open.a(), this.f324719e.get(), (com.avito.android.verification.storage.a) this.f324720f.get(), (a.g) this.f324721g.get(), (a.i) this.f324722h.get(), (vM0.f) this.f324723i.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324724j.get(), (g) this.f324725k.get(), this.f324726l.get(), (InterfaceC28373a) this.f324727m.get());
    }
}
