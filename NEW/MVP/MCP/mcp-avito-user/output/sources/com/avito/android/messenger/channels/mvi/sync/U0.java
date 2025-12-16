package com.avito.android.messenger.channels.mvi.sync;

import IY.a;
import androidx.compose.runtime.C22026a;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.channels.mvi.sync.V0;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.di.InterfaceC32447j0;
import com.avito.android.messenger.di.InterfaceC32450k0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.N4;
import com.avito.android.util.W4;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import io.reactivex.rxjava3.internal.operators.completable.C41821l;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerReadStatusSyncAgent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/U0;", "Lcom/avito/android/messenger/channels/mvi/sync/G0;", "Lcom/avito/android/util/N4;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class U0 implements G0, N4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f188393a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.data.r f188394b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.w0 f188395c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f188396d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.W f188397e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.Z f188398f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.A f188399g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f188400h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.sync.O0 f188401i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mvi.rx3.locks.j<IY.a> f188402j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.H f188403k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C31667x f188404l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188405m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188406n;

    /* compiled from: MessengerReadStatusSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/MessengerUserHashInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hu.akarnokd.rxjava3.schedulers.c f188408c;

        public a(hu.akarnokd.rxjava3.schedulers.c cVar) {
            this.f188408c = cVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
            X2.f318778a.i("MessengerReadStatusSyncAgent", C22026a.c(new StringBuilder("Got new userInfo = ("), com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]), ')'), null);
            U0 u02 = U0.this;
            u02.f188406n.e();
            if (ru.avito.messenger.o0.b(messengerUserHashInfo)) {
                io.reactivex.rxjava3.core.z<T> zVarC = u02.f188397e.C(X81.h.class);
                hu.akarnokd.rxjava3.schedulers.c cVar = this.f188408c;
                io.reactivex.rxjava3.internal.observers.l lVarV = new C41821l(zVarC.x0(cVar).j0(cVar).v(new R0(u02, messengerUserHashInfo)), new H0(messengerUserHashInfo, 0)).n(new S0(messengerUserHashInfo)).v(new H0(messengerUserHashInfo, 1), new T0(messengerUserHashInfo));
                io.reactivex.rxjava3.disposables.c cVar2 = u02.f188406n;
                cVar2.b(lVarV);
                io.reactivex.rxjava3.internal.operators.observable.B0 b0D0 = com.avito.android.util.rx3.arrow.b.a(u02.f188393a.O(messengerUserHashInfo)).d0(new P0(u02, messengerUserHashInfo));
                com.avito.android.messenger.channels.mvi.data.r rVar = u02.f188394b;
                io.reactivex.rxjava3.core.z zVarE0 = io.reactivex.rxjava3.core.z.e0(b0D0, io.reactivex.rxjava3.kotlin.F0.a(rVar.s(messengerUserHashInfo)).d0(new I0(messengerUserHashInfo, u02, MarkAction.f188362b)), io.reactivex.rxjava3.kotlin.F0.a(rVar.n(messengerUserHashInfo)).d0(new I0(messengerUserHashInfo, u02, MarkAction.f188363c)));
                InterfaceC35745a5 interfaceC35745a5 = u02.f188396d;
                io.reactivex.rxjava3.core.z zVarT = zVarE0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.c()).Z(new V0.a(new kotlin.jvm.internal.h0() { // from class: com.avito.android.messenger.channels.mvi.sync.L0
                    @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
                    @Y61.l
                    public final Object get(@Y61.l Object obj2) {
                        return ((C31823a) obj2).f188420a;
                    }
                })).T(new M0(u02), Integer.MAX_VALUE);
                N0 n02 = new N0(u02);
                O0<T> o02 = O0.f188383b;
                zVarT.getClass();
                cVar2.b(zVarT.v0(n02, o02, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    /* compiled from: MessengerReadStatusSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f188409b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            X2.f318778a.a("MessengerReadStatusSyncAgent", "Error during userIdInteractor#currentUserIdToken observation", (Throwable) obj);
        }
    }

    public U0(@Y61.k InterfaceC32024m interfaceC32024m, @Y61.k com.avito.android.messenger.channels.mvi.data.r rVar, @Y61.k com.avito.android.messenger.w0 w0Var, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ru.avito.messenger.W w12, @Y61.k C30277e1 c30277e1, @Y61.k ru.avito.messenger.Z z12, @Y61.k ru.avito.messenger.A a12, @Y61.k com.avito.android.server_time.h hVar, @Y61.k com.avito.android.messenger.conversation.mvi.sync.O0 o02, @InterfaceC32447j0 @Y61.k com.avito.android.mvi.rx3.locks.j jVar, @InterfaceC32450k0 @Y61.k io.reactivex.rxjava3.core.H h12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f188393a = interfaceC32024m;
        this.f188394b = rVar;
        this.f188395c = w0Var;
        this.f188396d = interfaceC35745a5;
        this.f188397e = w12;
        this.f188398f = z12;
        this.f188399g = a12;
        this.f188400h = hVar;
        this.f188401i = o02;
        this.f188402j = jVar;
        this.f188403k = h12;
        new W4("MessengerReadStatusSyncAgent");
        this.f188404l = new C31667x(interfaceC28373a, c30277e1);
        this.f188405m = new io.reactivex.rxjava3.disposables.c();
        this.f188406n = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.G0
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.f188405m;
        cVar.e();
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(this.f188396d.a());
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        cVar.b(new io.reactivex.rxjava3.internal.operators.observable.N(this.f188395c.g().j0(cVar2).D(io.reactivex.rxjava3.internal.functions.a.f401991a), new com.avito.android.advert_core.task.a(13)).v0(new a(cVar2), b.f188409b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.F0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.v b(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        io.reactivex.rxjava3.core.I<kotlin.G0> iMarkChannelsAsUnread = this.f188398f.markChannelsAsUnread(Collections.singletonList(str));
        InterfaceC35745a5 interfaceC35745a5 = this.f188396d;
        AbstractC41768a abstractC41768aO = iMarkChannelsAsUnread.z(interfaceC35745a5.c()).s(interfaceC35745a5.c()).o(new K0(this, messengerUserHashInfo, str));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        Set<? extends IY.a> setSingleton = Collections.singleton(new a.b(str));
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f188402j.t(abstractC41768aO.B(kotlin.G0.f406611a), "markChannelAsUnread", setSingleton, this.f188403k));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.E0
    @Y61.k
    public final AbstractC41768a c(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        io.reactivex.rxjava3.internal.operators.completable.M mX2 = this.f188394b.f(str, messengerUserHashInfo).x(this.f188396d.a());
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        Set<? extends IY.a> setSingleton = Collections.singleton(new a.b(str));
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f188402j.t(mX2.B(kotlin.G0.f406611a), "markChannelAsLocallyRead", setSingleton, this.f188403k));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.E0
    @Y61.k
    public final AbstractC41768a d(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        io.reactivex.rxjava3.internal.operators.completable.M mX2 = this.f188394b.q(str, messengerUserHashInfo).x(this.f188396d.a());
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        Set<? extends IY.a> setSingleton = Collections.singleton(new a.b(str));
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f188402j.t(mX2.B(kotlin.G0.f406611a), "markChannelAsLocallyUnread", setSingleton, this.f188403k));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.F0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.v e(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        io.reactivex.rxjava3.core.I<kotlin.G0> iG2 = this.f188399g.g(messengerUserHashInfo, Collections.singletonList(str));
        InterfaceC35745a5 interfaceC35745a5 = this.f188396d;
        C41811b c41811bG = iG2.z(interfaceC35745a5.c()).s(interfaceC35745a5.c()).o(new J0(this, messengerUserHashInfo, str, j12)).g(this.f188394b.o(str, messengerUserHashInfo).x(interfaceC35745a5.a()));
        com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]);
        Set<? extends IY.a> setSingleton = Collections.singleton(new a.b(str));
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f188402j.t(c41811bG.B(kotlin.G0.f406611a), "markChannelAsRead", setSingleton, this.f188403k));
    }
}
