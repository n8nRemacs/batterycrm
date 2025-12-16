package com.avito.android.advert_stats;

import androidx.recyclerview.widget.C23424o;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.advert_stats.item.K;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.Action;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.architecture_components.C35748b;
import com.avito.android.util.architecture_components.C35751e;
import eH0.c;
import i31.InterfaceC41220a;
import ib.C41376c;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kb.C42659a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import nb.InterfaceC44368a;

/* compiled from: AdvertStatsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/r;", "Landroidx/lifecycle/M0;", "a", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f86844E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f86845J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final p f86846K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final K f86847L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final eH0.c f86848M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final l f86849N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f86850O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f86851P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44368a f86852Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f86853R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f86854S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C35748b<?>> f86855T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C41376c> f86856U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Action> f86857V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public AtomicReference f86858W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public AtomicReference f86859X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public AtomicReference f86860Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.d f86861Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final AtomicReference f86862a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.conveyor_item.a> f86863b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f86864c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C35748b<?>> f86865d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f86866e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C41376c> f86867f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f86868g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f86869h0;

    /* compiled from: AdvertStatsViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/r$a;", "", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        r a(@Y61.k String str);
    }

    /* compiled from: AdvertStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lkb/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2<?> p22 = (P2) obj;
            if (p22 instanceof P2.b) {
                return;
            }
            r.this.f86854S.postValue(p22);
        }
    }

    /* compiled from: AdvertStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lkb/a;", "it", "", "test", "(Lcom/avito/android/util/P2;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f86871b = new c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((P2) obj) instanceof P2.b;
        }
    }

    /* compiled from: AdvertStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkb/a;", "it", "apply", "(Lcom/avito/android/util/P2;)Lkb/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T, R> f86872b = new d<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (C42659a) ((P2.b) ((P2) obj)).f318720a;
        }
    }

    /* compiled from: AdvertStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkb/a;", "statistics", "Lkotlin/G0;", "accept", "(Lkb/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Action action = ((C42659a) obj).getAction();
            if (action != null) {
                r.this.f86857V.postValue(action);
            }
        }
    }

    /* compiled from: AdvertStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkb/a;", "it", "", "Lcom/avito/conveyor_item/a;", "apply", "(Lkb/a;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements l41.o {
        public f() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return r.this.f86847L.b((C42659a) obj);
        }
    }

    /* compiled from: AdvertStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "it", "Lcom/avito/android/util/P2$b;", "apply", "(Ljava/util/List;)Lcom/avito/android/util/P2$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T, R> f86875b = new g<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.b((List) obj);
        }
    }

    /* compiled from: AdvertStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2$b;", "", "Lcom/avito/conveyor_item/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2.b bVar = (P2.b) obj;
            r rVar = r.this;
            InterfaceC44368a interfaceC44368a = rVar.f86852Q;
            interfaceC44368a.f();
            rVar.f86854S.postValue(bVar);
            rVar.ne((List) bVar.f318720a);
            rVar.f86864c0 = false;
            interfaceC44368a.g();
        }
    }

    /* compiled from: AdvertStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {
        public i() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            r rVar = r.this;
            InterfaceC44368a interfaceC44368a = rVar.f86852Q;
            interfaceC44368a.f();
            rVar.f86854S.postValue(new P2.a(com.avito.android.remote.error.j.a(2, com.avito.android.error.z.l(th2), null)));
            interfaceC44368a.b(th2);
        }
    }

    @i31.c
    public r(@InterfaceC41220a @Y61.k String str, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k p pVar, @Y61.k K k12, @Y61.k eH0.c cVar, @Y61.k l lVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC44368a interfaceC44368a) {
        this.f86844E = str;
        this.f86845J = interfaceC35745a5;
        this.f86846K = pVar;
        this.f86847L = k12;
        this.f86848M = cVar;
        this.f86849N = lVar;
        this.f86850O = aVar;
        this.f86851P = interfaceC28373a;
        this.f86852Q = interfaceC44368a;
        C23038g0<P2<?>> c23038g0 = new C23038g0<>();
        this.f86854S = c23038g0;
        C23038g0<C35748b<?>> c23038g02 = new C23038g0<>();
        this.f86855T = c23038g02;
        C23038g0<C41376c> c23038g03 = new C23038g0<>();
        this.f86856U = c23038g03;
        C23038g0<Action> c23038g04 = new C23038g0<>();
        this.f86857V = c23038g04;
        C23038g0 c23038g05 = new C23038g0();
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
        this.f86858W = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f86859X = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f86860Y = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f86861Z = io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f86862a0 = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f86863b0 = C42784z0.f406748b;
        le(str);
        this.f86862a0 = (AtomicReference) aVar.d9().t0(new u(this));
        this.f86865d0 = c23038g02;
        this.f86866e0 = c23038g0;
        this.f86867f0 = c23038g03;
        this.f86868g0 = c23038g04;
        this.f86869h0 = c23038g05;
    }

    public static final void ke(r rVar, List list) {
        List<com.avito.conveyor_item.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (com.avito.conveyor_item.a aVar : list2) {
            if (aVar instanceof com.avito.android.advert_stats.item.period.a) {
                com.avito.android.advert_stats.item.period.a aVar2 = (com.avito.android.advert_stats.item.period.a) aVar;
                aVar = new com.avito.android.advert_stats.item.period.a(aVar2.f86780b, aVar2.f86781c, true);
            } else if (aVar instanceof com.avito.android.advert_stats.item.details.a) {
                com.avito.android.advert_stats.item.details.a aVar3 = (com.avito.android.advert_stats.item.details.a) aVar;
                aVar = new com.avito.android.advert_stats.item.details.a(aVar3.f86735b, aVar3.f86736c, aVar3.f86737d, aVar3.f86738e, aVar3.f86739f, true);
            }
            arrayList.add(aVar);
        }
        rVar.ne(arrayList);
        rVar.f86864c0 = true;
    }

    public final void le(String str) {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f86853R;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        B0 b0D0 = this.f86846K.b(str).K(new b()).N(c.f86871b).d0(d.f86872b).K(new e()).d0(new f()).d0(g.f86875b);
        InterfaceC35745a5 interfaceC35745a5 = this.f86845J;
        this.f86853R = (io.reactivex.rxjava3.internal.observers.y) b0D0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new h(), new i(), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    public final void me() {
        this.f86855T.postValue(new com.avito.android.util.architecture_components.F(new C35751e(c.a.a(this.f86848M, this.f86844E, null, false, false, 30).setFlags(603979776))));
    }

    public final void ne(List<? extends com.avito.conveyor_item.a> list) {
        this.f86856U.setValue(new C41376c(list, C23424o.a(new F(this.f86863b0, list), true)));
        this.f86863b0 = list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v5, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f86853R;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f86858W.dispose();
        this.f86859X.dispose();
        this.f86860Y.dispose();
        this.f86861Z.dispose();
        this.f86862a0.dispose();
        super.onCleared();
    }
}
