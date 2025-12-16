package com.avito.android.advert_core.task;

import com.avito.android.app.task.PublishDraftsCleanupTask;
import com.avito.android.app.task.PublishDraftsSyncTask;
import com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.IacLogSendingWorker;
import com.avito.android.push.impl_module.fcm.i;
import com.avito.android.util.V2;
import com.avito.android.util.X2;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84395b;

    public /* synthetic */ a(int i12) {
        this.f84395b = i12;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f84395b) {
            case 0:
                FirstTimeRunTask.execute$lambda$1();
                break;
            case 1:
                V2.f318762a.c("PendingMessageHandler", "Waiting for new messages.", null);
                break;
            case 2:
                V2.f318762a.c("PendingMessageHandler", "Waiting for login", null);
                break;
            case 3:
                PublishDraftsCleanupTask.execute$lambda$0();
                break;
            case 4:
                PublishDraftsSyncTask.execute$lambda$0();
                break;
            case 5:
                V2.f318762a.c("PublishDraftsSyncTask", "Success drafts sync", null);
                break;
            case 6:
                V2.f318762a.i("PendingMessageSendingTask", "Canceled send pending messages work", null);
                break;
            case 7:
                V2.f318762a.i("PendingMessageSendingTask", "Scheduled send pending message work", null);
                break;
            case 8:
                V2.f318762a.i("PendingMessageSendingTask", "Scheduled send pending message work with delay", null);
                break;
            case 9:
                V2.f318762a.i("PendingMessageSendingTask", "Stopped foreground handling", null);
                break;
            case 10:
                break;
            case 11:
                V2.f318762a.g("FavoriteSellerInteractor", "Favorite seller updated after muting");
                break;
            case 12:
                IacLogSendingWorker.a aVar = IacLogSendingWorker.f168050g;
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogSendingWorker", "Worker is finished", null);
                break;
            case 13:
                X2.f318778a.i("MessengerReadStatusSyncAgent", "Subscription to userId disposed", null);
                break;
            case 14:
                X2.f318778a.i("MessageSyncAgent", "Subscription to userId & events disposed", null);
                break;
            case 15:
                V2 v22 = V2.f318762a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[" + Thread.currentThread().getName() + ']');
                sb2.append(" Subscription to userId & events disposed");
                v22.i("UnreadChatsCounterSyncAgent", sb2.toString(), null);
                break;
            case 16:
                V2 v23 = V2.f318762a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("[" + Thread.currentThread().getName() + ']');
                sb3.append(" Subscription to userId & events completed");
                v23.i("UnreadChatsCounterSyncAgent", sb3.toString(), null);
                break;
            case 17:
                V2.f318762a.c("PublishDrafts", "Publish draft was deleted", null);
                break;
            default:
                i.f245951h.release();
                break;
        }
    }

    private final void a() {
    }
}
