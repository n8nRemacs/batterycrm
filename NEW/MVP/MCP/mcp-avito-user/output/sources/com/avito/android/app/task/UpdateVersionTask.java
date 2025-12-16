package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.service.short_task.ShortTask;
import kotlin.Metadata;

/* compiled from: UpdateVersionTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/app/task/UpdateVersionTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/service/short_task/app_update/e;", "appUpdateInteractor", "Lcom/avito/android/service/short_task/j;", "taskScheduler", "<init>", "(Lcom/avito/android/service/short_task/app_update/e;Lcom/avito/android/service/short_task/j;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/service/short_task/app_update/e;", "Lcom/avito/android/service/short_task/j;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class UpdateVersionTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final com.avito.android.service.short_task.app_update.e appUpdateInteractor;

    @Y61.k
    private final com.avito.android.service.short_task.j taskScheduler;

    public UpdateVersionTask(@Y61.k com.avito.android.service.short_task.app_update.e eVar, @Y61.k com.avito.android.service.short_task.j jVar) {
        this.appUpdateInteractor = eVar;
        this.taskScheduler = jVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        com.avito.android.service.short_task.app_update.e eVar = this.appUpdateInteractor;
        if (eVar.f274042a.a() != eVar.f274043b.getF125492l()) {
            this.taskScheduler.c(com.avito.android.service.short_task.app_update.g.class, ShortTask.NetworkState.f274024c, false, false, false, false, 1000L, true, null, ShortTask.BackoffPolicy.f274019b, 30000L);
        }
    }
}
