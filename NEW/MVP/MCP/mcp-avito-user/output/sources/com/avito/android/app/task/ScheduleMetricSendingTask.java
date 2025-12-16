package com.avito.android.app.task;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.SystemClock;
import com.avito.android.analytics.clickstream.C28376a;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;

/* compiled from: ScheduleMetricSendingTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/app/task/ScheduleMetricSendingTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/util/a5;", "schedulers", "Lcom/avito/android/service/short_task/j;", "taskScheduler", "<init>", "(Lcom/avito/android/util/a5;Lcom/avito/android/service/short_task/j;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/util/a5;", "Lcom/avito/android/service/short_task/j;", "a", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class ScheduleMetricSendingTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final InterfaceC35745a5 schedulers;

    @Y61.k
    private final com.avito.android.service.short_task.j taskScheduler;

    /* compiled from: ScheduleMetricSendingTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/ScheduleMetricSendingTask$a;", "", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        long b();
    }

    /* compiled from: ScheduleMetricSendingTask.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/app/task/ScheduleMetricSendingTask$b", "Lid/i;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends id.i {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C28376a f91519b = new C28376a();

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Application f91520c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ScheduleMetricSendingTask f91521d;

        public b(Application application, ScheduleMetricSendingTask scheduleMetricSendingTask) {
            this.f91520c = application;
            this.f91521d = scheduleMetricSendingTask;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@Y61.k Activity activity) {
            Application application = this.f91520c;
            application.unregisterActivityLifecycleCallbacks(this);
            Intent intent = activity.getIntent();
            boolean zHasCategory = intent.hasCategory("android.intent.category.LAUNCHER");
            ScheduleMetricSendingTask scheduleMetricSendingTask = this.f91521d;
            if (!zHasCategory || !kotlin.jvm.internal.L.f(intent.getAction(), "android.intent.action.MAIN")) {
                scheduleMetricSendingTask.taskScheduler.c(com.avito.android.service.short_task.metrics.t.class, ShortTask.NetworkState.f274023b, false, false, false, false, 1000L, true, null, ShortTask.BackoffPolicy.f274019b, 30000L);
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            a aVar = application instanceof a ? (a) application : null;
            if (aVar == null) {
                return;
            }
            new io.reactivex.rxjava3.internal.operators.single.G(new VH0.c(aVar, 8)).z(scheduleMetricSendingTask.schedulers.c()).s(scheduleMetricSendingTask.schedulers.c()).x(new E1(this, jElapsedRealtime, scheduleMetricSendingTask), F1.f91406b);
        }
    }

    public ScheduleMetricSendingTask(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.service.short_task.j jVar) {
        this.schedulers = interfaceC35745a5;
        this.taskScheduler = jVar;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        application.registerActivityLifecycleCallbacks(new b(application, this));
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
