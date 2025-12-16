package com.avito.android.enabler;

import com.avito.android.InterfaceC29272c2;
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
public final class RemoteFeaturesStartupMonitor_Factory implements h<RemoteFeaturesStartupMonitor> {
    private final Provider<InterfaceC28373a> analyticsProvider;
    private final Provider<C> buildInfoProvider;
    private final Provider<InterfaceC29272c2> remoteTogglesProvider;

    public RemoteFeaturesStartupMonitor_Factory(Provider<InterfaceC29272c2> provider, Provider<InterfaceC28373a> provider2, Provider<C> provider3) {
        this.remoteTogglesProvider = provider;
        this.analyticsProvider = provider2;
        this.buildInfoProvider = provider3;
    }

    public static RemoteFeaturesStartupMonitor_Factory create(Provider<InterfaceC29272c2> provider, Provider<InterfaceC28373a> provider2, Provider<C> provider3) {
        return new RemoteFeaturesStartupMonitor_Factory(provider, provider2, provider3);
    }

    public static RemoteFeaturesStartupMonitor newInstance(InterfaceC29272c2 interfaceC29272c2, InterfaceC28373a interfaceC28373a, C c12) {
        return new RemoteFeaturesStartupMonitor(interfaceC29272c2, interfaceC28373a, c12);
    }

    @Override // javax.inject.Provider
    public RemoteFeaturesStartupMonitor get() {
        return newInstance(this.remoteTogglesProvider.get(), this.analyticsProvider.get(), this.buildInfoProvider.get());
    }
}
