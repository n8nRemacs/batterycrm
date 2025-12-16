package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageUpdateMerger.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/p0;", "Lcom/avito/android/messenger/conversation/mvi/sync/o0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.p0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32282p0 implements InterfaceC32280o0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f194837a;

    /* compiled from: MessageUpdateMerger.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "", "kotlin.jvm.PlatformType", "call", "()Ljava/util/List;", "com/avito/android/messenger/conversation/mvi/sync/r0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.sync.p0$a */
    public static final class a<V> implements Callable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f194838b;

        public a(List list) {
            this.f194838b = list;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            List<LocalMessage> list = this.f194838b;
            ArrayList arrayList = new ArrayList();
            for (LocalMessage localMessage : list) {
                String remoteId = (kotlin.jvm.internal.L.f(localMessage.getFromId(), localMessage.getUserId()) || localMessage.isRead()) ? null : localMessage.getRemoteId();
                if (remoteId != null) {
                    arrayList.add(remoteId);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: MessageUpdateMerger.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "kotlin.jvm.PlatformType", "messageIdsThatNeedToBeMerged", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/messenger/conversation/mvi/sync/t0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.sync.p0$b */
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f194840c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f194841d;

        public b(MessengerUserHashInfo messengerUserHashInfo, List list) {
            this.f194840c = messengerUserHashInfo;
            this.f194841d = list;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            List list = (List) obj;
            boolean zIsEmpty = list.isEmpty();
            List list2 = this.f194841d;
            if (zIsEmpty) {
                return io.reactivex.rxjava3.core.I.q(list2);
            }
            C32282p0 c32282p0 = C32282p0.this;
            return c32282p0.f194837a.a0(this.f194840c, list).r(new C32284q0(c32282p0, list2));
        }
    }

    public C32282p0(@Y61.k InterfaceC32024m interfaceC32024m) {
        this.f194837a = interfaceC32024m;
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.InterfaceC32280o0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<List<LocalMessage>> a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k List<LocalMessage> list) {
        return new io.reactivex.rxjava3.internal.operators.single.G(new a(list)).n(new b(messengerUserHashInfo, list));
    }
}
