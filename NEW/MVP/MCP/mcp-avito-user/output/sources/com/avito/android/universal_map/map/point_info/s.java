package com.avito.android.universal_map.map.point_info;

import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Overlay;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.map.point_info.g;
import com.avito.android.universal_map.map.point_info.n;
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
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;
import oG0.InterfaceC44637a;
import uG0.C48897c;

/* compiled from: UniversalMapPointInfoViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/s;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/universal_map/map/point_info/n;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s extends M0 implements n {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.point_info.a f305875E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f305876J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44637a f305877K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f305878L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final String f305879M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f305880N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39737b f305881O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.tracker.c f305882P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f305883Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f305884R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f305885S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f305886T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public y f305887U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public Marker.Pin f305888V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public Map<String, ? extends Object> f305889W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public Overlay f305890X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final D<n.a> f305891Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0<g.a> f305892Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Marker.Pin.IconType> f305893a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final String f305894b0;

    /* compiled from: UniversalMapPointInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LuG0/c;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.c;
            s sVar = s.this;
            if (z12) {
                sVar.getClass();
                sVar.f305892Z.setValue(new g.a.C9392a(null, P2.c.f318721a, 1, null));
                return;
            }
            if (!(p22 instanceof P2.b)) {
                if (p22 instanceof P2.a) {
                    com.avito.android.universal_map.map.tracker.c cVar = sVar.f305882P;
                    ApiError apiError = ((P2.a) p22).f318719a;
                    ScreenPerformanceTracker.a.d(cVar, sVar.f305894b0, null, new J.a(apiError), null, 10);
                    com.avito.android.universal_map.map.tracker.c cVar2 = sVar.f305882P;
                    String str = sVar.f305894b0;
                    cVar2.m(str);
                    sVar.f305892Z.setValue(new g.a.C9392a(null, new P2.a(apiError), 1, null));
                    ScreenPerformanceTracker.a.c(cVar2, str, new J.a(apiError), null, 4);
                    return;
                }
                return;
            }
            ScreenPerformanceTracker.a.d(sVar.f305882P, sVar.f305894b0, null, null, null, 14);
            C48897c c48897c = (C48897c) ((P2.b) p22).f318720a;
            com.avito.android.universal_map.map.tracker.c cVar3 = sVar.f305882P;
            String str2 = sVar.f305894b0;
            cVar3.m(str2);
            List<BeduinModel> listE = c48897c.e();
            if (listE == null) {
                listE = C42784z0.f406748b;
            }
            String topFormId = c48897c.getTopFormId();
            if (topFormId == null) {
                topFormId = "top";
            }
            com.avito.android.beduin_shared.model.utils.j.b(sVar.f305884R, topFormId, listE);
            List<BeduinModel> listC = c48897c.c();
            if (listC == null) {
                listC = C42784z0.f406748b;
            }
            String mainFormId = c48897c.getMainFormId();
            if (mainFormId == null) {
                mainFormId = "main";
            }
            com.avito.android.beduin_shared.model.utils.j.b(sVar.f305885S, mainFormId, listC);
            List<BeduinModel> listA = c48897c.a();
            if (listA == null) {
                listA = C42784z0.f406748b;
            }
            String bottomFormId = c48897c.getBottomFormId();
            if (bottomFormId == null) {
                bottomFormId = "bottom";
            }
            com.avito.android.beduin_shared.model.utils.j.b(sVar.f305886T, bottomFormId, listA);
            ScreenPerformanceTracker.a.c(cVar3, str2, null, null, 6);
        }
    }

    /* compiled from: UniversalMapPointInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            s sVar = s.this;
            ScreenPerformanceTracker.a.d(sVar.f305882P, sVar.f305894b0, null, new J.a(th2), null, 10);
            V2.f318762a.f(th2);
            com.avito.android.universal_map.map.tracker.c cVar = sVar.f305882P;
            String str = sVar.f305894b0;
            cVar.m(str);
            sVar.f305891Y.setValue(new n.a(sVar.f305877K.getF419643a(), th2));
            ScreenPerformanceTracker.a.c(cVar, str, new J.a(th2), null, 4);
        }
    }

    public s(@Y61.k com.avito.android.universal_map.map.point_info.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC44637a interfaceC44637a, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k String str, @Y61.l Map<String, ? extends Object> map, @Y61.k InterfaceC39737b interfaceC39737b, @Y61.k com.avito.android.universal_map.map.tracker.c cVar, @Y61.k com.avito.android.map_core.beduin.action_handler.o oVar) {
        this.f305875E = aVar;
        this.f305876J = interfaceC35745a5;
        this.f305877K = interfaceC44637a;
        this.f305878L = interfaceC40691b;
        this.f305879M = str;
        this.f305880N = map;
        this.f305881O = interfaceC39737b;
        this.f305882P = cVar;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f305883Q = cVar2;
        InterfaceC43779a interfaceC43779aJ = interfaceC40691b.j();
        this.f305884R = interfaceC43779aJ;
        InterfaceC43779a interfaceC43779aJ2 = interfaceC40691b.j();
        this.f305885S = interfaceC43779aJ2;
        InterfaceC43779a interfaceC43779aJ3 = interfaceC40691b.j();
        this.f305886T = interfaceC43779aJ3;
        this.f305891Y = new D<>();
        this.f305892Z = new C23038g0<>();
        this.f305893a0 = new C23038g0<>(null);
        this.f305894b0 = "point-info";
        hide();
        K0 k02 = K0.f404849a;
        C41981q0 f103348p = interfaceC43779aJ.getF103348p();
        C41981q0 f103348p2 = interfaceC43779aJ2.getF103348p();
        C41981q0 f103348p3 = interfaceC43779aJ3.getF103348p();
        k02.getClass();
        cVar2.b(K0.a(f103348p, f103348p2, f103348p3).j0(interfaceC35745a5.e()).t0(new q(this)));
        cVar2.b(oVar.f185662b.j0(interfaceC35745a5.e()).t0(new r(this)));
    }

    @Override // com.avito.android.universal_map.map.point_info.n
    public final void H1(@Y61.l Map<String, ? extends Object> map) {
        this.f305889W = map;
    }

    @Override // com.avito.android.universal_map.map.point_info.n
    /* renamed from: I4, reason: from getter */
    public final C23038g0 getF305893a0() {
        return this.f305893a0;
    }

    @Override // com.avito.android.universal_map.map.point_info.n
    public final void Pd(@Y61.l Overlay overlay) {
        this.f305890X = overlay;
        if (this.f305892Z.getValue() instanceof g.a.b) {
            hide();
        }
    }

    @Override // com.avito.android.universal_map.map.point_info.n
    /* renamed from: V5, reason: from getter */
    public final C23038g0 getF305892Z() {
        return this.f305892Z;
    }

    @Override // com.avito.android.universal_map.map.point_info.n
    public final void V7() {
        hide();
    }

    @Override // com.avito.android.universal_map.map.point_info.n
    public final void X() {
        Marker.Pin pin = this.f305888V;
        if (pin != null) {
            ke(pin);
        }
    }

    @Override // com.avito.android.universal_map.map.point_info.n
    /* renamed from: a0, reason: from getter */
    public final D getF305891Y() {
        return this.f305891Y;
    }

    @Override // com.avito.android.universal_map.map.point_info.n
    @Y61.k
    public final InterfaceC39736a h1() {
        return this.f305881O.F();
    }

    @Override // com.avito.android.universal_map.map.point_info.n
    public final void h9(@Y61.k Marker.Pin pin) {
        if (L.f(this.f305888V, pin)) {
            return;
        }
        this.f305888V = pin;
        ke(pin);
    }

    @Override // com.avito.android.universal_map.map.point_info.n
    public final void hide() {
        this.f305888V = null;
        this.f305892Z.setValue(new g.a.b(this.f305890X));
    }

    public final void ke(Marker.Pin pin) {
        y yVar = this.f305887U;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        ScreenPerformanceTracker.a.b(this.f305882P, this.f305894b0, 2);
        this.f305887U = (y) this.f305875E.b(this.f305879M, pin.f304925e, this.f305889W, this.f305880N).j0(this.f305876J.e()).v0(new a(), new b(), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f305883Q.dispose();
        y yVar = this.f305887U;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f305878L.onCleared();
    }
}
