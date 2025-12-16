package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.analytics.clickstream.InterfaceC28394t;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics_adjust.InterfaceC28533a;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.C35891d;
import javax.inject.Inject;
import kotlin.Metadata;
import pd.InterfaceC47056b;
import sc.InterfaceC48152a;
import uc.InterfaceC49030e;

/* compiled from: AnalyticsWarmUpTask.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/app/task/AnalyticsWarmUpTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/error_reporting/error_reporter/n;", "errorReporter", "Lsc/a;", "appMetricaInitializer", "Lcom/avito/android/analytics_adjust/a;", "adjust", "LQc/c;", "firebase", "Luc/e;", "myTracker", "Lcom/avito/android/util/a5;", "schedulers", "Lcom/avito/android/analytics/task/a;", "tracker", "Lcom/avito/android/analytics/clickstream/t;", "clickStreamCrashReporter", "<init>", "(Lcom/avito/android/error_reporting/error_reporter/n;Lsc/a;Lcom/avito/android/analytics_adjust/a;LQc/c;Luc/e;Lcom/avito/android/util/a5;Lcom/avito/android/analytics/task/a;Lcom/avito/android/analytics/clickstream/t;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/error_reporting/error_reporter/n;", "Lsc/a;", "Lcom/avito/android/analytics_adjust/a;", "LQc/c;", "Luc/e;", "Lcom/avito/android/util/a5;", "Lcom/avito/android/analytics/task/a;", "Lcom/avito/android/analytics/clickstream/t;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnalyticsWarmUpTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final InterfaceC28533a adjust;

    @Y61.l
    private final InterfaceC48152a appMetricaInitializer;

    @Y61.k
    private final InterfaceC28394t clickStreamCrashReporter;

    @Y61.k
    private final com.avito.android.error_reporting.error_reporter.n errorReporter;

    @Y61.k
    private final Qc.c firebase;

    @Y61.k
    private final InterfaceC49030e myTracker;

    @Y61.k
    private final InterfaceC35745a5 schedulers;

    @Y61.k
    private final com.avito.android.analytics.task.a tracker;

    @Inject
    public AnalyticsWarmUpTask(@Y61.k com.avito.android.error_reporting.error_reporter.n nVar, @Y61.l InterfaceC48152a interfaceC48152a, @Y61.k InterfaceC28533a interfaceC28533a, @Y61.k Qc.c cVar, @Y61.k InterfaceC49030e interfaceC49030e, @Y61.k InterfaceC35745a5 interfaceC35745a5, @InterfaceC47056b @Y61.k com.avito.android.analytics.task.a aVar, @Y61.k InterfaceC28394t interfaceC28394t) {
        this.errorReporter = nVar;
        this.appMetricaInitializer = interfaceC48152a;
        this.adjust = interfaceC28533a;
        this.firebase = cVar;
        this.myTracker = interfaceC49030e;
        this.schedulers = interfaceC35745a5;
        this.tracker = aVar;
        this.clickStreamCrashReporter = interfaceC28394t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.G0 execute$lambda$2(AnalyticsWarmUpTask analyticsWarmUpTask) {
        analyticsWarmUpTask.adjust.a();
        InterfaceC48152a interfaceC48152a = analyticsWarmUpTask.appMetricaInitializer;
        if (interfaceC48152a != null) {
            interfaceC48152a.a();
        }
        analyticsWarmUpTask.clickStreamCrashReporter.a();
        analyticsWarmUpTask.myTracker.a();
        return kotlin.G0.f406611a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        this.errorReporter.a();
        this.tracker.a(fA2.b(), "anal-fabric");
        com.avito.android.analytics.screens.F fA3 = D.a.a();
        this.firebase.a();
        this.tracker.a(fA3.b(), "anal-firebase");
        C35891d.a(new io.reactivex.rxjava3.internal.operators.completable.r(new VH0.c(this, 6)).x(this.schedulers.a()));
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
