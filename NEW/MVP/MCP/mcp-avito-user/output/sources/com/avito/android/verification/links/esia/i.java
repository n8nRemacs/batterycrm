package com.avito.android.verification.links.esia;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import hD.C40808c;
import javax.inject.Provider;

/* compiled from: VerificationEsiaLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f324256a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324257b;

    /* renamed from: c, reason: collision with root package name */
    public final vM0.d f324258c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.verification.links.open.b f324259d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f324260e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f324261f;

    /* renamed from: g, reason: collision with root package name */
    public final vM0.g f324262g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f324263h;

    /* renamed from: i, reason: collision with root package name */
    public final k f324264i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.verification.links.esia.apptoapp.c f324265j;

    /* renamed from: k, reason: collision with root package name */
    public final C40808c f324266k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.verification.storage.c f324267l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324268m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.f f324269n;

    public i(dv.b bVar, dv.b bVar2, vM0.d dVar, com.avito.android.verification.links.open.b bVar3, dv.b bVar4, dv.b bVar5, vM0.g gVar, dagger.internal.f fVar, k kVar, com.avito.android.verification.links.esia.apptoapp.c cVar, C40808c c40808c, com.avito.android.verification.storage.c cVar2, Provider provider, dagger.internal.f fVar2) {
        this.f324256a = bVar;
        this.f324257b = bVar2;
        this.f324258c = dVar;
        this.f324259d = bVar3;
        this.f324260e = bVar4;
        this.f324261f = bVar5;
        this.f324262g = gVar;
        this.f324263h = fVar;
        this.f324264i = kVar;
        this.f324265j = cVar;
        this.f324266k = c40808c;
        this.f324267l = cVar2;
        this.f324268m = provider;
        this.f324269n = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.b bVar = (a.b) this.f324256a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f324257b.get();
        com.avito.android.verification.b bVar2 = (com.avito.android.verification.b) this.f324258c.get();
        this.f324259d.getClass();
        return new b(bVar, interfaceC4053a, bVar2, new com.avito.android.verification.links.open.a(), (a.g) this.f324260e.get(), (a.i) this.f324261f.get(), (vM0.f) this.f324262g.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324263h.get(), (j) this.f324264i.get(), (com.avito.android.verification.links.esia.apptoapp.b) this.f324265j.get(), (C40806a) this.f324266k.get(), (com.avito.android.verification.storage.a) this.f324267l.get(), this.f324268m.get(), (InterfaceC28373a) this.f324269n.get());
    }
}
