package com.avito.android.messenger.map.viewing.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapBoundsBuilder;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapCameraUpdate;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapMoveReason;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.avito_map.PointsWithOffset;
import com.avito.android.avito_map.clustering.ClusterManager;
import com.avito.android.job.cv_info_actualization.ui.items.radio.h;
import com.avito.android.messenger.map.viewing.view.d;
import com.avito.android.mvi.e;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.reactivex.rxjava3.core.z;
import java.util.Iterator;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: PlatformMapView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/f;", "Lcom/avito/android/messenger/map/viewing/view/d;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements d, AvitoMapAttachHelper.MapAttachListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f196880y = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/map/viewing/view/PlatformMapView$State;", f.class))};

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f196881b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C35971x f196882c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f196883d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public AvitoMap f196884e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final FloatingActionButton f196885f;

    /* renamed from: g, reason: collision with root package name */
    public final View f196886g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.messenger.map.d f196887h;

    /* renamed from: i, reason: collision with root package name */
    public ClusterManager<com.avito.android.messenger.map.viewing.view.a> f196888i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.b<Boolean> f196889j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.b<Boolean> f196890k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<com.avito.android.messenger.map.viewing.view.a> f196891l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<com.avito.android.messenger.map.viewing.view.a> f196892m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f196893n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<AvitoMapCameraPosition> f196894o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f196895p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<AvitoMapCameraPosition> f196896q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f196897r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final z<G0> f196898s;

    /* renamed from: t, reason: collision with root package name */
    public final int f196899t;

    /* renamed from: u, reason: collision with root package name */
    public final int f196900u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f196901v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public AvitoMapMarker f196902w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f196903x;

    /* compiled from: PlatformMapView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/map/viewing/view/f$a", "Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements AvitoMap.MapMoveStartListener {
        public a() {
        }

        @Override // com.avito.android.avito_map.AvitoMap.MapMoveStartListener
        public final void onMapMoveStarted(@k AvitoMapMoveReason avitoMapMoveReason) {
            if (avitoMapMoveReason == AvitoMapMoveReason.GESTURE) {
                V2 v22 = V2.f318762a;
                f fVar = f.this;
                v22.i(fVar.f196883d, "OnCameraMoveStarted.REASON_GESTURE", null);
                fVar.f196893n.accept(G0.f406611a);
            }
        }
    }

    /* compiled from: PlatformMapView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/map/viewing/view/f$b", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements AvitoMap.MapMoveEndListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AvitoMap f196906c;

        public b(AvitoMap avitoMap) {
            this.f196906c = avitoMap;
        }

        @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
        public final void onMapSettled(@k AvitoMapCameraPosition avitoMapCameraPosition) {
            V2 v22 = V2.f318762a;
            f fVar = f.this;
            String str = fVar.f196883d;
            v22.i(str, "onCameraIdle()", null);
            ClusterManager<com.avito.android.messenger.map.viewing.view.a> clusterManager = fVar.f196888i;
            if (clusterManager == null) {
                clusterManager = null;
            }
            clusterManager.onMapSettled(avitoMapCameraPosition);
            if (fVar.f196903x) {
                v22.i(str, "onCameraIdle(), ignoring", null);
                fVar.f196903x = false;
            } else {
                v22.i(str, "onCameraIdle(), sending event", null);
                fVar.f196894o.accept(this.f196906c.getMapCameraPosition());
            }
        }
    }

    public f(@k View view, boolean z12, @k AvitoMapAttachHelper avitoMapAttachHelper, @k FragmentManager fragmentManager) {
        this.f196881b = view;
        this.f196882c = new C35971x();
        this.f196883d = "PlatformMapView";
        View viewFindViewById = view.findViewById(R.id.messenger_platform_map_location_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.floatingactionbutton.FloatingActionButton");
        }
        this.f196885f = (FloatingActionButton) viewFindViewById;
        this.f196886g = view.findViewById(R.id.messenger_platform_map_map_view);
        com.avito.android.messenger.map.d dVar = new com.avito.android.messenger.map.d(view, R.style.Re23_Button_PrimaryMedium, R.string.messenger_platform_map_create_route_button, z12);
        this.f196887h = dVar;
        com.jakewharton.rxrelay3.b<Boolean> bVarN0 = com.jakewharton.rxrelay3.b.N0(Boolean.FALSE);
        this.f196889j = bVarN0;
        this.f196890k = bVarN0;
        com.jakewharton.rxrelay3.c<com.avito.android.messenger.map.viewing.view.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f196891l = cVar;
        this.f196892m = cVar;
        this.f196893n = new com.jakewharton.rxrelay3.c<>();
        com.jakewharton.rxrelay3.c<AvitoMapCameraPosition> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f196894o = cVar2;
        this.f196895p = view.getContext();
        this.f196896q = cVar2;
        this.f196897r = new com.jakewharton.rxrelay3.c<>();
        this.f196898s = dVar.f196462p;
        this.f196899t = view.getResources().getDimensionPixelSize(R.dimen.messenger_platform_map_lat_lng_bounds_padding);
        this.f196900u = view.getResources().getDimensionPixelSize(R.dimen.messenger_platform_map_center_offset);
        this.f196903x = true;
        avitoMapAttachHelper.setMapAttachedListener(this);
        avitoMapAttachHelper.attachView(R.id.messenger_platform_map_map_view, view, fragmentManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final d.b a(com.avito.android.mvi.e<d.b> eVar) {
        n<Object> nVar = f196880y[0];
        return (d.b) this.f196882c.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.map.viewing.view.d$b] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        n<Object> nVar = f196880y[0];
        this.f196882c.f319122b = (d.b) obj;
    }

    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<d.b> eVar, d.b bVar, d.b bVar2) {
        AvitoMap avitoMap;
        AvitoMapCameraUpdate avitoMapCameraUpdate;
        Q<Integer, Integer> size;
        Q<Integer, Integer> size2;
        AvitoMapPoint mapPoint;
        d.b bVar3 = bVar;
        d.b bVar4 = bVar2;
        Set<com.avito.android.messenger.map.viewing.view.a> set = bVar4.f196870a;
        if (bVar3 == null || !L.f(set, bVar3.f196870a)) {
            ClusterManager<com.avito.android.messenger.map.viewing.view.a> clusterManager = this.f196888i;
            if (clusterManager == null) {
                clusterManager = null;
            }
            clusterManager.clearItems();
            ClusterManager<com.avito.android.messenger.map.viewing.view.a> clusterManager2 = this.f196888i;
            if (clusterManager2 == null) {
                clusterManager2 = null;
            }
            clusterManager2.addItems(set);
            ClusterManager<com.avito.android.messenger.map.viewing.view.a> clusterManager3 = this.f196888i;
            if (clusterManager3 == null) {
                clusterManager3 = null;
            }
            clusterManager3.cluster();
        }
        int dimensionPixelSize = 0;
        AvitoMapPoint avitoMapPoint = bVar4.f196873d;
        if (bVar3 == null || !L.f(avitoMapPoint, bVar3.f196873d)) {
            AvitoMapMarker avitoMapMarker = this.f196902w;
            if (avitoMapMarker != null && (avitoMap = this.f196884e) != null) {
                AvitoMap.DefaultImpls.removeMarker$default(avitoMap, avitoMapMarker, false, 2, null);
            }
            if (avitoMapPoint != null) {
                AvitoMap avitoMap2 = this.f196884e;
                AvitoMapMarker avitoMapMarkerAddUserCoords = avitoMap2 != null ? avitoMap2.addUserCoords(new AvitoMapPoint(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude(), null, 4, null), bVar4.f196874e, R.style.Theme_DesignSystem_Re23) : null;
                if (avitoMapMarkerAddUserCoords != null) {
                    avitoMapMarkerAddUserCoords.setPosition(avitoMapPoint);
                }
                if (avitoMapMarkerAddUserCoords != null) {
                    avitoMapMarkerAddUserCoords.setData(avitoMapPoint);
                }
                this.f196902w = avitoMapMarkerAddUserCoords;
            }
        }
        if ((!this.f196901v || bVar4.f196877h) && (avitoMapCameraUpdate = bVar4.f196872c) != null) {
            if (avitoMapCameraUpdate.getCameraPosition() != null) {
                AvitoMapCameraPosition cameraPosition = avitoMapCameraUpdate.getCameraPosition();
                if (cameraPosition == null || (mapPoint = cameraPosition.getMapPoint()) == null) {
                    return;
                }
                AvitoMapCameraPosition cameraPosition2 = avitoMapCameraUpdate.getCameraPosition();
                Float fValueOf = cameraPosition2 != null ? Float.valueOf(cameraPosition2.getZoomLevel()) : null;
                AvitoMap avitoMap3 = this.f196884e;
                if (avitoMap3 != null) {
                    avitoMap3.moveTo(mapPoint, false, fValueOf);
                }
            } else if (avitoMapCameraUpdate.getBounds() != null) {
                AvitoMapBounds bounds = avitoMapCameraUpdate.getBounds();
                if (bounds == null) {
                    return;
                }
                AvitoMap avitoMap4 = this.f196884e;
                if (avitoMap4 != null) {
                    avitoMap4.moveTo(bounds, false);
                }
            } else if (avitoMapCameraUpdate.getBoundsByPoints() != null) {
                PointsWithOffset boundsByPoints = avitoMapCameraUpdate.getBoundsByPoints();
                if (boundsByPoints == null) {
                    return;
                }
                AvitoMap avitoMap5 = this.f196884e;
                int iIntValue = (avitoMap5 == null || (size2 = avitoMap5.getSize()) == null) ? 0 : size2.f406619b.intValue();
                AvitoMap avitoMap6 = this.f196884e;
                AvitoMapBoundsBuilder avitoMapBoundsBuilder = new AvitoMapBoundsBuilder(iIntValue, (avitoMap6 == null || (size = avitoMap6.getSize()) == null) ? 0 : size.f406620c.intValue());
                Iterator<T> it = boundsByPoints.getPoints().iterator();
                while (it.hasNext()) {
                    avitoMapBoundsBuilder.addPoint((AvitoMapPoint) it.next());
                }
                avitoMapBoundsBuilder.addOffset(boundsByPoints.getOffset());
                AvitoMapBounds avitoMapBoundsBuild = avitoMapBoundsBuilder.build();
                if (avitoMapBoundsBuild == null) {
                    return;
                }
                AvitoMap avitoMap7 = this.f196884e;
                if (avitoMap7 != null) {
                    avitoMap7.moveTo(avitoMapBoundsBuild, false);
                }
            }
            this.f196903x = true;
            this.f196901v = true;
        }
        com.avito.android.messenger.map.d dVar = this.f196887h;
        dVar.getClass();
        e.a.a(dVar, bVar4.f196871b);
        if (dVar.f196453g.getF177843b().getVisibility() == 0 && dVar.f196449c && !dVar.f196451e.getBoolean(R.bool.is_tablet)) {
            dimensionPixelSize = dVar.f196448b.getResources().getDimensionPixelSize(R.dimen.messenger_platform_map_bottom_sheet_view_margin_top) + D6.v(dVar.f196454h);
        }
        D6.c(this.f196886g, null, null, null, Integer.valueOf(dimensionPixelSize), 7);
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    public final void onMapAttach(@k AvitoMap avitoMap) {
        this.f196884e = avitoMap;
        View view = this.f196881b;
        ClusterManager<com.avito.android.messenger.map.viewing.view.a> clusterManager = new ClusterManager<>(view.getContext(), avitoMap);
        this.f196888i = clusterManager;
        Context context = view.getContext();
        ClusterManager<com.avito.android.messenger.map.viewing.view.a> clusterManager2 = this.f196888i;
        if (clusterManager2 == null) {
            clusterManager2 = null;
        }
        c cVar = new c(context, avitoMap, clusterManager2);
        cVar.setMinClusterSize(3);
        clusterManager.setRenderer(cVar);
        avitoMap.setPadding(0, 0, this.f196900u * 2, 0);
        AvitoMapUiSettings uiSettings = avitoMap.getUiSettings();
        uiSettings.isRotateGesturesEnabled(false);
        uiSettings.isTiltGesturesEnabled(false);
        ClusterManager<com.avito.android.messenger.map.viewing.view.a> clusterManager3 = this.f196888i;
        if (clusterManager3 == null) {
            clusterManager3 = null;
        }
        avitoMap.addMarkerExactClickListener(clusterManager3);
        ClusterManager<com.avito.android.messenger.map.viewing.view.a> clusterManager4 = this.f196888i;
        if (clusterManager4 == null) {
            clusterManager4 = null;
        }
        clusterManager4.setOnClusterItemClickListener(new e(this, avitoMap));
        ClusterManager<com.avito.android.messenger.map.viewing.view.a> clusterManager5 = this.f196888i;
        (clusterManager5 != null ? clusterManager5 : null).setOnClusterClickListener(new e(this, avitoMap));
        avitoMap.addMoveStartListener(new a());
        avitoMap.addMoveEndListener(new b(avitoMap));
        this.f196885f.setOnClickListener(new h(23, this, avitoMap));
        this.f196889j.accept(Boolean.TRUE);
    }

    public /* synthetic */ f(View view, boolean z12, AvitoMapAttachHelper avitoMapAttachHelper, FragmentManager fragmentManager, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? false : z12, avitoMapAttachHelper, fragmentManager);
    }
}
