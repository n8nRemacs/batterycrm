package com.avito.android.push.impl_module.token.sending.startup;

import Y61.k;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.push.impl_module.token.sending.analytics.b;
import com.avito.android.push.impl_module.token.sending.short_task.c;
import ig0.AbstractC41398a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PushTokenUpdateStartupTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/startup/PushTokenUpdateStartupTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/push/impl_module/token/sending/short_task/c;", "sendPushTokenShortTaskScheduler", "Lcom/avito/android/push/impl_module/token/sending/analytics/b;", "notificationSystemSettingsLogger", "<init>", "(Lcom/avito/android/push/impl_module/token/sending/short_task/c;Lcom/avito/android/push/impl_module/token/sending/analytics/b;)V", "Lkotlin/G0;", "execute", "()V", "Lcom/avito/android/push/impl_module/token/sending/short_task/c;", "Lcom/avito/android/push/impl_module/token/sending/analytics/b;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PushTokenUpdateStartupTask implements ApplicationForegroundStartupTask {

    @k
    private final b notificationSystemSettingsLogger;

    @k
    private final c sendPushTokenShortTaskScheduler;

    @Inject
    public PushTokenUpdateStartupTask(@k c cVar, @k b bVar) {
        this.sendPushTokenShortTaskScheduler = cVar;
        this.notificationSystemSettingsLogger = bVar;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        this.notificationSystemSettingsLogger.a();
        this.sendPushTokenShortTaskScheduler.a(AbstractC41398a.b.f398616c);
    }
}
