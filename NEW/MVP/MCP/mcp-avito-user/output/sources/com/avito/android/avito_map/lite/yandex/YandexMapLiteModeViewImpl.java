package com.avito.android.avito_map.lite.yandex;

import Y61.k;
import Y61.l;
import com.avito.android.avito_map.AvitoFittingBoundsBuilder;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.avito_map.google.AvitoGoogleMapKt;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.lite.MapLiteModeView;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import com.avito.android.avito_map.resolvers.MarkerAnchorResolver;
import com.avito.android.avito_map.resolvers.MarkerAnchorResolverImpl;
import com.avito.android.avito_map.resolvers.MarkerZIndexResolver;
import com.avito.android.avito_map.resolvers.MarkerZIndexResolverImpl;
import com.avito.android.avito_map.yandex.AvitoYandexMap;
import com.google.android.gms.maps.model.LatLng;
import com.vk.id.captcha.web.h;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.mapview.MapView;
import j.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: YandexMapLiteModeViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u001d\u0010\u001a\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\fJO\u0010%\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010\fJ\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\fJ\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\fJ\u000f\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00107R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00108R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00109R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010AR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010A¨\u0006B"}, d2 = {"Lcom/avito/android/avito_map/lite/yandex/YandexMapLiteModeViewImpl;", "Lcom/avito/android/avito_map/lite/MapLiteModeView;", "Lcom/yandex/mapkit/mapview/MapView;", "mapView", "Lcom/avito/android/avito_map/icon_factory/AvitoMarkerIconFactory;", "markerIconFactory", "", "themeResId", "<init>", "(Lcom/yandex/mapkit/mapview/MapView;Lcom/avito/android/avito_map/icon_factory/AvitoMarkerIconFactory;I)V", "Lkotlin/G0;", "addNecessaryToMap", "()V", "Lcom/avito/android/avito_map/AvitoMapPoint;", "point", "addMainPoint", "(Lcom/avito/android/avito_map/AvitoMapPoint;)V", "", "Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "pins", "addPinsOnMap", "(Ljava/util/List;)V", "setZoomOnMap", "(Ljava/util/List;Lcom/avito/android/avito_map/AvitoMapPoint;)V", "moveToPoint", "points", "moveToPoints", "clean", "mainPoint", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "clickListener", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "markerClickListener", "", "centerToMainPoint", "fitPinsToBounds", "addPinOnMainPoint", "bindView", "(Lcom/avito/android/avito_map/AvitoMapPoint;Ljava/util/List;Lcom/avito/android/avito_map/AvitoMap$MapClickListener;Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;ZZZ)V", "onStart", "onStop", "onDestroyView", "onLowMemory", "Lcom/yandex/mapkit/mapview/MapView;", "Lcom/avito/android/avito_map/icon_factory/AvitoMarkerIconFactory;", "I", "Lcom/avito/android/avito_map/resolvers/MarkerAnchorResolver;", "anchorResolver", "Lcom/avito/android/avito_map/resolvers/MarkerAnchorResolver;", "Lcom/avito/android/avito_map/resolvers/MarkerZIndexResolver;", "zIndexResolver", "Lcom/avito/android/avito_map/resolvers/MarkerZIndexResolver;", "Lcom/avito/android/avito_map/yandex/AvitoYandexMap;", "avitoMap", "Lcom/avito/android/avito_map/yandex/AvitoYandexMap;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "Ljava/util/List;", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "Lcom/avito/android/avito_map/AvitoMapBounds;", "fittingBounds", "Lcom/avito/android/avito_map/AvitoMapBounds;", "", "zoomLevel", "Ljava/lang/Float;", "Z", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexMapLiteModeViewImpl implements MapLiteModeView {
    private boolean addPinOnMainPoint;

    @k
    private final MarkerAnchorResolver anchorResolver;

    @l
    private AvitoYandexMap avitoMap;
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
    private final int themeResId;

    @k
    private final MarkerZIndexResolver zIndexResolver;

    @l
    private Float zoomLevel;

    public YandexMapLiteModeViewImpl(@k MapView mapView, @l AvitoMarkerIconFactory avitoMarkerIconFactory, @f0 int i12) {
        this.mapView = mapView;
        this.markerIconFactory = avitoMarkerIconFactory;
        this.themeResId = i12;
        this.anchorResolver = new MarkerAnchorResolverImpl();
        this.zIndexResolver = new MarkerZIndexResolverImpl();
        this.pins = C42784z0.f406748b;
        this.addPinOnMainPoint = true;
    }

    private final void addMainPoint(AvitoMapPoint point) {
        AvitoYandexMap avitoYandexMap = this.avitoMap;
        if (avitoYandexMap != null) {
            avitoYandexMap.addMarker(point, AvitoMapMarker.Type.MARKER_PIN_DEFAULT_RED, AvitoMapMarker.Anchor.CENTER, Float.valueOf(1.0f), this.themeResId);
        }
    }

    private final void addNecessaryToMap() {
        AvitoMapPoint avitoMapPoint;
        AvitoYandexMap avitoYandexMap = this.avitoMap;
        if (avitoYandexMap == null) {
            return;
        }
        if (this.addPinOnMainPoint && (avitoMapPoint = this.mainPoint) != null) {
            addMainPoint(avitoMapPoint);
        }
        setZoomOnMap(this.pins, this.mainPoint);
        addPinsOnMap(this.pins);
        AvitoMapUiSettings uiSettings = avitoYandexMap.getUiSettings();
        uiSettings.isRotateGesturesEnabled(false);
        uiSettings.isTiltGesturesEnabled(false);
        uiSettings.isZoomGesturesEnabled(false);
        uiSettings.isFastTapEnabled(false);
        uiSettings.isMoveGesturesEnabled(false);
        avitoYandexMap.addMarkerClickListener(this.markerClickListener);
        avitoYandexMap.addMapClickListener(this.clickListener);
    }

    private final void addPinsOnMap(List<? extends AvitoMarkerItem> pins) {
        this.mapView.post(new h(26, this, pins));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addPinsOnMap$lambda$5(YandexMapLiteModeViewImpl yandexMapLiteModeViewImpl, List list) {
        AvitoMarkerIconFactory avitoMarkerIconFactory = yandexMapLiteModeViewImpl.markerIconFactory;
        if (avitoMarkerIconFactory != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AvitoMarkerItem avitoMarkerItem = (AvitoMarkerItem) it.next();
                LatLng coordinates = avitoMarkerItem.getF304960b();
                AvitoYandexMap avitoYandexMap = yandexMapLiteModeViewImpl.avitoMap;
                if (avitoYandexMap != null) {
                    avitoYandexMap.addMarker(AvitoGoogleMapKt.toAvitoMapPoint(coordinates), avitoMarkerIconFactory.getIcon(avitoMarkerItem), (AvitoMapMarker.AvitoMapAnchor) yandexMapLiteModeViewImpl.anchorResolver.resolveAnchor(avitoMarkerItem), Float.valueOf(yandexMapLiteModeViewImpl.zIndexResolver.resolveZIndex(avitoMarkerItem)), true);
                }
            }
        }
    }

    private final void clean() {
        this.avitoMap = null;
        this.mainPoint = null;
        this.pins = C42784z0.f406748b;
        this.clickListener = null;
        this.markerClickListener = null;
        this.fittingBounds = null;
        this.zoomLevel = null;
        this.centerToMainPoint = false;
        this.addPinOnMainPoint = false;
    }

    private final void moveToPoint(AvitoMapPoint point) {
        AvitoYandexMap avitoYandexMap = this.avitoMap;
        if (avitoYandexMap != null) {
            avitoYandexMap.moveTo(point, false, Float.valueOf(16.0f));
        }
    }

    private final void moveToPoints(List<AvitoMapPoint> points) {
        AvitoYandexMap avitoYandexMap = this.avitoMap;
        if (avitoYandexMap != null) {
            AvitoMarkerIconFactory avitoMarkerIconFactory = this.markerIconFactory;
            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoYandexMap, points, avitoMarkerIconFactory != null ? Integer.valueOf(avitoMarkerIconFactory.getF1367g()) : null, null, false, null, 20, null);
        }
        AvitoYandexMap avitoYandexMap2 = this.avitoMap;
        if (avitoYandexMap2 != null) {
            AvitoMap.DefaultImpls.zoomOut$default(avitoYandexMap2, 1.0f, false, 2, null);
        }
    }

    private final void setZoomOnMap(List<? extends AvitoMarkerItem> pins, AvitoMapPoint point) {
        AvitoMapCameraPosition mapCameraPosition;
        AvitoMapBounds avitoMapBounds = this.fittingBounds;
        Float f12 = this.zoomLevel;
        if (avitoMapBounds != null) {
            AvitoYandexMap avitoYandexMap = this.avitoMap;
            if (avitoYandexMap != null) {
                avitoYandexMap.moveToBounds(avitoMapBounds, false, 0);
            }
            if (f12 == null) {
                AvitoYandexMap avitoYandexMap2 = this.avitoMap;
                this.zoomLevel = (avitoYandexMap2 == null || (mapCameraPosition = avitoYandexMap2.getMapCameraPosition()) == null) ? null : Float.valueOf(mapCameraPosition.getZoomLevel());
                return;
            } else {
                AvitoYandexMap avitoYandexMap3 = this.avitoMap;
                if (avitoYandexMap3 != null) {
                    AvitoMap.DefaultImpls.zoomTo$default(avitoYandexMap3, f12.floatValue(), false, null, 6, null);
                    return;
                }
                return;
            }
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
            this.mapView.onStart();
            MapKitFactory.getInstance().onStart();
            MapView mapView = this.mapView;
            this.avitoMap = new AvitoYandexMap(mapView, mapView.getContext());
            addNecessaryToMap();
        }
    }

    @Override // com.avito.android.avito_map.lite.MapLiteModeView
    public void onDestroyView() {
        clean();
    }

    @Override // com.avito.android.avito_map.lite.MapLiteModeView
    public void onLowMemory() {
        AvitoYandexMap avitoYandexMap = this.avitoMap;
        if (avitoYandexMap != null) {
            avitoYandexMap.onLowMemory();
        }
    }

    @Override // com.avito.android.avito_map.lite.MapLiteModeView
    public void onStart() {
        AvitoYandexMap avitoYandexMap = this.avitoMap;
        if (avitoYandexMap != null) {
            avitoYandexMap.onStart();
        }
        addNecessaryToMap();
    }

    @Override // com.avito.android.avito_map.lite.MapLiteModeView
    public void onStop() {
        AvitoYandexMap avitoYandexMap = this.avitoMap;
        if (avitoYandexMap != null) {
            avitoYandexMap.onStop(true);
        }
    }

    public /* synthetic */ YandexMapLiteModeViewImpl(MapView mapView, AvitoMarkerIconFactory avitoMarkerIconFactory, int i12, int i13, C42822w c42822w) {
        this(mapView, (i13 & 2) != 0 ? null : avitoMarkerIconFactory, i12);
    }
}
