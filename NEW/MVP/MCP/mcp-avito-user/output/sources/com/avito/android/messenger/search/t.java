package com.avito.android.messenger.search;

import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.C30277e1;
import com.avito.android.messenger.search.B;
import com.avito.android.messenger.search.InterfaceC32569e;
import com.avito.android.messenger.search.s;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K5;
import fZ.AbstractC40377a;
import fZ.InterfaceC40378b;
import io.reactivex.rxjava3.internal.operators.observable.G;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsSearchPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/messenger/search/t;", "Lcom/avito/android/messenger/search/s;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/search/B$b;", "c", "d", "e", "f", "g", "h", "i", "j", "k", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t extends AbstractC32892c<B.b> implements s {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32569e f197182V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40378b f197183W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f197184X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.interactor.A f197185Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<com.avito.android.messenger.channels.mvi.interactor.z> f197186Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f197187a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f197188b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D f197189c0;

    /* compiled from: ChannelsSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/search/e$b;", "interactorState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/search/e$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            t tVar = t.this;
            tVar.le().s(tVar.new e((InterfaceC32569e.b) obj));
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            t tVar = t.this;
            tVar.le().s(tVar.new f());
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/t$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends C32890a<B.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f197192d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f197193e;

        /* renamed from: f, reason: collision with root package name */
        public final int f197194f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f197195g;

        public c(@Y61.k String str, @Y61.l String str2, int i12, @Y61.l String str3) {
            super(androidx.appcompat.app.r.t(C23088b.b("ItemClickAction(channelId=", str, " messageId=", str2, " position="), i12, ')'), null, 2, null);
            this.f197192d = str;
            this.f197193e = str2;
            this.f197194f = i12;
            this.f197195g = str3;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(B.b bVar) {
            t.this.f197189c0.postValue(new s.a(this.f197192d, this.f197194f, this.f197193e, bVar.getF196974c().f196969a.f197042b, this.f197195g));
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/t$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<B.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Set<String> f197197d;

        public d(@Y61.k Set set) {
            super("locallyDeletedChannelIds = " + set, null, 2, null);
            this.f197197d = set;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final B.b d(B.b bVar) {
            B.b bVar2 = bVar;
            boolean z12 = bVar2 instanceof B.b.a;
            Set<String> set = this.f197197d;
            if (z12) {
                B.b.a aVar = (B.b.a) bVar2;
                return new B.b.a(aVar.f196946c, aVar.f196945b, set);
            }
            if (bVar2 instanceof B.b.C5794b) {
                B.b.C5794b c5794b = (B.b.C5794b) bVar2;
                Throwable th2 = c5794b.f196950d;
                return new B.b.C5794b(c5794b.f196947a, c5794b.f196948b, c5794b.f196949c, th2, set);
            }
            if (bVar2 instanceof B.b.c.a) {
                B.b.c.a aVar2 = (B.b.c.a) bVar2;
                return new B.b.c.a(aVar2.f196955d, aVar2.f196954c, aVar2.f196952a, set);
            }
            if (bVar2 instanceof B.b.c.C5795b) {
                return B.b.c.C5795b.e((B.b.c.C5795b) bVar2, null, null, set, 11);
            }
            if (bVar2 instanceof B.b.d) {
                B.b.d dVar = (B.b.d) bVar2;
                return new B.b.d(dVar.f196961b, dVar.f196960a, set);
            }
            if (!(bVar2 instanceof B.b.g)) {
                throw new NoWhenBranchMatchedException();
            }
            B.b.g gVar = (B.b.g) bVar2;
            return new B.b.g(gVar.f196974c, gVar.f196972a, set);
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/t$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.o<B.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final InterfaceC32569e.b f197198d;

        public e(@Y61.k InterfaceC32569e.b bVar) {
            super("NewInteractorStateMutator", null, 2, null);
            this.f197198d = bVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final B.b d(B.b bVar) {
            B.b.e aVar;
            B.b bVar2 = bVar;
            InterfaceC32569e.b bVar3 = this.f197198d;
            if (!L.f(bVar3.getF197136c(), bVar2.getF196972a())) {
                return bVar2;
            }
            if (bVar3 instanceof InterfaceC32569e.b.a) {
                return new B.b.a(bVar2.a(), null, null, 6, null);
            }
            boolean z12 = bVar3 instanceof InterfaceC32569e.b.c;
            t tVar = t.this;
            if (!z12) {
                if (!(bVar3 instanceof InterfaceC32569e.b.C5804b)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC32569e.b.C5804b c5804b = (InterfaceC32569e.b.C5804b) bVar3;
                B.b.f f196974c = bVar2.getF196974c();
                List<AbstractC40377a> list = bVar2.getF196974c().f196970b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!L.f((AbstractC40377a) obj, AbstractC40377a.b.f395931b)) {
                        arrayList.add(obj);
                    }
                }
                B.b.f fVarA = B.b.f.a(f196974c, arrayList, false);
                PrintableText printableTextA = InterfaceC35741a1.a.a(tVar.f197184X, c5804b.f197132d, null, null, 6);
                Set<String> setA = bVar2.a();
                return new B.b.C5794b(c5804b.f197131c, fVarA, printableTextA, c5804b.f197132d, setA);
            }
            InterfaceC32569e.b.c cVar = (InterfaceC32569e.b.c) bVar3;
            InterfaceC40378b interfaceC40378b = tVar.f197183W;
            String str = cVar.f197134a.f430682d;
            InterfaceC32569e.a aVar2 = cVar.f197137d;
            List<InterfaceC32569e.a.C5803a> list2 = aVar2.f197121a;
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                InterfaceC32569e.a.C5803a c5803a = (InterfaceC32569e.a.C5803a) obj2;
                if (hashSet.add(new Q(c5803a.f197123a.getChannelId(), c5803a.f197124b))) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayListA = interfaceC40378b.a(str, arrayList2);
            if (arrayListA.isEmpty()) {
                return new B.b.c.a(cVar.f197136c, bVar2.a(), null, null, 12, null);
            }
            B.b.f fVar = new B.b.f(cVar.f197136c, arrayListA, aVar2.f197122b);
            InterfaceC32569e.b.d.C5805b c5805b = InterfaceC32569e.b.d.C5805b.f197140a;
            InterfaceC32569e.b.d dVar = cVar.f197138e;
            if (L.f(dVar, c5805b)) {
                aVar = B.b.e.C5796b.f196965a;
            } else {
                if (!(dVar instanceof InterfaceC32569e.b.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC32569e.b.d.a aVar3 = (InterfaceC32569e.b.d.a) dVar;
                aVar = new B.b.e.a(InterfaceC35741a1.a.a(tVar.f197184X, aVar3.f197139a, null, null, 6), aVar3.f197139a);
            }
            return new B.b.c.C5795b(fVar, aVar, bVar2.a(), null, 8, null);
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/t$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends C32890a<B.b> {
        public f() {
            super("ReconnectAction", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(B.b bVar) {
            B.b bVar2 = bVar;
            boolean z12 = bVar2 instanceof B.b.c;
            t tVar = t.this;
            if (z12) {
                B.b.e f196957b = ((B.b.c) bVar2).getF196957b();
                if ((f196957b instanceof B.b.e.a) && K5.e(((B.b.e.a) f196957b).f196964b)) {
                    tVar.X();
                    return;
                }
                return;
            }
            if (bVar2 instanceof B.b.C5794b) {
                if (K5.e(((B.b.C5794b) bVar2).f196950d)) {
                    tVar.X();
                }
            } else {
                if ((bVar2 instanceof B.b.a) || (bVar2 instanceof B.b.d)) {
                    return;
                }
                boolean z13 = bVar2 instanceof B.b.g;
            }
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/t$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class g extends C32890a<B.b> {
        public g() {
            super("RequestNextPageAction", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(B.b bVar) {
            B.b bVar2 = bVar;
            if ((bVar2 instanceof B.b.c.C5795b) && (((B.b.c.C5795b) bVar2).f196957b instanceof B.b.e.c)) {
                t.this.f197182V.J();
            }
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/t$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class h extends C32890a<B.b> {
        public h() {
            super("RetryAction", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(B.b bVar) {
            B.b bVar2 = bVar;
            boolean z12 = bVar2 instanceof B.b.c;
            t tVar = t.this;
            if (z12) {
                if (((B.b.c) bVar2).getF196957b() instanceof B.b.e.a) {
                    tVar.J();
                    return;
                } else {
                    tVar.je(bVar2.getF196972a().f197042b, true);
                    return;
                }
            }
            if (bVar2 instanceof B.b.C5794b) {
                tVar.je(((B.b.C5794b) bVar2).f196947a.f197042b, true);
            } else {
                if ((bVar2 instanceof B.b.a) || (bVar2 instanceof B.b.d)) {
                    return;
                }
                boolean z13 = bVar2 instanceof B.b.g;
            }
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/t$i;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class i extends C32890a<B.b> {
        public i() {
            super("SearchAction", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(B.b bVar) {
            B.b bVar2 = bVar;
            if (bVar2 instanceof B.b.d) {
                t.this.f197182V.Z6(((B.b.d) bVar2).f196960a);
            }
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/t$j;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class j extends com.avito.android.mvi.rx3.with_monolithic_state.o<B.b> {
        public j() {
            super("StartPaginationMutator", null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final B.b d(B.b bVar) {
            B.b bVar2 = bVar;
            if (!(bVar2 instanceof B.b.c.C5795b) || !((B.b.c.C5795b) bVar2).f196956a.f196971c) {
                return bVar2;
            }
            t tVar = t.this;
            tVar.le().s(tVar.new g());
            B.b.c.C5795b c5795b = (B.b.c.C5795b) bVar2;
            B.b.f fVar = c5795b.f196956a;
            List<AbstractC40377a> list = fVar.f196970b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!L.f((AbstractC40377a) obj, AbstractC40377a.b.f395931b)) {
                    arrayList.add(obj);
                }
            }
            return B.b.c.C5795b.e(c5795b, B.b.f.a(fVar, C42745f0.i0(AbstractC40377a.b.f395931b, arrayList), true), B.b.e.c.f196966a, null, 12);
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/t$k;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class k extends com.avito.android.mvi.rx3.with_monolithic_state.o<B.b> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f197205d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f197206e;

        public k(@Y61.k String str, boolean z12) {
            super("StartSearchMutator(" + str + ", " + z12 + ')', null, 2, null);
            this.f197205d = str;
            this.f197206e = z12;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final B.b d(B.b bVar) {
            B.b gVar;
            B.b bVar2 = bVar;
            String str = this.f197205d;
            String string = C43066x.A0(C43066x.t0(255, str)).toString();
            if (!this.f197206e && L.f(bVar2.getF196972a().f197042b, string)) {
                return bVar2;
            }
            int length = str.length();
            if (length == 0) {
                gVar = new B.b.a(bVar2.a(), null, null, 6, null);
            } else {
                if (1 > length || length >= 2) {
                    t tVar = t.this;
                    F f12 = new F(tVar.f197187a0.incrementAndGet(), str);
                    tVar.le().s(tVar.new i());
                    return new B.b.d(bVar2.getF196974c(), f12, bVar2.a());
                }
                gVar = new B.b.g(new F(0L, str), bVar2.a(), null, 4, null);
            }
            return gVar;
        }
    }

    @Inject
    public t(@Y61.k InterfaceC32569e interfaceC32569e, @Y61.k InterfaceC40378b interfaceC40378b, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.avito.android.messenger.channels.mvi.interactor.A a12, @Y61.k C30277e1 c30277e1, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super("ChannelsSearchPresenter", new B.b.a(B0.f406639b, null, null, 6, null), interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f197182V = interfaceC32569e;
        this.f197183W = interfaceC40378b;
        this.f197184X = interfaceC35741a1;
        this.f197185Y = a12;
        this.f197186Z = new com.avito.android.util.architecture_components.D<>();
        this.f197187a0 = new AtomicLong(0L);
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f197188b0 = cVar;
        this.f197189c0 = new com.avito.android.util.architecture_components.D();
        cVar.b(interfaceC32569e.M0().j0(interfaceC35745a5.c()).t0(new a()));
        cVar.b(interfaceC32569e.F0().j0(interfaceC35745a5.c()).t0(new b()));
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[47];
        if (((Boolean) c30277e1.f144987U.a().invoke()).booleanValue()) {
            G gS2 = a12.s();
            InterfaceC35745a5 interfaceC35745a52 = this.f207133K;
            cVar.b(gS2.x0(interfaceC35745a52.a()).t0(new u(this)));
            cVar.b(a12.r().x0(interfaceC35745a52.a()).t0(new v(this)));
        }
    }

    @Override // com.avito.android.messenger.search.adapter.supportchannel.b.a
    public final void H7(@Y61.k AbstractC40377a.c cVar, int i12) {
        le().s(new c(cVar.f395934b, cVar.f395935c, i12, null));
    }

    @Override // com.avito.android.messenger.search.s
    public final void J() {
        le().s(new j());
    }

    @Override // com.avito.android.messenger.search.s
    public final void X() {
        le().s(new h());
    }

    @Override // com.avito.android.messenger.search.adapter.channel.b.a
    public final void b9(@Y61.k AbstractC40377a.C11158a c11158a, int i12) {
        le().s(new c(c11158a.f395912b, c11158a.f395913c, i12, c11158a.f395925o));
    }

    @Override // com.avito.android.messenger.search.s
    /* renamed from: d5, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF197189c0() {
        return this.f197189c0;
    }

    @Override // com.avito.android.messenger.search.s
    public final void je(@Y61.k String str, boolean z12) {
        le().s(new k(str, z12));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f197188b0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.search.s
    public final void p(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        this.f197188b0.b(this.f197185Y.p(str, messengerUserHashInfo).x(this.f207133K.a()).u());
    }

    @Override // com.avito.android.messenger.search.s
    /* renamed from: rb, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF197186Z() {
        return this.f197186Z;
    }
}
