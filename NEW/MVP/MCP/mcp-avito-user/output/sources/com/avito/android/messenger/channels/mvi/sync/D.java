package com.avito.android.messenger.channels.mvi.sync;

import IY.a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsBackendNotificationsHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "event", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/messenger/channels/mvi/sync/I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f188326c;

    public D(MessengerUserHashInfo messengerUserHashInfo, J j12) {
        this.f188325b = messengerUserHashInfo;
        this.f188326c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        X81.g gVar = (X81.g) obj;
        String str = gVar.uid;
        MessengerUserHashInfo messengerUserHashInfo = this.f188325b;
        if (!kotlin.jvm.internal.L.f(str, messengerUserHashInfo.f430682d)) {
            return C41823n.f402260b;
        }
        C31852o0 c31852o0 = this.f188326c.f188345f;
        String channelId = gVar.getChannelId();
        io.reactivex.rxjava3.internal.operators.completable.I iA2 = c31852o0.f188518c.a(channelId, messengerUserHashInfo);
        InterfaceC35745a5 interfaceC35745a5 = c31852o0.f188519d;
        C41811b c41811bG = iA2.q(interfaceC35745a5.c()).g(c31852o0.f188517b.a(channelId, messengerUserHashInfo).q(interfaceC35745a5.c()).x(interfaceC35745a5.c()));
        Set<? extends IY.a> setSingleton = Collections.singleton(new a.b(channelId));
        return new io.reactivex.rxjava3.internal.operators.completable.v(c31852o0.f188520e.t(c41811bG.B(kotlin.G0.f406611a), "deleteChatAndDraftFromDb", setSingleton, c31852o0.f188521f));
    }
}
