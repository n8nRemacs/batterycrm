package com.avito.android.messenger.channels.mvi.sync;

import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsBackendNotificationsHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "event", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/messenger/channels/mvi/sync/I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class E<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f188328c;

    public E(MessengerUserHashInfo messengerUserHashInfo, J j12) {
        this.f188327b = messengerUserHashInfo;
        this.f188328c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        X81.a aVar = (X81.a) obj;
        String str = aVar.ownerId;
        MessengerUserHashInfo messengerUserHashInfo = this.f188327b;
        return kotlin.jvm.internal.L.f(str, messengerUserHashInfo.f430682d) ? this.f188328c.f188345f.d(messengerUserHashInfo, aVar.userId, aVar.context.getChannelId(), aVar.context.getItemId()) : C41823n.f402260b;
    }
}
