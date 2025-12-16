package com.avito.android.bundles.vas_union.viewmodel;

import Ek.C13495a;
import Ek.C13496b;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.A1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VasUnionViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/vas_union/viewmodel/a;", "Landroidx/lifecycle/M0;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f108699E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bundles.vas_union.a f108700J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bundles.vas_union.repository.a f108701K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f108702L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f108703M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final AK0.l f108704N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C23038g0<w> f108705O;

    /* renamed from: P, reason: collision with root package name */
    public C13496b f108706P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f108707Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f108708R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f108709S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f108710T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f108711U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f108712V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f108713W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public com.avito.android.bundles.vas_union.item.tabs.f f108714X;

    /* compiled from: VasUnionViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bundles.vas_union.viewmodel.a$a, reason: collision with other inner class name */
    public static final class C3253a extends N implements Y41.a<List<? extends com.avito.conveyor_item.a>> {
        public C3253a() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends com.avito.conveyor_item.a> invoke() {
            a aVar = a.this;
            C13496b c13496b = aVar.f108706P;
            if (c13496b == null) {
                c13496b = null;
            }
            if (!(c13496b.f4210b.f108668b.size() >= 2)) {
                C13496b c13496b2 = aVar.f108706P;
                return Collections.singletonList((c13496b2 != null ? c13496b2 : null).f4209a);
            }
            C13496b c13496b3 = aVar.f108706P;
            if (c13496b3 == null) {
                c13496b3 = null;
            }
            List listSingletonList = Collections.singletonList(c13496b3.f4209a);
            C13496b c13496b4 = aVar.f108706P;
            return C42745f0.h0(Collections.singletonList((c13496b4 != null ? c13496b4 : null).f4210b), listSingletonList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.k AK0.l lVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.bundles.vas_union.a aVar, @Y61.k com.avito.android.bundles.vas_union.repository.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k String str) {
        this.f108699E = str;
        this.f108700J = aVar;
        this.f108701K = aVar2;
        this.f108702L = interfaceC35745a5;
        this.f108703M = screenPerformanceTracker;
        this.f108704N = lVar;
        C23038g0<w> c23038g0 = new C23038g0<>();
        c23038g0.setValue(new w(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        this.f108705O = c23038g0;
        this.f108707Q = C42727D.c(new C3253a());
        this.f108708R = new D<>();
        this.f108709S = new D<>();
        this.f108710T = new D<>();
        this.f108711U = new C23038g0<>();
        this.f108712V = new io.reactivex.rxjava3.disposables.c();
        this.f108713W = new io.reactivex.rxjava3.disposables.c();
        le();
    }

    public static ArrayList ke(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if (!(aVar instanceof com.avito.android.bundles.vas_union.item.performance.vas.c) || L.f(((com.avito.android.bundles.vas_union.item.performance.vas.c) aVar).f108649h, str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(@Y61.k Set<TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f108713W;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.bundles.vas_union.item.tabs.f) {
                com.avito.android.bundles.vas_union.item.tabs.f fVar = (com.avito.android.bundles.vas_union.item.tabs.f) dVar;
                this.f108714X = fVar;
                com.jakewharton.rxrelay3.c f108679d = fVar.getF108679d();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                f108679d.getClass();
                A1 a1C0 = f108679d.C0(300L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b);
                l lVar = new l(this);
                final V2 v22 = V2.f318762a;
                cVar.b(a1C0.v0(lVar, new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.m
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v22.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else {
                boolean z12 = dVar instanceof com.avito.android.bundles.vas_union.item.performance.info_action.d;
                InterfaceC35745a5 interfaceC35745a5 = this.f108702L;
                if (z12) {
                    z<DeepLink> zVarK = ((K) dVar).k();
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    zVarK.getClass();
                    I0 i0J0 = zVarK.C0(300L, timeUnit2, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                    final D<DeepLink> d12 = this.f108710T;
                    l41.g gVar = new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.h
                        @Override // l41.g
                        public final void accept(Object obj) {
                            d12.setValue((DeepLink) obj);
                        }
                    };
                    final V2 v23 = V2.f318762a;
                    cVar.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.i
                        @Override // l41.g
                        public final void accept(Object obj) {
                            v23.f((Throwable) obj);
                        }
                    }, io.reactivex.rxjava3.internal.functions.a.f401993c));
                } else if (dVar instanceof com.avito.android.bundles.vas_union.item.performance.tabs.d) {
                    io.reactivex.rxjava3.subjects.e f108632c = ((com.avito.android.bundles.vas_union.item.performance.tabs.d) dVar).getF108632c();
                    TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                    f108632c.getClass();
                    A1 a1C02 = f108632c.C0(300L, timeUnit3, io.reactivex.rxjava3.schedulers.b.f404942b);
                    p pVar = new p(this);
                    final V2 v24 = V2.f318762a;
                    cVar.b(a1C02.v0(pVar, new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.q
                        @Override // l41.g
                        public final void accept(Object obj) {
                            v24.f((Throwable) obj);
                        }
                    }, io.reactivex.rxjava3.internal.functions.a.f401993c));
                } else {
                    boolean z13 = dVar instanceof com.avito.android.bundles.vas_union.item.performance.vas.d;
                    final D<DeepLink> d13 = this.f108708R;
                    if (z13) {
                        z<DeepLink> zVarK2 = ((K) dVar).k();
                        TimeUnit timeUnit4 = TimeUnit.MILLISECONDS;
                        zVarK2.getClass();
                        I0 i0J02 = zVarK2.C0(300L, timeUnit4, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                        l41.g gVar2 = new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.n
                            @Override // l41.g
                            public final void accept(Object obj) {
                                d13.setValue((DeepLink) obj);
                            }
                        };
                        final V2 v25 = V2.f318762a;
                        cVar.b(i0J02.v0(gVar2, new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.o
                            @Override // l41.g
                            public final void accept(Object obj) {
                                v25.f((Throwable) obj);
                            }
                        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
                    } else if (dVar instanceof com.avito.android.bundles.ui.recycler.item.bundle.d) {
                        z<DeepLink> zVarK3 = ((K) dVar).k();
                        TimeUnit timeUnit5 = TimeUnit.MILLISECONDS;
                        zVarK3.getClass();
                        I0 i0J03 = zVarK3.C0(300L, timeUnit5, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                        l41.g gVar3 = new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.f
                            @Override // l41.g
                            public final void accept(Object obj) {
                                d13.setValue((DeepLink) obj);
                            }
                        };
                        final V2 v26 = V2.f318762a;
                        cVar.b(i0J03.v0(gVar3, new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.g
                            @Override // l41.g
                            public final void accept(Object obj) {
                                v26.f((Throwable) obj);
                            }
                        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
                    } else if (dVar instanceof com.avito.android.bundles.ui.recycler.item.skip_button.d) {
                        z<DeepLink> zVarK4 = ((K) dVar).k();
                        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
                        zVarK4.getClass();
                        I0 i0J04 = zVarK4.C0(300L, timeUnit6, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                        final D<DeepLink> d14 = this.f108709S;
                        l41.g gVar4 = new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.r
                            @Override // l41.g
                            public final void accept(Object obj) {
                                d14.setValue((DeepLink) obj);
                            }
                        };
                        final V2 v27 = V2.f318762a;
                        cVar.b(i0J04.v0(gVar4, new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.s
                            @Override // l41.g
                            public final void accept(Object obj) {
                                v27.f((Throwable) obj);
                            }
                        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
                    } else if (dVar instanceof com.avito.android.bundles.ui.recycler.item.benefit.b) {
                        z<DeepLink> zVarK5 = ((K) dVar).k();
                        TimeUnit timeUnit7 = TimeUnit.MILLISECONDS;
                        zVarK5.getClass();
                        I0 i0J05 = zVarK5.C0(300L, timeUnit7, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                        l41.g gVar5 = new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.d
                            @Override // l41.g
                            public final void accept(Object obj) {
                                d13.setValue((DeepLink) obj);
                            }
                        };
                        final V2 v28 = V2.f318762a;
                        cVar.b(i0J05.v0(gVar5, new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.e
                            @Override // l41.g
                            public final void accept(Object obj) {
                                v28.f((Throwable) obj);
                            }
                        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
                    } else if (dVar instanceof com.avito.android.bundles.vas_union.item.lightning_block.d) {
                        z<DeepLink> zVarK6 = ((K) dVar).k();
                        TimeUnit timeUnit8 = TimeUnit.MILLISECONDS;
                        zVarK6.getClass();
                        I0 i0J06 = zVarK6.C0(300L, timeUnit8, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                        l41.g gVar6 = new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.j
                            @Override // l41.g
                            public final void accept(Object obj) {
                                d13.setValue((DeepLink) obj);
                            }
                        };
                        final V2 v29 = V2.f318762a;
                        cVar.b(i0J06.v0(gVar6, new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.k
                            @Override // l41.g
                            public final void accept(Object obj) {
                                v29.f((Throwable) obj);
                            }
                        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
                    } else if (dVar instanceof com.avito.android.bundles.vas_union.item.additional_info_block.d) {
                        z<DeepLink> zVarK7 = ((K) dVar).k();
                        TimeUnit timeUnit9 = TimeUnit.MILLISECONDS;
                        zVarK7.getClass();
                        I0 i0J07 = zVarK7.C0(300L, timeUnit9, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                        l41.g gVar7 = new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.b
                            @Override // l41.g
                            public final void accept(Object obj) {
                                d13.setValue((DeepLink) obj);
                            }
                        };
                        final V2 v210 = V2.f318762a;
                        cVar.b(i0J07.v0(gVar7, new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.c
                            @Override // l41.g
                            public final void accept(Object obj) {
                                v210.f((Throwable) obj);
                            }
                        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
                    }
                }
            }
        }
    }

    public final void le() {
        ScreenPerformanceTracker.a.b(this.f108703M, null, 3);
        I0 i0J0 = this.f108701K.a(this.f108699E).j0(this.f108702L.e());
        l41.g gVar = new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.a.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l41.g
            public final void accept(Object obj) {
                P2 p22 = (P2) obj;
                a aVar = a.this;
                aVar.getClass();
                boolean z12 = p22 instanceof P2.b;
                C23038g0<w> c23038g0 = aVar.f108705O;
                DeepLink deepLink = null;
                ScreenPerformanceTracker screenPerformanceTracker = aVar.f108703M;
                ScreenPerformanceTracker screenPerformanceTracker2 = aVar.f108703M;
                if (!z12) {
                    if (!(p22 instanceof P2.a)) {
                        if (c23038g0.getValue() != null) {
                            c23038g0.postValue(new w(p22, C42784z0.f406748b));
                            G0 g02 = G0.f406611a;
                            return;
                        }
                        return;
                    }
                    ApiError apiError = ((P2.a) p22).f318719a;
                    ScreenPerformanceTracker.a.d(aVar.f108703M, null, null, new J.a(apiError), null, 11);
                    screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
                    if (c23038g0.getValue() != null) {
                        c23038g0.postValue(new w(p22, C42784z0.f406748b));
                    }
                    ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(apiError), null, 5);
                    G0 g03 = G0.f406611a;
                    return;
                }
                ScreenPerformanceTracker.a.d(screenPerformanceTracker2, null, null, null, null, 15);
                screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
                Dk.j jVar = (Dk.j) ((P2.b) p22).f318720a;
                C13496b c13496bA = aVar.f108700J.a(jVar);
                aVar.f108706P = c13496bA;
                com.avito.android.bundles.vas_union.item.tabs.b bVar = c13496bA.f4211c;
                List<com.avito.conveyor_item.a> list = bVar.f108666a.get(bVar.f108667b);
                if (list == null) {
                    list = C42784z0.f406748b;
                }
                ArrayList arrayListKe = a.ke(c13496bA.f4210b.f108670d, list);
                if (c23038g0.getValue() != null) {
                    c23038g0.postValue(new w(p22, C42745f0.h0(arrayListKe, (List) aVar.f108707Q.getValue())));
                }
                aVar.me();
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
                Iterator<T> it = jVar.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DL0.b performanceVas = ((Dk.k) it.next()).getItem().getPerformanceVas();
                    if (performanceVas != null) {
                        AL0.b lightning = performanceVas.getLightning();
                        if (lightning != null) {
                            AK0.l lVar = aVar.f108704N;
                            if (!lVar.c("vas_lighting_bottom_sheet_showed")) {
                                for (Attribute attribute : lightning.getDescription().getAttributes()) {
                                    if ((attribute instanceof DeepLinkAttribute) && L.f(attribute.getName(), "action")) {
                                        deepLink = ((DeepLinkAttribute) attribute).getDeepLink();
                                    }
                                }
                                if (deepLink != null) {
                                    aVar.f108708R.postValue(deepLink);
                                    lVar.putBoolean("vas_lighting_bottom_sheet_showed", true);
                                }
                            }
                        }
                    }
                }
                G0 g04 = G0.f406611a;
            }
        };
        final V2 v22 = V2.f318762a;
        this.f108712V.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.bundles.vas_union.viewmodel.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void me() {
        C13496b c13496b = this.f108706P;
        C13495a c13495a = (c13496b == null ? null : c13496b).f4212d;
        if (c13495a != null) {
            if (c13496b == null) {
                c13496b = null;
            }
            boolean zF2 = L.f(c13496b.f4211c.f108667b.getF413506f(), c13495a.f4207a);
            C23038g0<String> c23038g0 = this.f108711U;
            if (zF2) {
                c23038g0.postValue(c13495a.f4208b.getTitle());
            } else {
                c23038g0.postValue("");
            }
        }
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f108713W.dispose();
        this.f108712V.dispose();
        super.onCleared();
    }
}
