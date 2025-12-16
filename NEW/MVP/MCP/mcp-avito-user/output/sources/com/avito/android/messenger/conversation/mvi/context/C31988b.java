package com.avito.android.messenger.conversation.mvi.context;

import androidx.compose.runtime.C22026a;
import androidx.view.AbstractC22991Y;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.conversation.OpenedFrom;
import com.avito.android.messenger.conversation.W1;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.messenger.w0;
import com.avito.android.mvi.b;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelContextInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b;", "Lcom/avito/android/messenger/conversation/mvi/context/a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.context.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31988b extends AbstractC32892c<InterfaceC31987a.C5631a> implements InterfaceC31987a {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final String f190241V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final w0 f190242W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f190243X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.service.user_last_activity.a f190244Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f190245Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.service.p f190246a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final OpenedFrom f190247b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final W1 f190248c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.analytics.b f190249d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.r f190250e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final ChannelSyncAgent f190251f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f190252g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f190253h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f190254i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f190255j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f190256k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f190257l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f190258m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final String f190259n0;

    /* compiled from: ChannelContextInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/E;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$a */
    public static final class a implements com.avito.android.mvi.rx3.with_monolithic_state.E<InterfaceC31987a.C5631a> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f190260b = new a();

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.E
        public final boolean a(@Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31987a.C5631a> xVar, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31987a.C5631a> xVar2) {
            if (xVar instanceof f.c) {
                if (!(xVar2 instanceof f.c ? true : xVar2 instanceof f.C5634b ? true : xVar2 instanceof f.a ? true : xVar2 instanceof i ? true : xVar2 instanceof j ? true : xVar2 instanceof k ? true : xVar2 instanceof C5633b)) {
                    return false;
                }
            } else if (xVar instanceof j) {
                if (!(xVar2 instanceof j ? true : xVar2 instanceof C5633b)) {
                    return false;
                }
            } else if (xVar instanceof i) {
                if (!(xVar2 instanceof i)) {
                    return false;
                }
            } else if (xVar instanceof k) {
                if (!(xVar2 instanceof k)) {
                    return false;
                }
            } else if (xVar instanceof C5633b) {
                if (!(xVar2 instanceof C5633b)) {
                    return false;
                }
            } else if (xVar instanceof e) {
                if (!(xVar2 instanceof e)) {
                    return false;
                }
            } else {
                if (xVar instanceof c) {
                    if (xVar2 instanceof d) {
                        return kotlin.jvm.internal.L.f(((c) xVar).f190262d, ((d) xVar2).f190263d);
                    }
                    return false;
                }
                if (xVar instanceof d) {
                    if (xVar2 instanceof c) {
                        return kotlin.jvm.internal.L.f(((d) xVar).f190263d, ((c) xVar2).f190262d);
                    }
                    return false;
                }
                if (!(xVar instanceof g) || !(xVar2 instanceof g)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$b, reason: collision with other inner class name */
    public final class C5633b extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31987a.C5631a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Channel f190261d;

        public C5633b(@Y61.k Channel channel) {
            super(null, "newChannel = " + channel, 1, null);
            this.f190261d = channel;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC31987a.C5631a d(InterfaceC31987a.C5631a c5631a) {
            return InterfaceC31987a.C5631a.a(c5631a, null, new b.d(this.f190261d), null, false, 13);
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$c */
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31987a.C5631a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f190262d;

        public c(@Y61.k String str) {
            super(null, "typingUserId=".concat(str), 1, null);
            this.f190262d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC31987a.C5631a d(InterfaceC31987a.C5631a c5631a) {
            InterfaceC31987a.C5631a c5631aA;
            InterfaceC31987a.C5631a c5631a2 = c5631a;
            com.avito.android.mvi.b<Channel> bVar = c5631a2.f190237b;
            if (bVar instanceof b.d) {
                LinkedHashSet linkedHashSetO0 = C42745f0.O0(c5631a2.f190238c);
                String str = this.f190262d;
                linkedHashSetO0.remove(str);
                linkedHashSetO0.add(str);
                c5631aA = InterfaceC31987a.C5631a.a(c5631a2, null, null, linkedHashSetO0, false, 11);
            } else {
                c5631aA = null;
            }
            return c5631aA == null ? c5631a2 : c5631aA;
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$d */
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31987a.C5631a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f190263d;

        public d(@Y61.k String str) {
            super(null, "typingUserId = ".concat(str), 1, null);
            this.f190263d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC31987a.C5631a d(InterfaceC31987a.C5631a c5631a) {
            InterfaceC31987a.C5631a c5631a2 = c5631a;
            Set<String> set = c5631a2.f190238c;
            String str = this.f190263d;
            return set.contains(str) ? InterfaceC31987a.C5631a.a(c5631a2, null, null, b1.e(set, str), false, 11) : c5631a2;
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$e */
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31987a.C5631a> {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f190264d;

        public e(boolean z12) {
            super(null, com.avito.android.bxcontent.mvi.entity.f.l("isConnecting=", z12), 1, null);
            this.f190264d = z12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC31987a.C5631a d(InterfaceC31987a.C5631a c5631a) {
            InterfaceC31987a.C5631a c5631a2 = c5631a;
            boolean z12 = c5631a2.f190239d;
            boolean z13 = this.f190264d;
            return z13 != z12 ? InterfaceC31987a.C5631a.a(c5631a2, null, null, null, z13, 7) : c5631a2;
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "a", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$f */
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.n<InterfaceC31987a.C5631a> {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f190265d;

        /* renamed from: e, reason: collision with root package name */
        public final long f190266e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31987a.C5631a>>> f190267f;

        /* compiled from: ChannelContextInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$f$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$f$a */
        public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC31987a.C5631a> {
            public a() {
                super(AK.c.s(new StringBuilder(), f.this.f207165a, ".GetChannelMutator"), f.this.f207166b);
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
            public final io.reactivex.rxjava3.core.I<InterfaceC31987a.C5631a> b(InterfaceC31987a.C5631a c5631a) {
                InterfaceC31987a.C5631a c5631a2 = c5631a;
                com.avito.android.mvi.b<Channel> bVar = c5631a2.f190237b;
                if (!(bVar instanceof b.c)) {
                    bVar = null;
                }
                b.c cVar = (b.c) bVar;
                if (cVar != null) {
                    f fVar = f.this;
                    if (cVar.f207034a == fVar.f190266e) {
                        C31988b c31988b = C31988b.this;
                        C42026y c42026yN = c31988b.f190242W.g().j0(c31988b.f207140R).d0(S.f190194b).S().n(new C31990d(c31988b, c5631a2, this));
                        hu.akarnokd.rxjava3.schedulers.c cVar2 = c31988b.f207140R;
                        return c42026yN.s(cVar2).k(new C31991e(c31988b)).h(new C31992f(c31988b)).u(new C31989c(c31988b, c5631a2, 0)).z(cVar2);
                    }
                }
                return io.reactivex.rxjava3.core.I.q(c5631a2);
            }
        }

        /* compiled from: ChannelContextInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$f$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$f$b, reason: collision with other inner class name */
        public final class C5634b extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC31987a.C5631a> {
            public C5634b() {
                throw null;
            }
        }

        /* compiled from: ChannelContextInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$f$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$f$c */
        public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31987a.C5631a> {
            public c() {
                throw null;
            }
        }

        /* compiled from: ChannelContextInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$f$d */
        public static final class d extends kotlin.jvm.internal.N implements Y41.a<List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31987a.C5631a>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C31988b f190270l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ f f190271m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(f fVar, C31988b c31988b) {
                super(0);
                this.f190270l = c31988b;
                this.f190271m = fVar;
            }

            @Override // Y41.a
            public final List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31987a.C5631a>> invoke() {
                X2 x22 = X2.f318778a;
                String str = this.f190270l.f207131E;
                StringBuilder sb2 = new StringBuilder("InitialDataRequestComposite(isRetry=");
                f fVar = this.f190271m;
                x22.i(str, androidx.appcompat.app.r.s(").block()", sb2, fVar.f190265d), null);
                StringBuilder sb3 = new StringBuilder();
                String str2 = fVar.f207165a;
                String strS = AK.c.s(sb3, str2, ".SetInProgressMutator");
                C31988b c31988b = C31988b.this;
                C31997k c31997k = new C31997k(fVar, c31988b);
                String str3 = fVar.f207166b;
                return C42745f0.U(new c(c31997k, strS, str3), new C5634b(new C31996j(fVar, c31988b), androidx.appcompat.app.r.q(str2, ".GetUserIdMutator"), str3), fVar.new a());
            }
        }

        public f(boolean z12, long j12) {
            super("InitialDataRequestComposite", com.avito.android.bxcontent.mvi.entity.f.l("isRetry=", z12), null, 4, null);
            this.f190265d = z12;
            this.f190266e = j12;
            this.f190267f = new d(this, C31988b.this);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.n
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC31987a.C5631a>>> b() {
            return this.f190267f;
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$g */
    public final class g extends C32890a<InterfaceC31987a.C5631a> {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f190272d;

        public g(boolean z12) {
            super(null, com.avito.android.bxcontent.mvi.entity.f.l("notificationQueueWasRestored = ", z12), 1, null);
            this.f190272d = z12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(InterfaceC31987a.C5631a c5631a) {
            boolean z12 = c5631a.f190237b instanceof b.d;
            C31988b c31988b = C31988b.this;
            if (!z12) {
                c31988b.Hd(true);
            } else {
                if (this.f190272d) {
                    return;
                }
                c31988b.p0();
            }
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$h */
    public final class h extends C32890a<InterfaceC31987a.C5631a> {
        public h() {
            super(null, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(InterfaceC31987a.C5631a c5631a) {
            InterfaceC31987a.C5631a c5631a2 = c5631a;
            com.avito.android.mvi.b<Channel> bVar = c5631a2.f190237b;
            boolean z12 = bVar instanceof b.d;
            ChannelContext.Item item = null;
            if (z12) {
                ChannelContext context = ((Channel) ((b.d) bVar).f207035a).getContext();
                if (context instanceof ChannelContext.Item) {
                    item = (ChannelContext.Item) context;
                }
            }
            if (item != null) {
                boolean zF2 = kotlin.jvm.internal.L.f(item.getUserId(), c5631a2.f190236a.f430682d);
                C31988b c31988b = C31988b.this;
                if (zF2) {
                    c31988b.f190254i0.postValue(item.getId());
                } else {
                    c31988b.f190253h0.postValue(item.getId());
                }
                if (z12) {
                    c31988b.f190245Z.c(new com.avito.android.messenger.analytics.S(((Channel) ((b.d) bVar).f207035a).getChannelId()));
                }
            }
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$i;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$i */
    public final class i extends C32891b<InterfaceC31987a.C5631a> {
        /* JADX WARN: Multi-variable type inference failed */
        public i() {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final io.reactivex.rxjava3.core.I b(InterfaceC31987a.C5631a c5631a) {
            C31988b c31988b = C31988b.this;
            return c31988b.f190242W.g().j0(c31988b.f207140R).d0(S.f190194b).S().n(new C31998l(c31988b));
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$j;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$j */
    public final class j extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC31987a.C5631a> {
        public j() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<InterfaceC31987a.C5631a> b(InterfaceC31987a.C5631a c5631a) {
            InterfaceC31987a.C5631a c5631a2 = c5631a;
            C31988b c31988b = C31988b.this;
            return c31988b.f190242W.g().j0(c31988b.f207140R).d0(S.f190194b).S().n(new C31999m(c31988b, c5631a2)).u(new androidx.room.rxjava3.b(c5631a2, 6));
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/b$k;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$k */
    public final class k extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC31987a.C5631a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f190277d;

        public k(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
            super(null, C22026a.c(new StringBuilder("newUserInfo = ["), com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]), ']'), 1, null);
            this.f190277d = messengerUserHashInfo;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC31987a.C5631a d(InterfaceC31987a.C5631a c5631a) {
            InterfaceC31987a.C5631a c5631a2 = c5631a;
            if (kotlin.jvm.internal.L.f(this.f190277d, c5631a2.f190236a)) {
                return c5631a2;
            }
            C31988b.this.p0();
            return InterfaceC31987a.C5631a.a(c5631a2, this.f190277d, null, null, false, 14);
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$l */
    public static final class l implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C32000n f190279b;

        public l(C32000n c32000n) {
            this.f190279b = c32000n;
        }

        @Override // l41.g
        public final /* synthetic */ void accept(Object obj) {
            this.f190279b.invoke(obj);
        }
    }

    /* compiled from: ChannelContextInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.b$m */
    public static final class m implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C32008w f190280b;

        public m(C32008w c32008w) {
            this.f190280b = c32008w;
        }

        @Override // l41.o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f190280b.invoke(obj);
        }
    }

    public C31988b() {
        throw null;
    }

    @Inject
    public C31988b(@InterfaceC32438g0 @Y61.k String str, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k w0 w0Var, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k com.avito.android.messenger.service.user_last_activity.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.messenger.service.p pVar, @Y61.k OpenedFrom openedFrom, @Y61.k W1 w12, @Y61.k com.avito.android.messenger.conversation.analytics.b bVar, @Y61.k com.avito.android.messenger.channels.mvi.data.r rVar, @Y61.k ChannelSyncAgent channelSyncAgent, @Y61.k C30277e1 c30277e1) {
        com.avito.android.mvi.rx3.with_monolithic_state.F f12 = new com.avito.android.mvi.rx3.with_monolithic_state.F(interfaceC35745a5.a(), "ChannelContextInteractor");
        InterfaceC31987a.C5631a.f190234e.getClass();
        super("ChannelContextInteractor", InterfaceC31987a.C5631a.f190235f, interfaceC35745a5, a.f190260b, f12, null, null, null, 224, null);
        this.f190241V = str;
        this.f190242W = w0Var;
        this.f190243X = interfaceC47842z;
        this.f190244Y = aVar;
        this.f190245Z = interfaceC28373a;
        this.f190246a0 = pVar;
        this.f190247b0 = openedFrom;
        this.f190248c0 = w12;
        this.f190249d0 = bVar;
        this.f190250e0 = rVar;
        this.f190251f0 = channelSyncAgent;
        this.f190252g0 = c30277e1;
        this.f190253h0 = new com.avito.android.util.architecture_components.D<>();
        this.f190254i0 = new com.avito.android.util.architecture_components.D<>();
        this.f190255j0 = new com.jakewharton.rxrelay3.c<>();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f190256k0 = cVar;
        this.f190257l0 = new io.reactivex.rxjava3.disposables.c();
        this.f190258m0 = new AtomicLong(0L);
        this.f190259n0 = androidx.compose.foundation.H.o(new StringBuilder(), this.f207131E, ':', str);
        X2.f318778a.i(this.f207131E, "child init block", null);
        Hd(false);
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(this.f207133K.a());
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        C41982q1 c41982q1X0 = interfaceC47842z.A().j0(cVar2).x0(cVar2);
        L l12 = new L(this);
        l lVar = new l(new C32000n(this, "client.allReconnects()"));
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(c41982q1X0.v0(l12, lVar, interfaceC43543a));
        cVar.b(interfaceC47842z.state().j0(cVar2).d0(C.f190173b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).x0(cVar2).v0(new D(this), new E(this), interfaceC43543a));
        cVar.b(w0Var.b().j0(cVar2).q0(1L).N(F.f190176b).x0(cVar2).v0(new G(this), new l(new C32000n(this, "Blank user id")), interfaceC43543a));
        cVar.b(this.f207139Q.x0(this.f207133K.a()).N(C32001o.f190394b).z0(1L).v0(new C32002p(this), new l(new C32000n(this, "stateObservable")), interfaceC43543a));
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a
    public final void Hd(boolean z12) {
        X2.f318778a.i(this.f207131E, "initialDataRequest(isRetry = " + z12 + ')', null);
        le().s(new f(z12, this.f190258m0.getAndIncrement()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a
    public final io.reactivex.rxjava3.core.z I1() {
        return this.f190255j0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.g0
    public final void K3() {
        le().s(new h());
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.g0
    public final AbstractC22991Y M6() {
        return this.f190253h0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.context.g0
    public final AbstractC22991Y Q3() {
        return this.f190254i0;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f190256k0.e();
        this.f190244Y.u8(this.f190259n0, B0.f406639b);
        super.onCleared();
    }

    public final void p0() {
        com.avito.android.mvi.rx3.with_monolithic_state.t<InterfaceC31987a.C5631a> tVarLe = le();
        C30277e1 c30277e1 = this.f190252g0;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[22];
        tVarLe.s(((Boolean) c30277e1.f145047x.a().invoke()).booleanValue() ? new i() : new j());
    }
}
