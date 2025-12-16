package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import kotlin.Metadata;

/* compiled from: AppStartTypeDetermineTask.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/app/task/AppStartTypeDetermineTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Stub", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AppStartTypeDetermineTask extends ApplicationBlockingStartupTask {

    /* compiled from: AppStartTypeDetermineTask.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/app/task/AppStartTypeDetermineTask$Stub;", "Lcom/avito/android/app/task/AppStartTypeDetermineTask;", "<init>", "()V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a$c;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a$c;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Stub implements AppStartTypeDetermineTask {

        @Y61.k
        public static final Stub INSTANCE = new Stub();

        private Stub() {
        }

        @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
        @Y61.k
        public ApplicationBlockingStartupTask.Priority getPriority() {
            return ApplicationBlockingStartupTask.Priority.f91378b;
        }

        @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
        @Y61.k
        public InterfaceC28559h.a.c execute(@Y61.k Application application) {
            return InterfaceC28559h.a.c.f91606a;
        }
    }

    /* compiled from: AppStartTypeDetermineTask.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }
}
