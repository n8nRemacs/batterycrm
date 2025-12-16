package com.avito.android.universal_map.map;

import Zi.InterfaceC19564a;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.storeParameters.BeduinStoreParametersAction;
import com.avito.android.beduin_shared.model.action.storeParameters.StorageType;
import com.avito.android.map_core.beduin.BeduinShowSpecificLocationAction;
import com.avito.android.remote.model.Overlay;
import com.avito.android.universal_map.map.AbstractC35291a;
import com.avito.android.universal_map.map.AbstractC35292b;
import com.avito.android.universal_map.map.AbstractC35293c;
import com.avito.android.universal_map.map.AbstractC35294d;
import com.avito.android.universal_map.map.AbstractC35317e;
import com.avito.android.universal_map.map.T;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.map.pin_filters.j;
import com.avito.android.universal_map.remote.model.MapMode;
import com.avito.android.universal_map.remote.model.UniversalMapPointRect;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import com.avito.android.universal_map.remote.model.UniversalPreselectMapPoint;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import oG0.InterfaceC44637a;
import qG0.C47290a;
import qG0.C47292c;
import qG0.C47293d;

/* compiled from: UniversalPointsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/g0;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/universal_map/map/T;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g0 extends M0 implements T {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final J f305180E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f305181J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f305182K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public List<? extends BeduinAction> f305183L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final String f305184M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final InterfaceC19564a f305185N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f305186O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44637a f305187P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f305188Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.tracker.c f305189R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f305190S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f305191T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f305192U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public Marker.Pin f305193V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<T.a> f305194W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Map<String, Object>> f305195X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<j.b> f305196Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<C47292c> f305197Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<AbstractC35294d> f305198a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<AbstractC35293c> f305199b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<AbstractC35292b> f305200c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<AbstractC35291a> f305201d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<P2<G0>> f305202e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<AbstractC35317e> f305203f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f305204g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Overlay> f305205h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.l
    public C47293d f305206i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f305207j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public UniversalPreselectMapPoint f305208k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public AvitoMapBounds f305209l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public AvitoMapPoint f305210m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f305211n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f305212o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f305213p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public MapMode f305214q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public BeduinShowSpecificLocationAction f305215r0;

    /* compiled from: UniversalPointsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AvitoMapPoint f305217m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f305218n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AvitoMapPoint avitoMapPoint, boolean z12) {
            super(0);
            this.f305217m = avitoMapPoint;
            this.f305218n = z12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g0.this.le(this.f305217m, this.f305218n, false);
            return G0.f406611a;
        }
    }

    public g0(@Y61.l InterfaceC19564a interfaceC19564a, @Y61.k com.avito.android.map_core.beduin.action_handler.a aVar, @Y61.k com.avito.android.map_core.beduin.action_handler.c cVar, @Y61.k com.avito.android.map_core.beduin.action_handler.e eVar, @Y61.k com.avito.android.map_core.beduin.action_handler.g gVar, @Y61.k com.avito.android.map_core.beduin.action_handler.i iVar, @Y61.k com.avito.android.map_core.beduin.action_handler.k kVar, @Y61.k com.avito.android.map_core.beduin.action_handler.m mVar, @Y61.k J j12, @Y61.k com.avito.android.universal_map.map.tracker.c cVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k String str, @Y61.l String str2, @Y61.l List list, @Y61.k Map map, @Y61.k InterfaceC44637a interfaceC44637a) {
        this.f305180E = j12;
        this.f305181J = str;
        this.f305182K = map;
        this.f305183L = list;
        this.f305184M = str2;
        this.f305185N = interfaceC19564a;
        this.f305186O = interfaceC40691b;
        this.f305187P = interfaceC44637a;
        this.f305188Q = interfaceC35745a5;
        this.f305189R = cVar2;
        io.reactivex.rxjava3.disposables.c cVar3 = new io.reactivex.rxjava3.disposables.c();
        this.f305190S = cVar3;
        this.f305194W = new com.avito.android.util.architecture_components.D<>();
        this.f305195X = new C23038g0<>();
        this.f305196Y = new com.avito.android.util.architecture_components.D<>();
        this.f305197Z = new com.avito.android.util.architecture_components.D<>();
        this.f305198a0 = new com.avito.android.util.architecture_components.D<>();
        this.f305199b0 = new com.avito.android.util.architecture_components.D<>();
        this.f305200c0 = new com.avito.android.util.architecture_components.D<>();
        this.f305201d0 = new com.avito.android.util.architecture_components.D<>();
        this.f305202e0 = new com.avito.android.util.architecture_components.D<>();
        this.f305203f0 = new com.avito.android.util.architecture_components.D<>();
        this.f305204g0 = new com.avito.android.util.architecture_components.D<>();
        this.f305205h0 = new com.avito.android.util.architecture_components.D<>();
        this.f305207j0 = true;
        cVar3.b(com.avito.android.beduin_shared.model.utils.b.b(interfaceC40691b).t0(new c0(this)));
        cVar3.b(cVar.f185649b.t0(new Z(this)));
        cVar3.b(iVar.f185656c.t0(new f0(this)));
        cVar3.b(gVar.f185653b.t0(new d0(this)));
        cVar3.b(mVar.f185660b.t0(new e0(this)));
        cVar3.b(aVar.f185647b.t0(new Y(this)));
        cVar3.b(eVar.f185651b.t0(a0.f304913b));
        cVar3.b(kVar.f185658b.t0(new b0(this)));
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: D3, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF305201d0() {
        return this.f305201d0;
    }

    @Override // com.avito.android.universal_map.map.T
    public final void Gc(@Y61.k C47290a c47290a, @Y61.l Map<String, ? extends Object> map, boolean z12) {
        this.f305186O.o(new BeduinStoreParametersAction(StorageType.TEMPORARY, "universal_map_form_params", com.avito.android.universal_map.map.util.b.a(c47290a), null));
        MapMode mapMode = this.f305214q0;
        MapMode mapMode2 = MapMode.STATIC;
        if (mapMode != mapMode2 || z12) {
            if (mapMode == mapMode2 && z12) {
                this.f305214q0 = null;
            }
            io.reactivex.rxjava3.internal.observers.y yVar = this.f305191T;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            Marker.Pin pin = this.f305193V;
            Map<String, Object> map2 = pin != null ? pin.f304925e : null;
            boolean z13 = this.f305213p0;
            this.f305191T = (io.reactivex.rxjava3.internal.observers.y) this.f305180E.a(this.f305181J, c47290a.f429136c, c47290a.f429137d, c47290a.f429139f, this.f305182K, map, map2, z13).j0(this.f305188Q.c()).v0(new W(this, z12), new X(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: P5, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF305200c0() {
        return this.f305200c0;
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: U5, reason: from getter */
    public final C23038g0 getF305195X() {
        return this.f305195X;
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: Y3, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF305203f0() {
        return this.f305203f0;
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: a0, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF305197Z() {
        return this.f305197Z;
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: cb, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF305199b0() {
        return this.f305199b0;
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: fb, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF305204g0() {
        return this.f305204g0;
    }

    @Override // com.avito.android.universal_map.map.T
    public final void hb(@Y61.k List<? extends BeduinAction> list) {
        com.avito.android.beduin_shared.model.utils.a.a(this.f305186O, list);
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: jb, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF305198a0() {
        return this.f305198a0;
    }

    public final UniversalPreselectMapPoint ke(UniversalMapPointsRectResult universalMapPointsRectResult) {
        UniversalPreselectMapPoint savedLocation = universalMapPointsRectResult.getSavedLocation();
        Object obj = null;
        if (savedLocation == null || !this.f305207j0) {
            return null;
        }
        String id2 = savedLocation.getPin().getId();
        Iterator<T> it = universalMapPointsRectResult.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.L.f(((UniversalMapPointRect) next).getId(), id2)) {
                obj = next;
                break;
            }
        }
        UniversalMapPointRect pin = (UniversalMapPointRect) obj;
        if (pin == null) {
            pin = savedLocation.getPin();
        }
        return UniversalPreselectMapPoint.a(savedLocation, pin);
    }

    public final void le(AvitoMapPoint avitoMapPoint, boolean z12, boolean z13) {
        boolean z14 = (this.f305210m0 != null) || !(this.f305211n0 || this.f305212o0);
        this.f305200c0.postValue(new AbstractC35292b.a(avitoMapPoint));
        this.f305210m0 = avitoMapPoint;
        if (z14) {
            this.f305199b0.postValue(new AbstractC35293c.b(avitoMapPoint, z12, null));
            if (z13) {
                this.f305201d0.postValue(AbstractC35291a.C9363a.f304911a);
            }
        }
    }

    public final void me() {
        C47293d c47293d = this.f305206i0;
        if (c47293d != null) {
            if (c47293d.a()) {
                this.f305203f0.setValue(new AbstractC35317e.b(c47293d));
            }
            this.f305206i0 = null;
        }
        UniversalPreselectMapPoint universalPreselectMapPoint = this.f305208k0;
        com.avito.android.util.architecture_components.D<AbstractC35293c> d12 = this.f305199b0;
        if (universalPreselectMapPoint != null) {
            UniversalMapPointRect.Viewport viewport = universalPreselectMapPoint.getPin().getViewport();
            d12.postValue(viewport != null ? new AbstractC35293c.a(new AvitoMapBounds(com.avito.android.universal_map.map.util.b.b(viewport.getTopLeft()), com.avito.android.universal_map.map.util.b.b(viewport.getBottomRight()))) : new AbstractC35293c.b(com.avito.android.universal_map.map.util.b.b(universalPreselectMapPoint.getPin().getCoordinates()), false, universalPreselectMapPoint.getZoomLevel()));
            this.f305198a0.postValue(new AbstractC35294d.a(com.avito.android.universal_map.map.common.marker.i.a(universalPreselectMapPoint.getPin(), universalPreselectMapPoint.getZoomLevel())));
        }
        AvitoMapBounds avitoMapBounds = this.f305209l0;
        if (avitoMapBounds == null) {
            return;
        }
        this.f305209l0 = null;
        d12.postValue(new AbstractC35293c.a(avitoMapBounds));
    }

    @Override // com.avito.android.universal_map.map.T
    public final void n8(@Y61.l Marker.Pin pin) {
        this.f305193V = pin;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f305190S.dispose();
        io.reactivex.rxjava3.internal.observers.y yVar = this.f305191T;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f305186O.onCleared();
    }

    @Override // com.avito.android.universal_map.map.T
    public final void ra(boolean z12, boolean z13) {
        this.f305213p0 = false;
        this.f305215r0 = null;
        le(new AvitoMapPoint(j0.f305231a, j0.f305232b, null, 4, null), z12, z13);
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: u9, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF305205h0() {
        return this.f305205h0;
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: v8, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF305194W() {
        return this.f305194W;
    }

    @Override // com.avito.android.universal_map.map.T
    public final void wb() {
        List<? extends BeduinAction> list = this.f305183L;
        InterfaceC40691b interfaceC40691b = this.f305186O;
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC40691b, list);
        this.f305183L = null;
        String str = this.f305184M;
        if (str != null) {
            InterfaceC19564a interfaceC19564a = this.f305185N;
            com.avito.android.beduin_shared.model.utils.a.a(interfaceC40691b, interfaceC19564a != null ? interfaceC19564a.b(str) : null);
        }
        me();
    }

    @Override // com.avito.android.universal_map.map.T
    /* renamed from: xa, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF305196Y() {
        return this.f305196Y;
    }

    @Override // com.avito.android.universal_map.map.T
    public final void y2(double d12, double d13, boolean z12) {
        this.f305213p0 = true;
        AvitoMapPoint avitoMapPoint = new AvitoMapPoint(d12, d13, null, 4, null);
        BeduinShowSpecificLocationAction beduinShowSpecificLocationAction = this.f305215r0;
        a aVar = new a(avitoMapPoint, z12);
        if (beduinShowSpecificLocationAction != null) {
            io.reactivex.rxjava3.internal.observers.y yVar = this.f305192U;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            this.f305192U = (io.reactivex.rxjava3.internal.observers.y) this.f305180E.b(beduinShowSpecificLocationAction.getPath(), beduinShowSpecificLocationAction.getRequestTimeout(), beduinShowSpecificLocationAction.getExtraRequestParams()).j0(this.f305188Q.e()).v0(new h0(this, avitoMapPoint, aVar), new i0(aVar), io.reactivex.rxjava3.internal.functions.a.f401993c);
        } else {
            aVar.invoke();
        }
        this.f305215r0 = null;
    }
}
