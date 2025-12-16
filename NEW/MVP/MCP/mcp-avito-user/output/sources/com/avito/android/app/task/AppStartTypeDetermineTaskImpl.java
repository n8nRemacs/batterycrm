package com.avito.android.app.task;

import Ec.C13472a;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.view.C23050m0;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28419i;
import com.avito.android.analytics.statsd.y;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppStartTypeDetermineTask.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR8\u0010#\u001a&\u0012\f\u0012\n !*\u0004\u0018\u00010\n0\n !*\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010\n0\n\u0018\u00010\"0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/avito/android/app/task/AppStartTypeDetermineTaskImpl;", "Lcom/avito/android/app/task/AppStartTypeDetermineTask;", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/error_reporting/app_state/a$a;", "appStateCollector", "Lcom/avito/android/analytics/start/a;", "warmStartAnalytics", "<init>", "(Lcom/avito/android/analytics/a;Lcom/avito/android/error_reporting/app_state/a$a;Lcom/avito/android/analytics/start/a;)V", "Landroid/app/Activity;", "activity", "Lkotlin/G0;", "onStartTypeDetermined", "(Landroid/app/Activity;)V", "", "isForegroundProcess", "()Z", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/analytics/a;", "Lcom/avito/android/error_reporting/app_state/a$a;", "Lcom/avito/android/analytics/start/a;", "Lcom/avito/android/app/task/W1;", "startType", "Lcom/avito/android/app/task/W1;", "atLeastOneActivityCreated", "Z", "processStartedWithActivity", "", "kotlin.jvm.PlatformType", "", "activitiesThatWereEverForeground", "Ljava/util/Set;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AppStartTypeDetermineTaskImpl implements AppStartTypeDetermineTask {
    private final Set<Activity> activitiesThatWereEverForeground = Collections.newSetFromMap(new WeakHashMap());

    @Y61.k
    private final InterfaceC28373a analytics;

    @Y61.k
    private final InterfaceC30362a.InterfaceC4322a appStateCollector;
    private boolean atLeastOneActivityCreated;
    private boolean processStartedWithActivity;

    @Y61.l
    private W1 startType;

    @Y61.k
    private final com.avito.android.analytics.start.a warmStartAnalytics;

    /* compiled from: AppStartTypeDetermineTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/app/task/AppStartTypeDetermineTaskImpl$a", "Lid/i;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends id.i {
        public a() {
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
            AppStartTypeDetermineTaskImpl.this.atLeastOneActivityCreated = true;
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@Y61.k Activity activity) {
            AppStartTypeDetermineTaskImpl appStartTypeDetermineTaskImpl = AppStartTypeDetermineTaskImpl.this;
            if (appStartTypeDetermineTaskImpl.startType == null && appStartTypeDetermineTaskImpl.processStartedWithActivity) {
                appStartTypeDetermineTaskImpl.startType = appStartTypeDetermineTaskImpl.activitiesThatWereEverForeground.contains(activity) ? W1.f91549e : W1.f91548d;
                appStartTypeDetermineTaskImpl.onStartTypeDetermined(activity);
                if (appStartTypeDetermineTaskImpl.startType == W1.f91548d) {
                    appStartTypeDetermineTaskImpl.warmStartAnalytics.a(activity);
                }
            }
            appStartTypeDetermineTaskImpl.activitiesThatWereEverForeground.add(activity);
        }
    }

    /* compiled from: AppStartTypeDetermineTask.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/avito/android/app/task/AppStartTypeDetermineTaskImpl$b", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onStop", "()V", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC22982O {
        public b() {
        }

        @InterfaceC23042i0(Lifecycle.Event.ON_STOP)
        private final void onStop() {
            AppStartTypeDetermineTaskImpl.this.startType = null;
        }
    }

    @Inject
    public AppStartTypeDetermineTaskImpl(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC30362a.InterfaceC4322a interfaceC4322a, @Y61.k com.avito.android.analytics.start.a aVar) {
        this.analytics = interfaceC28373a;
        this.appStateCollector = interfaceC4322a;
        this.warmStartAnalytics = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(AppStartTypeDetermineTaskImpl appStartTypeDetermineTaskImpl) {
        if (appStartTypeDetermineTaskImpl.atLeastOneActivityCreated && appStartTypeDetermineTaskImpl.isForegroundProcess()) {
            appStartTypeDetermineTaskImpl.startType = W1.f91547c;
            appStartTypeDetermineTaskImpl.processStartedWithActivity = true;
            appStartTypeDetermineTaskImpl.onStartTypeDetermined((Activity) C42745f0.F(appStartTypeDetermineTaskImpl.activitiesThatWereEverForeground));
        }
    }

    private final boolean isForegroundProcess() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStartTypeDetermined(Activity activity) {
        W1 w12 = this.startType;
        if (w12 != null) {
            String str = w12.f91552b;
            InterfaceC28373a interfaceC28373a = this.analytics;
            C13472a.f4111a.getClass();
            interfaceC28373a.c(new y.a("application_start.type.".concat(str), 0L, 2, null));
            this.analytics.c(new C28419i(str));
            this.appStateCollector.b("app_start_type", str);
            String str2 = activity == null ? "unknown" : new com.avito.android.analytics.screens.r(activity, (Long) null, (String) null, 6, (C42822w) null).f90694a;
            this.analytics.c(new y.a("application_start.activity_distribution." + str + '.' + str2, 0L, 2, null));
        }
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        application.registerActivityLifecycleCallbacks(new a());
        new Handler(Looper.getMainLooper()).post(new com.avito.android.app.coldstart.d(this, 2));
        C23050m0.f46822j.getClass();
        C23050m0.f46823k.f46829g.a(new b());
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
