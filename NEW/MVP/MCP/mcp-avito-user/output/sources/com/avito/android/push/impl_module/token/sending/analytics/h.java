package com.avito.android.push.impl_module.token.sending.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnNewTokenInvocationPeriodTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f246016a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<j> f246017b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f246018c;

    public h(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f246016a = fVar;
        this.f246017b = provider;
        this.f246018c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((InterfaceC28373a) this.f246016a.get(), this.f246017b.get(), this.f246018c.get());
    }
}
