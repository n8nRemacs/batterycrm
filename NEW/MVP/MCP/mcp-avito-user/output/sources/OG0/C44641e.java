package oG0;

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
import com.avito.android.progress_overlay.l;
import com.avito.android.util.D6;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import oG0.InterfaceC44640d;
import pG0.AbstractC46950b;
import qG0.C47290a;

/* compiled from: UniversalMapView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LoG0/e;", "LoG0/d;", "LpG0/b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oG0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44641e extends AbstractC46950b implements InterfaceC44640d {

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.universal_map.map.common.marker.a f419657l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final l f419658m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f419659n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f419660o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final LinkedHashMap f419661p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public InterfaceC44640d.b f419662q;

    /* compiled from: UniversalMapView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"oG0/e$a", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oG0.e$a */
    public static final class a implements AvitoMap.MapMoveEndListener {
        public a() {
        }

        @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
        public final void onMapSettled(@k AvitoMapCameraPosition avitoMapCameraPosition) {
            AvitoMapBounds mapBounds;
            AvitoMapBounds viewportBounds;
            C44641e c44641e = C44641e.this;
            AvitoMap avitoMap = c44641e.f428295k;
            AvitoMapBounds mapBounds2 = avitoMap != null ? avitoMap.getMapBounds() : null;
            if (mapBounds2 != null) {
                float[] fArr = new float[1];
                Location.distanceBetween(mapBounds2.getTopLeft().getLatitude(), mapBounds2.getTopLeft().getLongitude(), mapBounds2.getBottomRight().getLatitude(), mapBounds2.getBottomRight().getLongitude(), fArr);
                float f12 = fArr[0];
                AvitoMapPoint mapPoint = avitoMapCameraPosition.getMapPoint();
                float zoomLevel = avitoMapCameraPosition.getZoomLevel();
                AvitoMap avitoMap2 = c44641e.f428295k;
                if (avitoMap2 == null || (mapBounds = avitoMap2.getMapBounds()) == null || (viewportBounds = avitoMapCameraPosition.getViewportBounds()) == null) {
                    return;
                }
                c44641e.f428289e.accept(new C47290a(avitoMapCameraPosition, viewportBounds, mapBounds.getTopLeft(), mapBounds.getBottomRight(), Float.valueOf(f12), c44641e.f419657l.a(mapPoint.getLatitude(), zoomLevel)));
            }
        }
    }

    /* compiled from: UniversalMapView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"oG0/e$b", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oG0.e$b */
    public static final class b implements AvitoMap.MarkerClickListener {
        public b() {
        }

        @Override // com.avito.android.avito_map.AvitoMap.MarkerClickListener
        public final void onMarkerClicked(@Y61.l Object obj) {
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                C44641e c44641e = C44641e.this;
                D6.w(c44641e.f428290f);
                c44641e.f419659n.accept(str);
            }
        }
    }

    public C44641e(@k View view, @k InterfaceC28373a interfaceC28373a, @k com.avito.android.universal_map.map.common.marker.a aVar, @k AvitoMapAttachHelper avitoMapAttachHelper, @k FragmentManager fragmentManager) {
        super(view, avitoMapAttachHelper, fragmentManager);
        this.f419657l = aVar;
        this.f419658m = new l((ViewGroup) view.findViewById(R.id.map_overlay), R.id.map, interfaceC28373a, 0, 0, 24, null);
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f419659n = cVar;
        this.f419660o = cVar;
        this.f419661p = new LinkedHashMap();
    }

    @Override // pG0.AbstractC46950b, com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    public final void onMapAttach(@k AvitoMap avitoMap) {
        super.onMapAttach(avitoMap);
        avitoMap.addMoveEndListener(new a());
        avitoMap.addMarkerClickListener(new b());
    }
}
