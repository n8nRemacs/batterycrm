package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.W0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.persistence.messenger.UserEntityType;
import com.avito.android.persistence.messenger.e3;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: VoiceInfoSyncAgent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/X0;", "Lcom/avito/android/messenger/conversation/mvi/sync/W0;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/sync/W0$b;", "e", "f", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class X0 extends AbstractC32892c<W0.b> implements W0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f194726a0 = 0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f194727V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f194728W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.data.g0 f194729X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<List<LocalMessage>> f194730Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f194731Z;

    /* compiled from: VoiceInfoSyncAgent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "kotlin.jvm.PlatformType", "messages", "", "Lcom/avito/android/messenger/conversation/mvi/sync/W0$c;", "apply", "(Ljava/util/List;)Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f194732b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            ArrayList arrayList = new ArrayList();
            for (LocalMessage localMessage : (List) obj) {
                MessageBody body = localMessage.getBody();
                MessageBody.Voice voice = body instanceof MessageBody.Voice ? (MessageBody.Voice) body : null;
                String voiceId = voice != null ? voice.getVoiceId() : null;
                W0.c cVar = voiceId != null ? new W0.c(com.avito.android.messenger.util.i.c(localMessage), localMessage.getChannelId(), localMessage.getLocalId(), voiceId) : null;
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            return C42745f0.P0(arrayList);
        }
    }

    /* compiled from: VoiceInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0017\u0010\u0005\u001a\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/reactivex/rxjava3/schedulers/d;", "", "Lcom/avito/android/messenger/conversation/mvi/sync/W0$c;", "Lj41/e;", "old", "new", "", "test", "(Lio/reactivex/rxjava3/schedulers/d;Lio/reactivex/rxjava3/schedulers/d;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T1, T2> implements l41.d {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T1, T2> f194733a = new b<>();

        @Override // l41.d
        public final boolean a(Object obj, Object obj2) {
            io.reactivex.rxjava3.schedulers.d dVar = (io.reactivex.rxjava3.schedulers.d) obj;
            io.reactivex.rxjava3.schedulers.d dVar2 = (io.reactivex.rxjava3.schedulers.d) obj2;
            return ((Set) dVar.f404958a).containsAll((Collection) dVar2.f404958a) && dVar2.f404959b - dVar.f404959b < 2000;
        }
    }

    /* compiled from: VoiceInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/rxjava3/schedulers/d;", "", "Lcom/avito/android/messenger/conversation/mvi/sync/W0$c;", "it", "", "test", "(Lio/reactivex/rxjava3/schedulers/d;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f194734b = new c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return !((Collection) ((io.reactivex.rxjava3.schedulers.d) obj).f404958a).isEmpty();
        }
    }

    /* compiled from: VoiceInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/reactivex/rxjava3/schedulers/d;", "", "Lcom/avito/android/messenger/conversation/mvi/sync/W0$c;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/schedulers/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = X0.f194726a0;
            X0 x02 = X0.this;
            x02.le().s(x02.new f((Set) ((io.reactivex.rxjava3.schedulers.d) obj).f404958a));
        }
    }

    /* compiled from: VoiceInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/X0$e;", "", "<init>", "()V", "", "SAME_IDS_THROTTLE_INTERVAL_MILLIS", "I", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    /* compiled from: VoiceInfoSyncAgent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/X0$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/sync/W0$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.p<W0.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Set<W0.c> f194736d;

        public f(@Y61.k Set<W0.c> set) {
            super("RequestVoiceInfo", "voiceLoadEntries = " + set);
            this.f194736d = set;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<W0.b> b(W0.b bVar) {
            W0.b bVar2 = bVar;
            Set<W0.c> set = this.f194736d;
            Set<W0.c> set2 = set;
            ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(((W0.c) it.next()).f194724d);
            }
            Set setP0 = C42745f0.P0(arrayList);
            HashMap map = bVar2.f194720a;
            boolean zIsEmpty = kotlin.collections.b1.f(setP0, map.keySet()).isEmpty();
            X0 x02 = X0.this;
            if (zIsEmpty) {
                V2 v22 = V2.f318762a;
                int i12 = X0.f194726a0;
                v22.c(x02.f207131E, "voiceIds already loaded", null);
                return d(map, set).B(kotlin.G0.f406611a).n(new Y0(bVar2));
            }
            V2 v23 = V2.f318762a;
            int i13 = X0.f194726a0;
            v23.c(x02.f207131E, "Started loading voiceInfo for ids: " + setP0, null);
            io.reactivex.rxjava3.core.I<Map<String, VoiceInfo>> iE2 = x02.f194728W.E(C42745f0.M0(setP0));
            InterfaceC35745a5 interfaceC35745a5 = x02.f194727V;
            return iE2.z(interfaceC35745a5.a()).s(interfaceC35745a5.a()).n(new a1(this, bVar2)).k(new b1(x02, setP0)).i(new c1(x02, setP0)).v(bVar2);
        }

        public final AbstractC41768a d(Map map, Set set) {
            e3 e3Var;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                W0.c cVar = (W0.c) it.next();
                VoiceInfo voiceInfo = (VoiceInfo) map.get(cVar.f194724d);
                if (voiceInfo != null) {
                    MessengerUserHashInfo messengerUserHashInfo = cVar.f194721a;
                    UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
                    long duration = voiceInfo.getDuration();
                    String error = voiceInfo.getError();
                    e3Var = new e3(messengerUserHashInfo.f430682d, cVar.f194722b, cVar.f194723c, duration, userEntityTypeG, messengerUserHashInfo.f430680b, error);
                } else {
                    e3Var = null;
                }
                if (e3Var != null) {
                    arrayList.add(e3Var);
                }
            }
            return X0.this.f194729X.c(arrayList);
        }
    }

    static {
        new e(null);
    }

    @Inject
    public X0(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k com.avito.android.messenger.conversation.mvi.data.g0 g0Var) {
        super("VoiceInfoSyncAgent", new W0.b(new HashMap()), interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f194727V = interfaceC35745a5;
        this.f194728W = interfaceC47842z;
        this.f194729X = g0Var;
        com.jakewharton.rxrelay3.c<List<LocalMessage>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f194730Y = cVar;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f194731Z = cVar2;
        io.reactivex.rxjava3.internal.operators.observable.B0 b0D0 = cVar.j0(interfaceC35745a5.a()).d0(a.f194732b);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.core.H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(h12, "scheduler is null");
        cVar2.b(b0D0.d0(io.reactivex.rxjava3.internal.functions.a.l(timeUnit, h12)).B(b.f194733a).N(c.f194734b).t0(new d()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.W0
    public final void k9(@Y61.k ArrayList arrayList) {
        this.f194730Y.accept(arrayList);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f194731Z.e();
        super.onCleared();
    }
}
