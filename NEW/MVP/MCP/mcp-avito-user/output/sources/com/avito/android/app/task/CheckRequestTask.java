package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.service.short_task.ShortTask;
import kotlin.Metadata;

/* compiled from: CheckRequestTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/app/task/CheckRequestTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/service/short_task/j;", "taskScheduler", "<init>", "(Lcom/avito/android/service/short_task/j;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/service/short_task/j;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class CheckRequestTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final com.avito.android.service.short_task.j taskScheduler;

    public CheckRequestTask(@Y61.k com.avito.android.service.short_task.j jVar) {
        this.taskScheduler = jVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        this.taskScheduler.c(com.avito.android.service.short_task.p.class, ShortTask.NetworkState.f274024c, false, false, false, false, 1000L, true, null, ShortTask.BackoffPolicy.f274019b, 30000L);
    }
}
