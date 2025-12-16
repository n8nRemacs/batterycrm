package com.avito.android.gig_apply.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yF.InterfaceC50106a;

/* compiled from: GigApplyDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.gig_apply.ui.j f159565a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f159566b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f159567c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f159568d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f159569e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f159570f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f159571g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC50106a> f159572h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.f f159573i;

    /* renamed from: j, reason: collision with root package name */
    public final dv.b f159574j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<R0> f159575k;

    public f(com.avito.android.gig_apply.ui.j jVar, dv.b bVar, dv.b bVar2, dv.b bVar3, dv.b bVar4, dagger.internal.f fVar, dv.b bVar5, Provider provider, dagger.internal.f fVar2, dv.b bVar6, Provider provider2) {
        this.f159565a = jVar;
        this.f159566b = bVar;
        this.f159567c = bVar2;
        this.f159568d = bVar3;
        this.f159569e = bVar4;
        this.f159570f = fVar;
        this.f159571g = bVar5;
        this.f159572h = provider;
        this.f159573i = fVar2;
        this.f159574j = bVar6;
        this.f159575k = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.gig_apply.ui.h) this.f159565a.get(), (a.f) this.f159566b.get(), (a.b) this.f159567c.get(), (a.InterfaceC4053a) this.f159568d.get(), (a.d) this.f159569e.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f159570f.get(), (a.g) this.f159571g.get(), this.f159572h.get(), (com.avito.android.deep_linking.x) this.f159573i.get(), (a.i) this.f159574j.get(), this.f159575k.get());
    }
}
