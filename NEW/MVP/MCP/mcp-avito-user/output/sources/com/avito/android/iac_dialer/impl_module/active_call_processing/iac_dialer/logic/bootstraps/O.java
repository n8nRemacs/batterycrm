package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: NetworkStatusBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class O implements dagger.internal.h<NetworkStatusBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.device_status.connection_status.a> f165188a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165189b;

    public O(Provider<com.avito.android.iac_dialer.impl_module.device_status.connection_status.a> provider, Provider<R0> provider2) {
        this.f165188a = provider;
        this.f165189b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new NetworkStatusBootstrap(this.f165188a.get(), this.f165189b.get());
    }
}
