package com.avito.android.verification.links.alfa;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationAlfaLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f324167a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324168b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f324169c;

    /* renamed from: d, reason: collision with root package name */
    public final vM0.d f324170d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.verification.links.open.b f324171e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f324172f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f324173g;

    /* renamed from: h, reason: collision with root package name */
    public final vM0.g f324174h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.f f324175i;

    /* renamed from: j, reason: collision with root package name */
    public final h f324176j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324177k;

    public f(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, vM0.d dVar, com.avito.android.verification.links.open.b bVar3, dv.b bVar4, dv.b bVar5, vM0.g gVar, dagger.internal.f fVar2, h hVar, Provider provider) {
        this.f324167a = fVar;
        this.f324168b = bVar;
        this.f324169c = bVar2;
        this.f324170d = dVar;
        this.f324171e = bVar3;
        this.f324172f = bVar4;
        this.f324173g = bVar5;
        this.f324174h = gVar;
        this.f324175i = fVar2;
        this.f324176j = hVar;
        this.f324177k = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f324167a.get();
        a.b bVar = (a.b) this.f324168b.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f324169c.get();
        com.avito.android.verification.b bVar2 = (com.avito.android.verification.b) this.f324170d.get();
        this.f324171e.getClass();
        return new b(interfaceC28373a, bVar, interfaceC4053a, bVar2, new com.avito.android.verification.links.open.a(), (a.g) this.f324172f.get(), (a.i) this.f324173g.get(), (vM0.f) this.f324174h.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324175i.get(), (g) this.f324176j.get(), this.f324177k.get());
    }
}
