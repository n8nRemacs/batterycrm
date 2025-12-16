package com.avito.android.mvi.rx3.with_monolithic_state;

import com.avito.android.item_map.view.C31075l;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.core.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReducerQueue.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/with_monolithic_state/F;", "", "StateT", "Lcom/avito/android/mvi/rx3/with_monolithic_state/t;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class F<StateT> implements t<StateT> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f207119b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<x<StateT>> f207120c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<x<StateT>> f207121d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f207122e;

    /* compiled from: ReducerQueue.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "StateT", "Lio/reactivex/rxjava3/disposables/d;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<io.reactivex.rxjava3.disposables.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ F<StateT> f207123l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(F<StateT> f12) {
            super(1);
            this.f207123l = f12;
        }

        @Override // Y41.l
        public final G0 invoke(io.reactivex.rxjava3.disposables.d dVar) {
            String str = this.f207123l.f207119b;
            if (str != null) {
                X2.f318778a.i(str, "{RQ} subscribed to qRelay", null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReducerQueue.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "StateT", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "kotlin.jvm.PlatformType", "reducible", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mvi/rx3/with_monolithic_state/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<x<StateT>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ F<StateT> f207124l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(F<StateT> f12) {
            super(1);
            this.f207124l = f12;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            x xVar = (x) obj;
            F<StateT> f12 = this.f207124l;
            String str = f12.f207119b;
            if (str != null) {
                X2.f318778a.i(str, "{RQ} sendToReducer(reducible = " + xVar + ')', null);
            }
            xVar.c(f12.f207120c);
            return G0.f406611a;
        }
    }

    public F(@Y61.k H h12, @Y61.l String str) {
        this.f207119b = str;
        this.f207120c = new com.jakewharton.rxrelay3.c<>();
        com.jakewharton.rxrelay3.d<x<StateT>> dVarM = C31685o.m();
        this.f207121d = dVarM;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f207122e = cVar;
        hu.akarnokd.rxjava3.schedulers.c cVar2 = new hu.akarnokd.rxjava3.schedulers.c(h12);
        cVar.b(io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar2, 0)));
        cVar.b(dVarM.j0(cVar2).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new C31075l(17, new a(this))).t0(new C31075l(18, new b(this))));
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f207122e.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f207122e.f401978c;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.t
    /* renamed from: l, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF207175b() {
        return this.f207120c;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.t
    public final void s(@Y61.k x<StateT> xVar) {
        String str = this.f207119b;
        if (str != null) {
            X2.f318778a.i(str, "{RQ} plusAssign(value = " + xVar + ')', null);
        }
        this.f207121d.accept(xVar);
    }

    public /* synthetic */ F(H h12, String str, int i12, C42822w c42822w) {
        this(h12, (i12 & 2) != 0 ? null : str);
    }
}
