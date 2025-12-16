package com.avito.android.enabler;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

@e
@y
@x
/* loaded from: classes13.dex */
public final class RemoteFeaturesLoadingMonitor_Factory implements h<RemoteFeaturesLoadingMonitor> {
    private final Provider<InterfaceC28373a> analyticsProvider;
    private final Provider<C> buildInfoProvider;

    public RemoteFeaturesLoadingMonitor_Factory(Provider<InterfaceC28373a> provider, Provider<C> provider2) {
        this.analyticsProvider = provider;
        this.buildInfoProvider = provider2;
    }

    public static RemoteFeaturesLoadingMonitor_Factory create(Provider<InterfaceC28373a> provider, Provider<C> provider2) {
        return new RemoteFeaturesLoadingMonitor_Factory(provider, provider2);
    }

    public static RemoteFeaturesLoadingMonitor newInstance(InterfaceC28373a interfaceC28373a, C c12) {
        return new RemoteFeaturesLoadingMonitor(interfaceC28373a, c12);
    }

    @Override // javax.inject.Provider
    public RemoteFeaturesLoadingMonitor get() {
        return newInstance(this.analyticsProvider.get(), this.buildInfoProvider.get());
    }
}
