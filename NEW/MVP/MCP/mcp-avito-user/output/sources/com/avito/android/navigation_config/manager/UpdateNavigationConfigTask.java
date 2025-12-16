package com.avito.android.navigation_config.manager;

import Y61.l;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.bottom_navigation.space.o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: UpdateNavigationConfigTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/navigation_config/manager/UpdateNavigationConfigTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/navigation_config/manager/a;", "navigationConfigManager", "LW20/a;", "navigationConfigFeatures", "<init>", "(Lcom/avito/android/navigation_config/manager/a;LW20/a;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/navigation_config/manager/a;", "LW20/a;", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateNavigationConfigTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final W20.a navigationConfigFeatures;

    @Y61.k
    private final com.avito.android.navigation_config.manager.a navigationConfigManager;

    /* compiled from: UpdateNavigationConfigTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/navigation_config/manager/UpdateNavigationConfigTask$a", "Lid/i;", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends id.i {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreCreated(@Y61.k Activity activity, @l Bundle bundle) {
            if ((activity instanceof o) && bundle == null) {
                UpdateNavigationConfigTask.this.navigationConfigManager.d();
            }
        }
    }

    @Inject
    public UpdateNavigationConfigTask(@Y61.k com.avito.android.navigation_config.manager.a aVar, @Y61.k W20.a aVar2) {
        this.navigationConfigManager = aVar;
        this.navigationConfigFeatures = aVar2;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        W20.a aVar = this.navigationConfigFeatures;
        aVar.getClass();
        n<Object> nVar = W20.a.f17716j[1];
        if (((Boolean) aVar.f17718c.a().invoke()).booleanValue()) {
            application.registerActivityLifecycleCallbacks(new a());
        }
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
