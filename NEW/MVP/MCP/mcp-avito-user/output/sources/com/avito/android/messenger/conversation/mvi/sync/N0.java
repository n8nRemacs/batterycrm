package com.avito.android.messenger.conversation.mvi.sync;

import android.content.Context;
import androidx.work.C23542f;
import androidx.work.C23544h;
import androidx.work.ExistingWorkPolicy;
import androidx.work.J;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import com.avito.android.C30277e1;
import com.avito.android.messenger.conversation.mvi.sync.MessageIsReadMarkerWorker;
import com.avito.android.util.V2;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SyncJobsScheduler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/N0;", "Lcom/avito/android/messenger/conversation/mvi/sync/O0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class N0 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f194630a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f194631b;

    public N0(@Y61.k Context context, @Y61.k C30277e1 c30277e1) {
        this.f194630a = context;
        this.f194631b = c30277e1;
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.O0
    public final void a(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        IncompleteMessageLoadingWorker.f194599b.getClass();
        C23542f.a aVar = new C23542f.a();
        aVar.b(NetworkType.f55396c);
        C23542f c23542fA = aVar.a();
        String strConcat = "IncompleteMessageLoadingWorker-".concat(str);
        C23544h.a aVar2 = new C23544h.a();
        dZ.g.b(aVar2, IncompleteMessageLoadingWorker.f194600c, messengerUserHashInfo);
        LinkedHashMap linkedHashMap = aVar2.f55511a;
        linkedHashMap.put("channelId", str);
        linkedHashMap.put("localId", null);
        androidx.work.J jB2 = new J.a(IncompleteMessageLoadingWorker.class).f(c23542fA).a(strConcat).h(aVar2.a()).b();
        WorkManager.f55428a.getClass();
        androidx.work.impl.Y.f(this.f194630a).a(strConcat, ExistingWorkPolicy.f55375b, jB2).a();
        kotlin.Q q12 = new kotlin.Q(strConcat, jB2.f55478a);
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" enqueued ");
        sb2.append(q12);
        v22.i("IncompleteMessageLoadingWorker", sb2.toString(), null);
        v22.i("SyncJobScheduler", com.avito.android.authorization.auto_recovery.phone_confirm.b.i(new StringBuilder("Enqueued IncompleteMessageLoadingWorker("), q12, ')'), null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.O0
    public final void b(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        MessageIsReadMarkerWorker.a aVar = MessageIsReadMarkerWorker.f194619d;
        C30277e1 c30277e1 = this.f194631b;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[67];
        boolean zBooleanValue = ((Boolean) c30277e1.f145028n0.a().invoke()).booleanValue();
        aVar.getClass();
        kotlin.Q qA2 = MessageIsReadMarkerWorker.a.a(this.f194630a, messengerUserHashInfo, str, j12, "mark_channel_unread", zBooleanValue);
        V2.f318762a.i("SyncJobScheduler", "Enqueued MessageIsReadMarkerWorker(" + qA2 + ')', null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.O0
    public final void c(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        MessageIsReadMarkerWorker.a aVar = MessageIsReadMarkerWorker.f194619d;
        C30277e1 c30277e1 = this.f194631b;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[67];
        boolean zBooleanValue = ((Boolean) c30277e1.f145028n0.a().invoke()).booleanValue();
        aVar.getClass();
        kotlin.Q qA2 = MessageIsReadMarkerWorker.a.a(this.f194630a, messengerUserHashInfo, str, j12, "mark_channel_read", zBooleanValue);
        V2.f318762a.i("SyncJobScheduler", "Enqueued MessageIsReadMarkerWorker(" + qA2 + ')', null);
    }
}
