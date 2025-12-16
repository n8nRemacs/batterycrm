package com.avito.android.app.task;

import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.util.V2;
import com.avito.android.util.X2;
import kotlin.Metadata;

/* compiled from: InitLoggerTask.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/app/task/InitLoggerTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "<init>", "()V", "LAW/b;", "logger", "Lkotlin/G0;", "setAvitoLogger", "(LAW/b;)V", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "priority", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "getPriority", "()Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class InitLoggerTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final ApplicationBlockingStartupTask.Priority priority = ApplicationBlockingStartupTask.Priority.f91379c;

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public final ApplicationBlockingStartupTask.Priority getPriority() {
        return this.priority;
    }

    public final void setAvitoLogger(@Y61.k AW.b logger) {
        V2.f318762a.getClass();
        V2.f318763b = logger;
        X2.f318778a.getClass();
        X2.f318779b = logger;
    }
}
