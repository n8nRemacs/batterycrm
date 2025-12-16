package com.avito.android.remote_toggles_fetcher.fetcher;

import com.avito.android.enabler.RemoteFeaturesLoadingMonitor_Factory;
import com.avito.android.enabler.TogglesStorage;
import com.avito.android.util.C;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import tm0.InterfaceC48689a;

/* compiled from: RemoteTogglesFetcherImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48689a> f254460a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f254461b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<TogglesStorage> f254462c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.remote_toggles_fetcher.analytics.h f254463d;

    /* renamed from: e, reason: collision with root package name */
    public final RemoteFeaturesLoadingMonitor_Factory f254464e;

    public e(Provider provider, Provider provider2, Provider provider3, com.avito.android.remote_toggles_fetcher.analytics.h hVar, RemoteFeaturesLoadingMonitor_Factory remoteFeaturesLoadingMonitor_Factory) {
        this.f254460a = provider;
        this.f254461b = provider2;
        this.f254462c = provider3;
        this.f254463d = hVar;
        this.f254464e = remoteFeaturesLoadingMonitor_Factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f254460a.get(), this.f254461b.get(), this.f254462c.get(), (com.avito.android.remote_toggles_fetcher.analytics.f) this.f254463d.get(), this.f254464e.get());
    }
}
