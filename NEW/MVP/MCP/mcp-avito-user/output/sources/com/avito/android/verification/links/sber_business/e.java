package com.avito.android.verification.links.sber_business;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SberBusinessLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f324422a;

    /* renamed from: b, reason: collision with root package name */
    public final vM0.d f324423b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f324424c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f324425d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f324426e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324427f;

    /* renamed from: g, reason: collision with root package name */
    public final i f324428g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f324429h;

    public e(dv.b bVar, vM0.d dVar, dv.b bVar2, dv.b bVar3, dv.b bVar4, Provider provider, i iVar, dagger.internal.f fVar) {
        this.f324422a = bVar;
        this.f324423b = dVar;
        this.f324424c = bVar2;
        this.f324425d = bVar3;
        this.f324426e = bVar4;
        this.f324427f = provider;
        this.f324428g = iVar;
        this.f324429h = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f324422a.get(), (com.avito.android.verification.b) this.f324423b.get(), (a.b) this.f324424c.get(), (a.g) this.f324425d.get(), (a.i) this.f324426e.get(), this.f324427f.get(), (h) this.f324428g.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324429h.get());
    }
}
