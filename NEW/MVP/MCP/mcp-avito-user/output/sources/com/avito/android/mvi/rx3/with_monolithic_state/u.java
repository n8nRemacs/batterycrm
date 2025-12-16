package com.avito.android.mvi.rx3.with_monolithic_state;

import com.avito.android.item_map.view.C31075l;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import io.reactivex.rxjava3.core.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import p41.AbstractC46895b;

/* compiled from: ReducerQueue.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mvi/rx3/with_monolithic_state/u;", "", "StateT", "KeyT", "Lcom/avito/android/mvi/rx3/with_monolithic_state/t;", "b", "c", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u<StateT, KeyT> implements t<StateT> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<x<StateT>> f207175b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<x<StateT>> f207176c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f207177d;

    /* compiled from: ReducerQueue.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0004*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "StateT", "KeyT", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "kotlin.jvm.PlatformType", "reducible", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mvi/rx3/with_monolithic_state/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<x<StateT>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u<StateT, KeyT> f207178l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u<StateT, KeyT> uVar) {
            super(1);
            this.f207178l = uVar;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            ((x) obj).c(this.f207178l.f207175b);
            return G0.f406611a;
        }
    }

    /* compiled from: ReducerQueue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\u0004\b\u0003\u0010\u00032\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/with_monolithic_state/u$b;", "", "StateT", "KeyT", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b<StateT, KeyT> {
        @Y61.l
        String a(@Y61.k x xVar);
    }

    /* compiled from: ReducerQueue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\u0004\b\u0003\u0010\u00032\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/with_monolithic_state/u$c;", "", "StateT", "KeyT", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c<StateT, KeyT> {
        @Y61.k
        io.reactivex.rxjava3.core.z a(@Y61.l Object obj, @Y61.k AbstractC46895b abstractC46895b);
    }

    /* compiled from: ReducerQueue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f207179b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l lVar) {
            this.f207179b = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f207179b.invoke(obj);
        }
    }

    /* compiled from: ReducerQueue.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0010\n\u001a\u0004\u0018\u00018\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0001\"\b\b\u0003\u0010\u0004*\u00020\u0001\"\u0004\b\u0004\u0010\u00002\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"KeyT", "", "EventT", "OutT", "StateT", "kotlin.jvm.PlatformType", "event", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/avito/android/mvi/rx3/with_monolithic_state/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<x<StateT>, KeyT> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b f207180l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar) {
            super(1);
            this.f207180l = bVar;
        }

        @Override // Y41.l
        @Y61.l
        public final KeyT invoke(x<StateT> xVar) {
            return (KeyT) this.f207180l.a(xVar);
        }
    }

    /* compiled from: ReducerQueue.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\f\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00018\u00028\u0002 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00018\u00028\u0002\u0018\u00010\b0\b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0001\"\b\b\u0003\u0010\u0004*\u00020\u0001\"\u0004\b\u0004\u0010\u00002:\u0010\u0007\u001a6\u0012\u0006\u0012\u0004\u0018\u00018\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00018\u0001 \u0006*\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"KeyT", "", "EventT", "OutT", "StateT", "Lp41/b;", "kotlin.jvm.PlatformType", "groupedObs", "Lio/reactivex/rxjava3/core/E;", "invoke", "(Lp41/b;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/mvi/rx3/with_monolithic_state/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<AbstractC46895b<KeyT, x<StateT>>, io.reactivex.rxjava3.core.E<? extends x<StateT>>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f207181l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c cVar) {
            super(1);
            this.f207181l = cVar;
        }

        @Override // Y41.l
        public final Object invoke(Object obj) {
            AbstractC46895b abstractC46895b = (AbstractC46895b) obj;
            return this.f207181l.a(abstractC46895b.f428195b, abstractC46895b);
        }
    }

    public u(@Y61.k H h12, @Y61.k b<StateT, KeyT> bVar, @Y61.k c<StateT, KeyT> cVar) {
        com.jakewharton.rxrelay3.d<x<StateT>> dVarM = C31685o.m();
        this.f207176c = dVarM;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f207177d = cVar2;
        hu.akarnokd.rxjava3.schedulers.c cVar3 = new hu.akarnokd.rxjava3.schedulers.c(h12);
        cVar2.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar3, 0)));
        cVar2.b(dVarM.j0(cVar3).Z(new d(new e(bVar))).T(new d(new f(cVar)), Integer.MAX_VALUE).j0(cVar3).t0(new C31075l(16, new a(this))));
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f207177d.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f207177d.f401978c;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.t
    /* renamed from: l, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF207120c() {
        return this.f207175b;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.t
    public final void s(@Y61.k x<StateT> xVar) {
        this.f207176c.accept(xVar);
    }
}
