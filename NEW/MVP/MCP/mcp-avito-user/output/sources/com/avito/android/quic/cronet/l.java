package com.avito.android.quic.cronet;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CronetErrorsReporter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f246215a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.quic.tracking.a> f246216b;

    public l(dagger.internal.f fVar, Provider provider) {
        this.f246215a = fVar;
        this.f246216b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((InterfaceC28373a) this.f246215a.get(), this.f246216b.get());
    }
}
