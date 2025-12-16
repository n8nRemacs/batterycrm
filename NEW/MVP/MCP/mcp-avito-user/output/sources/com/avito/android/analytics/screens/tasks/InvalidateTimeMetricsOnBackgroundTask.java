package com.avito.android.analytics.screens.tasks;

import Y61.k;
import android.app.Application;
import androidx.view.C23050m0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import com.avito.android.analytics.screens.tracker.V;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.time.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InvalidateTimeMetricsOnBackgroundTask.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/analytics/screens/tasks/InvalidateTimeMetricsOnBackgroundTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Landroidx/lifecycle/q;", "Lcom/avito/android/analytics/screens/tracker/V;", "measurementStateChecker", "<init>", "(Lcom/avito/android/analytics/screens/tracker/V;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Landroidx/lifecycle/P;", SearchParamsConverterKt.OWNER, "Lkotlin/G0;", "onStop", "(Landroidx/lifecycle/P;)V", "Lcom/avito/android/analytics/screens/tracker/V;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvalidateTimeMetricsOnBackgroundTask implements ApplicationBlockingStartupTask, InterfaceC23057q {

    @k
    private final V measurementStateChecker;

    @Inject
    public InvalidateTimeMetricsOnBackgroundTask(@k V v12) {
        this.measurementStateChecker = v12;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public InterfaceC28559h.a execute(@k Application application) {
        C23050m0.f46822j.getClass();
        C23050m0.f46823k.f46829g.a(this);
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }

    @Override // androidx.view.InterfaceC23057q
    public void onStop(@k InterfaceC22983P owner) {
        V v12 = this.measurementStateChecker;
        v12.getClass();
        c.f301452a.getClass();
        v12.f90794a = c.f301453b.a();
    }
}
