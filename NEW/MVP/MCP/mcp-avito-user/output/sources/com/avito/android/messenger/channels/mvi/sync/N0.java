package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.util.X2;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerReadStatusSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/a;", "readRequest", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/channels/mvi/sync/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class N0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f188382b;

    public N0(U0 u02) {
        this.f188382b = u02;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C31823a c31823a = (C31823a) obj;
        com.avito.android.messenger.conversation.mvi.sync.O0 o02 = this.f188382b.f188401i;
        MarkAction markAction = c31823a.f188423d;
        int iOrdinal = markAction.ordinal();
        long j12 = c31823a.f188422c;
        String str = c31823a.f188420a;
        MessengerUserHashInfo messengerUserHashInfo = c31823a.f188421b;
        if (iOrdinal == 0) {
            o02.c(j12, str, messengerUserHashInfo);
        } else if (iOrdinal == 1) {
            o02.b(j12, str, messengerUserHashInfo);
        }
        X2.f318778a.i("MessengerReadStatusSyncAgent", "Scheduling a new request to mark channel " + markAction, null);
    }
}
