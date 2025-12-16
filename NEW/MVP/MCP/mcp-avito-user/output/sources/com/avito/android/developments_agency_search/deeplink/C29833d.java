package com.avito.android.developments_agency_search.deeplink;

import Qw.InterfaceC14939a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import rw.C47925c;
import rw.InterfaceC47923a;

/* compiled from: DealCabinetLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.developments_agency_search.deeplink.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29833d implements dagger.internal.h<C29832c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f136415a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f136416b;

    /* renamed from: c, reason: collision with root package name */
    public final C47925c f136417c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC14939a> f136418d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f136419e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.developments_agency_search.features.c f136420f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f136421g;

    public C29833d(dv.b bVar, dv.b bVar2, C47925c c47925c, Provider provider, dagger.internal.f fVar, com.avito.android.developments_agency_search.features.c cVar, Provider provider2) {
        this.f136415a = bVar;
        this.f136416b = bVar2;
        this.f136417c = c47925c;
        this.f136418d = provider;
        this.f136419e = fVar;
        this.f136420f = cVar;
        this.f136421g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29832c((a.InterfaceC4053a) this.f136415a.get(), (a.g) this.f136416b.get(), (InterfaceC47923a) this.f136417c.get(), this.f136418d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f136419e.get(), (com.avito.android.developments_agency_search.features.a) this.f136420f.get(), this.f136421g.get());
    }
}
