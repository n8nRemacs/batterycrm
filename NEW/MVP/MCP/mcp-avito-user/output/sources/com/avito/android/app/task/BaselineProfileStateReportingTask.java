package com.avito.android.app.task;

import android.app.Application;
import androidx.profileinstaller.j;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BaselineProfileStateReportingTask.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/app/task/BaselineProfileStateReportingTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/analytics/a;", "analytics", "<init>", "(Lcom/avito/android/analytics/a;)V", "Ljava/util/concurrent/Executor;", "directExecutor", "()Ljava/util/concurrent/Executor;", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/analytics/a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BaselineProfileStateReportingTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final InterfaceC28373a analytics;

    @Inject
    public BaselineProfileStateReportingTask(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.analytics = interfaceC28373a;
    }

    private final Executor directExecutor() {
        return new androidx.arch.core.executor.a(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void directExecutor$lambda$1(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void execute$lambda$0(com.google.common.util.concurrent.D0 d02, BaselineProfileStateReportingTask baselineProfileStateReportingTask) {
        j.c cVar = (j.c) d02.get();
        baselineProfileStateReportingTask.analytics.c(new y.a("baseline-profiles.status-code." + cVar.f53636a, 0L, 2, null));
        baselineProfileStateReportingTask.analytics.c(new y.a("baseline-profiles.status." + cVar.f53637b, 0L, 2, null));
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        androidx.concurrent.futures.e<j.c> eVar = androidx.profileinstaller.j.f53629a;
        eVar.N(new J11.c(28, eVar, this), directExecutor());
    }
}
