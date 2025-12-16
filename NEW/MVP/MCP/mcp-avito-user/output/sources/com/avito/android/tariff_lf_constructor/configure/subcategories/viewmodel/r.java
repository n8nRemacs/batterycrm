package com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import qD0.C47283a;

/* compiled from: ConstructorConfigureSubCategoriesViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/subcategories/viewmodel/r;", "Lcom/avito/android/tariff_lf_constructor/configure/subcategories/viewmodel/h;", "Landroidx/lifecycle/M0;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r extends M0 implements h {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f300515E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f300516J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final String f300517K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.d f300518L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.a f300519M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.a f300520N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l f300521O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f300522P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f300523Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public AtomicReference f300524R = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f300525S = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f300526T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final D<String> f300527U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<ED0.b> f300528V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f300529W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f300530X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f300531Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f300532Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f300533a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final D<String> f300534b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<ED0.b> f300535c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f300536d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f300537e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f300538f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final D<Boolean> f300539g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C47283a> f300540h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f300541i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.conveyor_item.a> f300542j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f300543k0;

    /* compiled from: ConstructorConfigureSubCategoriesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;", "groupItem", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            r rVar = r.this;
            r.ke(rVar, rVar.f300521O.b((d.a) obj));
        }
    }

    /* compiled from: ConstructorConfigureSubCategoriesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f300545b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe group item icon clicks", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorConfigureSubCategoriesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;", "groupItem", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            r rVar = r.this;
            r.ke(rVar, rVar.f300521O.e((d.a) obj));
        }
    }

    /* compiled from: ConstructorConfigureSubCategoriesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f300547b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe group item clicks", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorConfigureSubCategoriesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$b;", "singleItem", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            r rVar = r.this;
            r.ke(rVar, rVar.f300521O.c((d.b) obj));
        }
    }

    /* compiled from: ConstructorConfigureSubCategoriesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f300549b = new f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe group item clicks", (Throwable) obj);
        }
    }

    public r(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.d dVar, @Y61.k com.avito.android.tariff_lf_constructor.configure.a aVar, @Y61.k com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.a aVar2, @Y61.k com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l lVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f300515E = str;
        this.f300516J = str2;
        this.f300517K = str3;
        this.f300518L = dVar;
        this.f300519M = aVar;
        this.f300520N = aVar2;
        this.f300521O = lVar;
        this.f300522P = interfaceC35745a5;
        this.f300523Q = screenPerformanceTracker;
        C23038g0<P2<?>> c23038g0 = new C23038g0<>();
        this.f300526T = c23038g0;
        D<String> d12 = new D<>();
        this.f300527U = d12;
        C23038g0<ED0.b> c23038g02 = new C23038g0<>();
        this.f300528V = c23038g02;
        C23038g0<String> c23038g03 = new C23038g0<>();
        this.f300529W = c23038g03;
        C23038g0<Boolean> c23038g04 = new C23038g0<>();
        this.f300530X = c23038g04;
        C23038g0<List<com.avito.conveyor_item.a>> c23038g05 = new C23038g0<>();
        this.f300531Y = c23038g05;
        D<Boolean> d13 = new D<>();
        C23038g0<C47283a> c23038g06 = new C23038g0<>();
        D<DeepLink> d14 = new D<>();
        this.f300532Z = d14;
        this.f300533a0 = c23038g0;
        this.f300534b0 = d12;
        this.f300535c0 = c23038g02;
        this.f300536d0 = c23038g03;
        this.f300537e0 = c23038g04;
        this.f300538f0 = c23038g05;
        this.f300539g0 = d13;
        this.f300540h0 = c23038g06;
        this.f300541i0 = d14;
        this.f300542j0 = C42784z0.f406748b;
        this.f300543k0 = new LinkedHashSet();
        me();
    }

    public static final void ke(r rVar, List list) {
        rVar.f300542j0 = list;
        ScreenPerformanceTracker screenPerformanceTracker = rVar.f300523Q;
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        rVar.f300531Y.setValue(list);
        List<? extends com.avito.conveyor_item.a> list2 = rVar.f300542j0;
        rVar.f300543k0.clear();
        rVar.le(new ArrayList(list2));
        rVar.f300530X.setValue(Boolean.valueOf(!r1.isEmpty()));
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    /* renamed from: F1, reason: from getter */
    public final C23038g0 getF300537e0() {
        return this.f300537e0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    /* renamed from: L, reason: from getter */
    public final D getF300534b0() {
        return this.f300534b0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    /* renamed from: M, reason: from getter */
    public final C23038g0 getF300538f0() {
        return this.f300538f0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    /* renamed from: N, reason: from getter */
    public final C23038g0 getF300540h0() {
        return this.f300540h0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    /* renamed from: R, reason: from getter */
    public final D getF300539g0() {
        return this.f300539g0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f300525S;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z12 = dVar instanceof com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.c;
            InterfaceC35745a5 interfaceC35745a5 = this.f300522P;
            if (z12) {
                com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.c cVar2 = (com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.c) dVar;
                I0 i0J0 = cVar2.getF299518e().j0(interfaceC35745a5.e());
                a aVar = new a();
                l41.g<? super Throwable> gVar = b.f300545b;
                InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                cVar.b(i0J0.v0(aVar, gVar, interfaceC43543a));
                cVar.b(cVar2.getF299519f().j0(interfaceC35745a5.e()).v0(new c(), d.f300547b, interfaceC43543a));
            } else if (dVar instanceof com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.c) {
                cVar.b(((com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.c) dVar).d().j0(interfaceC35745a5.e()).v0(new e(), f.f300549b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF300533a0() {
        return this.f300533a0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    public final void h0() {
        me();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    @Y61.k
    public final D<DeepLink> k0() {
        return this.f300541i0;
    }

    public final void le(List<com.avito.conveyor_item.a> list) {
        List<com.avito.conveyor_item.a> list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d dVar = (com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d) it.next();
            if (dVar.getF299461c() == State.f181147b) {
                this.f300543k0.add(dVar.getF281670b());
            }
            if ((dVar instanceof d.a) && (list2 = ((d.a) dVar).f299473o) != null) {
                le(list2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void me() {
        ScreenPerformanceTracker.a.b(this.f300523Q, null, 3);
        this.f300524R.dispose();
        this.f300524R = (AtomicReference) this.f300518L.a(this.f300515E, this.f300516J, this.f300517K).r0(P2.c.f318721a).K(new k(this)).N(l.f300509b).d0(m.f300510b).d0(new n(this)).d0(new o(this)).j0(this.f300522P.e()).v0(new p(this), new q(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f300525S.dispose();
        this.f300524R.dispose();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    /* renamed from: q0, reason: from getter */
    public final C23038g0 getF300536d0() {
        return this.f300536d0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    public final void r0() {
        ScreenPerformanceTracker.a.b(this.f300523Q, null, 3);
        this.f300524R.dispose();
        this.f300524R = (AtomicReference) this.f300519M.a(this.f300515E, this.f300516J, (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : this.f300543k0, (52 & 32) != 0 ? null : null).j0(this.f300522P.e()).v0(new s(this), new t(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel.h
    /* renamed from: u0, reason: from getter */
    public final C23038g0 getF300535c0() {
        return this.f300535c0;
    }
}
