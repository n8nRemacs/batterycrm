package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.C30277e1;
import com.avito.android.util.X2;
import javax.inject.Inject;
import kotlin.InterfaceC43069u;
import kotlin.Metadata;

/* compiled from: MessengerBackgroundTask.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BY\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&¨\u0006'"}, d2 = {"Lcom/avito/android/app/task/MessengerBackgroundTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/app/task/MessengerPhotosCleanupTask;", "messengerPhotosCleanupTask", "Lcom/avito/android/app/task/SendPendingMessagesTask;", "sendMessagesTask", "Lcom/avito/android/app/task/ChannelSyncTask;", "channelSyncTask", "Lcom/avito/android/app/task/MessageSyncTask;", "messageSyncTask", "Lcom/avito/android/app/task/MessengerReadStatusSyncTask;", "messengerReadStatusSyncTask", "Lcom/avito/android/app/task/HashIdChangesObservingTask;", "hashIdChangesObservingTask", "Lcom/avito/android/app/task/MessengerNotificationsTask;", "messengerNotificationsTask", "Lcom/avito/android/app/task/MessageLocallyDeletedChannelsTask;", "messageLocallyDeletedChannelsTask", "Lcom/avito/android/app/task/ChannelWarmUpTask;", "channelWarmUpTask", "Lcom/avito/android/e1;", "messengerFeatures", "<init>", "(Lcom/avito/android/app/task/MessengerPhotosCleanupTask;Lcom/avito/android/app/task/SendPendingMessagesTask;Lcom/avito/android/app/task/ChannelSyncTask;Lcom/avito/android/app/task/MessageSyncTask;Lcom/avito/android/app/task/MessengerReadStatusSyncTask;Lcom/avito/android/app/task/HashIdChangesObservingTask;Lcom/avito/android/app/task/MessengerNotificationsTask;Lcom/avito/android/app/task/MessageLocallyDeletedChannelsTask;Lcom/avito/android/app/task/ChannelWarmUpTask;Lcom/avito/android/e1;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/app/task/MessengerPhotosCleanupTask;", "Lcom/avito/android/app/task/SendPendingMessagesTask;", "Lcom/avito/android/app/task/ChannelSyncTask;", "Lcom/avito/android/app/task/MessageSyncTask;", "Lcom/avito/android/app/task/MessengerReadStatusSyncTask;", "Lcom/avito/android/app/task/HashIdChangesObservingTask;", "Lcom/avito/android/app/task/MessengerNotificationsTask;", "Lcom/avito/android/app/task/MessageLocallyDeletedChannelsTask;", "Lcom/avito/android/app/task/ChannelWarmUpTask;", "Lcom/avito/android/e1;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MessengerBackgroundTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final ChannelSyncTask channelSyncTask;

    @Y61.k
    private final ChannelWarmUpTask channelWarmUpTask;

    @Y61.k
    private final HashIdChangesObservingTask hashIdChangesObservingTask;

    @Y61.k
    private final MessageLocallyDeletedChannelsTask messageLocallyDeletedChannelsTask;

    @Y61.k
    private final MessageSyncTask messageSyncTask;

    @Y61.k
    private final C30277e1 messengerFeatures;

    @Y61.k
    private final MessengerNotificationsTask messengerNotificationsTask;

    @Y61.k
    private final MessengerPhotosCleanupTask messengerPhotosCleanupTask;

    @Y61.k
    private final MessengerReadStatusSyncTask messengerReadStatusSyncTask;

    @Y61.k
    private final SendPendingMessagesTask sendMessagesTask;

    @Inject
    public MessengerBackgroundTask(@Y61.k MessengerPhotosCleanupTask messengerPhotosCleanupTask, @Y61.k SendPendingMessagesTask sendPendingMessagesTask, @Y61.k ChannelSyncTask channelSyncTask, @Y61.k MessageSyncTask messageSyncTask, @Y61.k MessengerReadStatusSyncTask messengerReadStatusSyncTask, @Y61.k HashIdChangesObservingTask hashIdChangesObservingTask, @Y61.k MessengerNotificationsTask messengerNotificationsTask, @Y61.k MessageLocallyDeletedChannelsTask messageLocallyDeletedChannelsTask, @Y61.k ChannelWarmUpTask channelWarmUpTask, @Y61.k C30277e1 c30277e1) {
        this.messengerPhotosCleanupTask = messengerPhotosCleanupTask;
        this.sendMessagesTask = sendPendingMessagesTask;
        this.channelSyncTask = channelSyncTask;
        this.messageSyncTask = messageSyncTask;
        this.messengerReadStatusSyncTask = messengerReadStatusSyncTask;
        this.hashIdChangesObservingTask = hashIdChangesObservingTask;
        this.messengerNotificationsTask = messengerNotificationsTask;
        this.messageLocallyDeletedChannelsTask = messageLocallyDeletedChannelsTask;
        this.channelWarmUpTask = channelWarmUpTask;
        this.messengerFeatures = c30277e1;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    @InterfaceC43069u
    public void execute(@Y61.k Application application) {
        X2 x22 = X2.f318778a;
        x22.i("MsgBgInitTask", "execute MessengerPhotosCleanupTask", null);
        this.messengerPhotosCleanupTask.execute(application);
        x22.i("MsgBgInitTask", "execute SendPendingMessagesTask", null);
        this.sendMessagesTask.execute(application);
        x22.i("MsgBgInitTask", "execute ChannelSyncTask", null);
        this.channelSyncTask.execute(application);
        x22.i("MsgBgInitTask", "execute MessageSyncTask", null);
        this.messageSyncTask.execute(application);
        x22.i("MsgBgInitTask", "execute MessengerReadStatusSyncTask", null);
        this.messengerReadStatusSyncTask.execute(application);
        x22.i("MsgBgInitTask", "execute HashIdChangesObservingTask", null);
        this.hashIdChangesObservingTask.execute(application);
        x22.i("MsgBgInitTask", "execute MessengerNotificationsTask", null);
        this.messengerNotificationsTask.execute(application);
        x22.i("MsgBgInitTask", "execute MessageLocallyDeletedChannelsTask", null);
        this.messageLocallyDeletedChannelsTask.execute(application);
        C30277e1 c30277e1 = this.messengerFeatures;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[56];
        if (((Boolean) c30277e1.f145008d0.a().invoke()).booleanValue()) {
            x22.i("MsgBgInitTask", "execute ChannelWarmUpTask", null);
            this.channelWarmUpTask.execute(application);
        }
    }
}
