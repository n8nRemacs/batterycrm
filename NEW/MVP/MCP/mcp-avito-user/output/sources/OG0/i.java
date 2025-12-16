package oG0;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.map.common.marker.MarkerItem;
import com.avito.android.util.architecture_components.D;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import oG0.InterfaceC44640d;
import qG0.C47290a;
import qG0.C47291b;

/* compiled from: UniversalMapViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LoG0/i;", "LoG0/f;", "Landroidx/lifecycle/M0;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends M0 implements f {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.universal_map.map.common.marker.j f419671E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC28373a f419672J;

    /* renamed from: K, reason: collision with root package name */
    @l
    public C47290a f419673K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final C23038g0<Boolean> f419674L;

    /* renamed from: M, reason: collision with root package name */
    @l
    public AvitoMarkerIconFactory f419675M;

    /* renamed from: N, reason: collision with root package name */
    @l
    public Marker.Pin.IconType f419676N;

    /* renamed from: O, reason: collision with root package name */
    @l
    public AvitoMapPoint f419677O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public Set<? extends Marker> f419678P;

    /* renamed from: Q, reason: collision with root package name */
    @k
    public Set<String> f419679Q;

    /* renamed from: R, reason: collision with root package name */
    @l
    public Marker.Pin f419680R;

    /* renamed from: S, reason: collision with root package name */
    @k
    public InterfaceC44640d.b f419681S;

    /* renamed from: T, reason: collision with root package name */
    @k
    public final D<InterfaceC44640d.b> f419682T;

    /* renamed from: U, reason: collision with root package name */
    @k
    public final D<G0> f419683U;

    /* renamed from: V, reason: collision with root package name */
    @k
    public final D<Marker.Pin> f419684V;

    public i(@k com.avito.android.universal_map.map.common.marker.j jVar, @k InterfaceC28373a interfaceC28373a, @l ParametrizedEvent parametrizedEvent) {
        this.f419671E = jVar;
        this.f419672J = interfaceC28373a;
        C23038g0<Boolean> c23038g0 = new C23038g0<>();
        this.f419674L = c23038g0;
        B0 b02 = B0.f406639b;
        this.f419678P = b02;
        this.f419679Q = b02;
        this.f419681S = new InterfaceC44640d.b(b02, null, null, 4, null);
        this.f419682T = new D<>();
        this.f419683U = new D<>();
        this.f419684V = new D<>();
        c23038g0.setValue(Boolean.TRUE);
        if (parametrizedEvent != null) {
            interfaceC28373a.c(a0.a(parametrizedEvent));
        }
    }

    @Override // oG0.f
    /* renamed from: F7, reason: from getter */
    public final D getF419684V() {
        return this.f419684V;
    }

    @Override // oG0.f
    public final void K4(@l Double d12, @k String str) {
        Object next;
        Marker.Pin pin = this.f419680R;
        if (L.f(pin != null ? pin.f304923c : null, str)) {
            return;
        }
        Iterator<T> it = this.f419678P.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((Marker) next).getF304921a(), str)) {
                    break;
                }
            }
        }
        Marker marker = (Marker) next;
        if (marker == null) {
            return;
        }
        me(marker, d12, null);
    }

    @Override // oG0.f
    public final void Lc(boolean z12) {
        AvitoMapCameraPosition avitoMapCameraPosition;
        if (z12) {
            C47290a c47290a = this.f419673K;
            if (c47290a != null && (avitoMapCameraPosition = c47290a.f429134a) != null) {
                le(avitoMapCameraPosition.getMapPoint(), false, Float.valueOf(avitoMapCameraPosition.getZoomLevel()));
            }
            this.f419682T.setValue(this.f419681S);
        }
    }

    @Override // oG0.f
    /* renamed from: P4, reason: from getter */
    public final D getF419682T() {
        return this.f419682T;
    }

    @Override // oG0.f
    public final void Q4(@k AvitoMapBounds avitoMapBounds) {
        ne(new InterfaceC44640d.b(this.f419681S.f419654a, new C47291b(false, avitoMapBounds, null, null, 12, null), Boolean.FALSE));
    }

    @Override // oG0.f
    public final void R6(@k AvitoMapPoint avitoMapPoint, boolean z12, @l Float f12) {
        le(avitoMapPoint, z12, f12);
    }

    @Override // oG0.f
    public final boolean Rb() {
        C47290a c47290a = this.f419673K;
        return (c47290a != null ? c47290a.f429134a : null) != null;
    }

    @Override // oG0.f
    /* renamed from: S4, reason: from getter */
    public final C23038g0 getF419674L() {
        return this.f419674L;
    }

    @Override // oG0.f
    /* renamed from: T9, reason: from getter */
    public final D getF419683U() {
        return this.f419683U;
    }

    @Override // oG0.f
    public final void Xd(@k AvitoMarkerIconFactory avitoMarkerIconFactory) {
        this.f419675M = avitoMarkerIconFactory;
    }

    @Override // oG0.f
    public final void bc(@k AvitoMapPoint avitoMapPoint) {
        Bitmap icon;
        this.f419677O = avitoMapPoint;
        AvitoMarkerIconFactory avitoMarkerIconFactory = this.f419675M;
        if (avitoMarkerIconFactory == null || (icon = avitoMarkerIconFactory.getIcon(new MarkerItem.MyLocation(new LatLng(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude())))) == null) {
            return;
        }
        InterfaceC44640d.a.C12180a c12180a = new InterfaceC44640d.a.C12180a(icon, false, false, null, 14, null);
        c12180a.f419653d = "my_location";
        G0 g02 = G0.f406611a;
        InterfaceC44640d.a aVar = new InterfaceC44640d.a("user_marker_id", avitoMapPoint, c12180a, AvitoMapMarker.Anchor.CENTER, -1.0f);
        Set<InterfaceC44640d.a> set = this.f419681S.f419654a;
        HashSet hashSet = new HashSet(this.f419681S.f419654a.size());
        for (Object obj : set) {
            if (!L.f(((InterfaceC44640d.a) obj).f419645a, "user_marker_id")) {
                hashSet.add(obj);
            }
        }
        ne(new InterfaceC44640d.b(b1.i(hashSet, aVar), null, Boolean.FALSE));
    }

    @Override // oG0.f
    public final void ed() {
        this.f419675M = null;
    }

    @Override // oG0.f
    public final void fd(@l Marker.Pin.IconType iconType) {
        this.f419676N = iconType;
        Marker.Pin pin = this.f419680R;
        Marker.Pin pinF = pin != null ? Marker.Pin.f(pin, iconType) : null;
        if (pinF != null) {
            Set<InterfaceC44640d.a> set = this.f419681S.f419654a;
            HashSet hashSet = new HashSet(this.f419681S.f419654a.size());
            for (InterfaceC44640d.a aVar : set) {
                if (L.f(pinF.f304923c, aVar.f419645a)) {
                    InterfaceC44640d.a.C12180a c12180aKe = ke(pinF);
                    aVar = c12180aKe == null ? null : new InterfaceC44640d.a(aVar.f419645a, aVar.f419646b, c12180aKe, aVar.f419648d, aVar.f419649e);
                }
                if (aVar != null) {
                    hashSet.add(aVar);
                }
            }
            ne(new InterfaceC44640d.b(hashSet, null, null, 4, null));
        }
    }

    @Override // oG0.f
    @l
    /* renamed from: h2, reason: from getter */
    public final C47290a getF419673K() {
        return this.f419673K;
    }

    @Override // oG0.f
    public final void i2(@k Marker.Pin pin, @l Double d12, @l Float f12) {
        Object next;
        Iterator<T> it = this.f419678P.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((Marker) next).getF304921a(), pin.f304923c)) {
                    break;
                }
            }
        }
        if (((Marker) next) == null) {
            return;
        }
        me(pin, d12, f12);
    }

    public final InterfaceC44640d.a.C12180a ke(Marker marker) {
        Marker.a aVar;
        String str;
        if (!(marker instanceof Marker.Pin)) {
            if (!(marker instanceof Marker.a)) {
                if (!(marker instanceof Marker.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                AvitoMarkerIconFactory avitoMarkerIconFactory = this.f419675M;
                if (avitoMarkerIconFactory != null) {
                    Marker.b bVar = (Marker.b) marker;
                    Bitmap icon = avitoMarkerIconFactory.getIcon(new MarkerItem.MyLocation(new LatLng(bVar.f304947d.getLatitude(), bVar.f304947d.getLongitude())));
                    if (icon != null) {
                        return new InterfaceC44640d.a.C12180a(icon, false, false, null, 14, null);
                    }
                }
                return null;
            }
            Marker.a aVar2 = (Marker.a) marker;
            if (this.f419679Q.contains(aVar2.f304940c) && (str = (aVar = (Marker.a) marker).f304943f) != null) {
                AvitoMarkerIconFactory avitoMarkerIconFactory2 = this.f419675M;
                if (avitoMarkerIconFactory2 != null) {
                    Bitmap icon2 = avitoMarkerIconFactory2.getIcon(new MarkerItem.ClusterWithLabel(new LatLng(aVar2.f304941d.getLatitude(), aVar2.f304941d.getLongitude()), str, aVar.f304942e));
                    if (icon2 != null) {
                        InterfaceC44640d.a.C12180a c12180a = new InterfaceC44640d.a.C12180a(icon2, true, false, null, 12, null);
                        c12180a.f419653d = String.format("cluster_with_label %s %s", Arrays.copyOf(new Object[]{aVar.f304943f, aVar.f304942e}, 2));
                        return c12180a;
                    }
                }
                return null;
            }
            AvitoMarkerIconFactory avitoMarkerIconFactory3 = this.f419675M;
            if (avitoMarkerIconFactory3 != null) {
                Marker.a aVar3 = (Marker.a) marker;
                Bitmap icon3 = avitoMarkerIconFactory3.getIcon(new MarkerItem.Cluster(aVar3.f304942e, new LatLng(aVar2.f304941d.getLatitude(), aVar2.f304941d.getLongitude())));
                if (icon3 != null) {
                    InterfaceC44640d.a.C12180a c12180a2 = new InterfaceC44640d.a.C12180a(icon3, false, false, null, 14, null);
                    c12180a2.f419653d = String.format("cluster_default %s", Arrays.copyOf(new Object[]{aVar3.f304942e}, 1));
                    return c12180a2;
                }
            }
            return null;
        }
        Marker.Pin pin = (Marker.Pin) marker;
        String str2 = pin.f304923c;
        Marker.Pin pin2 = this.f419680R;
        if (L.f(str2, pin2 != null ? pin2.f304923c : null)) {
            AvitoMarkerIconFactory avitoMarkerIconFactory4 = this.f419675M;
            if (avitoMarkerIconFactory4 != null) {
                Marker.Pin pin3 = (Marker.Pin) marker;
                Bitmap icon4 = avitoMarkerIconFactory4.getIcon(new MarkerItem.Pin(new LatLng(pin.f304924d.getLatitude(), pin.f304924d.getLongitude()), true, null, null, pin3.f304931k, 12, null));
                if (icon4 != null) {
                    InterfaceC44640d.a.C12180a c12180a3 = new InterfaceC44640d.a.C12180a(icon4, false, true, null, 10, null);
                    c12180a3.f419653d = String.format("pin_selected %s %s %s", Arrays.copyOf(new Object[]{pin3.f304926f, Boolean.valueOf(c12180a3.f419652c), pin3.f304931k}, 3));
                    return c12180a3;
                }
            }
            return null;
        }
        if (this.f419679Q.contains(pin.f304923c) && marker.e()) {
            AvitoMarkerIconFactory avitoMarkerIconFactory5 = this.f419675M;
            if (avitoMarkerIconFactory5 != null) {
                Marker.Pin pin4 = (Marker.Pin) marker;
                Bitmap icon5 = avitoMarkerIconFactory5.getIcon(new MarkerItem.PinWithLabel(new LatLng(pin.f304924d.getLatitude(), pin.f304924d.getLongitude()), false, pin4.f304926f, pin4.f304927g, pin4.f304928h, null, null, pin4.f304931k, 98, null));
                if (icon5 != null) {
                    InterfaceC44640d.a.C12180a c12180a4 = new InterfaceC44640d.a.C12180a(icon5, true, false, null, 12, null);
                    c12180a4.f419653d = String.format("pin_with_label %s %s %s", Arrays.copyOf(new Object[]{pin4.f304926f, Boolean.valueOf(c12180a4.f419652c), pin4.f304931k}, 3));
                    return c12180a4;
                }
            }
            return null;
        }
        AvitoMarkerIconFactory avitoMarkerIconFactory6 = this.f419675M;
        if (avitoMarkerIconFactory6 != null) {
            Marker.Pin pin5 = (Marker.Pin) marker;
            Bitmap icon6 = avitoMarkerIconFactory6.getIcon(new MarkerItem.Pin(new LatLng(pin.f304924d.getLatitude(), pin.f304924d.getLongitude()), false, null, null, pin5.f304931k, 14, null));
            if (icon6 != null) {
                InterfaceC44640d.a.C12180a c12180a5 = new InterfaceC44640d.a.C12180a(icon6, false, false, null, 14, null);
                c12180a5.f419653d = String.format("pin_default %s", Arrays.copyOf(new Object[]{pin5.f304931k}, 1));
                return c12180a5;
            }
        }
        return null;
    }

    public final void le(@k AvitoMapPoint avitoMapPoint, boolean z12, @l Float f12) {
        ne(new InterfaceC44640d.b(this.f419681S.f419654a, new C47291b(z12, null, avitoMapPoint, f12, 2, null), Boolean.FALSE));
    }

    public final void me(Marker marker, Double d12, Float f12) {
        AvitoMapCameraPosition avitoMapCameraPosition;
        AvitoMapPoint avitoMapPoint;
        InterfaceC44640d.a aVar;
        Marker.Pin pin = this.f419680R;
        boolean z12 = marker instanceof Marker.Pin;
        if (z12) {
            Marker.Pin pin2 = (Marker.Pin) marker;
            this.f419680R = pin2;
            this.f419684V.setValue(pin2);
        }
        if (!z12) {
            if (marker instanceof Marker.a) {
                AvitoMapPoint avitoMapPoint2 = ((Marker.a) marker).f304941d;
                C47290a c47290a = this.f419673K;
                le(avitoMapPoint2, true, Float.valueOf(((c47290a == null || (avitoMapCameraPosition = c47290a.f429134a) == null) ? 12.0f : avitoMapCameraPosition.getZoomLevel()) + 2.0f));
                return;
            }
            return;
        }
        Set<InterfaceC44640d.a> set = this.f419681S.f419654a;
        HashSet hashSet = new HashSet(this.f419681S.f419654a.size());
        for (InterfaceC44640d.a aVar2 : set) {
            Marker.Pin pin3 = (Marker.Pin) marker;
            if (L.f(aVar2.f419645a, pin3.f304923c)) {
                InterfaceC44640d.a.C12180a c12180aKe = ke(marker);
                if (c12180aKe == null) {
                    return;
                } else {
                    aVar = new InterfaceC44640d.a(pin3.f304923c, pin3.f304924d, c12180aKe, aVar2.f419648d, 1.0f);
                }
            } else if (pin == null || !L.f(aVar2.f419645a, pin.f304923c)) {
                hashSet.add(aVar2);
            } else {
                InterfaceC44640d.a.C12180a c12180aKe2 = ke(pin);
                if (c12180aKe2 == null) {
                    return;
                } else {
                    aVar = new InterfaceC44640d.a(pin.f304923c, pin.f304924d, c12180aKe2, aVar2.f419648d, 0.0f);
                }
            }
            aVar2 = aVar;
            hashSet.add(aVar2);
        }
        if (d12 == null) {
            avitoMapPoint = ((Marker.Pin) marker).f304924d;
        } else {
            Marker.Pin pin4 = (Marker.Pin) marker;
            avitoMapPoint = new AvitoMapPoint(pin4.f304924d.getLatitude() - d12.doubleValue(), pin4.f304924d.getLongitude(), null, 4, null);
        }
        ne(new InterfaceC44640d.b(hashSet, new C47291b(true, null, avitoMapPoint, f12, 2, null), null, 4, null));
    }

    public final void ne(InterfaceC44640d.b bVar) {
        this.f419681S = bVar;
        this.f419682T.setValue(bVar);
    }

    @Override // oG0.f
    public final void t2() {
        ne(new InterfaceC44640d.b(this.f419681S.f419654a, null, Boolean.TRUE));
    }

    @Override // oG0.f
    public final void uc() {
        Object next;
        Iterator<T> it = this.f419678P.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String f304921a = ((Marker) next).getF304921a();
            Marker.Pin pin = this.f419680R;
            if (L.f(f304921a, pin != null ? pin.f304923c : null)) {
                break;
            }
        }
        Marker marker = (Marker) next;
        Marker.Pin pin2 = this.f419680R;
        String str = pin2 != null ? pin2.f304923c : null;
        this.f419680R = null;
        this.f419684V.setValue(null);
        this.f419676N = null;
        Set<InterfaceC44640d.a> set = this.f419681S.f419654a;
        HashSet hashSet = new HashSet(this.f419681S.f419654a.size());
        for (InterfaceC44640d.a aVar : set) {
            if (L.f(str, aVar.f419645a) && marker == null) {
                aVar = null;
            } else if (marker != null) {
                if (L.f(aVar.f419645a, marker.getF304921a())) {
                    String f304921a2 = marker.getF304921a();
                    AvitoMapPoint f304922b = marker.getF304922b();
                    InterfaceC44640d.a.C12180a c12180aKe = ke(marker);
                    if (c12180aKe == null) {
                        return;
                    } else {
                        aVar = new InterfaceC44640d.a(f304921a2, f304922b, c12180aKe, aVar.f419648d, 0.0f);
                    }
                }
            }
            if (aVar != null) {
                hashSet.add(aVar);
            }
        }
        ne(new InterfaceC44640d.b(hashSet, null, null, 4, null));
    }

    @Override // oG0.f
    public final void xd(@k C47290a c47290a) {
        this.f419673K = c47290a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.avito.android.universal_map.map.common.marker.j] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Set<? extends com.avito.android.universal_map.map.common.marker.Marker>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.HashSet] */
    @Override // oG0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yb(@Y61.k com.avito.android.universal_map.map.T.a r12) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oG0.i.yb(com.avito.android.universal_map.map.T$a):void");
    }
}
