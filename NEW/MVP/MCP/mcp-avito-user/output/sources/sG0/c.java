package sG0;

import Y41.l;
import Y61.k;
import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.avito_map.AvitoMapView;
import com.avito.android.universal_map.map.mvi.entity.MapState;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.s0;
import qG0.C47290a;
import rG0.AbstractC47541a;

/* compiled from: UniversalMapViewMvi.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LsG0/c;", "LsG0/a;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements InterfaceC48047a, AvitoMapAttachHelper.MapAttachListener {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f437553b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.universal_map.map.common.marker.a f437554c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AvitoMapAttachHelper f437555d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<AbstractC47541a, G0> f437556e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.progress_overlay.l f437557f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f437558g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final AvitoMapView f437559h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public AvitoMap f437560i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinkedHashMap f437561j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public Set<MapState.b> f437562k;

    /* compiled from: UniversalMapViewMvi.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sG0/c$a", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements AvitoMap.MapMoveEndListener {
        public a() {
        }

        @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
        public final void onMapSettled(@k AvitoMapCameraPosition avitoMapCameraPosition) {
            c cVar = c.this;
            AvitoMapBounds avitoMapBoundsA = cVar.a();
            if (avitoMapBoundsA == null) {
                return;
            }
            AvitoMapPoint mapPoint = avitoMapCameraPosition.getMapPoint();
            float zoomLevel = avitoMapCameraPosition.getZoomLevel();
            AvitoMapBounds viewportBounds = avitoMapCameraPosition.getViewportBounds();
            if (viewportBounds == null) {
                return;
            }
            AvitoMapPoint topLeft = avitoMapBoundsA.getTopLeft();
            AvitoMapPoint bottomRight = avitoMapBoundsA.getBottomRight();
            float[] fArr = new float[1];
            Location.distanceBetween(avitoMapBoundsA.getTopLeft().getLatitude(), avitoMapBoundsA.getTopLeft().getLongitude(), avitoMapBoundsA.getBottomRight().getLatitude(), avitoMapBoundsA.getBottomRight().getLongitude(), fArr);
            C47290a c47290a = new C47290a(avitoMapCameraPosition, viewportBounds, topLeft, bottomRight, Float.valueOf(fArr[0]), cVar.f437554c.a(mapPoint.getLatitude(), zoomLevel));
            AbstractC47541a.c.C12363a c12363a = AbstractC47541a.c.C12363a.f429692a;
            l<AbstractC47541a, G0> lVar = cVar.f437556e;
            lVar.invoke(c12363a);
            lVar.invoke(new AbstractC47541a.d.C12365a(c47290a));
        }
    }

    /* compiled from: UniversalMapViewMvi.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sG0/c$b", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements AvitoMap.MarkerClickListener {
        public b() {
        }

        @Override // com.avito.android.avito_map.AvitoMap.MarkerClickListener
        public final void onMarkerClicked(@Y61.l Object obj) {
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                c.this.f437556e.invoke(new AbstractC47541a.b.f(str));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k View view, @k com.avito.android.universal_map.map.common.marker.a aVar, @k AvitoMapAttachHelper avitoMapAttachHelper, @k FragmentManager fragmentManager, @k l<? super AbstractC47541a, G0> lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f437553b = view;
        this.f437554c = aVar;
        this.f437555d = avitoMapAttachHelper;
        this.f437556e = lVar;
        this.f437557f = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.map_overlay), R.id.map, interfaceC28373a, 0, 0, 24, null);
        View viewFindViewById = view.findViewById(R.id.find_me_button);
        this.f437558g = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.map);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.avito_map.AvitoMapView");
        }
        this.f437559h = (AvitoMapView) viewFindViewById2;
        this.f437561j = new LinkedHashMap();
        this.f437562k = B0.f406639b;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC48048b(this, 0));
    }

    @Y61.l
    public final AvitoMapBounds a() {
        AvitoMap avitoMap = this.f437560i;
        if (avitoMap != null) {
            return avitoMap.getMapBounds();
        }
        return null;
    }

    public final void b() {
        AvitoMap avitoMap = this.f437560i;
        if (avitoMap != null) {
            avitoMap.clearMoveEndListeners();
        }
        AvitoMap avitoMap2 = this.f437560i;
        if (avitoMap2 != null) {
            avitoMap2.clearMarkerClickListeners();
        }
        AvitoMap avitoMap3 = this.f437560i;
        if (avitoMap3 != null) {
            avitoMap3.addMoveEndListener(new a());
        }
        AvitoMap avitoMap4 = this.f437560i;
        if (avitoMap4 != null) {
            avitoMap4.addMarkerClickListener(new b());
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    public final void onMapAttach(@k AvitoMap avitoMap) {
        this.f437560i = avitoMap;
        AvitoMapUiSettings uiSettings = avitoMap.getUiSettings();
        uiSettings.isRotateGesturesEnabled(false);
        uiSettings.isTiltGesturesEnabled(false);
        b();
        this.f437556e.invoke(AbstractC47541a.b.e.f429680a);
    }
}
