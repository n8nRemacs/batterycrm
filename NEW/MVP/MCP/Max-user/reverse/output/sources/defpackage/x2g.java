package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* loaded from: classes2.dex */
public final class x2g {
    public static final /* synthetic */ int b = 0;
    public final g5i a;

    public x2g(g5i g5iVar) {
        this.a = g5iVar;
        nrb nrbVar = (nrb) ((mrb) ((mrb) new mrb(TaskMonitor$TaskMonitorWorker.class, 6L, TimeUnit.HOURS).setConstraints(new bu3(1, false, true, false, false, -1L, -1L, ue3.h0(new LinkedHashSet())))).addTag("TASK_MONITOR_PERIODIC_TASK")).build();
        wqi.c("x2g", "work " + nrbVar.getId() + " try to add TASK_MONITOR_PERIODIC_TASK request", new Object[0]);
        g5i.e(g5iVar, "TASK_MONITOR_PERIODIC_TASK", 2, nrbVar, 24);
    }

    public final void a() {
        ogb ogbVar = (ogb) ((ngb) ((ngb) new ngb(TaskMonitor$TaskMonitorWorker.class).setBackoffCriteria(eg0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("TASK_MONITOR_ONE_TIME_TASK")).build();
        wqi.c("x2g", "work " + ogbVar.getId() + " try to add TASK_MONITOR_ONE_TIME_TASK request", new Object[0]);
        this.a.b("TASK_MONITOR_ONE_TIME_TASK", uk5.b, ogbVar).c();
    }
}
