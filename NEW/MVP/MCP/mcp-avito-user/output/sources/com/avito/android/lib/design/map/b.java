package com.avito.android.lib.design.map;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapMoveReason;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapPolyline;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.avito_map.AvitoMapView;
import com.avito.android.avito_map.R;
import com.avito.android.avito_map.google.GoogleAvitoMapAttachHelper;
import com.avito.android.avito_map.yandex.AvitoMapPolygon;
import com.avito.android.avito_map.yandex.YandexAvitoMapAttachHelperKt;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.map.state.MapState;
import com.avito.android.lib.design.map.state.MoveReason;
import com.avito.android.lib.design.map.state.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import nV.InterfaceC44339c;
import oV.C44694a;

/* compiled from: Map.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/lib/design/map/b;", "LLV/a;", "Lcom/avito/android/lib/design/map/state/MapState;", "LoV/a;", "Lcom/avito/android/avito_map/AvitoMapView;", "newStyle", "Lkotlin/G0;", "setStyle", "(LoV/a;)V", "newState", "setState", "(Lcom/avito/android/lib/design/map/state/MapState;)V", "", "Lcom/avito/android/lib/design/map/state/MapState$a;", "items", "setMarkerItems", "(Ljava/util/List;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ViewConstructor", "CustomViewStyleable"})
/* loaded from: classes14.dex */
public final class b extends AvitoMapView implements LV.a<MapState, C44694a> {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f179595n = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FragmentManager f179596b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f179597c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public C44694a f179598d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public MapState f179599e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public InterfaceC42726C<? extends AvitoMap> f179600f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedHashMap f179601g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinkedHashSet f179602h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Q<? extends InterfaceC44339c, ? extends AvitoMapMarker> f179603i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinkedHashMap f179604j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Q<MapState.b, ? extends AvitoMapPolygon> f179605k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final LinkedHashMap f179606l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public AvitoMapMoveReason f179607m;

    /* compiled from: Map.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MapState.DrawingMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MapState.DrawingMode drawingMode = MapState.DrawingMode.f179628b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Map.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/map/b$b", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.map.b$b, reason: collision with other inner class name */
    public static final class C5282b implements AvitoMap.MapClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<AvitoMapPoint, Float, G0> f179608b;

        /* JADX WARN: Multi-variable type inference failed */
        public C5282b(p<? super AvitoMapPoint, ? super Float, G0> pVar) {
            this.f179608b = pVar;
        }

        @Override // com.avito.android.avito_map.AvitoMap.MapClickListener
        public final void onMapClicked(@k AvitoMapTarget avitoMapTarget) {
            this.f179608b.invoke(avitoMapTarget.getPoint(), Float.valueOf(avitoMapTarget.getZoomLevel()));
        }
    }

    /* compiled from: Map.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/map/b$c", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements AvitoMap.MarkerClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MapState.a, G0> f179609b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super MapState.a, G0> lVar) {
            this.f179609b = lVar;
        }

        @Override // com.avito.android.avito_map.AvitoMap.MarkerClickListener
        public final void onMarkerClicked(@l Object obj) {
            MapState.a aVar = obj instanceof MapState.a ? (MapState.a) obj : null;
            if (aVar != null) {
                this.f179609b.invoke(aVar);
            }
        }
    }

    /* compiled from: Map.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/map/b$d", "Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements AvitoMap.MapMoveStartListener {
        public d() {
        }

        @Override // com.avito.android.avito_map.AvitoMap.MapMoveStartListener
        public final void onMapMoveStarted(@k AvitoMapMoveReason avitoMapMoveReason) {
            Y41.l<MoveReason, G0> lVar;
            b bVar = b.this;
            bVar.f179607m = avitoMapMoveReason;
            MapState mapState = bVar.f179599e;
            MapState mapStateA = mapState != null ? MapState.a(mapState, null, null, 8183) : null;
            bVar.f179599e = mapStateA;
            if (mapStateA == null || (lVar = mapStateA.f179620f) == null) {
                return;
            }
            lVar.invoke(bVar.f179607m == AvitoMapMoveReason.GESTURE ? MoveReason.f179644b : MoveReason.f179645c);
        }
    }

    /* compiled from: Map.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/map/b$e", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements AvitoMap.MapMoveEndListener {
        public e() {
        }

        @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
        public final void onMapSettled(@k AvitoMapCameraPosition avitoMapCameraPosition) {
            Y41.l<a.c, G0> lVar;
            AvitoMapPoint mapPoint = avitoMapCameraPosition.getMapPoint();
            float zoomLevel = avitoMapCameraPosition.getZoomLevel();
            AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
            b bVar = b.this;
            a.c cVar = new a.c(mapPoint, zoomLevel, viewportBounds, bVar.f179607m == AvitoMapMoveReason.GESTURE ? MoveReason.f179644b : MoveReason.f179645c);
            MapState mapState = bVar.f179599e;
            MapState mapStateA = mapState != null ? MapState.a(mapState, null, cVar, 8183) : null;
            bVar.f179599e = mapStateA;
            if (mapStateA == null || (lVar = mapStateA.f179621g) == null) {
                return;
            }
            lVar.invoke(cVar);
        }
    }

    /* compiled from: Map.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/avito_map/AvitoMap;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/avito_map/AvitoMap;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<AvitoMap, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AvitoMap avitoMap) {
            InterfaceC42726C<? extends AvitoMap> interfaceC42726CC = C42727D.c(new com.avito.android.lib.design.map.d(avitoMap));
            b bVar = b.this;
            bVar.f179600f = interfaceC42726CC;
            bVar.b();
            C44694a c44694a = bVar.f179598d;
            bVar.f179598d = null;
            if (c44694a != null) {
                bVar.setStyle(c44694a);
            }
            MapState mapState = bVar.f179599e;
            bVar.f179599e = null;
            if (mapState != null) {
                bVar.setState(mapState);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, FragmentManager fragmentManager, boolean z12, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        z12 = (i14 & 4) != 0 ? false : z12;
        attributeSet = (i14 & 8) != 0 ? null : attributeSet;
        i12 = (i14 & 16) != 0 ? 0 : i12;
        i13 = (i14 & 32) != 0 ? 0 : i13;
        super(context, attributeSet, i12);
        this.f179596b = fragmentManager;
        this.f179597c = z12;
        this.f179601g = new LinkedHashMap();
        this.f179602h = new LinkedHashSet();
        this.f179604j = new LinkedHashMap();
        this.f179606l = new LinkedHashMap();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178954Y, i12, i13);
        C44694a.f419779o.getClass();
        setStyle(C44694a.b.b(typedArrayObtainStyledAttributes, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setMarkerItems(List<MapState.a> items) {
        LinkedHashSet<String> linkedHashSet;
        AvitoMap value;
        AvitoMap value2;
        Object next;
        AvitoMapMarker avitoMapMarker;
        List<MapState.a> list = items;
        HashSet hashSetK0 = C42745f0.K0(list);
        LinkedHashMap linkedHashMap = this.f179601g;
        Set setKeySet = linkedHashMap.keySet();
        if (L.f(setKeySet, hashSetK0)) {
            return;
        }
        ArrayList arrayList = new ArrayList(C42745f0.d0(list, setKeySet));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashSet = this.f179602h;
            if (!zHasNext) {
                break;
            }
            Object next2 = it.next();
            MapState.a aVar = (MapState.a) next2;
            for (String str : linkedHashSet) {
                if (L.f(str, aVar.f179631a)) {
                    Iterator it2 = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (L.f(((MapState.a) next).f179631a, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    MapState.a aVar2 = (MapState.a) next;
                    if (aVar2 != null && (avitoMapMarker = (AvitoMapMarker) linkedHashMap.get(aVar2)) != null) {
                        linkedHashMap.remove(aVar2);
                        linkedHashMap.put(aVar, avitoMapMarker);
                    }
                }
            }
            if (linkedHashSet.contains(aVar.f179631a)) {
                arrayList2.add(next2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            MapState.a aVar3 = (MapState.a) it3.next();
            AvitoMapMarker avitoMapMarker2 = (AvitoMapMarker) linkedHashMap.get(aVar3);
            if (avitoMapMarker2 != null) {
                avitoMapMarker2.changeIcon(aVar3.f179633c, aVar3.f179636f, aVar3.f179635e, aVar3.f179634d);
                avitoMapMarker2.setData(aVar3);
            }
        }
        Set<MapState.a> setF = b1.f(linkedHashMap.keySet(), hashSetK0);
        Set<MapState.a> setF2 = b1.f(hashSetK0, linkedHashMap.keySet());
        C42745f0.q0(setF2);
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f179600f;
        if (interfaceC42726C != null && (value2 = interfaceC42726C.getValue()) != null) {
            for (MapState.a aVar4 : setF2) {
                AvitoMapMarker avitoMapMarkerAddMarker = value2.addMarker(aVar4.f179632b.getLatitude(), aVar4.f179632b.getLongitude(), aVar4.f179633c, aVar4.f179634d, aVar4.f179635e, aVar4.f179631a, true);
                avitoMapMarkerAddMarker.setZIndex(aVar4.f179635e);
                avitoMapMarkerAddMarker.setData(aVar4);
                linkedHashMap.put(aVar4, avitoMapMarkerAddMarker);
                linkedHashSet.add(aVar4.f179631a);
            }
        }
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C2 = this.f179600f;
        if (interfaceC42726C2 == null || (value = interfaceC42726C2.getValue()) == null) {
            return;
        }
        for (MapState.a aVar5 : setF) {
            AvitoMapMarker avitoMapMarker3 = (AvitoMapMarker) linkedHashMap.remove(aVar5);
            if (avitoMapMarker3 != null) {
                value.removeMarker(avitoMapMarker3, true);
            }
            linkedHashSet.remove(aVar5.f179631a);
        }
    }

    public final void a(LinkedHashMap linkedHashMap, List list) {
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C;
        AvitoMap value;
        AvitoMap value2;
        C44694a.e eVar;
        C44694a.e eVar2;
        Integer num;
        C44694a.e eVar3;
        Integer num2;
        HashSet hashSetK0 = C42745f0.K0(list);
        Set setKeySet = linkedHashMap.keySet();
        if (L.f(setKeySet, hashSetK0)) {
            return;
        }
        Set setF = b1.f(setKeySet, hashSetK0);
        Set<MapState.c> setF2 = b1.f(hashSetK0, setKeySet);
        C42745f0.q0(setF2);
        for (MapState.c cVar : setF2) {
            InterfaceC42726C<? extends AvitoMap> interfaceC42726C2 = this.f179600f;
            if (interfaceC42726C2 != null && (value2 = interfaceC42726C2.getValue()) != null) {
                List<AvitoMapPoint> list2 = cVar.f179640b;
                C44694a c44694a = this.f179598d;
                int iIntValue = 0;
                int iIntValue2 = (c44694a == null || (eVar3 = c44694a.f419792m) == null || (num2 = eVar3.f419804b) == null) ? 0 : num2.intValue();
                C44694a c44694a2 = this.f179598d;
                if (c44694a2 != null && (eVar2 = c44694a2.f419792m) != null && (num = eVar2.f419804b) != null) {
                    iIntValue = num.intValue();
                }
                int i12 = iIntValue;
                C44694a c44694a3 = this.f179598d;
                AvitoMapPolyline avitoMapPolylineAddPolyline = value2.addPolyline(list2, iIntValue2, 0.0f, i12, false, (c44694a3 == null || (eVar = c44694a3.f419792m) == null) ? 0.0f : eVar.f419805c, 3.0f, false);
                avitoMapPolylineAddPolyline.setZIndex(3.0f);
                linkedHashMap.put(cVar, avitoMapPolylineAddPolyline);
            }
        }
        Iterator it = setF.iterator();
        while (it.hasNext()) {
            AvitoMapPolyline avitoMapPolyline = (AvitoMapPolyline) linkedHashMap.remove((MapState.c) it.next());
            if (avitoMapPolyline != null && (interfaceC42726C = this.f179600f) != null && (value = interfaceC42726C.getValue()) != null) {
                value.removePolyline(avitoMapPolyline);
            }
        }
    }

    public final void b() {
        AvitoMap value;
        AvitoMap value2;
        AvitoMapUiSettings uiSettings;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f179600f;
        if (interfaceC42726C != null && (value2 = interfaceC42726C.getValue()) != null && (uiSettings = value2.getUiSettings()) != null) {
            uiSettings.isRotateGesturesEnabled(false);
            uiSettings.isCompassEnabled(false);
            uiSettings.isMyLocationButtonEnabled(false);
        }
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C2 = this.f179600f;
        if (interfaceC42726C2 == null || (value = interfaceC42726C2.getValue()) == null) {
            return;
        }
        value.distinctSameMoveEvent(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44694a c44694a = this.f179598d;
        MapState mapState = this.f179599e;
        if (c44694a == null || mapState == null) {
            return;
        }
        this.f179598d = null;
        this.f179599e = null;
        setStyle(c44694a);
        setState(mapState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AvitoMap value;
        this.f179601g.clear();
        this.f179602h.clear();
        this.f179604j.clear();
        this.f179606l.clear();
        this.f179603i = null;
        this.f179605k = null;
        this.f179607m = null;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f179600f;
        if (interfaceC42726C != null && (value = interfaceC42726C.getValue()) != null) {
            value.clearMoveStartListeners();
            value.clearMoveEndListeners();
            AvitoMap.DefaultImpls.onStop$default(value, false, 1, null);
        }
        this.f179600f = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04d5  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k com.avito.android.lib.design.map.state.MapState r20) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.map.b.setState(com.avito.android.lib.design.map.state.MapState):void");
    }

    /* JADX WARN: Type inference failed for: r1v32, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // LV.d
    public void setStyle(@k C44694a newStyle) {
        AvitoMap value;
        AvitoMap value2;
        AvitoMap value3;
        AvitoMap value4;
        AvitoMap value5;
        C44694a c44694a = this.f179598d;
        if (new com.avito.android.lib.util.c(newStyle, c44694a).f181333c) {
            return;
        }
        this.f179598d = newStyle;
        if (this.f179600f == null) {
            com.avito.android.lib.design.a.f178170a.getClass();
            if (!((Boolean) com.avito.android.lib.design.a.f178172c.invoke()).booleanValue()) {
                f fVar = new f();
                GoogleAvitoMapAttachHelper googleAvitoMapAttachHelper = new GoogleAvitoMapAttachHelper();
                googleAvitoMapAttachHelper.setMapAttachedListener(new com.avito.android.lib.design.map.c(fVar));
                Object systemService = getContext().getSystemService("layout_inflater");
                LayoutInflater layoutInflater = systemService instanceof LayoutInflater ? (LayoutInflater) systemService : null;
                View viewInflate = layoutInflater != null ? layoutInflater.inflate(R.layout.google_map_item, (ViewGroup) null) : null;
                AvitoMapView avitoMapView = viewInflate instanceof AvitoMapView ? (AvitoMapView) viewInflate : null;
                if (avitoMapView != null) {
                    addView(avitoMapView);
                    googleAvitoMapAttachHelper.attachView(R.id.google_map_view, avitoMapView, this.f179596b);
                    return;
                }
                return;
            }
            this.f179600f = YandexAvitoMapAttachHelperKt.attachYandexMap(this, this.f179597c);
            b();
        }
        Integer num = c44694a != null ? c44694a.f419780a : null;
        Integer num2 = newStyle.f419780a;
        if (!new com.avito.android.lib.util.c(num2, num).f181333c && num2 != null) {
            int iIntValue = num2.intValue();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.height = iIntValue;
            setLayoutParams(layoutParams);
        }
        Integer num3 = c44694a != null ? c44694a.f419781b : null;
        Integer num4 = newStyle.f419781b;
        if (!new com.avito.android.lib.util.c(num4, num3).f181333c && num4 != null) {
            int iIntValue2 = num4.intValue();
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams2.width = iIntValue2;
            setLayoutParams(layoutParams2);
        }
        Float fValueOf = Float.valueOf(newStyle.f419782c);
        if (!new com.avito.android.lib.util.c(fValueOf, c44694a != null ? Float.valueOf(c44694a.f419782c) : null).f181333c) {
            float fFloatValue = fValueOf.floatValue();
            InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f179600f;
            if (interfaceC42726C != null && (value5 = interfaceC42726C.getValue()) != null) {
                value5.setMaxZoomPreference(fFloatValue);
            }
        }
        Float fValueOf2 = Float.valueOf(newStyle.f419783d);
        if (!new com.avito.android.lib.util.c(fValueOf2, c44694a != null ? Float.valueOf(c44694a.f419783d) : null).f181333c) {
            float fFloatValue2 = fValueOf2.floatValue();
            InterfaceC42726C<? extends AvitoMap> interfaceC42726C2 = this.f179600f;
            if (interfaceC42726C2 != null && (value4 = interfaceC42726C2.getValue()) != null) {
                value4.setMinZoomPreference(fFloatValue2);
            }
        }
        C44694a.d dVar = c44694a != null ? c44694a.f419793n : null;
        C44694a.d dVar2 = newStyle.f419793n;
        if (!new com.avito.android.lib.util.c(dVar2, dVar).f181333c && dVar2 != null && (dVar2 instanceof C44694a.d.C12191a)) {
            InterfaceC42726C<? extends AvitoMap> interfaceC42726C3 = this.f179600f;
            if (interfaceC42726C3 != null && (value3 = interfaceC42726C3.getValue()) != null) {
                C44694a.c cVar = ((C44694a.d.C12191a) dVar2).f419802a;
                value3.setLogoAlignment(cVar.f419798a, cVar.f419799b);
            }
            InterfaceC42726C<? extends AvitoMap> interfaceC42726C4 = this.f179600f;
            if (interfaceC42726C4 != null && (value2 = interfaceC42726C4.getValue()) != null) {
                C44694a.c cVar2 = ((C44694a.d.C12191a) dVar2).f419802a;
                value2.setLogoPadding(cVar2.f419801d, cVar2.f419800c);
            }
        }
        int i12 = newStyle.f419785f;
        boolean zEquals = Integer.valueOf(i12).equals(c44694a != null ? Integer.valueOf(c44694a.f419785f) : null);
        int i13 = newStyle.f419788i;
        int i14 = newStyle.f419787h;
        int i15 = newStyle.f419786g;
        if (zEquals) {
            if (Integer.valueOf(i15).equals(c44694a != null ? Integer.valueOf(c44694a.f419786g) : null)) {
                if (Integer.valueOf(i14).equals(c44694a != null ? Integer.valueOf(c44694a.f419787h) : null)) {
                    if (Integer.valueOf(i13).equals(c44694a != null ? Integer.valueOf(c44694a.f419788i) : null)) {
                        return;
                    }
                }
            }
        }
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C5 = this.f179600f;
        if (interfaceC42726C5 == null || (value = interfaceC42726C5.getValue()) == null) {
            return;
        }
        value.setPadding(i12, i15, i14, i13);
    }
}
