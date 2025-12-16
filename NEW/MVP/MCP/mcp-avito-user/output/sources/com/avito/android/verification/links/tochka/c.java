package com.avito.android.verification.links.tochka;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationTochkaLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f324663a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324664b;

    /* renamed from: c, reason: collision with root package name */
    public final vM0.d f324665c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f324666d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f324667e;

    /* renamed from: f, reason: collision with root package name */
    public final vM0.g f324668f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f324669g;

    /* renamed from: h, reason: collision with root package name */
    public final f f324670h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<R0> f324671i;

    public c(dv.b bVar, dv.b bVar2, vM0.d dVar, dv.b bVar3, dv.b bVar4, vM0.g gVar, dagger.internal.f fVar, f fVar2, Provider provider) {
        this.f324663a = bVar;
        this.f324664b = bVar2;
        this.f324665c = dVar;
        this.f324666d = bVar3;
        this.f324667e = bVar4;
        this.f324668f = gVar;
        this.f324669g = fVar;
        this.f324670h = fVar2;
        this.f324671i = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f324663a.get(), (a.InterfaceC4053a) this.f324664b.get(), (com.avito.android.verification.b) this.f324665c.get(), (a.g) this.f324666d.get(), (a.i) this.f324667e.get(), (vM0.f) this.f324668f.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324669g.get(), (e) this.f324670h.get(), this.f324671i.get());
    }
}
