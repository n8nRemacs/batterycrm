package com.avito.android.advert_core.map;

import com.avito.android.advert_core.analytics.address.GeoFromBlock;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.developments_catalog.AmenityPin;
import com.avito.android.remote.model.developments_catalog.MapPreview;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertMapItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_core/map/e;", "Lcom/avito/android/advert_core/map/d;", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d, AvitoMap.MapClickListener, AvitoMap.MarkerClickListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public j f83757b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public F9.a f83758c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public g f83759d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public AdvertMapItem f83760e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_core.map.a f83761f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f83762g = C42727D.c(new a());

    /* compiled from: AdvertMapItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/advert_core/map/l;", "invoke", "()Lcom/avito/android/advert_core/map/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<l> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            return new l(e.this);
        }
    }

    @Inject
    public e() {
    }

    @Override // com.avito.android.advert_core.map.d
    public final boolean B4() {
        g gVar = this.f83759d;
        if (gVar != null) {
            return gVar.B4();
        }
        return false;
    }

    @Override // com.avito.android.advert_core.map.d
    public final void C4() {
        g gVar;
        com.avito.android.advert_core.map.a aVar = this.f83761f;
        if (aVar == null || (gVar = this.f83759d) == null) {
            return;
        }
        gVar.Eq(aVar, this, this);
    }

    @Override // com.avito.android.advert_core.map.d
    @Y61.k
    public final l D4() {
        return (l) this.f83762g.getValue();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertMapItem advertMapItem = (AdvertMapItem) aVar;
        this.f83759d = gVar;
        this.f83760e = advertMapItem;
        Coordinates coordinates = advertMapItem.f83724h;
        AvitoMapPoint avitoMapPoint = new AvitoMapPoint(coordinates.getLatitude(), coordinates.getLongitude(), null, 4, null);
        MapPreview mapPreview = advertMapItem.f83727k;
        List<AmenityPin> pins = mapPreview != null ? mapPreview.getPins() : null;
        ArrayList arrayList = new ArrayList();
        if (pins != null) {
            for (AmenityPin amenityPin : pins) {
                String id2 = amenityPin.getId();
                String type = amenityPin.getType();
                Color color = amenityPin.getColor();
                arrayList.add(new MarkerItem.LitePin(id2, type, color != null ? Integer.valueOf(color.getValue()) : null, amenityPin.getTitle(), new LatLng(amenityPin.getCoordinates().getLatitude(), amenityPin.getCoordinates().getLongitude()), false, 32, null));
                mapPreview = mapPreview;
                gVar = gVar;
            }
        }
        g gVar2 = gVar;
        MapPreview mapPreview2 = mapPreview;
        String header = mapPreview2 != null ? mapPreview2.getHeader() : null;
        if (advertMapItem.f83738v) {
            header = null;
        }
        com.avito.android.advert_core.map.a aVar2 = new com.avito.android.advert_core.map.a(avitoMapPoint, arrayList, header, mapPreview2 != null ? mapPreview2.getObjects() : null, mapPreview2 != null ? mapPreview2.getDistance() : null, advertMapItem.f83731o, advertMapItem.f83732p);
        gVar2.B20(aVar2);
        this.f83761f = aVar2;
    }

    public final void k() {
        AdvertMapItem advertMapItem = this.f83760e;
        if (advertMapItem == null) {
            return;
        }
        j jVar = this.f83757b;
        if (jVar != null) {
            jVar.p(advertMapItem.f83718b, advertMapItem.f83725i, null, advertMapItem.f83724h, advertMapItem.f83721e, advertMapItem.f83722f, advertMapItem.f83723g, null, advertMapItem.f83726j, false, advertMapItem.f83728l, advertMapItem.f83729m, advertMapItem.f83730n, null, advertMapItem.f83720d, advertMapItem.f83739w, advertMapItem.f83740x, advertMapItem.f83741y, false);
        }
        F9.a aVar = this.f83758c;
        if (aVar != null) {
            GeoFromBlock geoFromBlock = GeoFromBlock.f82792f;
            aVar.V(advertMapItem.f83718b, advertMapItem.f83719c, advertMapItem.f83720d, geoFromBlock);
        }
    }

    @Override // com.avito.android.advert_core.map.d
    public final void m7(@Y61.k j jVar, @Y61.l F9.a aVar) {
        this.f83757b = jVar;
        this.f83758c = aVar;
        g gVar = this.f83759d;
        if (gVar != null) {
            gVar.onStart();
        }
    }

    @Override // com.avito.android.advert_core.map.d
    public final void onDestroyView() {
        g gVar = this.f83759d;
        if (gVar != null) {
            gVar.onDestroyView();
        }
        this.f83759d = null;
        this.f83760e = null;
    }

    @Override // com.avito.android.advert_core.map.d
    public final void onLowMemory() {
        g gVar = this.f83759d;
        if (gVar != null) {
            gVar.onLowMemory();
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapClickListener
    public final void onMapClicked(@Y61.k AvitoMapTarget avitoMapTarget) {
        k();
    }

    @Override // com.avito.android.avito_map.AvitoMap.MarkerClickListener
    public final void onMarkerClicked(@Y61.l Object obj) {
        k();
    }

    @Override // com.avito.android.advert_core.map.d
    public final void onStop() {
        this.f83757b = null;
        this.f83758c = null;
        g gVar = this.f83759d;
        if (gVar != null) {
            gVar.onStop();
        }
    }
}
