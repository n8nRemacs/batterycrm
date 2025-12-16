package com.avito.android.avito_map.lite.google;

import Y61.k;
import Y61.l;
import android.os.RemoteException;
import android.os.StrictMode;
import com.avito.android.avito_map.AvitoFittingBoundsBuilder;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.avito_map.google.AvitoGoogleMap;
import com.avito.android.avito_map.google.AvitoGoogleMapKt;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.lite.MapLiteModeView;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import com.avito.android.avito_map.resolvers.MarkerAnchorResolver;
import com.avito.android.avito_map.resolvers.MarkerAnchorResolverImpl;
import com.avito.android.avito_map.resolvers.MarkerZIndexResolver;
import com.avito.android.avito_map.resolvers.MarkerZIndexResolverImpl;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.C36806c;
import com.google.android.gms.maps.C36809f;
import com.google.android.gms.maps.InterfaceC36810g;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.vk.id.captcha.web.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GoogleMapLiteModeViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u001d\u0010\u0019\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0014JO\u0010#\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u000bJ\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u000bJ\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u000bJ\u0019\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00109R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010:R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010<¨\u0006@"}, d2 = {"Lcom/avito/android/avito_map/lite/google/GoogleMapLiteModeViewImpl;", "Lcom/avito/android/avito_map/lite/MapLiteModeView;", "Lcom/google/android/gms/maps/g;", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lcom/avito/android/avito_map/icon_factory/AvitoMarkerIconFactory;", "markerIconFactory", "<init>", "(Lcom/google/android/gms/maps/MapView;Lcom/avito/android/avito_map/icon_factory/AvitoMarkerIconFactory;)V", "Lkotlin/G0;", "addNecessaryToMap", "()V", "Lcom/avito/android/avito_map/AvitoMapPoint;", "point", "addMainPoint", "(Lcom/avito/android/avito_map/AvitoMapPoint;)V", "", "Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "pins", "addPinsOnMap", "(Ljava/util/List;)V", "setZoomOnMap", "(Ljava/util/List;Lcom/avito/android/avito_map/AvitoMapPoint;)V", "moveToPoint", "points", "moveToPoints", "mainPoint", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "clickListener", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "markerClickListener", "", "centerToMainPoint", "fitPinsToBounds", "addPinOnMainPoint", "bindView", "(Lcom/avito/android/avito_map/AvitoMapPoint;Ljava/util/List;Lcom/avito/android/avito_map/AvitoMap$MapClickListener;Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;ZZZ)V", "onStart", "onStop", "onDestroyView", "onLowMemory", "Lcom/google/android/gms/maps/c;", "googleMap", "onMapReady", "(Lcom/google/android/gms/maps/c;)V", "Lcom/google/android/gms/maps/MapView;", "Lcom/avito/android/avito_map/icon_factory/AvitoMarkerIconFactory;", "Lcom/avito/android/avito_map/resolvers/MarkerAnchorResolver;", "anchorResolver", "Lcom/avito/android/avito_map/resolvers/MarkerAnchorResolver;", "Lcom/avito/android/avito_map/resolvers/MarkerZIndexResolver;", "zIndexResolver", "Lcom/avito/android/avito_map/resolvers/MarkerZIndexResolver;", "Lcom/avito/android/avito_map/google/AvitoGoogleMap;", "avitoMap", "Lcom/avito/android/avito_map/google/AvitoGoogleMap;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "Ljava/util/List;", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "Z", "Lcom/avito/android/avito_map/AvitoMapBounds;", "fittingBounds", "Lcom/avito/android/avito_map/AvitoMapBounds;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GoogleMapLiteModeViewImpl implements MapLiteModeView, InterfaceC36810g {
    private boolean addPinOnMainPoint;

    @k
    private final MarkerAnchorResolver anchorResolver;

    @l
    private AvitoGoogleMap avitoMap;
    private boolean centerToMainPoint;

    @l
    private AvitoMap.MapClickListener clickListener;

    @l
    private AvitoMapBounds fittingBounds;

    @l
    private AvitoMapPoint mainPoint;

    @k
    private final MapView mapView;

    @l
    private AvitoMap.MarkerClickListener markerClickListener;

    @l
    private final AvitoMarkerIconFactory markerIconFactory;

    @k
    private List<? extends AvitoMarkerItem> pins;

    @k
    private final MarkerZIndexResolver zIndexResolver;

    public GoogleMapLiteModeViewImpl(@k MapView mapView, @l AvitoMarkerIconFactory avitoMarkerIconFactory) {
        this.mapView = mapView;
        this.markerIconFactory = avitoMarkerIconFactory;
        this.anchorResolver = new MarkerAnchorResolverImpl();
        this.zIndexResolver = new MarkerZIndexResolverImpl();
        this.pins = C42784z0.f406748b;
        this.addPinOnMainPoint = true;
    }

    private final void addMainPoint(AvitoMapPoint point) {
        AvitoGoogleMap avitoGoogleMap = this.avitoMap;
        if (avitoGoogleMap != null) {
            avitoGoogleMap.addMarker(point, AvitoMapMarker.Type.MARKER_PIN_DEFAULT_RED, AvitoMapMarker.Anchor.CENTER, Float.valueOf(1.0f), 0);
        }
    }

    private final void addNecessaryToMap() {
        AvitoMapPoint avitoMapPoint;
        AvitoGoogleMap avitoGoogleMap = this.avitoMap;
        if (avitoGoogleMap == null) {
            return;
        }
        if (this.addPinOnMainPoint && (avitoMapPoint = this.mainPoint) != null) {
            addMainPoint(avitoMapPoint);
        }
        setZoomOnMap(this.pins, this.mainPoint);
        addPinsOnMap(this.pins);
        AvitoMapUiSettings uiSettings = avitoGoogleMap.getUiSettings();
        uiSettings.isMyLocationButtonEnabled(false);
        uiSettings.isRotateGesturesEnabled(false);
        uiSettings.isTiltGesturesEnabled(false);
        uiSettings.isCompassEnabled(false);
        uiSettings.isMapToolbarEnabled(false);
        avitoGoogleMap.addMapClickListener(this.clickListener);
        avitoGoogleMap.addMarkerClickListener(this.markerClickListener);
    }

    private final void addPinsOnMap(List<? extends AvitoMarkerItem> pins) {
        this.mapView.post(new h(25, this, pins));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addPinsOnMap$lambda$6(GoogleMapLiteModeViewImpl googleMapLiteModeViewImpl, List list) {
        AvitoMarkerIconFactory avitoMarkerIconFactory = googleMapLiteModeViewImpl.markerIconFactory;
        if (avitoMarkerIconFactory != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AvitoMarkerItem avitoMarkerItem = (AvitoMarkerItem) it.next();
                LatLng coordinates = avitoMarkerItem.getF304960b();
                AvitoGoogleMap avitoGoogleMap = googleMapLiteModeViewImpl.avitoMap;
                if (avitoGoogleMap != null) {
                    avitoGoogleMap.addMarker(AvitoGoogleMapKt.toAvitoMapPoint(coordinates), avitoMarkerIconFactory.getIcon(avitoMarkerItem), (AvitoMapMarker.AvitoMapAnchor) googleMapLiteModeViewImpl.anchorResolver.resolveAnchor(avitoMarkerItem), Float.valueOf(googleMapLiteModeViewImpl.zIndexResolver.resolveZIndex(avitoMarkerItem)), true);
                }
            }
        }
    }

    private final void moveToPoint(AvitoMapPoint point) {
        AvitoGoogleMap avitoGoogleMap = this.avitoMap;
        if (avitoGoogleMap != null) {
            avitoGoogleMap.moveTo(point, false, Float.valueOf(16.0f));
        }
    }

    private final void moveToPoints(List<AvitoMapPoint> points) {
        AvitoGoogleMap avitoGoogleMap = this.avitoMap;
        if (avitoGoogleMap != null) {
            AvitoMarkerIconFactory avitoMarkerIconFactory = this.markerIconFactory;
            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoGoogleMap, points, avitoMarkerIconFactory != null ? Integer.valueOf(avitoMarkerIconFactory.getF1367g()) : null, null, false, null, 20, null);
        }
        AvitoGoogleMap avitoGoogleMap2 = this.avitoMap;
        if (avitoGoogleMap2 != null) {
            AvitoMap.DefaultImpls.zoomOut$default(avitoGoogleMap2, 1.0f, false, 2, null);
        }
    }

    private final void setZoomOnMap(List<? extends AvitoMarkerItem> pins, AvitoMapPoint point) {
        AvitoMapBounds avitoMapBounds = this.fittingBounds;
        if (avitoMapBounds != null) {
            AvitoGoogleMap avitoGoogleMap = this.avitoMap;
            if (avitoGoogleMap != null) {
                avitoGoogleMap.moveToBounds(avitoMapBounds, false, 0);
                return;
            }
            return;
        }
        if (pins.isEmpty() || this.centerToMainPoint) {
            if (point != null) {
                moveToPoint(point);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<? extends AvitoMarkerItem> list = pins;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(AvitoGoogleMapKt.toAvitoMapPoint(((AvitoMarkerItem) it.next()).getF304960b()));
        }
        C42745f0.h(arrayList2, arrayList);
        if (point != null) {
            arrayList.add(point);
        }
        moveToPoints(arrayList);
    }

    @Override // com.avito.android.avito_map.lite.MapLiteModeView
    public void bindView(@l AvitoMapPoint mainPoint, @k List<? extends AvitoMarkerItem> pins, @k AvitoMap.MapClickListener clickListener, @k AvitoMap.MarkerClickListener markerClickListener, boolean centerToMainPoint, boolean fitPinsToBounds, boolean addPinOnMainPoint) {
        if (this.avitoMap == null) {
            this.mainPoint = mainPoint;
            this.clickListener = clickListener;
            this.markerClickListener = markerClickListener;
            this.pins = pins;
            this.centerToMainPoint = centerToMainPoint;
            this.addPinOnMainPoint = addPinOnMainPoint;
            if (fitPinsToBounds) {
                List<? extends AvitoMarkerItem> list = pins;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AvitoGoogleMapKt.toAvitoMapPoint(((AvitoMarkerItem) it.next()).getF304960b()));
                }
                AvitoFittingBoundsBuilder avitoFittingBoundsBuilder = new AvitoFittingBoundsBuilder(arrayList);
                if (!centerToMainPoint) {
                    mainPoint = null;
                }
                this.fittingBounds = avitoFittingBoundsBuilder.setCenterPoint(mainPoint).build();
            }
            MapView mapView = this.mapView;
            MapView.b bVar = mapView.f354316b;
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                bVar.b(null);
                if (bVar.f349638a == null) {
                    a.j(mapView);
                }
                StrictMode.setThreadPolicy(threadPolicy);
                this.mapView.a(this);
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        }
    }

    @Override // com.avito.android.avito_map.lite.MapLiteModeView
    public void onDestroyView() {
        this.mapView.f354316b.d();
    }

    @Override // com.avito.android.avito_map.lite.MapLiteModeView
    public void onLowMemory() {
        e eVar = this.mapView.f354316b.f349638a;
        if (eVar != null) {
            eVar.onLowMemory();
        }
    }

    @Override // com.google.android.gms.maps.InterfaceC36810g
    public void onMapReady(@l C36806c googleMap) {
        C36809f.a(this.mapView.getContext());
        if (googleMap != null) {
            this.avitoMap = new AvitoGoogleMap(googleMap, this.mapView.getContext());
            try {
                googleMap.f354354a.Z1();
                addNecessaryToMap();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }
    }

    @Override // com.avito.android.avito_map.lite.MapLiteModeView
    public void onStart() {
        this.mapView.f354316b.h();
    }

    @Override // com.avito.android.avito_map.lite.MapLiteModeView
    public void onStop() {
        this.mapView.f354316b.i();
    }

    public /* synthetic */ GoogleMapLiteModeViewImpl(MapView mapView, AvitoMarkerIconFactory avitoMarkerIconFactory, int i12, C42822w c42822w) {
        this(mapView, (i12 & 2) != 0 ? null : avitoMarkerIconFactory);
    }
}
