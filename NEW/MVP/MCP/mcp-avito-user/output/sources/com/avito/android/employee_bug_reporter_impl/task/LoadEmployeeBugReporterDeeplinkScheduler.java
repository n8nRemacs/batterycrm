package com.avito.android.employee_bug_reporter_impl.task;

import Ry.C15095a;
import Y61.k;
import android.app.Application;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.service.short_task.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: LoadEmployeeBugReporterDeeplinkScheduler.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/task/LoadEmployeeBugReporterDeeplinkScheduler;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/service/short_task/j;", "taskScheduler", "LRy/a;", "features", "<init>", "(Lcom/avito/android/service/short_task/j;LRy/a;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/service/short_task/j;", "LRy/a;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoadEmployeeBugReporterDeeplinkScheduler implements ApplicationBackgroundStartupTask {

    @k
    private final C15095a features;

    @k
    private final j taskScheduler;

    @Inject
    public LoadEmployeeBugReporterDeeplinkScheduler(@k j jVar, @k C15095a c15095a) {
        this.taskScheduler = jVar;
        this.features = c15095a;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@k Application application) {
        C15095a c15095a = this.features;
        c15095a.getClass();
        n<Object> nVar = C15095a.f14752d[0];
        if (((Boolean) c15095a.f14753b.a().invoke()).booleanValue()) {
            this.taskScheduler.c(b.class, ShortTask.NetworkState.f274024c, false, false, false, false, 1000L, true, null, ShortTask.BackoffPolicy.f274019b, 30000L);
        }
    }
}
