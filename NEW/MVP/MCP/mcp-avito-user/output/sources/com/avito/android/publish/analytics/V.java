package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: PublishNetworkStoresFakeDoorEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class V implements dagger.internal.h<U> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232186a;

    public V(Provider<InterfaceC28373a> provider) {
        this.f232186a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new U(this.f232186a.get());
    }
}
