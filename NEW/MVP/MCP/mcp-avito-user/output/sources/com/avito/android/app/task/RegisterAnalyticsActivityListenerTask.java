package com.avito.android.app.task;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.AbstractC28409d;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RegisterAnalyticsActivityListenerTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/app/task/RegisterAnalyticsActivityListenerTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/analytics/a;", "analytics", "<init>", "(Lcom/avito/android/analytics/a;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/analytics/a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RegisterAnalyticsActivityListenerTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final InterfaceC28373a analytics;

    /* compiled from: RegisterAnalyticsActivityListenerTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/app/task/RegisterAnalyticsActivityListenerTask$a", "Lid/i;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends id.i {
        public a() {
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
            RegisterAnalyticsActivityListenerTask.this.analytics.c(new AbstractC28409d.a(activity.getClass().getSimpleName().concat(".onCreate"), null));
            V2.f318762a.g(activity.getClass().getSimpleName(), "onCreate");
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@Y61.k Activity activity) {
            V2.f318762a.g(activity.getClass().getSimpleName(), "onDestroy");
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@Y61.k Activity activity) {
            RegisterAnalyticsActivityListenerTask.this.analytics.c(new AbstractC28409d.c(activity.getClass().getSimpleName().concat(".onPause"), null));
            V2.f318762a.g(activity.getClass().getSimpleName(), "onPause");
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@Y61.k Activity activity) {
            RegisterAnalyticsActivityListenerTask.this.analytics.c(new AbstractC28409d.C2671d(activity.getClass().getSimpleName().concat(".onResume"), null));
            V2.f318762a.g(activity.getClass().getSimpleName(), "onResume");
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@Y61.k Activity activity) {
            RegisterAnalyticsActivityListenerTask.this.analytics.c(new AbstractC28409d.e(activity.getClass().getSimpleName().concat(".onStart"), null));
            V2.f318762a.g(activity.getClass().getSimpleName(), "onStart");
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@Y61.k Activity activity) {
            RegisterAnalyticsActivityListenerTask.this.analytics.c(new AbstractC28409d.f(activity.getClass().getSimpleName().concat(".onStop"), null));
            V2.f318762a.g(activity.getClass().getSimpleName(), "onStop");
        }
    }

    @Inject
    public RegisterAnalyticsActivityListenerTask(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.analytics = interfaceC28373a;
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
