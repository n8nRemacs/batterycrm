package com.avito.android.mortgage.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: MortgageApplicationProxyDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.mortgage.deeplink.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32594i implements dagger.internal.h<C32591f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.deeplink.domain.h f198857a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f198858b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f198859c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f198860d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f198861e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f198862f;

    public C32594i(com.avito.android.mortgage.deeplink.domain.h hVar, dv.b bVar, dv.b bVar2, C25721c c25721c, dagger.internal.f fVar, Provider provider) {
        this.f198857a = hVar;
        this.f198858b = bVar;
        this.f198859c = bVar2;
        this.f198860d = c25721c;
        this.f198861e = fVar;
        this.f198862f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32591f((com.avito.android.mortgage.deeplink.domain.g) this.f198857a.get(), (a.g) this.f198858b.get(), (a.i) this.f198859c.get(), (C25719a) this.f198860d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f198861e.get(), this.f198862f.get());
    }
}
