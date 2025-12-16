package com.avito.android.quic.cronet;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CronetEngineProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f246209a;

    /* renamed from: b, reason: collision with root package name */
    public final c f246210b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<d> f246211c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<t> f246212d;

    public i(dagger.internal.f fVar, c cVar, Provider provider, Provider provider2) {
        this.f246209a = fVar;
        this.f246210b = cVar;
        this.f246211c = provider;
        this.f246212d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((InterfaceC28373a) this.f246209a.get(), (b) this.f246210b.get(), this.f246211c.get(), this.f246212d.get());
    }
}
