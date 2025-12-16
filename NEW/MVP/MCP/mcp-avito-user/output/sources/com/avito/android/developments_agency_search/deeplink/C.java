package com.avito.android.developments_agency_search.deeplink;

import Qw.InterfaceC14939a;
import android.content.res.Resources;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import rw.C47925c;
import rw.InterfaceC47923a;

/* compiled from: RealtyAgencySearchLotsLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f136352a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f136353b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f136354c;

    /* renamed from: d, reason: collision with root package name */
    public final C47925c f136355d;

    /* renamed from: e, reason: collision with root package name */
    public final Xu.c f136356e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC14939a> f136357f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f136358g;

    public C(dv.b bVar, dv.b bVar2, dv.b bVar3, C47925c c47925c, Xu.c cVar, Provider provider, Provider provider2) {
        this.f136352a = bVar;
        this.f136353b = bVar2;
        this.f136354c = bVar3;
        this.f136355d = c47925c;
        this.f136356e = cVar;
        this.f136357f = provider;
        this.f136358g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A((a.InterfaceC4053a) this.f136352a.get(), (a.g) this.f136353b.get(), (a.i) this.f136354c.get(), (InterfaceC47923a) this.f136355d.get(), (Resources) this.f136356e.get(), this.f136357f.get(), this.f136358g.get());
    }
}
