package com.avito.android.task;

import Y61.k;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.notification_center.counter.j;
import com.avito.android.remote.notification.InterfaceC34350q;
import h31.e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationCenterTask.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/task/NotificationCenterTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/notification_center/counter/j;", "updater", "Lcom/avito/android/remote/notification/q;", "notificationInteractor", "Lh31/e;", "Lcom/avito/android/notification_center/counter/k;", "pushHandler", "<init>", "(Lcom/avito/android/notification_center/counter/j;Lcom/avito/android/remote/notification/q;Lh31/e;)V", "Lkotlin/G0;", "execute", "()V", "Lcom/avito/android/notification_center/counter/j;", "Lcom/avito/android/remote/notification/q;", "Lh31/e;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationCenterTask implements ApplicationForegroundStartupTask {

    @k
    private final InterfaceC34350q notificationInteractor;

    @k
    private final e<com.avito.android.notification_center.counter.k> pushHandler;

    @k
    private final j updater;

    @Inject
    public NotificationCenterTask(@k j jVar, @k InterfaceC34350q interfaceC34350q, @k e<com.avito.android.notification_center.counter.k> eVar) {
        this.updater = jVar;
        this.notificationInteractor = interfaceC34350q;
        this.pushHandler = eVar;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        this.notificationInteractor.f(this.pushHandler.get());
        this.updater.a();
    }
}
