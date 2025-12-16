package dY0;

import android.os.IInterface;
import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.internal.maps.zzw;
import com.google.android.gms.internal.maps.zzz;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

/* renamed from: dY0.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC39647b extends IInterface {
    boolean A1(MapStyleOptions mapStyleOptions);

    void G1(E e12);

    void J1(A0 a02);

    zzw Q(PolygonOptions polygonOptions);

    void W(com.google.android.gms.dynamic.d dVar);

    void Z1();

    zzz Z3(PolylineOptions polylineOptions);

    zzt c0(MarkerOptions markerOptions);

    void clear();

    CameraPosition getCameraPosition();

    InterfaceC39663j getUiSettings();

    InterfaceC39655f h();

    void n(InterfaceC39679w interfaceC39679w);

    void r2(G0 g02);

    void setMaxZoomPreference(float f12);

    void setMinZoomPreference(float f12);

    void setPadding(int i12, int i13, int i14, int i15);

    zzh w(CircleOptions circleOptions);

    void y1(com.google.android.gms.dynamic.d dVar);
}
