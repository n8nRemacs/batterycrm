package com.avito.android.app.anr;

import Y61.k;
import android.app.Application;
import cc.C27173b;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.github.anrwatchdog.a;
import com.github.anrwatchdog.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: EnableAnrWatchdogTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/app/anr/EnableAnrWatchdogTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/I1;", "features", "Lcom/avito/android/analytics/a;", "analytics", "<init>", "(Lcom/avito/android/I1;Lcom/avito/android/analytics/a;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/I1;", "Lcom/avito/android/analytics/a;", "_avito_analytics-anr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnableAnrWatchdogTask implements ApplicationBlockingStartupTask {

    @k
    private final InterfaceC28373a analytics;

    @k
    private final I1 features;

    @Inject
    public EnableAnrWatchdogTask(@k I1 i12, @k InterfaceC28373a interfaceC28373a) {
        this.features = i12;
        this.analytics = interfaceC28373a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(EnableAnrWatchdogTask enableAnrWatchdogTask, a aVar) {
        I1 i12 = enableAnrWatchdogTask.features;
        i12.getClass();
        n<Object> nVar = I1.f67278k0[32];
        if (((Boolean) i12.f67285G.a().invoke()).booleanValue()) {
            enableAnrWatchdogTask.analytics.c(new NonFatalErrorEvent("Anr detected", aVar.getCause(), null, NonFatalErrorEvent.a.C4323a.f147930a, 4, null));
        }
        Throwable cause = aVar.getCause();
        Throwable thFillInStackTrace = cause != null ? cause.fillInStackTrace() : null;
        if (thFillInStackTrace == null) {
            return;
        }
        enableAnrWatchdogTask.analytics.c(new C27173b(thFillInStackTrace));
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public InterfaceC28559h.a execute(@k Application application) {
        I1 i12 = this.features;
        i12.getClass();
        n<Object> nVar = I1.f67278k0[31];
        if (!((Boolean) i12.f67284F.a().invoke()).booleanValue()) {
            return InterfaceC28559h.a.c.f91606a;
        }
        c cVar = new c();
        cVar.f342866g = null;
        cVar.f342861b = new com.my.target.ads.a(this, 19);
        cVar.start();
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
