package com.avito.android.universal_map.map.pin_filters;

import Vi.C15684a;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import com.avito.android.universal_map.map.pin_filters.g;
import com.avito.android.universal_map.map.pin_filters.j;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import dj.InterfaceC39736a;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.kotlin.K0;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import lj.InterfaceC43779a;
import oG0.InterfaceC44637a;
import uG0.C48896b;

/* compiled from: UniversalMapPinFiltersViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/o;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/universal_map/map/pin_filters/j;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o extends M0 implements j {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.pin_filters.a f305770E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f305771J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44637a f305772K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39737b f305773L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final String f305774M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f305775N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f305776O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.tracker.c f305777P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f305778Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public y f305779R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f305780S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f305781T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f305782U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public List<? extends BeduinAction> f305783V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final D<j.a> f305784W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C23038g0<g.a> f305785X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23038g0<j.b> f305786Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f305787Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.l
    public Map<String, ? extends Object> f305788a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final String f305789b0;

    /* compiled from: UniversalMapPinFiltersViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LuG0/b;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.c;
            o oVar = o.this;
            if (z12) {
                oVar.getClass();
                oVar.f305785X.setValue(g.a.e.f305726a);
                return;
            }
            if (!(p22 instanceof P2.b)) {
                if (p22 instanceof P2.a) {
                    com.avito.android.universal_map.map.tracker.c cVar = oVar.f305777P;
                    ApiError apiError = ((P2.a) p22).f318719a;
                    ScreenPerformanceTracker.a.d(cVar, oVar.f305789b0, null, new J.a(apiError), null, 10);
                    com.avito.android.universal_map.map.tracker.c cVar2 = oVar.f305777P;
                    String str = oVar.f305789b0;
                    cVar2.m(str);
                    oVar.f305785X.setValue(new g.a.c(apiError));
                    ScreenPerformanceTracker.a.c(cVar2, str, new J.a(apiError), null, 4);
                    return;
                }
                return;
            }
            ScreenPerformanceTracker.a.d(oVar.f305777P, oVar.f305789b0, null, null, null, 14);
            C48896b c48896b = (C48896b) ((P2.b) p22).f318720a;
            com.avito.android.universal_map.map.tracker.c cVar3 = oVar.f305777P;
            String str2 = oVar.f305789b0;
            cVar3.m(str2);
            oVar.f305783V = c48896b.e();
            List<BeduinModel> listF = c48896b.f();
            if (listF == null) {
                listF = C42784z0.f406748b;
            }
            String topFormId = c48896b.getTopFormId();
            if (topFormId == null) {
                topFormId = "top";
            }
            com.avito.android.beduin_shared.model.utils.j.b(oVar.f305780S, topFormId, listF);
            List<BeduinModel> listC = c48896b.c();
            if (listC == null) {
                listC = C42784z0.f406748b;
            }
            String mainFormId = c48896b.getMainFormId();
            if (mainFormId == null) {
                mainFormId = "main";
            }
            com.avito.android.beduin_shared.model.utils.j.b(oVar.f305781T, mainFormId, listC);
            List<BeduinModel> listA = c48896b.a();
            if (listA == null) {
                listA = C42784z0.f406748b;
            }
            String bottomFormId = c48896b.getBottomFormId();
            if (bottomFormId == null) {
                bottomFormId = "bottom";
            }
            com.avito.android.beduin_shared.model.utils.j.b(oVar.f305782U, bottomFormId, listA);
            oVar.f305785X.setValue(g.a.d.f305725a);
            ScreenPerformanceTracker.a.c(cVar3, str2, null, null, 6);
        }
    }

    /* compiled from: UniversalMapPinFiltersViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            o oVar = o.this;
            ScreenPerformanceTracker.a.d(oVar.f305777P, oVar.f305789b0, null, new J.a(th2), null, 10);
            com.avito.android.universal_map.map.tracker.c cVar = oVar.f305777P;
            String str = oVar.f305789b0;
            cVar.m(str);
            V2.f318762a.f(th2);
            oVar.f305784W.setValue(new j.a(oVar.f305772K.getF419643a(), th2));
            ScreenPerformanceTracker.a.c(cVar, str, new J.a(th2), null, 4);
        }
    }

    @Inject
    public o(@Y61.k com.avito.android.universal_map.map.pin_filters.a aVar, @Y61.k C15684a c15684a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC44637a interfaceC44637a, @Y61.k InterfaceC39737b interfaceC39737b, @Y61.l String str, @Y61.l Map<String, ? extends Object> map, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.universal_map.map.tracker.c cVar) {
        this.f305770E = aVar;
        this.f305771J = interfaceC35745a5;
        this.f305772K = interfaceC44637a;
        this.f305773L = interfaceC39737b;
        this.f305774M = str;
        this.f305775N = map;
        this.f305776O = interfaceC40691b;
        this.f305777P = cVar;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f305778Q = cVar2;
        InterfaceC43779a interfaceC43779aJ = interfaceC40691b.j();
        this.f305780S = interfaceC43779aJ;
        InterfaceC43779a interfaceC43779aJ2 = interfaceC40691b.j();
        this.f305781T = interfaceC43779aJ2;
        InterfaceC43779a interfaceC43779aJ3 = interfaceC40691b.j();
        this.f305782U = interfaceC43779aJ3;
        this.f305784W = new D<>();
        this.f305785X = new C23038g0<>();
        C23038g0<j.b> c23038g0 = new C23038g0<>();
        this.f305786Y = c23038g0;
        this.f305787Z = c23038g0;
        this.f305789b0 = "filters-info";
        T2(false);
        K0 k02 = K0.f404849a;
        C41981q0 f103348p = interfaceC43779aJ.getF103348p();
        C41981q0 f103348p2 = interfaceC43779aJ2.getF103348p();
        C41981q0 f103348p3 = interfaceC43779aJ3.getF103348p();
        k02.getClass();
        cVar2.b(K0.a(f103348p, f103348p2, f103348p3).j0(interfaceC35745a5.e()).t0(new n(this)));
        cVar2.b(c15684a.f17364b.t0(new m(this)));
    }

    @Override // com.avito.android.universal_map.map.pin_filters.j
    public final void H1(@Y61.l Map<String, ? extends Object> map) {
        this.f305788a0 = map;
    }

    @Override // com.avito.android.universal_map.map.pin_filters.j
    public final void O2() {
        String str = this.f305774M;
        if (str == null) {
            return;
        }
        y yVar = this.f305779R;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        ScreenPerformanceTracker.a.b(this.f305777P, this.f305789b0, 2);
        Map<String, ? extends Object> map = this.f305788a0;
        j.b value = this.f305786Y.getValue();
        this.f305779R = (y) this.f305770E.a(str, map, this.f305775N, value != null ? value.f305749b : null).j0(this.f305771J.e()).v0(new a(), new b(), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.universal_map.map.pin_filters.j
    @Y61.k
    /* renamed from: S7, reason: from getter */
    public final C23038g0 getF305787Z() {
        return this.f305787Z;
    }

    @Override // com.avito.android.universal_map.map.pin_filters.j
    public final void T2(boolean z12) {
        this.f305785X.setValue(new g.a.C9391a(z12));
    }

    @Override // com.avito.android.universal_map.map.pin_filters.j
    public final void X() {
        O2();
    }

    @Override // com.avito.android.universal_map.map.pin_filters.j
    /* renamed from: a0, reason: from getter */
    public final D getF305784W() {
        return this.f305784W;
    }

    @Override // com.avito.android.universal_map.map.pin_filters.j
    /* renamed from: ae, reason: from getter */
    public final C23038g0 getF305785X() {
        return this.f305785X;
    }

    @Override // com.avito.android.universal_map.map.pin_filters.j
    @Y61.k
    public final InterfaceC39736a h1() {
        return this.f305773L.F();
    }

    @Override // com.avito.android.universal_map.map.pin_filters.j
    public final void kd(@Y61.l j.b bVar) {
        this.f305786Y.setValue(bVar);
        T2(false);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f305778Q.dispose();
        y yVar = this.f305779R;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f305776O.onCleared();
    }

    @Override // com.avito.android.universal_map.map.pin_filters.j
    public final void u2() {
        com.avito.android.beduin_shared.model.utils.a.a(this.f305776O, this.f305783V);
    }
}
