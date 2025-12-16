package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelSyncTask.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/app/task/ChannelSyncTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lh31/e;", "Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent;", "syncAgent", "<init>", "(Lh31/e;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lh31/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChannelSyncTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final h31.e<ChannelSyncAgent> syncAgent;

    @Inject
    public ChannelSyncTask(@Y61.k h31.e<ChannelSyncAgent> eVar) {
        this.syncAgent = eVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        this.syncAgent.get().b();
    }
}
