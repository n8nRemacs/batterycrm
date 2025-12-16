package com.avito.android.developments_agency_search.deeplink;

import Qw.InterfaceC14939a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import rw.C47925c;
import rw.InterfaceC47923a;

/* compiled from: DealRoomLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.developments_agency_search.deeplink.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29839j implements dagger.internal.h<C29837h> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f136441a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f136442b;

    /* renamed from: c, reason: collision with root package name */
    public final C47925c f136443c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC14939a> f136444d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f136445e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.developments_agency_search.features.c f136446f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f136447g;

    public C29839j(dv.b bVar, dv.b bVar2, C47925c c47925c, Provider provider, dagger.internal.f fVar, com.avito.android.developments_agency_search.features.c cVar, Provider provider2) {
        this.f136441a = bVar;
        this.f136442b = bVar2;
        this.f136443c = c47925c;
        this.f136444d = provider;
        this.f136445e = fVar;
        this.f136446f = cVar;
        this.f136447g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29837h((a.InterfaceC4053a) this.f136441a.get(), (a.g) this.f136442b.get(), (InterfaceC47923a) this.f136443c.get(), this.f136444d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f136445e.get(), (com.avito.android.developments_agency_search.features.a) this.f136446f.get(), this.f136447g.get());
    }
}
