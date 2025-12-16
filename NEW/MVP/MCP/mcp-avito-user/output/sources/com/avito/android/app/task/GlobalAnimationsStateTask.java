package com.avito.android.app.task;

import android.app.Application;
import android.provider.Settings;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GlobalAnimationsStateTask.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/app/task/GlobalAnimationsStateTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "<init>", "()V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GlobalAnimationsStateTask implements ApplicationBlockingStartupTask {
    @Inject
    public GlobalAnimationsStateTask() {
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        com.avito.android.util.C1.f318564a.getClass();
        com.avito.android.util.C1.f318565b = Float.valueOf(Settings.Global.getFloat(application.getContentResolver(), "animator_duration_scale", 1.0f));
        Settings.Global.getFloat(application.getContentResolver(), "transition_animation_scale", 1.0f);
        Settings.Global.getFloat(application.getContentResolver(), "window_animation_scale", 1.0f);
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
