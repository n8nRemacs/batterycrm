package com.avito.android.enabler;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

@e
@y
@x
/* loaded from: classes13.dex */
public final class StartRemoteFeaturesMonitorTask_Factory implements h<StartRemoteFeaturesMonitorTask> {
    private final Provider<RemoteFeaturesTouchMonitor> touchMonitorProvider;

    public StartRemoteFeaturesMonitorTask_Factory(Provider<RemoteFeaturesTouchMonitor> provider) {
        this.touchMonitorProvider = provider;
    }

    public static StartRemoteFeaturesMonitorTask_Factory create(Provider<RemoteFeaturesTouchMonitor> provider) {
        return new StartRemoteFeaturesMonitorTask_Factory(provider);
    }

    public static StartRemoteFeaturesMonitorTask newInstance(RemoteFeaturesTouchMonitor remoteFeaturesTouchMonitor) {
        return new StartRemoteFeaturesMonitorTask(remoteFeaturesTouchMonitor);
    }

    @Override // javax.inject.Provider
    public StartRemoteFeaturesMonitorTask get() {
        return newInstance(this.touchMonitorProvider.get());
    }
}
