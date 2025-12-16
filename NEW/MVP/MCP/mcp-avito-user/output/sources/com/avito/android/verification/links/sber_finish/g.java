package com.avito.android.verification.links.sber_finish;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationSberFinishLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f324460a;

    /* renamed from: b, reason: collision with root package name */
    public final i f324461b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f324462c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324463d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f324464e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f324465f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f324466g;

    /* renamed from: h, reason: collision with root package name */
    public final vM0.g f324467h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.verification.links.sber_id.a> f324468i;

    public g(dagger.internal.f fVar, i iVar, dv.b bVar, Provider provider, dagger.internal.f fVar2, dv.b bVar2, dv.b bVar3, vM0.g gVar, Provider provider2) {
        this.f324460a = fVar;
        this.f324461b = iVar;
        this.f324462c = bVar;
        this.f324463d = provider;
        this.f324464e = fVar2;
        this.f324465f = bVar2;
        this.f324466g = bVar3;
        this.f324467h = gVar;
        this.f324468i = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC28373a) this.f324460a.get(), (h) this.f324461b.get(), (a.g) this.f324462c.get(), this.f324463d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324464e.get(), (a.i) this.f324465f.get(), (a.InterfaceC4053a) this.f324466g.get(), (vM0.f) this.f324467h.get(), this.f324468i.get());
    }
}
