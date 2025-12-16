package com.avito.android.multigeo_flow.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: JobMultiGeoFullListDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f206869a;

    /* renamed from: b, reason: collision with root package name */
    public final F f206870b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f206871c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f206872d;

    public y(dv.b bVar, F f12, dv.b bVar2, Provider provider) {
        this.f206869a = bVar;
        this.f206870b = f12;
        this.f206871c = bVar2;
        this.f206872d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x((a.InterfaceC4053a) this.f206869a.get(), (N20.a) this.f206870b.get(), (a.b) this.f206871c.get(), this.f206872d.get());
    }
}
