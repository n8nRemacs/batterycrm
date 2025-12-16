package com.avito.android.tariff_lf_constructor.configure.locations.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import oD0.C44628b;
import qD0.C47283a;

/* compiled from: ConstructorConfigureLocationsViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/viewmodel/r;", "Lcom/avito/android/tariff_lf_constructor/configure/locations/viewmodel/i;", "Landroidx/lifecycle/M0;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r extends M0 implements i {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f299986E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f299987J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.e f299988K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.a f299989L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.a f299990M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l f299991N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.checkbox_selector.e f299992O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299993P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f299994Q;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public ArrayList f300006c0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f300008e0;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public AtomicReference f299995R = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f299996S = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f299997T = new C23038g0<>();

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final D<String> f299998U = new D<>();

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C44628b> f299999V = new C23038g0<>();

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f300000W = new C23038g0<>();

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f300001X = new C23038g0<>();

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f300002Y = new C23038g0<>();

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C47283a> f300003Z = new C23038g0<>();

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final D<Boolean> f300004a0 = new D<>();

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f300005b0 = new D<>();

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f300007d0 = new LinkedHashMap();

    /* compiled from: ConstructorConfigureLocationsViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Object next;
            List<? extends com.avito.conveyor_item.a> listC;
            String str = (String) obj;
            r rVar = r.this;
            ArrayList arrayList = rVar.f300006c0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (L.f(((com.avito.conveyor_item.a) next).getF248601b(), str)) {
                            break;
                        }
                    }
                }
                com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) next;
                if (aVar == null) {
                    return;
                }
                boolean z12 = aVar instanceof d.a;
                com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l lVar = rVar.f299991N;
                if (z12) {
                    listC = lVar.e((d.a) aVar);
                } else if (aVar instanceof d.b) {
                    listC = lVar.c((d.b) aVar);
                } else {
                    listC = rVar.f300006c0;
                    if (listC == null) {
                        listC = C42784z0.f406748b;
                    }
                }
                rVar.ke(listC);
            }
        }
    }

    /* compiled from: ConstructorConfigureLocationsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;", "groupItem", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            r rVar = r.this;
            rVar.ke(rVar.f299991N.b((d.a) obj));
        }
    }

    /* compiled from: ConstructorConfigureLocationsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f300011b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe group item icon clicks", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorConfigureLocationsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;", "groupItem", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            r rVar = r.this;
            rVar.ke(rVar.f299991N.e((d.a) obj));
        }
    }

    /* compiled from: ConstructorConfigureLocationsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T> f300013b = new e<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe group item clicks", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorConfigureLocationsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$b;", "singleItem", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            r rVar = r.this;
            rVar.ke(rVar.f299991N.c((d.b) obj));
        }
    }

    /* compiled from: ConstructorConfigureLocationsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f300015b = new g<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe group item clicks", (Throwable) obj);
        }
    }

    /* compiled from: ConstructorConfigureLocationsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ArrayList f300017m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ArrayList arrayList) {
            super(0);
            this.f300017m = arrayList;
        }

        @Override // Y41.a
        public final G0 invoke() {
            r.this.ke(this.f300017m);
            return G0.f406611a;
        }
    }

    public r(@Y61.k String str, @Y61.k String str2, @Y61.k com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.e eVar, @Y61.k com.avito.android.tariff_lf_constructor.configure.a aVar, @Y61.k com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.a aVar2, @Y61.k com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l lVar, @Y61.k com.avito.android.tariff_lf_constructor.configure.checkbox_selector.e eVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f299986E = str;
        this.f299987J = str2;
        this.f299988K = eVar;
        this.f299989L = aVar;
        this.f299990M = aVar2;
        this.f299991N = lVar;
        this.f299992O = eVar2;
        this.f299993P = interfaceC35745a5;
        this.f299994Q = screenPerformanceTracker;
        le();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    /* renamed from: F1, reason: from getter */
    public final C23038g0 getF300001X() {
        return this.f300001X;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    /* renamed from: L, reason: from getter */
    public final D getF299998U() {
        return this.f299998U;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    /* renamed from: M, reason: from getter */
    public final C23038g0 getF300000W() {
        return this.f300000W;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    /* renamed from: N, reason: from getter */
    public final C23038g0 getF300003Z() {
        return this.f300003Z;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    /* renamed from: R, reason: from getter */
    public final D getF300004a0() {
        return this.f300004a0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f299996S;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z12 = dVar instanceof com.avito.android.tariff_lf_constructor.configure.locations.items.badges.c;
            InterfaceC35745a5 interfaceC35745a5 = this.f299993P;
            if (z12) {
                cVar.b(((com.avito.android.tariff_lf_constructor.configure.locations.items.badges.c) dVar).getF299934c().j0(interfaceC35745a5.e()).t0(new a()));
            } else if (dVar instanceof com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.c) {
                com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.c cVar2 = (com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.c) dVar;
                I0 i0J0 = cVar2.getF299518e().j0(interfaceC35745a5.e());
                b bVar = new b();
                l41.g<? super Throwable> gVar = c.f300011b;
                InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                cVar.b(i0J0.v0(bVar, gVar, interfaceC43543a));
                cVar.b(cVar2.getF299519f().j0(interfaceC35745a5.e()).v0(new d(), e.f300013b, interfaceC43543a));
            } else if (dVar instanceof com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.c) {
                cVar.b(((com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.c) dVar).d().j0(interfaceC35745a5.e()).v0(new f(), g.f300015b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF299997T() {
        return this.f299997T;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    public final void h0() {
        le();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    public final void i(boolean z12) {
        this.f300008e0 = z12;
        ArrayList arrayList = this.f300006c0;
        if (arrayList != null) {
            ke(arrayList);
        }
        if (this.f300007d0.isEmpty()) {
            return;
        }
        this.f300001X.setValue(Boolean.valueOf(!z12));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    @Y61.k
    public final D<DeepLink> k0() {
        return this.f300005b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ke(java.util.List<? extends com.avito.conveyor_item.a> r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.r.ke(java.util.List):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void le() {
        ScreenPerformanceTracker.a.b(this.f299994Q, null, 3);
        this.f299995R.dispose();
        this.f299995R = (AtomicReference) this.f299988K.a(this.f299986E, this.f299987J).r0(P2.c.f318721a).K(new l(this)).N(m.f299981b).d0(n.f299982b).d0(new o(this)).j0(this.f299993P.e()).v0(new p(this), new q(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f299996S.dispose();
        this.f299995R.dispose();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    /* renamed from: q0, reason: from getter */
    public final C23038g0 getF300002Y() {
        return this.f300002Y;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    public final void r0() {
        ScreenPerformanceTracker.a.b(this.f299994Q, null, 3);
        this.f299995R.dispose();
        this.f299995R = (AtomicReference) this.f299989L.a(this.f299986E, this.f299987J, (52 & 4) != 0 ? null : this.f300007d0.keySet(), (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null).j0(this.f299993P.e()).v0(new s(this), new t(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    public final void t(@Y61.k String str) {
        ArrayList arrayList = this.f300006c0;
        if (arrayList == null) {
            return;
        }
        this.f299992O.a(arrayList, str, new h(arrayList));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.locations.viewmodel.i
    /* renamed from: u0, reason: from getter */
    public final C23038g0 getF299999V() {
        return this.f299999V;
    }
}
