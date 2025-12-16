package com.avito.android.entrypoint.task;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.V2;
import id.i;
import javax.inject.Inject;
import kotlin.Metadata;
import vz.C49402c;
import vz.f;

/* compiled from: AppEntrypointStartupTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/entrypoint/task/AppEntrypointStartupTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lvz/c;", "appEntrypointProviderImpl", "<init>", "(Lvz/c;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lvz/c;", "_avito_entrypoint_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AppEntrypointStartupTask implements ApplicationBlockingStartupTask {

    @k
    private final C49402c appEntrypointProviderImpl;

    /* compiled from: AppEntrypointStartupTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/entrypoint/task/AppEntrypointStartupTask$a", "Lid/i;", "_avito_entrypoint_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Application f147735c;

        public a(Application application) {
            this.f147735c = application;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@k Activity activity, @l Bundle bundle) {
            boolean z12 = activity instanceof f;
            AppEntrypointStartupTask appEntrypointStartupTask = AppEntrypointStartupTask.this;
            if (z12) {
                C49402c c49402c = appEntrypointStartupTask.appEntrypointProviderImpl;
                c49402c.f441066a.setValue(((f) activity).G0());
            }
            V2.f318762a.c("AppEntrypoint", String.valueOf(appEntrypointStartupTask.appEntrypointProviderImpl.a()), null);
            this.f147735c.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Inject
    public AppEntrypointStartupTask(@k C49402c c49402c) {
        this.appEntrypointProviderImpl = c49402c;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public InterfaceC28559h.a execute(@k Application application) {
        application.registerActivityLifecycleCallbacks(new a(application));
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
