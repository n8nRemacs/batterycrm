package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.C30277e1;
import com.avito.android.remote.notification.InterfaceC34350q;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessengerNotificationsTask.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/app/task/MessengerNotificationsTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/e1;", "features", "Lcom/avito/android/remote/notification/q;", "notificationInteractor", "Lh31/e;", "Lcom/avito/android/messenger/notification/e;", "visibleChannelIdHolder", "Lcom/avito/android/messenger/notification/c;", "unreadMsgNotificationHandler", "<init>", "(Lcom/avito/android/e1;Lcom/avito/android/remote/notification/q;Lh31/e;Lh31/e;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/e1;", "Lcom/avito/android/remote/notification/q;", "Lh31/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MessengerNotificationsTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final C30277e1 features;

    @Y61.k
    private final InterfaceC34350q notificationInteractor;

    @Y61.k
    private final h31.e<com.avito.android.messenger.notification.c> unreadMsgNotificationHandler;

    @Y61.k
    private final h31.e<com.avito.android.messenger.notification.e> visibleChannelIdHolder;

    @Inject
    public MessengerNotificationsTask(@Y61.k C30277e1 c30277e1, @Y61.k InterfaceC34350q interfaceC34350q, @Y61.k h31.e<com.avito.android.messenger.notification.e> eVar, @Y61.k h31.e<com.avito.android.messenger.notification.c> eVar2) {
        this.features = c30277e1;
        this.notificationInteractor = interfaceC34350q;
        this.visibleChannelIdHolder = eVar;
        this.unreadMsgNotificationHandler = eVar2;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        this.notificationInteractor.f(this.visibleChannelIdHolder.get());
        C30277e1 c30277e1 = this.features;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[24];
        if (((Boolean) c30277e1.f145049y.a().invoke()).booleanValue()) {
            this.unreadMsgNotificationHandler.get().a();
        }
    }
}
