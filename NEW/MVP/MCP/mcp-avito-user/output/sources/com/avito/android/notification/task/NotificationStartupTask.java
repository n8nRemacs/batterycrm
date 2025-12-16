package com.avito.android.notification.task;

import Y61.k;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import javax.inject.Inject;
import kotlin.Metadata;
import y30.InterfaceC50050d;

/* compiled from: NotificationStartupTask.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/notification/task/NotificationStartupTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Ly30/d;", "storage", "<init>", "(Ly30/d;)V", "Lkotlin/G0;", "execute", "()V", "Ly30/d;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationStartupTask implements ApplicationForegroundStartupTask {

    @k
    private final InterfaceC50050d storage;

    @Inject
    public NotificationStartupTask(@k InterfaceC50050d interfaceC50050d) {
        this.storage = interfaceC50050d;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        this.storage.b(null);
    }
}
