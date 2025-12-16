package com.avito.android.verification.links.tinkoff_finish;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationTinkoffFinishLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final j f324575a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324576b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f324577c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f324578d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f324579e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.verification.links.tinkoff_documents.f> f324580f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f324581g;

    /* renamed from: h, reason: collision with root package name */
    public final vM0.g f324582h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.f f324583i;

    public f(j jVar, dv.b bVar, Provider provider, dagger.internal.f fVar, dv.b bVar2, Provider provider2, dv.b bVar3, vM0.g gVar, dagger.internal.f fVar2) {
        this.f324575a = jVar;
        this.f324576b = bVar;
        this.f324577c = provider;
        this.f324578d = fVar;
        this.f324579e = bVar2;
        this.f324580f = provider2;
        this.f324581g = bVar3;
        this.f324582h = gVar;
        this.f324583i = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((i) this.f324575a.get(), (a.g) this.f324576b.get(), this.f324577c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324578d.get(), (a.i) this.f324579e.get(), this.f324580f.get(), (a.InterfaceC4053a) this.f324581g.get(), (vM0.f) this.f324582h.get(), (InterfaceC28373a) this.f324583i.get());
    }
}
