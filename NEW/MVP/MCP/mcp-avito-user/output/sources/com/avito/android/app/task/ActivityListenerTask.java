package com.avito.android.app.task;

import android.app.Activity;
import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import id.C41383a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ActivityListenerTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/app/task/ActivityListenerTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lid/a;", "activityProvider", "Lid/j;", "startedActivitiesProvider", "<init>", "(Lid/a;Lid/j;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lid/a;", "Lid/j;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActivityListenerTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final C41383a activityProvider;

    @Y61.k
    private final id.j startedActivitiesProvider;

    /* compiled from: ActivityListenerTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/app/task/ActivityListenerTask$a", "Lid/i;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends id.i {
        public a() {
        }

        public final void b(Activity activity) {
            ActivityListenerTask activityListenerTask = ActivityListenerTask.this;
            if (activity == activityListenerTask.activityProvider.get()) {
                activityListenerTask.activityProvider.f398594a = null;
            }
            id.j jVar = activityListenerTask.startedActivitiesProvider;
            Iterable iterable = (Iterable) jVar.f398601a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                Activity activity2 = (Activity) ((WeakReference) obj).get();
                if (activity2 != null && activity2 != activity) {
                    arrayList.add(obj);
                }
            }
            jVar.f398601a = arrayList;
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@Y61.k Activity activity) {
            b(activity);
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@Y61.k Activity activity) {
            WeakReference<Activity> weakReference;
            C41383a c41383a = ActivityListenerTask.this.activityProvider;
            if (activity == null) {
                weakReference = null;
            } else {
                c41383a.getClass();
                weakReference = new WeakReference<>(activity);
            }
            c41383a.f398594a = weakReference;
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@Y61.k Activity activity) {
            id.j jVar = ActivityListenerTask.this.startedActivitiesProvider;
            jVar.f398601a = C42745f0.i0(new WeakReference(activity), (Collection) jVar.f398601a);
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@Y61.k Activity activity) {
            b(activity);
        }
    }

    @Inject
    public ActivityListenerTask(@Y61.k C41383a c41383a, @Y61.k id.j jVar) {
        this.activityProvider = c41383a;
        this.startedActivitiesProvider = jVar;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        application.registerActivityLifecycleCallbacks(new a());
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
