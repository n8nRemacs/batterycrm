package com.avito.android.messenger.conversation.mvi;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import arrow.core.Y0;
import arrow.core.Z0;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.blacklist_reasons.y;
import com.avito.android.messenger.conversation.mvi.a;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.o;
import l41.r;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageSpamActionsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/b;", "Lcom/avito/android/messenger/conversation/mvi/a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/a$b;", "g", "h", "i", "j", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends AbstractC32892c<a.b> implements com.avito.android.messenger.conversation.mvi.a {

    /* renamed from: V, reason: collision with root package name */
    @k
    public final y f189670V;

    /* renamed from: W, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f189671W;

    /* renamed from: X, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<Throwable> f189672X;

    /* compiled from: MessageSpamActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", VoiceInfo.STATE, "", "test", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f189673b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((InterfaceC31987a.C5631a) obj).f190237b instanceof b.d;
        }
    }

    /* compiled from: MessageSpamActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", VoiceInfo.STATE, "Larrow/core/Y0;", "Lcom/avito/android/messenger/conversation/mvi/a$a;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.b$b, reason: collision with other inner class name */
    public static final class C5597b<T, R> implements o {
        public C5597b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [com.avito.android.messenger.conversation.mvi.a$a] */
        @Override // l41.o
        public final Object apply(Object obj) {
            String suspectMessageId;
            InterfaceC31987a.C5631a c5631a = (InterfaceC31987a.C5631a) obj;
            b.this.getClass();
            MessengerUserHashInfo messengerUserHashInfo = c5631a.f190236a;
            if (!C43066x.K(messengerUserHashInfo.f430682d)) {
                com.avito.android.mvi.b<Channel> bVar = c5631a.f190237b;
                b.d dVar = bVar instanceof b.d ? (b.d) bVar : null;
                Channel channel = dVar != null ? dVar.f207035a : (T) null;
                if (channel != null && (suspectMessageId = channel.getSuspectMessageId()) != null) {
                    String channelId = channel.getChannelId();
                    ChannelContext context = channel.getContext();
                    ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
                    c5594a = new a.C5594a(messengerUserHashInfo.f430682d, channelId, item != null ? item.getId() : null, suspectMessageId);
                }
            }
            return Z0.b(c5594a);
        }
    }

    /* compiled from: MessageSpamActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/messenger/conversation/mvi/a$a;", "channelData", "Lkotlin/G0;", "accept", "(Larrow/core/Y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.le().s(new h((a.C5594a) ((Y0) obj).c()));
        }
    }

    /* compiled from: MessageSpamActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$d;", VoiceInfo.STATE, "Larrow/core/Y0;", "Lcom/avito/android/messenger/blacklist_reasons/y$a$b;", "apply", "(Lcom/avito/android/messenger/blacklist_reasons/y$d;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T, R> f189676b = new d<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            y.d dVar = (y.d) obj;
            y.d.C5479d c5479d = dVar instanceof y.d.C5479d ? (y.d.C5479d) dVar : null;
            Object obj2 = c5479d != null ? c5479d.f186691a : null;
            return Z0.b(obj2 instanceof y.a.b ? (y.a.b) obj2 : null);
        }
    }

    /* compiled from: MessageSpamActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$a$b;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/blacklist_reasons/y$a$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.le().s(new j((y.a.b) obj));
        }
    }

    /* compiled from: MessageSpamActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$c;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/blacklist_reasons/y$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b bVar = b.this;
            bVar.le().s(bVar.new i((y.c) obj));
        }
    }

    /* compiled from: MessageSpamActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/b$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g extends C32890a<a.b> {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f189679d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f189680e;

        public g(boolean z12, @k String str) {
            super(null, null, 3, null);
            this.f189679d = z12;
            this.f189680e = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(a.b bVar) {
            a.b bVar2 = bVar;
            if (!(bVar2 instanceof a.b.c)) {
                if (bVar2.equals(a.b.C5595a.f189665a)) {
                    return;
                }
                boolean z12 = bVar2 instanceof a.b.C5596b;
                return;
            }
            y yVar = b.this.f189670V;
            a.C5594a c5594a = ((a.b.c) bVar2).f189669a;
            yVar.q5(this.f189680e, c5594a.f189662b, c5594a.f189664d, c5594a.f189663c, this.f189679d);
        }
    }

    /* compiled from: MessageSpamActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/b$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class h extends com.avito.android.mvi.rx3.with_monolithic_state.o<a.b> {

        /* renamed from: d, reason: collision with root package name */
        @l
        public final a.C5594a f189682d;

        public h(@l a.C5594a c5594a) {
            super("NewChannelDataMutator(" + c5594a + ')', null, 2, null);
            this.f189682d = c5594a;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final a.b d(a.b bVar) {
            a.b bVar2 = bVar;
            a.b c5596b = a.b.C5595a.f189665a;
            boolean zEquals = bVar2.equals(c5596b);
            a.C5594a c5594a = this.f189682d;
            if (zEquals) {
                return c5594a != null ? new a.b.c(c5594a) : bVar2;
            }
            if (bVar2 instanceof a.b.C5596b) {
                if (c5594a == null) {
                    return (a.b.C5596b) bVar2;
                }
                a.b.C5596b c5596b2 = (a.b.C5596b) bVar2;
                c5596b = new a.b.C5596b(c5594a, c5596b2.f189667b, c5596b2.f189668c);
            } else {
                if (!(bVar2 instanceof a.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (c5594a != null) {
                    return new a.b.c(c5594a);
                }
            }
            return c5596b;
        }
    }

    /* compiled from: MessageSpamActionsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/b$i;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class i extends com.avito.android.mvi.rx3.with_monolithic_state.o<a.b> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final y.c f189683d;

        public i(@k y.c cVar) {
            super(null, null, 3, null);
            this.f189683d = cVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final a.b d(a.b bVar) {
            a.b bVar2 = bVar;
            if (!(bVar2 instanceof a.b.C5596b)) {
                return bVar2;
            }
            y.c cVar = this.f189683d;
            y.a f186684a = cVar.getF186684a();
            y.a.b bVar3 = f186684a instanceof y.a.b ? (y.a.b) f186684a : null;
            if (bVar3 == null) {
                return bVar2;
            }
            a.C5594a c5594a = ((a.b.C5596b) bVar2).f189666a;
            if (!L.f(bVar3.f186678b, c5594a.f189662b)) {
                return bVar2;
            }
            if (!L.f(bVar3.f186680d, c5594a.f189664d)) {
                return bVar2;
            }
            if (cVar instanceof y.c.b) {
                return a.b.C5595a.f189665a;
            }
            if (!(cVar instanceof y.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            b.this.f189672X.accept(((y.c.a) cVar).f186683b);
            return new a.b.c(c5594a);
        }
    }

    /* compiled from: MessageSpamActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/b$j;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class j extends com.avito.android.mvi.rx3.with_monolithic_state.o<a.b> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final y.a.b f189685d;

        public j(@k y.a.b bVar) {
            super(null, null, 3, null);
            this.f189685d = bVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final a.b d(a.b bVar) {
            a.b bVar2 = bVar;
            if (!(bVar2 instanceof a.b.c)) {
                return bVar2;
            }
            y.a.b bVar3 = this.f189685d;
            String str = bVar3.f186678b;
            a.C5594a c5594a = ((a.b.c) bVar2).f189669a;
            if (L.f(str, c5594a.f189662b)) {
                return !L.f(bVar3.f186680d, c5594a.f189664d) ? bVar2 : new a.b.C5596b(c5594a, bVar3.f186681e, bVar3.f186677a);
            }
            return bVar2;
        }
    }

    @Inject
    public b(@k y yVar, @k InterfaceC31987a interfaceC31987a, @k InterfaceC35745a5 interfaceC35745a5) {
        super("MessageSpamActionsInteractor", a.b.C5595a.f189665a, interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f189670V = yVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f189671W = cVar;
        this.f189672X = C31685o.m();
        B0 b0D0 = interfaceC31987a.M0().j0(this.f207140R).N(a.f189673b).d0(new C5597b());
        o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        cVar.b(b0D0.D(oVar).t0(new c()));
        cVar.b(com.avito.android.util.rx3.arrow.b.a(yVar.M0().j0(this.f207140R).D(oVar).d0(d.f189676b)).t0(new e()));
        cVar.b(yVar.g7().j0(interfaceC35745a5.c()).t0(new f()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.a
    public final z Q() {
        return this.f189672X;
    }

    @Override // com.avito.android.messenger.conversation.mvi.a
    public final void U4(@k String str) {
        le().s(new g(true, str));
    }

    @Override // com.avito.android.messenger.conversation.mvi.a
    public final void Y6(@k String str) {
        le().s(new g(false, str));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f189671W.e();
        super.onCleared();
    }
}
