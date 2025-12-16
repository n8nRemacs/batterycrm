package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.analytics.graphite_counter.ChatLoadingResult;
import com.avito.android.messenger.conversation.W1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.messenger.conversation.mvi.sync.K;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.flowable.C41906z1;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import l41.InterfaceC43543a;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/a;", "a", "b", "c", "d", "e", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32141e extends AbstractC32892c<InterfaceC32129a.c> implements InterfaceC32129a {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f192902V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.sync.K f192903W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f192904X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.timer.a<ChatLoadingResult> f192905Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f192906Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final String f192907a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.l
    public final String f192908b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public final String f192909c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final C31667x f192910d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f192911e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f192912f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f192913g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f192914h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f192915i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f192916j0;

    /* compiled from: MessageListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$b */
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.n<InterfaceC32129a.c> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f192921d;

        /* renamed from: e, reason: collision with root package name */
        public final long f192922e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Integer f192923f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32129a.c>>> f192924g;

        /* compiled from: MessageListInteractor.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e$b$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$b$a */
        public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC32129a.c> {
            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
            public final io.reactivex.rxjava3.core.I<InterfaceC32129a.c> b(InterfaceC32129a.c cVar) {
                io.reactivex.rxjava3.core.I iT2;
                InterfaceC32129a.c cVar2 = cVar;
                if (cVar2 instanceof InterfaceC32129a.c.d) {
                    final b bVar = b.this;
                    if (((InterfaceC32129a.c.d) cVar2).f192131a == bVar.f192922e) {
                        final C32141e c32141e = C32141e.this;
                        String str = c32141e.f192908b0;
                        if (str != null) {
                            C41906z1 c41906z1Q = c32141e.f192902V.q(c32141e.f192907a0, str, bVar.f192921d);
                            C32141e c32141e2 = C32141e.this;
                            Integer num = bVar.f192923f;
                            iT2 = c41906z1Q.n(new C32147k(c32141e2, bVar, str, num, num, bVar, str));
                        } else {
                            Integer num2 = bVar.f192923f;
                            int iIntValue = num2 != null ? num2.intValue() : 100;
                            iT2 = K.a.a(c32141e.f192903W, bVar.f192921d, c32141e.f192907a0, 1, bVar.f192923f, 8).n(new C32144h(iIntValue, bVar, c32141e)).t(new C32146j(iIntValue, bVar, c32141e));
                        }
                        return new C42016n(iT2.k(new C32182v(c32141e, bVar)).j(new C32183w(c32141e)).h(new C32184x(c32141e)).i(new C32185y(c32141e)).u(new androidx.room.rxjava3.b(c32141e, 9)), new InterfaceC43543a() { // from class: com.avito.android.messenger.conversation.mvi.messages.f
                            @Override // l41.InterfaceC43543a
                            public final void run() {
                                C32141e c32141e3 = c32141e;
                                io.reactivex.rxjava3.disposables.c cVar3 = c32141e3.f192912f0;
                                if (cVar3.g() == 0) {
                                    io.reactivex.rxjava3.core.z<Boolean> zVarA = c32141e3.f192904X.A();
                                    InterfaceC35745a5 interfaceC35745a5 = c32141e3.f207133K;
                                    C41982q1 c41982q1X0 = zVarA.j0(interfaceC35745a5.a()).x0(interfaceC35745a5.a());
                                    C32141e.b bVar2 = bVar;
                                    cVar3.b(c41982q1X0.t0(new V(c32141e3, bVar2.f192921d, bVar2.f192923f)));
                                }
                            }
                        });
                    }
                }
                return io.reactivex.rxjava3.core.I.q(cVar2);
            }
        }

        /* compiled from: MessageListInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e$b$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$b$b, reason: collision with other inner class name */
        public final class C5700b extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC32129a.c> {
            public C5700b() {
                super(null, null, 3, null);
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
            public final InterfaceC32129a.c d(InterfaceC32129a.c cVar) {
                InterfaceC32129a.c cVar2 = cVar;
                return !(cVar2 instanceof InterfaceC32129a.c.d) ? new InterfaceC32129a.c.d(b.this.f192922e) : cVar2;
            }
        }

        /* compiled from: MessageListInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$b$c */
        public static final class c extends kotlin.jvm.internal.N implements Y41.a<List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32129a.c>>> {
            public c() {
                super(0);
            }

            @Override // Y41.a
            public final List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32129a.c>> invoke() {
                b bVar = b.this;
                return C42745f0.U(bVar.new C5700b(), bVar.new a());
            }
        }

        public b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, long j12, @Y61.l Integer num) {
            super(null, null, null, 7, null);
            this.f192921d = messengerUserHashInfo;
            this.f192922e = j12;
            this.f192923f = num;
            this.f192924g = new c();
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.n
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32129a.c>>> b() {
            return this.f192924g;
        }
    }

    /* compiled from: MessageListInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$d */
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC32129a.c> {

        /* renamed from: d, reason: collision with root package name */
        public final int f192942d;

        public d(int i12) {
            super(null, AK.c.g(i12, "newMessageCountInDb = "), 1, null);
            this.f192942d = i12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC32129a.c d(InterfaceC32129a.c cVar) {
            InterfaceC32129a.c cVar2 = cVar;
            if (!(cVar2 instanceof InterfaceC32129a.c.C5680c)) {
                return cVar2;
            }
            InterfaceC32129a.c.C5680c c5680c = (InterfaceC32129a.c.C5680c) cVar2;
            InterfaceC32129a.b bVar = c5680c.f192128b;
            if (!(bVar instanceof InterfaceC32129a.b.c)) {
                return cVar2;
            }
            InterfaceC32129a.b.c cVar3 = (InterfaceC32129a.b.c) bVar;
            return (cVar3.f192123a || this.f192942d <= c5680c.f192129c) ? cVar2 : InterfaceC32129a.c.C5680c.a(c5680c, null, new InterfaceC32129a.b.c(true, cVar3.f192124b), 0, 13);
        }
    }

    /* compiled from: MessageListInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$e, reason: collision with other inner class name */
    public final class C5702e extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC32129a.c> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f192943d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Integer f192944e;

        /* JADX WARN: Multi-variable type inference failed */
        public C5702e(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l Integer num) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.f192943d = messengerUserHashInfo;
            this.f192944e = num;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<InterfaceC32129a.c> b(InterfaceC32129a.c cVar) {
            InterfaceC32129a.c cVar2 = cVar;
            if (!(cVar2 instanceof InterfaceC32129a.c.C5680c)) {
                return io.reactivex.rxjava3.core.I.q(cVar2);
            }
            C32141e c32141e = C32141e.this;
            com.avito.android.messenger.conversation.mvi.sync.K k12 = c32141e.f192903W;
            int iNe = C32141e.ne(((InterfaceC32129a.c.C5680c) cVar2).f192129c, null);
            return K.a.a(k12, this.f192943d, c32141e.f192907a0, iNe, this.f192944e, 8).n(new Q(cVar2, this, c32141e)).t(new S(c32141e, cVar2));
        }
    }

    @Inject
    public C32141e(@Y61.k InterfaceC32024m interfaceC32024m, @Y61.k com.avito.android.messenger.conversation.mvi.sync.K k12, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k com.avito.android.analytics.timer.a<ChatLoadingResult> aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C30277e1 c30277e1, @Y61.k W1 w12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("MessageListInteractor", InterfaceC32129a.c.C5679a.f192125a, interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f192902V = interfaceC32024m;
        this.f192903W = k12;
        this.f192904X = interfaceC47842z;
        this.f192905Y = aVar;
        this.f192906Z = interfaceC28373a;
        this.f192907a0 = w12.f189238a;
        this.f192908b0 = w12.f189240c;
        this.f192909c0 = w12.f189241d;
        this.f192910d0 = new C31667x(interfaceC28373a, c30277e1);
        this.f192911e0 = new io.reactivex.rxjava3.disposables.c();
        this.f192912f0 = new io.reactivex.rxjava3.disposables.c();
        this.f192913g0 = new io.reactivex.rxjava3.disposables.c();
        this.f192914h0 = new io.reactivex.rxjava3.disposables.c();
        this.f192915i0 = new AtomicLong(0L);
        this.f192916j0 = new com.jakewharton.rxrelay3.c();
    }

    public static final io.reactivex.rxjava3.core.z me(C32141e c32141e, MessengerUserHashInfo messengerUserHashInfo, int i12) {
        return c32141e.f192902V.Y(i12, c32141e.f192907a0, messengerUserHashInfo);
    }

    public static int ne(int i12, Integer num) {
        if (i12 <= 0) {
            return 1;
        }
        return (i12 % (num != null ? num.intValue() : 100) <= 0 ? 0 : 1) + (i12 / (num != null ? num.intValue() : 100));
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a
    /* renamed from: B2, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF192916j0() {
        return this.f192916j0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a
    public final void L4(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l Integer num) {
        le().s(new c(messengerUserHashInfo, null, this.f192915i0.getAndIncrement(), num));
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a
    public final void o9(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l Integer num) {
        le().s(new b(messengerUserHashInfo, this.f192915i0.getAndIncrement(), num));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f192912f0.e();
        this.f192913g0.e();
        this.f192914h0.e();
        this.f192911e0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a
    public final void pc(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l Integer num) {
        le().s(new c(messengerUserHashInfo, str, this.f192915i0.getAndIncrement(), num));
    }

    /* compiled from: MessageListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "a", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$c */
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.n<InterfaceC32129a.c> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f192929d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f192930e;

        /* renamed from: f, reason: collision with root package name */
        public final long f192931f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Integer f192932g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32129a.c>>> f192933h;

        /* compiled from: MessageListInteractor.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e$c$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$c$b */
        public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC32129a.c> {

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final Integer f192938d;

            /* JADX WARN: Multi-variable type inference failed */
            public b(@Y61.l Integer num) {
                super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                this.f192938d = num;
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
            public final io.reactivex.rxjava3.core.I<InterfaceC32129a.c> b(InterfaceC32129a.c cVar) {
                InterfaceC32129a.c cVar2 = cVar;
                if (cVar2 instanceof InterfaceC32129a.c.C5680c) {
                    InterfaceC32129a.c.C5680c c5680c = (InterfaceC32129a.c.C5680c) cVar2;
                    InterfaceC32129a.b bVar = c5680c.f192128b;
                    if (bVar instanceof InterfaceC32129a.b.C5678b) {
                        c cVar3 = c.this;
                        if (((InterfaceC32129a.b.C5678b) bVar).f192122a == cVar3.f192931f) {
                            C32141e c32141e = C32141e.this;
                            return c32141e.f192902V.t(cVar3.f192929d, c32141e.f192907a0, c5680c.f192129c).n(new O(cVar2, this, cVar2)).u(new C32186z(c32141e, cVar2, 1));
                        }
                    }
                }
                return io.reactivex.rxjava3.core.I.q(cVar2);
            }
        }

        /* compiled from: MessageListInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e$c$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$c$c, reason: collision with other inner class name */
        public final class C5701c extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC32129a.c> {
            public C5701c() {
                super(null, null, 3, null);
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
            public final InterfaceC32129a.c d(InterfaceC32129a.c cVar) {
                InterfaceC32129a.c cVar2 = cVar;
                if (!(cVar2 instanceof InterfaceC32129a.c.C5680c)) {
                    return cVar2;
                }
                InterfaceC32129a.c.C5680c c5680c = (InterfaceC32129a.c.C5680c) cVar2;
                return !(c5680c.f192128b instanceof InterfaceC32129a.b.C5678b) ? InterfaceC32129a.c.C5680c.a(c5680c, null, new InterfaceC32129a.b.C5678b(c.this.f192931f), 0, 13) : cVar2;
            }
        }

        /* compiled from: MessageListInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$c$d */
        public static final class d extends kotlin.jvm.internal.N implements Y41.a<List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32129a.c>>> {
            public d() {
                super(0);
            }

            @Override // Y41.a
            public final List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32129a.c>> invoke() {
                c cVar = c.this;
                C5701c c5701c = cVar.new C5701c();
                String str = cVar.f192930e;
                Integer num = cVar.f192932g;
                return C42745f0.U(c5701c, str == null ? cVar.new b(num) : cVar.new a(str, num));
            }
        }

        public c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l String str, long j12, @Y61.l Integer num) {
            super(null, null, null, 7, null);
            this.f192929d = messengerUserHashInfo;
            this.f192930e = str;
            this.f192931f = j12;
            this.f192932g = num;
            this.f192933h = new d();
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.n
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32129a.c>>> b() {
            return this.f192933h;
        }

        /* compiled from: MessageListInteractor.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e$c$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$c$a */
        public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC32129a.c> {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f192935d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final Integer f192936e;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@Y61.k String str, @Y61.l Integer num) {
                super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                this.f192935d = str;
                this.f192936e = num;
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
            public final io.reactivex.rxjava3.core.I<InterfaceC32129a.c> b(InterfaceC32129a.c cVar) {
                InterfaceC32129a.c cVar2 = cVar;
                if (cVar2 instanceof InterfaceC32129a.c.C5680c) {
                    InterfaceC32129a.c.C5680c c5680c = (InterfaceC32129a.c.C5680c) cVar2;
                    InterfaceC32129a.b bVar = c5680c.f192128b;
                    if (bVar instanceof InterfaceC32129a.b.C5678b) {
                        c cVar3 = c.this;
                        if (((InterfaceC32129a.b.C5678b) bVar).f192122a == cVar3.f192931f) {
                            C32141e c32141e = C32141e.this;
                            return c32141e.f192902V.t(cVar3.f192929d, c32141e.f192907a0, c5680c.f192129c).n(new J(cVar2, this, cVar2)).u(new C32186z(c32141e, cVar2, 0));
                        }
                    }
                }
                return io.reactivex.rxjava3.core.I.q(cVar2);
            }

            public /* synthetic */ a(c cVar, String str, Integer num, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : num);
            }
        }

        public /* synthetic */ c(C32141e c32141e, MessengerUserHashInfo messengerUserHashInfo, String str, long j12, Integer num, int i12, C42822w c42822w) {
            this(messengerUserHashInfo, str, j12, (i12 & 8) != 0 ? null : num);
        }
    }

    /* compiled from: MessageListInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/e$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.e$a */
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC32129a.c> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f192917d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f192918e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Integer f192919f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, boolean z12, @Y61.l Integer num) {
            super(null, com.avito.android.bxcontent.mvi.entity.f.l("recovered = ", z12), 1, 0 == true ? 1 : 0);
            this.f192917d = messengerUserHashInfo;
            this.f192918e = z12;
            this.f192919f = num;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final io.reactivex.rxjava3.core.I<InterfaceC32129a.c> b(InterfaceC32129a.c cVar) {
            InterfaceC32129a.c cVar2 = cVar;
            boolean z12 = cVar2 instanceof InterfaceC32129a.c.C5680c;
            Integer num = this.f192919f;
            MessengerUserHashInfo messengerUserHashInfo = this.f192917d;
            C32141e c32141e = C32141e.this;
            if (!z12) {
                c32141e.o9(messengerUserHashInfo, num);
                return io.reactivex.rxjava3.core.I.q(cVar2);
            }
            if (this.f192918e) {
                InterfaceC32129a.c.C5680c c5680c = (InterfaceC32129a.c.C5680c) cVar2;
                if (!c5680c.f192130d) {
                    if (!(c5680c.f192128b instanceof InterfaceC32129a.b.C5677a)) {
                        return io.reactivex.rxjava3.core.I.q(cVar2);
                    }
                    c32141e.L4(messengerUserHashInfo, num);
                    return io.reactivex.rxjava3.core.I.q(cVar2);
                }
            }
            com.avito.android.messenger.conversation.mvi.sync.K k12 = c32141e.f192903W;
            int iNe = C32141e.ne(((InterfaceC32129a.c.C5680c) cVar2).f192129c, null);
            return K.a.a(k12, this.f192917d, c32141e.f192907a0, iNe, this.f192919f, 8).n(new C32131c(cVar2, this, c32141e)).t(new C32140d(c32141e, cVar2));
        }

        public /* synthetic */ a(C32141e c32141e, MessengerUserHashInfo messengerUserHashInfo, boolean z12, Integer num, int i12, C42822w c42822w) {
            this(messengerUserHashInfo, z12, (i12 & 4) != 0 ? null : num);
        }
    }
}
