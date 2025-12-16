package com.avito.android.verification.links.mts;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationMTSLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f324308a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324309b;

    /* renamed from: c, reason: collision with root package name */
    public final vM0.d f324310c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f324311d;

    /* renamed from: e, reason: collision with root package name */
    public final c f324312e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f324313f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324314g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f324315h;

    public g(dv.b bVar, dv.b bVar2, vM0.d dVar, dagger.internal.f fVar, c cVar, dv.b bVar3, Provider provider, dagger.internal.f fVar2) {
        this.f324308a = bVar;
        this.f324309b = bVar2;
        this.f324310c = dVar;
        this.f324311d = fVar;
        this.f324312e = cVar;
        this.f324313f = bVar3;
        this.f324314g = provider;
        this.f324315h = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((a.b) this.f324308a.get(), (a.InterfaceC4053a) this.f324309b.get(), (com.avito.android.verification.b) this.f324310c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324311d.get(), (b) this.f324312e.get(), (a.g) this.f324313f.get(), this.f324314g.get(), (InterfaceC28373a) this.f324315h.get());
    }
}
