package com.avito.android.universal_map.map.mvi.reducer;

import android.graphics.Bitmap;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import com.avito.android.di.B;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.map.common.marker.MarkerItem;
import com.avito.android.universal_map.map.mvi.entity.MapState;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MapViewStateMapper.kt */
@B
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/reducer/j;", "Lcom/avito/android/universal_map/map/mvi/reducer/d;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public com.avito.android.universal_map.map.common.marker.j f305682a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public AvitoMarkerIconFactory f305683b;

    @Inject
    public j() {
    }

    @Override // com.avito.android.universal_map.map.mvi.reducer.d
    public final void a() {
        this.f305682a = null;
        this.f305683b = null;
    }

    @Override // com.avito.android.universal_map.map.mvi.reducer.d
    public final void b(@Y61.k a aVar) {
        this.f305682a = aVar.getF305675a();
        this.f305683b = aVar.getF305676b();
    }

    public final MapState.b.a c(Marker marker, Marker.Pin pin, Set<String> set) {
        AvitoMarkerItem myLocation;
        AvitoMarkerItem cluster;
        Marker.a aVar;
        String str;
        AvitoMarkerItem pinWithLabel;
        String str2;
        AvitoMarkerIconFactory avitoMarkerIconFactory = this.f305683b;
        if (avitoMarkerIconFactory == null) {
            return null;
        }
        if (marker instanceof Marker.Pin) {
            Marker.Pin pin2 = (Marker.Pin) marker;
            if (L.f(pin2.f304923c, pin != null ? pin.f304923c : null)) {
                if (marker.e()) {
                    Marker.Pin pin3 = (Marker.Pin) marker;
                    pinWithLabel = new MarkerItem.PinWithLabel(new LatLng(pin2.f304924d.getLatitude(), pin2.f304924d.getLongitude()), true, pin3.f304926f, pin3.f304927g, pin3.f304928h, null, null, pin3.f304931k, 96, null);
                } else {
                    cluster = new MarkerItem.Pin(new LatLng(pin2.f304924d.getLatitude(), pin2.f304924d.getLongitude()), true, null, null, ((Marker.Pin) marker).f304931k, 12, null);
                    pinWithLabel = cluster;
                }
            } else if (set.contains(pin2.f304923c) && marker.e()) {
                Marker.Pin pin4 = (Marker.Pin) marker;
                pinWithLabel = new MarkerItem.PinWithLabel(new LatLng(pin2.f304924d.getLatitude(), pin2.f304924d.getLongitude()), false, pin4.f304926f, pin4.f304927g, pin4.f304928h, null, null, pin4.f304931k, 98, null);
            } else {
                myLocation = new MarkerItem.Pin(new LatLng(pin2.f304924d.getLatitude(), pin2.f304924d.getLongitude()), false, null, null, ((Marker.Pin) marker).f304931k, 14, null);
                pinWithLabel = myLocation;
            }
        } else {
            if (marker instanceof Marker.a) {
                Marker.a aVar2 = (Marker.a) marker;
                if (!set.contains(aVar2.f304940c) || (str = (aVar = (Marker.a) marker).f304943f) == null) {
                    cluster = new MarkerItem.Cluster(((Marker.a) marker).f304942e, new LatLng(aVar2.f304941d.getLatitude(), aVar2.f304941d.getLongitude()));
                    pinWithLabel = cluster;
                } else {
                    myLocation = new MarkerItem.ClusterWithLabel(new LatLng(aVar2.f304941d.getLatitude(), aVar2.f304941d.getLongitude()), str, aVar.f304942e);
                }
            } else {
                if (!(marker instanceof Marker.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Marker.b bVar = (Marker.b) marker;
                myLocation = new MarkerItem.MyLocation(new LatLng(bVar.f304947d.getLatitude(), bVar.f304947d.getLongitude()));
            }
            pinWithLabel = myLocation;
        }
        Bitmap icon = avitoMarkerIconFactory.getIcon(pinWithLabel);
        if (icon == null) {
            return null;
        }
        boolean z12 = pinWithLabel instanceof MarkerItem.Pin;
        boolean z13 = (z12 && ((MarkerItem.Pin) pinWithLabel).f304956c) || ((pinWithLabel instanceof MarkerItem.PinWithLabel) && ((MarkerItem.PinWithLabel) pinWithLabel).f304961c);
        if (pinWithLabel instanceof MarkerItem.Cluster) {
            str2 = String.format("cluster_default %s", Arrays.copyOf(new Object[]{((MarkerItem.Cluster) pinWithLabel).f304949b}, 1));
        } else if (pinWithLabel instanceof MarkerItem.ClusterWithLabel) {
            MarkerItem.ClusterWithLabel clusterWithLabel = (MarkerItem.ClusterWithLabel) pinWithLabel;
            str2 = String.format("cluster_with_label %s %s", Arrays.copyOf(new Object[]{clusterWithLabel.f304952c, clusterWithLabel.f304953d}, 2));
        } else if (pinWithLabel instanceof MarkerItem.MyLocation) {
            str2 = "my_location";
        } else if (z12) {
            MarkerItem.Pin pin5 = (MarkerItem.Pin) pinWithLabel;
            Marker.Pin.IconType iconType = pin5.f304959f;
            str2 = pin5.f304956c ? String.format("pin_selected %s %s", Arrays.copyOf(new Object[]{Boolean.TRUE, iconType}, 2)) : String.format("pin_default %s", Arrays.copyOf(new Object[]{iconType}, 1));
        } else {
            if (!(pinWithLabel instanceof MarkerItem.PinWithLabel)) {
                throw new NoWhenBranchMatchedException();
            }
            MarkerItem.PinWithLabel pinWithLabel2 = (MarkerItem.PinWithLabel) pinWithLabel;
            str2 = String.format("pin_with_label %s %s %s %s %s", Arrays.copyOf(new Object[]{pinWithLabel2.f304962d, pinWithLabel2.f304965g, pinWithLabel2.f304966h, pinWithLabel2.f304967i, Boolean.valueOf(pinWithLabel2.f304961c)}, 5));
        }
        return new MapState.b.a(icon, z13, str2);
    }

    public final MapState.b d(Marker marker, Marker.Pin pin, Set<String> set) {
        String f304921a = marker.getF304921a();
        AvitoMapPoint f304922b = marker.getF304922b();
        MapState.b.a aVarC = c(marker, pin, set);
        if (aVarC == null) {
            return null;
        }
        return new MapState.b(f304921a, f304922b, aVarC, marker.getF304948e(), L.f(marker.getF304921a(), pin != null ? pin.f304923c : null) ? 2.0f : marker.getF304945h());
    }
}
