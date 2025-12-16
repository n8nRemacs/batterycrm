package com.avito.android.advertising.loaders.event_service;

import Db.InterfaceC13381a;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.remote.interceptor.W0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommercialPixelServiceImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f88363a;

    /* renamed from: b, reason: collision with root package name */
    public final W0 f88364b;

    /* renamed from: c, reason: collision with root package name */
    public final u f88365c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f88366d;

    public g(Provider provider, W0 w02, u uVar, Provider provider2) {
        this.f88363a = provider;
        this.f88364b = w02;
        this.f88365c = uVar;
        this.f88366d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f88363a.get(), (U0) this.f88364b.get(), (InterfaceC13381a) this.f88365c.get(), this.f88366d.get());
    }
}
