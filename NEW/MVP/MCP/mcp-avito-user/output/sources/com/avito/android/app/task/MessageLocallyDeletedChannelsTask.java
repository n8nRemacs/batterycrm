package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.C30277e1;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31857r0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessageLocallyDeletedChannelsTask.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/app/task/MessageLocallyDeletedChannelsTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lh31/e;", "Lcom/avito/android/messenger/channels/mvi/sync/r0;", "syncAgent", "Lcom/avito/android/e1;", "messengerFeatures", "<init>", "(Lh31/e;Lcom/avito/android/e1;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lh31/e;", "Lcom/avito/android/e1;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MessageLocallyDeletedChannelsTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final C30277e1 messengerFeatures;

    @Y61.k
    private final h31.e<InterfaceC31857r0> syncAgent;

    @Inject
    public MessageLocallyDeletedChannelsTask(@Y61.k h31.e<InterfaceC31857r0> eVar, @Y61.k C30277e1 c30277e1) {
        this.syncAgent = eVar;
        this.messengerFeatures = c30277e1;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        C30277e1 c30277e1 = this.messengerFeatures;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[47];
        if (((Boolean) c30277e1.f144987U.a().invoke()).booleanValue()) {
            this.syncAgent.get().a();
        }
    }
}
