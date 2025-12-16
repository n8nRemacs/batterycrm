package com.avito.android.map.view;

import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import bY.InterfaceC25585b;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.avito_map.alignment.AvitoMapHorizontalAlignment;
import com.avito.android.avito_map.alignment.AvitoMapVerticalAlignment;
import com.avito.android.avito_map.google.AvitoGoogleMapKt;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.avito_map.marker.MarkerWithBrand;
import com.avito.android.avito_map.marker.MarkerWithId;
import com.avito.android.avito_map.resolvers.MarkerAnchorResolver;
import com.avito.android.avito_map.resolvers.MarkerZIndexResolver;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import dY.InterfaceC39638a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MapViewInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/view/C;", "Lcom/avito/android/map/view/u;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class C implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AvitoMarkerIconFactory f185333a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39638a f185334b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.view.a f185335c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final MarkerAnchorResolver f185336d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final MarkerZIndexResolver f185337e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ZX.b f185338f;

    /* renamed from: g, reason: collision with root package name */
    public Y41.l<? super InterfaceC25585b, G0> f185339g;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Q<? extends MarkerItem, ? extends AvitoMapMarker> f185342j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public LatLngBounds f185343k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public LatLngBounds f185344l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public InterfaceC42726C<? extends AvitoMap> f185345m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f185346n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f185347o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f185348p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f185350r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f185351s;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f185340h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f185341i = new LinkedHashSet();

    /* renamed from: q, reason: collision with root package name */
    public boolean f185349q = true;

    /* compiled from: MapViewInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/avito_map/AvitoMap;", "map", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/avito_map/AvitoMap;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<AvitoMap, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC25585b, G0> f185353m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super InterfaceC25585b, G0> lVar) {
            super(1);
            this.f185353m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(AvitoMap avitoMap) {
            AvitoMap avitoMap2 = avitoMap;
            C c12 = C.this;
            c12.f185338f.f();
            c12.f185345m = C42727D.c(new x(avitoMap2));
            AvitoMapUiSettings uiSettings = avitoMap2.getUiSettings();
            uiSettings.isRotateGesturesEnabled(false);
            uiSettings.isTiltGesturesEnabled(false);
            uiSettings.isCompassEnabled(false);
            uiSettings.isMyLocationButtonEnabled(false);
            avitoMap2.setMaxZoomPreference(18.0f);
            avitoMap2.setMinZoomPreference(2.0f);
            avitoMap2.setLogoAlignment(AvitoMapHorizontalAlignment.LEFT, AvitoMapVerticalAlignment.BOTTOM);
            avitoMap2.distinctSameMoveEvent(true);
            Y41.l<InterfaceC25585b, G0> lVar = this.f185353m;
            avitoMap2.addMoveEndListener(new y(c12, lVar));
            avitoMap2.addMoveStartListener(new z(c12, lVar));
            avitoMap2.addMarkerClickListener(new A(c12, lVar));
            avitoMap2.addMapClickListener(new B(lVar));
            return G0.f406611a;
        }
    }

    @Inject
    public C(@Y61.k AvitoMarkerIconFactory avitoMarkerIconFactory, @Y61.k InterfaceC39638a interfaceC39638a, @Y61.k com.avito.android.map_core.view.a aVar, @Y61.k MarkerAnchorResolver markerAnchorResolver, @Y61.k MarkerZIndexResolver markerZIndexResolver, @Y61.k ZX.b bVar) {
        this.f185333a = avitoMarkerIconFactory;
        this.f185334b = interfaceC39638a;
        this.f185335c = aVar;
        this.f185336d = markerAnchorResolver;
        this.f185337e = markerZIndexResolver;
        this.f185338f = bVar;
    }

    @Override // com.avito.android.map.view.u
    public final void a() {
        AvitoMap value;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C != null && (value = interfaceC42726C.getValue()) != null) {
            value.clearMoveStartListeners();
            value.clearMoveEndListeners();
            AvitoMap.DefaultImpls.onStop$default(value, false, 1, null);
        }
        this.f185340h.clear();
        this.f185341i.clear();
        this.f185342j = null;
        this.f185343k = null;
        this.f185344l = null;
        this.f185345m = null;
        this.f185346n = false;
        this.f185347o = false;
        this.f185348p = false;
        this.f185349q = true;
        this.f185350r = false;
        this.f185351s = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.map.view.u
    public final void b(@Y61.k MarkerItem.MyLocation myLocation) {
        AvitoMap value;
        AvitoMapMarker avitoMapMarker;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C;
        AvitoMap value2;
        Q<? extends MarkerItem, ? extends AvitoMapMarker> q12;
        AvitoMapBounds avitoMapBounds;
        AvitoMapPoint position;
        AvitoMapMarker avitoMapMarker2;
        Q<? extends MarkerItem, ? extends AvitoMapMarker> q13 = this.f185342j;
        if (L.f(q13 != null ? (MarkerItem) q13.f406619b : null, myLocation) && ((q12 = this.f185342j) == null || (avitoMapMarker2 = (AvitoMapMarker) q12.f406620c) == null || avitoMapMarker2.isVisible())) {
            LatLngBounds latLngBounds = this.f185343k;
            if (latLngBounds == null || (avitoMapBounds = AvitoGoogleMapKt.toAvitoMapBounds(latLngBounds)) == null) {
                LatLngBounds latLngBounds2 = this.f185344l;
                avitoMapBounds = latLngBounds2 != null ? AvitoGoogleMapKt.toAvitoMapBounds(latLngBounds2) : null;
            }
            Q<? extends MarkerItem, ? extends AvitoMapMarker> q14 = this.f185342j;
            AvitoMapMarker avitoMapMarker3 = q14 != null ? (AvitoMapMarker) q14.f406620c : null;
            if ((avitoMapMarker3 == null || (position = avitoMapMarker3.getPosition()) == null || avitoMapBounds == null) ? false : avitoMapBounds.contains(position)) {
                return;
            }
        }
        Q<? extends MarkerItem, ? extends AvitoMapMarker> q15 = this.f185342j;
        if (q15 != null && (avitoMapMarker = (AvitoMapMarker) q15.f406620c) != null && (interfaceC42726C = this.f185345m) != null && (value2 = interfaceC42726C.getValue()) != null) {
            AvitoMap.DefaultImpls.removeMarker$default(value2, avitoMapMarker, false, 2, null);
        }
        this.f185342j = null;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C2 = this.f185345m;
        if (interfaceC42726C2 != null && (value = interfaceC42726C2.getValue()) != null) {
            this.f185342j = new Q<>(myLocation, value.addUserCoords(AvitoGoogleMapKt.toAvitoMapPoint(myLocation.getF304960b()), myLocation.isApproximated(), R.style.Theme_DesignSystem_Legacy));
        }
        Float zoomToMarker = myLocation.getZoomToMarker();
        if (zoomToMarker != null) {
            l(myLocation.getF304960b(), Float.valueOf(zoomToMarker.floatValue()));
        }
    }

    @Override // com.avito.android.map.view.u
    public final void c(@Y61.k LatLngBounds latLngBounds, boolean z12, boolean z13) {
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C;
        AvitoMap value;
        AvitoMapCameraPosition mapCameraPosition;
        AvitoMapBounds viewportBounds;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C2;
        AvitoMap value2;
        if ((!L.f(this.f185343k, latLngBounds) || z13) && !L.f(this.f185344l, latLngBounds)) {
            if (z12 || !this.f185346n || this.f185351s) {
                this.f185351s = false;
                this.f185346n = false;
                AvitoMapBounds avitoMapBoundsA = this.f185334b.a(AvitoGoogleMapKt.toAvitoMapBounds(latLngBounds));
                if ((avitoMapBoundsA != null && (avitoMapBoundsA.getTopLeft().getLatitude() <= avitoMapBoundsA.getBottomRight().getLatitude() || avitoMapBoundsA.getTopLeft().getLongitude() == avitoMapBoundsA.getBottomRight().getLongitude())) || avitoMapBoundsA == null || (interfaceC42726C = this.f185345m) == null || (value = interfaceC42726C.getValue()) == null || (mapCameraPosition = value.getMapCameraPosition()) == null || (viewportBounds = mapCameraPosition.getViewportBounds()) == null || (interfaceC42726C2 = this.f185345m) == null || (value2 = interfaceC42726C2.getValue()) == null) {
                    return;
                }
                boolean z14 = this.f185343k != null;
                if (!z12 || !z14) {
                    value2.moveToBounds(avitoMapBoundsA, false, 0);
                    this.f185343k = latLngBounds;
                    return;
                }
                if (viewportBounds.getTopLeft().getLongitude() == avitoMapBoundsA.getTopLeft().getLongitude()) {
                    if (viewportBounds.getBottomRight().getLongitude() == avitoMapBoundsA.getBottomRight().getLongitude()) {
                        return;
                    }
                }
                value2.moveToBounds(avitoMapBoundsA, !this.f185349q, 0);
                this.f185343k = latLngBounds;
            }
        }
    }

    @Override // com.avito.android.map.view.u
    public final void clearDrawing() {
        AvitoMap value;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C == null || (value = interfaceC42726C.getValue()) == null) {
            return;
        }
        value.clearDrawing();
    }

    @Override // com.avito.android.map.view.u
    public final void d(@Y61.k List list, int i12, float f12, float f13) {
        AvitoMap value;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C == null || (value = interfaceC42726C.getValue()) == null) {
            return;
        }
        AvitoMap.DefaultImpls.addPolyline$default(value, list, i12, 0.0f, i12, false, f12, f13, false, 128, null);
    }

    @Override // com.avito.android.map.view.u
    public final void e(@Y61.k Y41.l lVar, @Y61.k View view, @Y61.k FragmentManager fragmentManager) {
        this.f185339g = lVar;
        this.f185338f.k();
        this.f185335c.a(new a(lVar), view, fragmentManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.map.view.u
    public final void f(@Y61.k List<? extends MarkerItem> list) {
        LinkedHashSet<String> linkedHashSet;
        AvitoMarkerIconFactory avitoMarkerIconFactory;
        AvitoMap value;
        AvitoMap value2;
        boolean zContains;
        Object obj;
        AvitoMapMarker avitoMapMarker;
        List<? extends MarkerItem> list2 = list;
        HashSet hashSetK0 = C42745f0.K0(list2);
        LinkedHashMap linkedHashMap = this.f185340h;
        Set setKeySet = linkedHashMap.keySet();
        if (L.f(setKeySet, hashSetK0)) {
            return;
        }
        ArrayList arrayList = new ArrayList(C42745f0.d0(list2, setKeySet));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashSet = this.f185341i;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            Parcelable parcelable = (MarkerItem) next;
            if (parcelable instanceof MarkerWithId) {
                for (String str : linkedHashSet) {
                    if (L.f(str, ((MarkerWithId) parcelable).getId())) {
                        Iterator it2 = linkedHashMap.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            MarkerItem markerItem = (MarkerItem) next2;
                            MarkerItem.Pin pin = markerItem instanceof MarkerItem.Pin ? (MarkerItem.Pin) markerItem : null;
                            if (L.f(pin != null ? pin.getId() : null, str)) {
                                obj = next2;
                                break;
                            }
                        }
                        Object obj2 = (MarkerItem) obj;
                        if (obj2 != null && (avitoMapMarker = (AvitoMapMarker) linkedHashMap.get(obj2)) != null) {
                            linkedHashMap.remove(obj2);
                            linkedHashMap.put(parcelable, avitoMapMarker);
                        }
                    }
                }
                zContains = linkedHashSet.contains(((MarkerWithId) parcelable).getId());
            } else {
                zContains = false;
            }
            if (zContains) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            boolean zHasNext2 = it3.hasNext();
            avitoMarkerIconFactory = this.f185333a;
            if (!zHasNext2) {
                break;
            }
            MarkerItem markerItem2 = (MarkerItem) it3.next();
            AvitoMapMarker avitoMapMarker2 = (AvitoMapMarker) linkedHashMap.get(markerItem2);
            if (avitoMapMarker2 != null) {
                if (!(markerItem2 instanceof MarkerWithBrand) || ((MarkerWithBrand) markerItem2).getBrand() == null) {
                    Bitmap icon = avitoMarkerIconFactory.getIcon(markerItem2);
                    if (icon == null) {
                        break;
                    }
                    avitoMapMarker2.changeIcon(icon, markerItem2.getMapId(), this.f185337e.resolveZIndex(markerItem2), this.f185336d.resolveAnchor(markerItem2));
                    avitoMapMarker2.setData(markerItem2);
                } else {
                    avitoMarkerIconFactory.getIconAsync(markerItem2, new w(this, avitoMapMarker2, markerItem2));
                }
            }
        }
        Set<Object> setF = b1.f(linkedHashMap.keySet(), hashSetK0);
        Set<MarkerItem> setF2 = b1.f(hashSetK0, linkedHashMap.keySet());
        C42745f0.q0(setF2);
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C != null && (value2 = interfaceC42726C.getValue()) != null) {
            for (MarkerItem markerItem3 : setF2) {
                if (!(markerItem3 instanceof MarkerWithBrand) || ((MarkerWithBrand) markerItem3).getBrand() == null) {
                    Bitmap icon2 = avitoMarkerIconFactory.getIcon(markerItem3);
                    if (icon2 == null) {
                        break;
                    } else {
                        m(value2, markerItem3, icon2);
                    }
                } else {
                    avitoMarkerIconFactory.getIconAsync(markerItem3, new v(this, value2, markerItem3));
                }
            }
        }
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C2 = this.f185345m;
        if (interfaceC42726C2 == null || (value = interfaceC42726C2.getValue()) == null) {
            return;
        }
        for (Object obj3 : setF) {
            AvitoMapMarker avitoMapMarker3 = (AvitoMapMarker) linkedHashMap.remove(obj3);
            if (avitoMapMarker3 != null) {
                value.removeMarker(avitoMapMarker3, true);
            }
            if (obj3 instanceof MarkerItem.Pin) {
                linkedHashSet.remove(((MarkerItem.Pin) obj3).getId());
            }
        }
    }

    @Override // com.avito.android.map.view.u
    @Y61.l
    public final AvitoMap g() {
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C != null) {
            return interfaceC42726C.getValue();
        }
        return null;
    }

    @Override // com.avito.android.map.view.u
    @Y61.l
    public final Float h() {
        AvitoMap value;
        AvitoMapCameraPosition mapCameraPosition;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C == null || (value = interfaceC42726C.getValue()) == null || (mapCameraPosition = value.getMapCameraPosition()) == null) {
            return null;
        }
        return Float.valueOf(mapCameraPosition.getZoomLevel());
    }

    @Override // com.avito.android.map.view.u
    public final void i(float f12) {
        AvitoMap value;
        this.f185350r = true;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C == null || (value = interfaceC42726C.getValue()) == null) {
            return;
        }
        value.zoomTo(f12, true, AvitoMap.AnimationLength.DEFAULT);
    }

    @Override // com.avito.android.map.view.u
    public final void j(@Y61.k LatLng latLng, @Y61.l Float f12) {
        AvitoMap value;
        float fFloatValue;
        AvitoMap value2;
        AvitoMapTarget mapTarget;
        this.f185347o = true;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C == null || (value = interfaceC42726C.getValue()) == null) {
            return;
        }
        AvitoMapPoint avitoMapPoint = new AvitoMapPoint(latLng.f354407b, latLng.f354408c, null, 4, null);
        if (f12 != null) {
            fFloatValue = f12.floatValue();
        } else {
            InterfaceC42726C<? extends AvitoMap> interfaceC42726C2 = this.f185345m;
            Float fValueOf = (interfaceC42726C2 == null || (value2 = interfaceC42726C2.getValue()) == null || (mapTarget = value2.getMapTarget()) == null) ? null : Float.valueOf(mapTarget.getZoomLevel());
            fFloatValue = fValueOf != null ? fValueOf.floatValue() : 15.0f;
        }
        value.moveTo(avitoMapPoint, true, Float.valueOf(fFloatValue));
    }

    @Override // com.avito.android.map.view.u
    public final void k(@Y61.k List<AvitoMapPoint> list, int i12, int i13, float f12, float f13) {
        AvitoMap value;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C == null || (value = interfaceC42726C.getValue()) == null) {
            return;
        }
        AvitoMap.DefaultImpls.addPolygon$default(value, list, i12, i13, f12, f13, false, 32, null);
    }

    @Override // com.avito.android.map.view.u
    public final void l(@Y61.k LatLng latLng, @Y61.l Float f12) {
        AvitoMap value;
        this.f185350r = true;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C == null || (value = interfaceC42726C.getValue()) == null) {
            return;
        }
        value.moveTo(new AvitoMapPoint(latLng.f354407b, latLng.f354408c, null, 4, null), true, Float.valueOf(f12 != null ? f12.floatValue() : 2.0f));
    }

    public final void m(AvitoMap avitoMap, MarkerItem markerItem, Bitmap bitmap) {
        float fResolveZIndex = this.f185337e.resolveZIndex(markerItem);
        AvitoMapMarker avitoMapMarkerAddMarker = avitoMap.addMarker(markerItem.getF304960b().f354407b, markerItem.getF304960b().f354408c, bitmap, this.f185336d.resolveAnchor(markerItem), fResolveZIndex, markerItem.getMapId(), true);
        avitoMapMarkerAddMarker.setZIndex(fResolveZIndex);
        avitoMapMarkerAddMarker.setData(markerItem);
        this.f185340h.put(markerItem, avitoMapMarkerAddMarker);
        if (markerItem instanceof MarkerItem.Pin) {
            this.f185341i.add(((MarkerItem.Pin) markerItem).getId());
        }
    }

    @Override // com.avito.android.map.view.u
    public final void setLogoAlignment(@Y61.k AvitoMapHorizontalAlignment avitoMapHorizontalAlignment, @Y61.k AvitoMapVerticalAlignment avitoMapVerticalAlignment) {
        AvitoMap value;
        InterfaceC42726C<? extends AvitoMap> interfaceC42726C = this.f185345m;
        if (interfaceC42726C == null || (value = interfaceC42726C.getValue()) == null) {
            return;
        }
        value.setLogoAlignment(avitoMapHorizontalAlignment, avitoMapVerticalAlignment);
    }
}
