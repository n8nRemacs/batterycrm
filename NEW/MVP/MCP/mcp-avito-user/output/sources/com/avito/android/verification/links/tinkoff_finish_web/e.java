package com.avito.android.verification.links.tinkoff_finish_web;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationTinkoffFinishWebLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final h f324616a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324617b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324618c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f324619d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f324620e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f324621f;

    /* renamed from: g, reason: collision with root package name */
    public final vM0.g f324622g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f324623h;

    public e(h hVar, dv.b bVar, Provider provider, dagger.internal.f fVar, dv.b bVar2, dv.b bVar3, vM0.g gVar, dagger.internal.f fVar2) {
        this.f324616a = hVar;
        this.f324617b = bVar;
        this.f324618c = provider;
        this.f324619d = fVar;
        this.f324620e = bVar2;
        this.f324621f = bVar3;
        this.f324622g = gVar;
        this.f324623h = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f324616a.get(), (a.g) this.f324617b.get(), this.f324618c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324619d.get(), (a.i) this.f324620e.get(), (a.InterfaceC4053a) this.f324621f.get(), (vM0.f) this.f324622g.get(), (InterfaceC28373a) this.f324623h.get());
    }
}
