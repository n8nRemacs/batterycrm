package com.avito.android.tariff_lf.edit_info.viewmodel;

import aD0.C19758a;
import aD0.C19759b;
import androidx.view.C23038g0;
import androidx.view.M0;
import cD0.C27015i;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.tariff.remote.model.edit.BottomSheetAction;
import com.avito.android.tariff_lf.edit_info.viewmodel.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: EditInfoViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/viewmodel/r;", "Lcom/avito/android/tariff_lf/edit_info/viewmodel/k;", "Landroidx/lifecycle/M0;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r extends M0 implements k {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f299116E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35211e f299117J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35207a f299118K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299119L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f299120M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.conveyor_item.a> f299121N = C42784z0.f406748b;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public AtomicReference f299122O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public AtomicReference f299123P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public AtomicReference f299124Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f299125R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f299126S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f299127T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0<k.a> f299128U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f299129V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> f299130W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C23038g0<ZC0.e> f299131X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C19758a> f299132Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Object> f299133Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<aD0.e> f299134a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.l
    public ZC0.f f299135b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f299136c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f299137d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> f299138e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f299139f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f299140g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f299141h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f299142i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f299143j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f299144k0;

    /* compiled from: EditInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LcD0/i;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            r.this.f299129V.postValue((P2) obj);
        }
    }

    /* compiled from: EditInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LcD0/i;", "it", "", "test", "(Lcom/avito/android/util/P2;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f299146b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((P2) obj) instanceof P2.b;
        }
    }

    /* compiled from: EditInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LcD0/i;", "it", "Lcom/avito/android/util/P2$b;", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/util/P2$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f299147b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (P2.b) ((P2) obj);
        }
    }

    /* compiled from: EditInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2$b;", "LcD0/i;", "it", "LZC0/f;", "apply", "(Lcom/avito/android/util/P2$b;)LZC0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements l41.o {
        public d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return r.this.f299118K.a((C27015i) ((P2.b) obj).f318720a);
        }
    }

    /* compiled from: EditInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZC0/f;", "it", "Lkotlin/G0;", "accept", "(LZC0/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            r rVar = r.this;
            ScreenPerformanceTracker.a.d(rVar.f299120M, null, null, null, null, 15);
            rVar.ke((ZC0.f) obj);
        }
    }

    /* compiled from: EditInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            r rVar = r.this;
            ScreenPerformanceTracker.a.d(rVar.f299120M, null, null, new J.a(th2), null, 11);
            ApiError.UnknownError unknownErrorA = com.avito.android.remote.error.j.a(1, null, th2);
            ScreenPerformanceTracker screenPerformanceTracker = rVar.f299120M;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            rVar.f299129V.setValue(new P2.a(unknownErrorA));
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(th2), null, 5);
        }
    }

    public r(@Y61.k String str, @Y61.k InterfaceC35211e interfaceC35211e, @Y61.k InterfaceC35207a interfaceC35207a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f299116E = str;
        this.f299117J = interfaceC35211e;
        this.f299118K = interfaceC35207a;
        this.f299119L = interfaceC35745a5;
        this.f299120M = screenPerformanceTracker;
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
        this.f299122O = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f299123P = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f299124Q = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f299125R = new io.reactivex.rxjava3.disposables.c();
        C23038g0<List<com.avito.conveyor_item.a>> c23038g0 = new C23038g0<>();
        this.f299126S = c23038g0;
        C23038g0<String> c23038g02 = new C23038g0<>();
        this.f299127T = c23038g02;
        C23038g0<k.a> c23038g03 = new C23038g0<>();
        this.f299128U = c23038g03;
        C23038g0<P2<?>> c23038g04 = new C23038g0<>();
        this.f299129V = c23038g04;
        com.avito.android.util.architecture_components.D<DeepLink> d12 = new com.avito.android.util.architecture_components.D<>();
        this.f299130W = d12;
        C23038g0<ZC0.e> c23038g05 = new C23038g0<>();
        this.f299131X = c23038g05;
        C23038g0<C19758a> c23038g06 = new C23038g0<>();
        this.f299132Y = c23038g06;
        new C23038g0();
        C23038g0<Object> c23038g07 = new C23038g0<>();
        this.f299133Z = c23038g07;
        C23038g0<aD0.e> c23038g08 = new C23038g0<>();
        this.f299134a0 = c23038g08;
        O();
        this.f299136c0 = c23038g04;
        this.f299137d0 = c23038g0;
        this.f299138e0 = d12;
        this.f299139f0 = c23038g02;
        this.f299140g0 = c23038g05;
        this.f299141h0 = c23038g03;
        this.f299142i0 = c23038g06;
        this.f299143j0 = c23038g07;
        this.f299144k0 = c23038g08;
    }

    public static ArrayList le(List list, boolean z12, boolean z13) {
        List<com.avito.conveyor_item.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (com.avito.conveyor_item.a aVar : list2) {
            if (aVar instanceof com.avito.android.tariff_lf.edit_info.item.prolongation.a) {
                com.avito.android.tariff_lf.edit_info.item.prolongation.a aVar2 = (com.avito.android.tariff_lf.edit_info.item.prolongation.a) aVar;
                aVar = new com.avito.android.tariff_lf.edit_info.item.prolongation.a(aVar2.f299035b, aVar2.f299036c, aVar2.f299037d, aVar2.f299038e, z12, z13, aVar2.f299041h);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    @Y61.k
    /* renamed from: Aa, reason: from getter */
    public final C23038g0 getF299144k0() {
        return this.f299144k0;
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    @Y61.k
    /* renamed from: Ib, reason: from getter */
    public final C23038g0 getF299140g0() {
        return this.f299140g0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    public final void O() {
        ScreenPerformanceTracker.a.b(this.f299120M, null, 3);
        this.f299122O.dispose();
        this.f299122O = (AtomicReference) this.f299117J.b(this.f299116E).r0(P2.c.f318721a).K(new a()).N(b.f299146b).d0(c.f299147b).d0(new d()).j0(this.f299119L.e()).v0(new e(), new f(), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    public final void W7(int i12) {
        ZC0.e eVar;
        ZC0.a aVar;
        ZC0.f fVar;
        QC0.a aVar2;
        ZC0.f fVar2 = this.f299135b0;
        if (fVar2 == null || (eVar = fVar2.f19984c) == null || (aVar = (ZC0.a) eVar.f19980b.get(i12)) == null || (fVar = this.f299135b0) == null || (aVar2 = fVar.f19982a) == null) {
            return;
        }
        aVar2.f13599c = aVar;
        List<com.avito.conveyor_item.a> list = aVar2.f13598b.get(aVar);
        if (list == null) {
            list = C42784z0.f406748b;
        }
        this.f299126S.postValue(list);
        this.f299121N = list;
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    @Y61.k
    /* renamed from: Y, reason: from getter */
    public final C23038g0 getF299139f0() {
        return this.f299139f0;
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    @Y61.k
    /* renamed from: Z4, reason: from getter */
    public final C23038g0 getF299142i0() {
        return this.f299142i0;
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f299125R;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof K) {
                cVar.b(com.avito.android.mnz_common.extensions.h.b(((K) dVar).k()).v0(new v(this), w.f299155b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.tariff_lf.edit_info.item.prolongation.d) {
                cVar.b(com.avito.android.mnz_common.extensions.h.b(((com.avito.android.tariff_lf.edit_info.item.prolongation.d) dVar).getF299054e()).d0(A.f299077b).v0(new B(this), C.f299079b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.tariff_lf.edit_info.item.button.d) {
                cVar.b(com.avito.android.mnz_common.extensions.h.b(((com.avito.android.tariff_lf.edit_info.item.button.d) dVar).A1()).d0(s.f299151b).j0(this.f299119L.e()).v0(new t(this), u.f299153b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.tariff_lf.edit_info.item.manager_call.f) {
                cVar.b(com.avito.android.mnz_common.extensions.h.b(((com.avito.android.tariff_lf.edit_info.item.manager_call.f) dVar).A1()).v0(new y(this), z.f299159b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF299136c0() {
        return this.f299136c0;
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    public final void h0() {
        O();
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    @Y61.k
    /* renamed from: j0, reason: from getter */
    public final C23038g0 getF299141h0() {
        return this.f299141h0;
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> k0() {
        return this.f299138e0;
    }

    public final void ke(ZC0.f fVar) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f299120M;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        this.f299135b0 = fVar;
        this.f299127T.postValue(fVar.f19982a.f13597a);
        QC0.a aVar = fVar.f19982a;
        List<com.avito.conveyor_item.a> list = aVar.f13598b.get(aVar.f13599c);
        if (list == null) {
            list = C42784z0.f406748b;
        }
        this.f299126S.postValue(list);
        this.f299121N = list;
        this.f299134a0.setValue(fVar.f19983b);
        this.f299131X.setValue(fVar.f19984c);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
        DeepLink deepLink = fVar.f19985d;
        if (deepLink != null) {
            this.f299130W.postValue(deepLink);
        }
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    /* renamed from: n0, reason: from getter */
    public final C23038g0 getF299137d0() {
        return this.f299137d0;
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    public final void n3(@Y61.k aD0.d dVar) {
        ZC0.f fVar;
        BottomSheetAction bottomSheetAction;
        BottomSheetAction bottomSheetAction2;
        if (dVar instanceof C19759b) {
            this.f299130W.postValue(((C19759b) dVar).f20823c);
            return;
        }
        if (dVar instanceof aD0.f) {
            C23038g0<C19758a> c23038g0 = this.f299132Y;
            aD0.g gVar = ((aD0.f) dVar).f20830c;
            String str = gVar.f20831a;
            List<BottomSheetAction> list = gVar.f20833c;
            c23038g0.postValue(new C19758a(str, gVar.f20832b, (list == null || (bottomSheetAction2 = (BottomSheetAction) C42745f0.K(0, list)) == null) ? null : bottomSheetAction2.getTitle(), (list == null || (bottomSheetAction = (BottomSheetAction) C42745f0.K(1, list)) == null) ? null : bottomSheetAction.getTitle(), new p(this), new q(this), 0, null, 192, null));
            return;
        }
        if (!(dVar instanceof aD0.c) || (fVar = this.f299135b0) == null) {
            return;
        }
        QC0.a aVar = fVar.f19982a;
        int i12 = aVar.f13599c.f19976f;
        Map<ZC0.a, List<com.avito.conveyor_item.a>> map = aVar.f13598b;
        Iterator<T> it = map.keySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = ((ZC0.a) it.next()).f19976f;
        while (it.hasNext()) {
            int i14 = ((ZC0.a) it.next()).f19976f;
            if (i13 < i14) {
                i13 = i14;
            }
        }
        if (i12 != i13) {
            for (ZC0.a aVar2 : map.keySet()) {
                int i15 = i12 + 1;
                if (aVar2.f19976f == i15) {
                    aVar.f13599c = aVar2;
                    fVar.f19984c.f19981c = i15;
                    ke(fVar);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f299122O.dispose();
        this.f299123P.dispose();
        this.f299125R.dispose();
    }

    @Override // com.avito.android.tariff_lf.edit_info.viewmodel.k
    @Y61.k
    /* renamed from: w4, reason: from getter */
    public final C23038g0 getF299143j0() {
        return this.f299143j0;
    }
}
