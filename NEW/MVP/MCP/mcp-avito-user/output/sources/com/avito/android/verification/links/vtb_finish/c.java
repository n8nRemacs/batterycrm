package com.avito.android.verification.links.vtb_finish;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import com.avito.android.verification.links.vtb.i;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vM0.g;

/* compiled from: VerificationVTBFinishLinkAsyncHandler_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f324758a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.verification.links.vtb.e> f324759b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.verification.storage.c f324760c;

    /* renamed from: d, reason: collision with root package name */
    public final i f324761d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f324762e;

    /* renamed from: f, reason: collision with root package name */
    public final f f324763f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f324764g;

    /* renamed from: h, reason: collision with root package name */
    public final g f324765h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<R0> f324766i;

    public c(f fVar, Provider provider, com.avito.android.verification.storage.c cVar, i iVar, dv.b bVar, f fVar2, dv.b bVar2, g gVar, Provider provider2) {
        this.f324758a = fVar;
        this.f324759b = provider;
        this.f324760c = cVar;
        this.f324761d = iVar;
        this.f324762e = bVar;
        this.f324763f = fVar2;
        this.f324764g = bVar2;
        this.f324765h = gVar;
        this.f324766i = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC28373a) this.f324758a.get(), this.f324759b.get(), (com.avito.android.verification.storage.a) this.f324760c.get(), (com.avito.android.verification.links.vtb.g) this.f324761d.get(), (a.g) this.f324762e.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f324763f.get(), (a.i) this.f324764g.get(), (vM0.f) this.f324765h.get(), this.f324766i.get());
    }
}
