package com.avito.android.messenger.conversation.mvi.sync;

import Oq.InterfaceC14725a;
import androidx.work.impl.CallableC23587q;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.C28567j1;
import com.avito.android.messenger.MessageSyncException;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.channels.mvi.data.CallableC31710s;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41821l;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.flowable.C41906z1;
import io.reactivex.rxjava3.internal.operators.observable.C41934a1;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import io.reactivex.rxjava3.internal.operators.single.C42019q;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: MessageSyncAgent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/P;", "Lcom/avito/android/messenger/conversation/mvi/sync/K;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class P implements K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.w0 f194633a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f194634b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.W f194635c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.A f194636d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final G f194637e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.B f194638f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f194639g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final O0 f194640h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f194641i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32291u0 f194642j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32280o0 f194643k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f f194644l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f194645m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.sync.z0 f194646n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C31667x f194647o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f194648p = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f194649q = C42727D.c(new l());

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f194650b = new a<>();

        @Override // l41.g
        public final void accept(Object obj) {
            LocalMessage localMessage = (LocalMessage) obj;
            V2.f318762a.i("MessageSyncAgent", "Message received: channelId=" + localMessage.getChannelId() + ", remoteId=" + localMessage.getRemoteId() + ", localId=" + localMessage.getLocalId(), null);
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0001*\u0004\u0018\u00010\u00000\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "kotlin.jvm.PlatformType", "newMessage", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f194651b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f194652c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f194653d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ P f194654e;

        public b(ChatMessage chatMessage, MessengerUserHashInfo messengerUserHashInfo, boolean z12, P p12) {
            this.f194651b = chatMessage;
            this.f194652c = messengerUserHashInfo;
            this.f194653d = z12;
            this.f194654e = p12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            LocalMessage localMessage = (LocalMessage) obj;
            String fromId = this.f194651b.getFromId();
            MessengerUserHashInfo messengerUserHashInfo = this.f194652c;
            if (!kotlin.jvm.internal.L.f(fromId, messengerUserHashInfo.f430682d) || !this.f194653d) {
                return io.reactivex.rxjava3.core.z.c0(localMessage);
            }
            C41934a1 c41934a1I = this.f194654e.f194634b.i(localMessage.getChannelId(), localMessage.getLocalId(), messengerUserHashInfo);
            arrow.core.Y0.f56266a.getClass();
            return c41934a1I.P(arrow.core.X0.f56264b).p(new Q(localMessage));
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00000\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "kotlin.jvm.PlatformType", "localMessage", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {
        public c() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return P.this.f194637e.b(Collections.singletonList((LocalMessage) obj));
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "messages", "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f194657c;

        public d(MessengerUserHashInfo messengerUserHashInfo) {
            this.f194657c = messengerUserHashInfo;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return P.this.f194643k.a(this.f194657c, (List) obj);
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "messages", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f194659c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f194660d;

        public e(MessengerUserHashInfo messengerUserHashInfo, ChatMessage chatMessage) {
            this.f194659c = messengerUserHashInfo;
            this.f194660d = chatMessage;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            List list = (List) obj;
            P p12 = P.this;
            return p12.f194634b.n(list).g(new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31710s(4, this.f194660d.getChannelId(), p12, this.f194659c, list)));
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/MessengerUserHashInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.reactivex.rxjava3.disposables.c f194661b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ P f194662c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ hu.akarnokd.rxjava3.schedulers.c f194663d;

        public f(io.reactivex.rxjava3.disposables.c cVar, P p12, hu.akarnokd.rxjava3.schedulers.c cVar2) {
            this.f194661b = cVar;
            this.f194662c = p12;
            this.f194663d = cVar2;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
            X2.f318778a.i("MessageSyncAgent", "Got new ".concat(com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0])), null);
            io.reactivex.rxjava3.disposables.c cVar = this.f194661b;
            cVar.e();
            if (ru.avito.messenger.o0.b(messengerUserHashInfo)) {
                P p12 = this.f194662c;
                io.reactivex.rxjava3.core.z<T> zVarC = p12.f194635c.C(X81.h.class);
                hu.akarnokd.rxjava3.schedulers.c cVar2 = this.f194663d;
                cVar.b(new C41821l(zVarC.x0(cVar2).j0(cVar2).v(new M(p12, messengerUserHashInfo)), new com.avito.android.messenger.channels.mvi.sync.H0(messengerUserHashInfo, 2)).n(new N(messengerUserHashInfo)).v(new com.avito.android.messenger.channels.mvi.sync.H0(messengerUserHashInfo, 3), new O(messengerUserHashInfo)));
            }
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f194664b = new g<>();

        @Override // l41.g
        public final void accept(Object obj) {
            X2.f318778a.a("MessageSyncAgent", "Subscription to userInfo & events has encountered an error", (Throwable) obj);
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/messenger/api/entity/ChatMessage;", "messages", "Lio/reactivex/rxjava3/core/E;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f194665b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f194666c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ P f194667d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f194668e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f194669f;

        public h(int i12, int i13, P p12, MessengerUserHashInfo messengerUserHashInfo, String str) {
            this.f194665b = i12;
            this.f194666c = i13;
            this.f194667d = p12;
            this.f194668e = messengerUserHashInfo;
            this.f194669f = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            int i12;
            T next;
            List list = (List) obj;
            if (list.size() < this.f194665b || (i12 = this.f194666c) == 1) {
                return io.reactivex.rxjava3.core.z.c0(list);
            }
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long created = ((ChatMessage) next).getCreated();
                    do {
                        T next2 = it.next();
                        long created2 = ((ChatMessage) next2).getCreated();
                        if (created > created2) {
                            next = next2;
                            created = created2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = (T) null;
            }
            ChatMessage chatMessage = next;
            Long lValueOf = chatMessage != null ? Long.valueOf(chatMessage.getCreated()) : null;
            return lValueOf != null ? io.reactivex.rxjava3.core.z.p(this.f194667d.e(this.f194668e, this.f194669f, lValueOf.longValue() + 1, Integer.valueOf(i12 - 1), null, C32260e0.f194773l).d0(C32262f0.f194775b), io.reactivex.rxjava3.core.z.c0(list)) : io.reactivex.rxjava3.core.z.c0(list);
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "mergedMessages", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ P f194670b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f194671c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f194672d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f194673e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Long f194674f;

        public i(int i12, P p12, Long l12, String str, MessengerUserHashInfo messengerUserHashInfo) {
            this.f194670b = p12;
            this.f194671c = messengerUserHashInfo;
            this.f194672d = str;
            this.f194673e = i12;
            this.f194674f = l12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            List list = (List) obj;
            io.reactivex.rxjava3.internal.operators.single.A aG2 = P.g(this.f194670b, this.f194671c, this.f194672d, this.f194673e, list, this.f194674f);
            P p12 = this.f194670b;
            p12.getClass();
            MessengerUserHashInfo messengerUserHashInfo = this.f194671c;
            String str = this.f194672d;
            return aG2.g(new C41826q(new C28567j1(3, p12, messengerUserHashInfo, str)).g(new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31710s(4, str, p12, messengerUserHashInfo, list)))).B(Integer.valueOf(list.size()));
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Long f194675b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f194676c;

        public j(int i12, Long l12) {
            this.f194675b = l12;
            this.f194676c = i12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).intValue();
            X2 x22 = X2.f318778a;
            StringBuilder sb2 = new StringBuilder("onSuccess syncMessages(before = ");
            sb2.append(this.f194675b);
            sb2.append(", numberOfPages=");
            x22.c("MessageSyncAgent", androidx.appcompat.app.r.t(sb2, this.f194676c, ')'), null);
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Long f194677b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f194678c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ P f194679d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f194680e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f194681f;

        public k(int i12, P p12, Long l12, String str, MessengerUserHashInfo messengerUserHashInfo) {
            this.f194677b = l12;
            this.f194678c = i12;
            this.f194679d = p12;
            this.f194680e = messengerUserHashInfo;
            this.f194681f = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder("onError syncMessages(before = ");
            sb2.append(this.f194677b);
            sb2.append(", numberOfPages=");
            String strT = androidx.appcompat.app.r.t(sb2, this.f194678c, ')');
            InterfaceC14725a.C0808a.a(this.f194679d.f194647o, new MessageSyncException(strT, th2), com.avito.android.messenger.util.i.a(this.f194680e, new kotlin.Q("channelId", this.f194681f)), 2);
            X2.f318778a.a("MessageSyncAgent", strT, th2);
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/reactivex/rxjava3/core/H;", "invoke", "()Lio/reactivex/rxjava3/core/H;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.H> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.H invoke() {
            return new hu.akarnokd.rxjava3.schedulers.c(P.this.f194639g.a());
        }
    }

    @Inject
    public P(@Y61.k com.avito.android.messenger.w0 w0Var, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k ru.avito.messenger.W w12, @Y61.k ru.avito.messenger.A a12, @Y61.k G g12, @Y61.k com.avito.android.messenger.B b12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k O0 o02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC32291u0 interfaceC32291u0, @Y61.k InterfaceC32280o0 interfaceC32280o0, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.f fVar, @Y61.k C30277e1 c30277e1, @Y61.k com.avito.android.messenger.channels.mvi.sync.z0 z0Var) {
        this.f194633a = w0Var;
        this.f194634b = interfaceC32024m;
        this.f194635c = w12;
        this.f194636d = a12;
        this.f194637e = g12;
        this.f194638f = b12;
        this.f194639g = interfaceC35745a5;
        this.f194640h = o02;
        this.f194641i = interfaceC28373a;
        this.f194642j = interfaceC32291u0;
        this.f194643k = interfaceC32280o0;
        this.f194644l = fVar;
        this.f194645m = c30277e1;
        this.f194646n = z0Var;
        this.f194647o = new C31667x(interfaceC28373a, c30277e1);
    }

    public static io.reactivex.rxjava3.internal.operators.single.A g(P p12, MessengerUserHashInfo messengerUserHashInfo, String str, int i12, List list, Long l12) {
        C41906z1 c41906z1O;
        p12.getClass();
        if (l12 != null) {
            c41906z1O = p12.f194634b.g(l12.longValue(), messengerUserHashInfo, str, i12 * 100);
        } else {
            c41906z1O = p12.f194634b.o(i12 * 100, str, messengerUserHashInfo);
        }
        return (io.reactivex.rxjava3.internal.operators.single.A) c41906z1O.o(new C32258d0(list, i12, 100, p12, messengerUserHashInfo, str));
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.K
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.f194648p;
        cVar.e();
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(this.f194639g.a());
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        cVar.b(new io.reactivex.rxjava3.internal.operators.observable.N(this.f194633a.g().j0(cVar2).D(io.reactivex.rxjava3.internal.functions.a.f401991a), new com.avito.android.advert_core.task.a(14)).v0(new f(new io.reactivex.rxjava3.disposables.c(), this, cVar2), g.f194664b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.K
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Integer> b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, int i12, @Y61.l Long l12, @Y61.l Integer num) {
        int iIntValue = num != null ? num.intValue() : 100;
        if (i12 < 1) {
            return io.reactivex.rxjava3.core.I.l(new IllegalArgumentException("numberOfPages should be >= 1"));
        }
        io.reactivex.rxjava3.core.I iE2 = this.f194636d.e(messengerUserHashInfo, str, l12, Integer.valueOf(iIntValue));
        InterfaceC42726C interfaceC42726C = this.f194649q;
        return f((io.reactivex.rxjava3.internal.operators.mixed.z) iE2.z((io.reactivex.rxjava3.core.H) interfaceC42726C.getValue()).s((io.reactivex.rxjava3.core.H) interfaceC42726C.getValue()).p(new h(iIntValue, i12, this, messengerUserHashInfo, str)), messengerUserHashInfo, str).n(new i(i12, this, l12, str, messengerUserHashInfo)).k(new j(i12, l12)).i(new k(i12, this, l12, str, messengerUserHashInfo));
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.K
    @Y61.k
    public final AbstractC41768a c(@Y61.k ChatMessage chatMessage, @Y61.k MessengerUserHashInfo messengerUserHashInfo, boolean z12) {
        if (!kotlin.jvm.internal.L.f(chatMessage.getUid(), messengerUserHashInfo.f430682d)) {
            return C41823n.f402260b;
        }
        return new io.reactivex.rxjava3.internal.operators.observable.Z(new C41936b0(new C41936b0(new io.reactivex.rxjava3.internal.operators.single.G(new CallableC23587q(this, messengerUserHashInfo, chatMessage, 14)).k(a.f194650b).p(new b(chatMessage, messengerUserHashInfo, z12, this)), new c()), new d(messengerUserHashInfo)), new e(messengerUserHashInfo, chatMessage)).k(new C31684n(chatMessage, 2)).g(this.f194646n.c(chatMessage.getInitActionTimestamp(), kotlin.jvm.internal.L.f(chatMessage.getFromId(), chatMessage.getUid())));
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.K
    @Y61.k
    public final C42019q d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l Integer num) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        int iIntValue = num != null ? num.intValue() : 100;
        return f((io.reactivex.rxjava3.internal.operators.mixed.z) this.f194636d.e(messengerUserHashInfo, str, l12, Integer.valueOf(iIntValue)).p(new C32268i0(atomicBoolean, iIntValue, atomicBoolean2, this, messengerUserHashInfo, str, num, str2)), messengerUserHashInfo, str).n(new C32270j0(iIntValue, this, messengerUserHashInfo, str, l12, atomicBoolean2)).k(new C32272k0(l12, str2, str3)).i(new C32274l0(l12, str2, str3, this, messengerUserHashInfo, str));
    }

    public final io.reactivex.rxjava3.internal.operators.mixed.z e(MessengerUserHashInfo messengerUserHashInfo, String str, long j12, Integer num, Integer num2, Y41.l lVar) {
        int iIntValue = num2 != null ? num2.intValue() : 100;
        return (io.reactivex.rxjava3.internal.operators.mixed.z) this.f194636d.e(messengerUserHashInfo, str, Long.valueOf(j12), Integer.valueOf(iIntValue)).p(new T(iIntValue, lVar, num, this, messengerUserHashInfo, str, num2));
    }

    public final C42026y f(io.reactivex.rxjava3.internal.operators.mixed.z zVar, MessengerUserHashInfo messengerUserHashInfo, String str) {
        io.reactivex.rxjava3.internal.operators.single.O oR2 = zVar.H0().r(U.f194711b).p(V.f194714b).d0(new W(this, messengerUserHashInfo)).H0().r(X.f194725b);
        final G g12 = this.f194637e;
        return oR2.n(new l41.o() { // from class: com.avito.android.messenger.conversation.mvi.sync.Y
            @Override // l41.o
            public final Object apply(Object obj) {
                return g12.b((List) obj);
            }
        }).k(new Z(str, messengerUserHashInfo)).n(new C32252a0(this, messengerUserHashInfo)).n(new C32254b0(this));
    }
}
