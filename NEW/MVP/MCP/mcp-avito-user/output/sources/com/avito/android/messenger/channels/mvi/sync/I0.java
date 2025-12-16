package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.remote.model.messenger.MessengerTimestamp;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerReadStatusSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "channelId", "Lcom/avito/android/messenger/channels/mvi/sync/a;", "apply", "(Ljava/lang/String;)Lcom/avito/android/messenger/channels/mvi/sync/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class I0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U0 f188338c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MarkAction f188339d;

    public I0(MessengerUserHashInfo messengerUserHashInfo, U0 u02, MarkAction markAction) {
        this.f188337b = messengerUserHashInfo;
        this.f188338c = u02;
        this.f188339d = markAction;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        U0 u02 = this.f188338c;
        u02.getClass();
        return new C31823a((String) obj, this.f188337b, MessengerTimestamp.INSTANCE.fromMillis(u02.f188400h.now()), this.f188339d);
    }
}
