package com.avito.android.enabler;

import Y61.k;
import android.app.Application;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StartRemoteFeaturesMonitorTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/enabler/StartRemoteFeaturesMonitorTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/enabler/RemoteFeaturesTouchMonitor;", "touchMonitor", "<init>", "(Lcom/avito/android/enabler/RemoteFeaturesTouchMonitor;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/enabler/RemoteFeaturesTouchMonitor;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StartRemoteFeaturesMonitorTask implements ApplicationBackgroundStartupTask {

    @k
    private final RemoteFeaturesTouchMonitor touchMonitor;

    @Inject
    public StartRemoteFeaturesMonitorTask(@k RemoteFeaturesTouchMonitor remoteFeaturesTouchMonitor) {
        this.touchMonitor = remoteFeaturesTouchMonitor;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@k Application application) {
        this.touchMonitor.start();
    }
}
