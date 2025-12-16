package com.avito.android.messenger.search;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.search.InterfaceC32569e;
import com.avito.android.messenger.w0;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.UnauthorizedException;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;
import shark.AndroidResourceIdNames;

/* compiled from: ChannelsSearchInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/search/h;", "Lcom/avito/android/messenger/search/e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/search/e$b;", "a", "b", "c", "d", "e", "f", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends AbstractC32892c<InterfaceC32569e.b> implements InterfaceC32569e {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f197143V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.B f197144W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f197145X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final B0 f197146Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f197147Z;

    /* compiled from: ChannelsSearchInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/h$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/search/e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC32569e.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final X81.h f197148d;

        public a(@Y61.k X81.h hVar) {
            super(null, null, 3, null);
            this.f197148d = hVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC32569e.b d(InterfaceC32569e.b bVar) {
            X81.h hVar;
            Object next;
            InterfaceC32569e.b bVar2 = bVar;
            if (!(bVar2 instanceof InterfaceC32569e.b.c)) {
                if (bVar2 instanceof InterfaceC32569e.b.a ? true : bVar2 instanceof InterfaceC32569e.b.C5804b) {
                    return bVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = ((InterfaceC32569e.b.c) bVar2).f197137d.f197121a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                hVar = this.f197148d;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((InterfaceC32569e.a.C5803a) next).f197123a.getChannelId(), hVar.getChannelId())) {
                    break;
                }
            }
            if (next == null) {
                return (InterfaceC32569e.b.c) bVar2;
            }
            InterfaceC32569e.b.c cVar = (InterfaceC32569e.b.c) bVar2;
            if (!(hVar instanceof X81.g)) {
                boolean z12 = hVar instanceof X81.o;
                MessengerUserHashInfo messengerUserHashInfo = cVar.f197134a;
                if (z12) {
                    if (L.f(((X81.o) hVar).getFromId(), messengerUserHashInfo.f430682d)) {
                        return e(cVar, true);
                    }
                }
                if (hVar instanceof X81.t) {
                    return L.f(((X81.t) hVar).getUid(), messengerUserHashInfo.f430682d) ? e(cVar, false) : cVar;
                }
                return cVar;
            }
            InterfaceC32569e.a aVar = cVar.f197137d;
            List<InterfaceC32569e.a.C5803a> list = aVar.f197121a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!L.f(((InterfaceC32569e.a.C5803a) obj).f197123a.getChannelId(), ((X81.g) hVar).getChannelId())) {
                    arrayList.add(obj);
                }
            }
            return InterfaceC32569e.b.c.e(cVar, null, new InterfaceC32569e.a(arrayList, aVar.f197122b), null, 23);
        }

        public final InterfaceC32569e.b.c e(InterfaceC32569e.b.c cVar, boolean z12) {
            InterfaceC32569e.a aVar = cVar.f197137d;
            List<InterfaceC32569e.a.C5803a> list = aVar.f197121a;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (InterfaceC32569e.a.C5803a c5803a : list) {
                if (L.f(c5803a.f197123a.getChannelId(), this.f197148d.getChannelId())) {
                    Channel channel = c5803a.f197123a;
                    c5803a = new InterfaceC32569e.a.C5803a(channel.copy((523775 & 1) != 0 ? channel.channelId : null, (523775 & 2) != 0 ? channel.type : null, (523775 & 4) != 0 ? channel.lastMessage : null, (523775 & 8) != 0 ? channel.users : null, (523775 & 16) != 0 ? channel.created : 0L, (523775 & 32) != 0 ? channel.updated : 0L, (523775 & 64) != 0 ? channel.context : null, (523775 & 128) != 0 ? channel.readOnlyState : null, (523775 & 256) != 0 ? channel.isDeleted : false, (523775 & 512) != 0 ? channel.isRead : z12, (523775 & 1024) != 0 ? channel.isSpam : false, (523775 & 2048) != 0 ? channel.isAnswered : false, (523775 & 4096) != 0 ? channel.tags : null, (523775 & 8192) != 0 ? channel.contextActions : null, (523775 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? channel.flow : null, (523775 & 32768) != 0 ? channel.suspectMessageId : null, (523775 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? channel.displayInfo : null, (523775 & 131072) != 0 ? channel.inputState : null, (523775 & 262144) != 0 ? channel.pinOrder : null), c5803a.f197124b);
                }
                arrayList.add(c5803a);
            }
            return InterfaceC32569e.b.c.e(cVar, null, new InterfaceC32569e.a(arrayList, aVar.f197122b), null, 23);
        }
    }

    /* compiled from: ChannelsSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/h$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/search/e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC32569e.b> {
        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            super("LoadNextPageMutator", null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<InterfaceC32569e.b> b(InterfaceC32569e.b bVar) {
            InterfaceC32569e.b bVar2 = bVar;
            if (bVar2 instanceof InterfaceC32569e.b.c) {
                InterfaceC32569e.b.c cVar = (InterfaceC32569e.b.c) bVar2;
                InterfaceC32569e.a aVar = cVar.f197137d;
                if (aVar.f197122b) {
                    h hVar = h.this;
                    I iH2 = hVar.f197143V.h(aVar.f197121a.size(), cVar.f197136c.f197042b);
                    InterfaceC35745a5 interfaceC35745a5 = hVar.f207133K;
                    return iH2.s(interfaceC35745a5.c()).r(new j(bVar2, hVar)).u(new i(bVar2, 0)).F().A0(hVar.f197146Y.S().F()).S().u(new i(bVar2, 1)).z(interfaceC35745a5.c());
                }
            }
            return I.q(bVar2);
        }
    }

    /* compiled from: ChannelsSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/h$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "Lcom/avito/android/messenger/search/e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends C32891b<InterfaceC32569e.b> {
        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            super("ReloadSearchOnUserIdChanged", null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32891b
        public final I b(InterfaceC32569e.b bVar) {
            InterfaceC32569e.b bVar2 = bVar;
            if (bVar2 instanceof InterfaceC32569e.b.c) {
                InterfaceC32569e.b.c cVar = (InterfaceC32569e.b.c) bVar2;
                if (!C43066x.K(cVar.f197134a.f430682d) && !C43066x.K(cVar.f197135b.f430682d) && !L.f(cVar.f197134a, cVar.f197135b)) {
                    h hVar = h.this;
                    hVar.le().s(hVar.new d(cVar.f197136c));
                }
            }
            return I.q(G0.f406611a);
        }
    }

    /* compiled from: ChannelsSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/h$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/search/e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.p<InterfaceC32569e.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final F f197151d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k F f12) {
            super("StartSearchMutator(" + f12 + ')', null, 2, 0 == true ? 1 : 0);
            this.f197151d = f12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<InterfaceC32569e.b> b(InterfaceC32569e.b bVar) {
            final InterfaceC32569e.b bVar2 = bVar;
            boolean zK2 = C43066x.K(bVar2.getF197134a().f430682d);
            F f12 = this.f197151d;
            if (zK2) {
                MessengerUserHashInfo.f430678e.getClass();
                return I.q(new InterfaceC32569e.b.C5804b(MessengerUserHashInfo.f430679f, bVar2.getF197135b(), f12, new UnauthorizedException(null, 1, null)));
            }
            h hVar = h.this;
            I iH2 = hVar.f197143V.h(0, f12.f197042b);
            InterfaceC35745a5 interfaceC35745a5 = hVar.f207133K;
            return iH2.s(interfaceC35745a5.c()).r(new l(bVar2, this, hVar)).u(new l41.o() { // from class: com.avito.android.messenger.search.k
                @Override // l41.o
                public final Object apply(Object obj) {
                    InterfaceC32569e.b bVar3 = bVar2;
                    return new InterfaceC32569e.b.C5804b(bVar3.getF197134a(), bVar3.getF197135b(), this.f197151d, com.avito.android.messenger.util.q.a((Throwable) obj));
                }
            }).F().A0(hVar.f197146Y.N(new m(this)).S().F()).S().u(new i(bVar2, 1)).j(new n(hVar, this)).z(interfaceC35745a5.c());
        }
    }

    /* compiled from: ChannelsSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/h$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "Lcom/avito/android/messenger/search/e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.n<InterfaceC32569e.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f197153d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32569e.b>>> f197154e;

        /* compiled from: ChannelsSearchInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "Lcom/avito/android/messenger/search/e$b;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.a<List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32569e.b>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ h f197155l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ e f197156m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, e eVar) {
                super(0);
                this.f197155l = hVar;
                this.f197156m = eVar;
            }

            @Override // Y41.a
            public final List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32569e.b>> invoke() {
                X2 x22 = X2.f318778a;
                h hVar = this.f197155l;
                String str = hVar.f207131E;
                StringBuilder sb2 = new StringBuilder("UserIdChangedComposite(");
                e eVar = this.f197156m;
                x22.i(str, AK.c.s(sb2, com.avito.android.messenger.util.i.b(eVar.f197153d, new Q[0]), ").block()"), null);
                return C42745f0.U(new f(eVar.f197153d), hVar.new c());
            }
        }

        public e(@Y61.k h hVar, MessengerUserHashInfo messengerUserHashInfo) {
            super("UserIdChangedComposite", com.avito.android.messenger.util.i.b(messengerUserHashInfo, new Q[0]), null, 4, null);
            this.f197153d = messengerUserHashInfo;
            this.f197154e = new a(hVar, this);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.n
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<InterfaceC32569e.b>>> b() {
            return this.f197154e;
        }
    }

    /* compiled from: ChannelsSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/h$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/search/e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends com.avito.android.mvi.rx3.with_monolithic_state.o<InterfaceC32569e.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f197157d;

        public f(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
            super(null, null, 3, null);
            this.f197157d = messengerUserHashInfo;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final InterfaceC32569e.b d(InterfaceC32569e.b bVar) {
            InterfaceC32569e.b.C5804b c5804b;
            InterfaceC32569e.b bVar2 = bVar;
            MessengerUserHashInfo f197134a = bVar2.getF197134a();
            MessengerUserHashInfo messengerUserHashInfo = this.f197157d;
            if (L.f(f197134a, messengerUserHashInfo)) {
                return bVar2;
            }
            if (bVar2 instanceof InterfaceC32569e.b.a) {
                return new InterfaceC32569e.b.a(messengerUserHashInfo);
            }
            if (bVar2 instanceof InterfaceC32569e.b.c) {
                if (!C43066x.K(messengerUserHashInfo.f430682d)) {
                    return InterfaceC32569e.b.c.e((InterfaceC32569e.b.c) bVar2, messengerUserHashInfo, null, null, 30);
                }
                MessengerUserHashInfo.f430678e.getClass();
                InterfaceC32569e.b.c cVar = (InterfaceC32569e.b.c) bVar2;
                c5804b = new InterfaceC32569e.b.C5804b(MessengerUserHashInfo.f430679f, cVar.f197135b, cVar.f197136c, new UnauthorizedException(null, 1, null));
            } else {
                if (!(bVar2 instanceof InterfaceC32569e.b.C5804b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (C43066x.K(messengerUserHashInfo.f430682d)) {
                    MessengerUserHashInfo.f430678e.getClass();
                    InterfaceC32569e.b.C5804b c5804b2 = (InterfaceC32569e.b.C5804b) bVar2;
                    c5804b = new InterfaceC32569e.b.C5804b(MessengerUserHashInfo.f430679f, c5804b2.f197130b, c5804b2.f197131c, new UnauthorizedException(null, 1, null));
                } else {
                    InterfaceC32569e.b.C5804b c5804b3 = (InterfaceC32569e.b.C5804b) bVar2;
                    c5804b = new InterfaceC32569e.b.C5804b(messengerUserHashInfo, c5804b3.f197130b, c5804b3.f197131c, c5804b3.f197132d);
                }
            }
            return c5804b;
        }
    }

    @Inject
    public h(@Y61.k w0 w0Var, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k com.avito.android.messenger.B b12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("ChannelsSearchInteractor", new InterfaceC32569e.b.a(null, 1, null), interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f197143V = interfaceC47842z;
        this.f197144W = b12;
        this.f197145X = interfaceC28373a;
        this.f197146Y = le().getF207175b().k0(d.class).d0(o.f197170b);
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f197147Z = cVar;
        cVar.b(w0Var.g().j0(interfaceC35745a5.c()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new C32570f(this)));
        cVar.b(interfaceC47842z.C(X81.h.class).j0(interfaceC35745a5.c()).t0(new g(this)));
    }

    @Override // com.avito.android.messenger.search.InterfaceC32569e
    @Y61.k
    public final B0 F0() {
        return this.f197143V.A().y(500L, TimeUnit.MILLISECONDS, this.f207133K.c()).d0(p.f197171b);
    }

    @Override // com.avito.android.messenger.search.InterfaceC32569e
    public final void J() {
        le().s(new b());
    }

    @Override // com.avito.android.messenger.search.InterfaceC32569e
    public final void Z6(@Y61.k F f12) {
        le().s(new d(f12));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f197147Z.e();
        super.onCleared();
    }
}
