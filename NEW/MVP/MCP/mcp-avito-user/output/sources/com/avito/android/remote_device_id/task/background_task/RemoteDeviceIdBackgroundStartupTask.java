package com.avito.android.remote_device_id.task.background_task;

import Y61.k;
import android.app.Application;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import com.avito.android.remote_device_id.task.short_task.a;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.service.short_task.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RemoteDeviceIdBackgroundStartupTask.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote_device_id/task/background_task/RemoteDeviceIdBackgroundStartupTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/service/short_task/j;", "taskScheduler", "<init>", "(Lcom/avito/android/service/short_task/j;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/service/short_task/j;", "Companion", "a", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RemoteDeviceIdBackgroundStartupTask implements ApplicationBackgroundStartupTask {

    @k
    private final j taskScheduler;

    @Inject
    public RemoteDeviceIdBackgroundStartupTask(@k j jVar) {
        this.taskScheduler = jVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@k Application application) {
        this.taskScheduler.c(a.class, ShortTask.NetworkState.f274024c, false, false, false, false, 20000L, true, null, ShortTask.BackoffPolicy.f274019b, 30000L);
    }
}
