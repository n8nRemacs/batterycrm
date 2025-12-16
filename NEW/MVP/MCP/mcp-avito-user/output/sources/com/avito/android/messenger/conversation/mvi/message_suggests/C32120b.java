package com.avito.android.messenger.conversation.mvi.message_suggests;

import androidx.compose.runtime.internal.P;
import arrow.core.AbstractC23662a;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageSuggestsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/b;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/a;", "a", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32120b implements InterfaceC32119a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f191946a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31987a f191947b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f191948c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31700h f191949d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f191950e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final u3.g<AssistantUxImprovementsBuyerTestGroup> f191951f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<AbstractC23662a<Throwable, InterfaceC32119a.b>> f191952g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f191953h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f191954i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final hu.akarnokd.rxjava3.schedulers.c f191955j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f191956k;

    /* compiled from: MessageSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$a;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.b$a */
    public static final /* data */ class a {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final C5673a f191957d = new C5673a(null);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final a f191958e = new a(new C5674b(null, false, false, false, false, false, null, 127, null), false, true);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C5674b f191959a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f191960b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f191961c;

        /* compiled from: MessageSuggestsInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$a$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.b$a$a, reason: collision with other inner class name */
        public static final class C5673a {
            public /* synthetic */ C5673a(C42822w c42822w) {
                this();
            }

            public C5673a() {
            }
        }

        public a(@Y61.k C5674b c5674b, boolean z12, boolean z13) {
            this.f191959a = c5674b;
            this.f191960b = z12;
            this.f191961c = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f191959a, aVar.f191959a) && this.f191960b == aVar.f191960b && this.f191961c == aVar.f191961c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f191961c) + androidx.appcompat.app.r.i(this.f191959a.hashCode() * 31, 31, this.f191960b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChannelConfig(channelStateInfo=");
            sb2.append(this.f191959a);
            sb2.append(", newIncomingMessageArrived=");
            sb2.append(this.f191960b);
            sb2.append(", suggestsEnabled=");
            return androidx.appcompat.app.r.x(sb2, this.f191961c, ')');
        }
    }

    /* compiled from: MessageSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.b$b, reason: collision with other inner class name */
    public static final /* data */ class C5674b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f191962a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f191963b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f191964c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f191965d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f191966e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f191967f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final LocalMessage f191968g;

        public C5674b() {
            this(null, false, false, false, false, false, null, 127, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5674b)) {
                return false;
            }
            C5674b c5674b = (C5674b) obj;
            return L.f(this.f191962a, c5674b.f191962a) && this.f191963b == c5674b.f191963b && this.f191964c == c5674b.f191964c && this.f191965d == c5674b.f191965d && this.f191966e == c5674b.f191966e && this.f191967f == c5674b.f191967f && L.f(this.f191968g, c5674b.f191968g);
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f191962a.hashCode() * 31, 31, this.f191963b), 31, this.f191964c), 31, this.f191965d), 31, this.f191966e), 31, this.f191967f);
            LocalMessage localMessage = this.f191968g;
            return i12 + (localMessage == null ? 0 : localMessage.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "ChannelStateInfo(currentUserInfo=" + this.f191962a + ", isSeller=" + this.f191963b + ", isBuyer=" + this.f191964c + ", isReadOnly=" + this.f191965d + ", hasChannel=" + this.f191966e + ", isReplyTimeWithCallButton=" + this.f191967f + ", lastMessage=" + this.f191968g + ')';
        }

        public C5674b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @Y61.l LocalMessage localMessage) {
            this.f191962a = messengerUserHashInfo;
            this.f191963b = z12;
            this.f191964c = z13;
            this.f191965d = z14;
            this.f191966e = z15;
            this.f191967f = z16;
            this.f191968g = localMessage;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public C5674b(MessengerUserHashInfo messengerUserHashInfo, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, LocalMessage localMessage, int i12, C42822w c42822w) {
            if ((i12 & 1) != 0) {
                MessengerUserHashInfo.f430678e.getClass();
                messengerUserHashInfo = MessengerUserHashInfo.f430679f;
            }
            this(messengerUserHashInfo, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? false : z15, (i12 & 32) == 0 ? z16 : false, (i12 & 64) != 0 ? null : localMessage);
        }
    }

    /* compiled from: MessageSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$c;", "", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$c$a;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$c$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.b$c */
    public interface c {

        /* compiled from: MessageSuggestsInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$c$a;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$c;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.b$c$a */
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f191969a = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1601905958;
            }

            @Y61.k
            public final String toString() {
                return "ClearSuggests";
            }
        }

        /* compiled from: MessageSuggestsInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$c$b;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.b$c$b, reason: collision with other inner class name */
        public static final /* data */ class C5675b implements c {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f191970a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final LocalMessage f191971b;

            public C5675b(boolean z12, @Y61.l LocalMessage localMessage) {
                this.f191970a = z12;
                this.f191971b = localMessage;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5675b)) {
                    return false;
                }
                C5675b c5675b = (C5675b) obj;
                return this.f191970a == c5675b.f191970a && L.f(this.f191971b, c5675b.f191971b);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f191970a) * 31;
                LocalMessage localMessage = this.f191971b;
                return iHashCode + (localMessage == null ? 0 : localMessage.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "GetSuggests(isSeller=" + this.f191970a + ", lastMessage=" + this.f191971b + ')';
            }
        }
    }

    /* compiled from: MessageSuggestsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.b$d */
    public static final class d<T, R> implements l41.o {
        public d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MessengerUserHashInfo messengerUserHashInfo = ((InterfaceC31987a.C5631a) obj).f190236a;
            if (C43066x.K(messengerUserHashInfo.f430682d)) {
                return C41823n.f402260b;
            }
            C32120b c32120b = C32120b.this;
            return c32120b.f191949d.e(c32120b.f191946a, messengerUserHashInfo);
        }
    }

    @Inject
    public C32120b(@InterfaceC32438g0 @Y61.k String str, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC31700h interfaceC31700h, @Y61.k C30277e1 c30277e1, @Y61.k u3.g<AssistantUxImprovementsBuyerTestGroup> gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f191946a = str;
        this.f191947b = interfaceC31987a;
        this.f191948c = interfaceC47842z;
        this.f191949d = interfaceC31700h;
        this.f191950e = c30277e1;
        this.f191951f = gVar;
        InterfaceC32119a.b.f191940e.getClass();
        com.jakewharton.rxrelay3.b<AbstractC23662a<Throwable, InterfaceC32119a.b>> bVarN0 = com.jakewharton.rxrelay3.b.N0(new AbstractC23662a.c(InterfaceC32119a.b.f191941f));
        this.f191952g = bVarN0;
        this.f191953h = bVarN0;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f191954i = cVar;
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(interfaceC35745a5.a());
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        this.f191955j = cVar2;
        this.f191956k = new AtomicBoolean(true);
        c30277e1.getClass();
        kotlin.reflect.n<Object>[] nVarArr = C30277e1.f144946d1;
        kotlin.reflect.n<Object> nVar = nVarArr[51];
        if (((Boolean) c30277e1.f144995Y.a().invoke()).booleanValue()) {
            kotlin.reflect.n<Object> nVar2 = nVarArr[69];
            if (((Boolean) c30277e1.f145032p0.a().invoke()).booleanValue()) {
                io.reactivex.rxjava3.core.z<R> zVarY0 = interfaceC31987a.M0().j0(cVar2).d0(new k(this)).D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new m(this));
                a.f191957d.getClass();
                cVar.b(zVarY0.o0(a.f191958e, n.f191986b).u(new o(this)).y0(new q(this)).x0(cVar2).s0());
            } else {
                io.reactivex.rxjava3.core.z<R> zVarY02 = interfaceC31987a.M0().j0(cVar2).d0(new C32121c(this)).D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new C32123e(this));
                a.f191957d.getClass();
                cVar.b(zVarY02.o0(a.f191958e, C32124f.f191976b).u(new C32125g(this)).y0(new C32128j(this)).x0(cVar2).s0());
            }
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF191953h() {
        return this.f191953h;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a
    public final void b() {
        this.f191954i.b(this.f191947b.M0().j0(this.f191955j).S().o(new d()).r().u());
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a
    public final void destroy() {
        this.f191954i.e();
    }
}
