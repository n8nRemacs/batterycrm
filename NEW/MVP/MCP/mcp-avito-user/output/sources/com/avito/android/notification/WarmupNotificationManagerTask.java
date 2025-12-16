package com.avito.android.notification;

import android.app.Application;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WarmupNotificationManagerTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/notification/WarmupNotificationManagerTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/notification/m;", "notificationManagerFactory", "Lcom/avito/android/notification/s;", "notificationSettingsTracker", "<init>", "(Lcom/avito/android/notification/m;Lcom/avito/android/notification/s;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/notification/m;", "Lcom/avito/android/notification/s;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WarmupNotificationManagerTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final m notificationManagerFactory;

    @Y61.k
    private final s notificationSettingsTracker;

    @Inject
    public WarmupNotificationManagerTask(@Y61.k m mVar, @Y61.k s sVar) {
        this.notificationManagerFactory = mVar;
        this.notificationSettingsTracker = sVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        this.notificationManagerFactory.a();
        this.notificationSettingsTracker.a();
    }
}
