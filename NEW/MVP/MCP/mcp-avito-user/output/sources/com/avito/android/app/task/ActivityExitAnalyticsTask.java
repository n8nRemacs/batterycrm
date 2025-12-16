package com.avito.android.app.task;

import android.app.Activity;
import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.V2;
import f90.InterfaceC40252a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ActivityExitAnalyticsTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/app/task/ActivityExitAnalyticsTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lkotlin/G0;", "trackActivities", "()V", "Lf90/a$a;", "record", "trackRecord", "(Lf90/a$a;)V", "Landroid/app/Application;", "application", "registerCallbacks", "(Landroid/app/Application;)V", "Landroid/app/Activity;", "activity", "createRecord", "(Landroid/app/Activity;)Lf90/a$a;", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lf90/a;", "storage", "Lf90/a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActivityExitAnalyticsTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final InterfaceC40252a storage;

    /* compiled from: ActivityExitAnalyticsTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/app/task/ActivityExitAnalyticsTask$a", "Lid/i;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends id.i {
        public a() {
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@Y61.k Activity activity) {
            ActivityExitAnalyticsTask activityExitAnalyticsTask = ActivityExitAnalyticsTask.this;
            activityExitAnalyticsTask.storage.a(activityExitAnalyticsTask.createRecord(activity));
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@Y61.k Activity activity) {
            ActivityExitAnalyticsTask activityExitAnalyticsTask = ActivityExitAnalyticsTask.this;
            activityExitAnalyticsTask.storage.c(activityExitAnalyticsTask.createRecord(activity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC40252a.C11130a createRecord(Activity activity) {
        return new InterfaceC40252a.C11130a(String.valueOf(System.identityHashCode(activity)), activity.getClass().getName());
    }

    private final void registerCallbacks(Application application) {
        application.registerActivityLifecycleCallbacks(new a());
    }

    private final void trackActivities() {
        ArrayList arrayListB = this.storage.b();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            trackRecord((InterfaceC40252a.C11130a) it.next());
        }
        V2.f318762a.c("ActivityExitAnalyticsTask", "Unexpected exit activities: " + arrayListB, null);
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        trackActivities();
        registerCallbacks(application);
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }

    private final void trackRecord(InterfaceC40252a.C11130a record) {
    }
}
