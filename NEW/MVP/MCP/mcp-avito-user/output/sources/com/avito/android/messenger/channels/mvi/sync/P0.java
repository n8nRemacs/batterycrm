package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerReadStatusSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "msg", "Lcom/avito/android/messenger/channels/mvi/sync/a;", "apply", "(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)Lcom/avito/android/messenger/channels/mvi/sync/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class P0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U0 f188385c;

    public P0(U0 u02, MessengerUserHashInfo messengerUserHashInfo) {
        this.f188384b = messengerUserHashInfo;
        this.f188385c = u02;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String channelId = ((LocalMessage) obj).getChannelId();
        U0 u02 = this.f188385c;
        u02.getClass();
        return new C31823a(channelId, this.f188384b, MessengerTimestamp.INSTANCE.fromMillis(u02.f188400h.now()), MarkAction.f188362b);
    }
}
