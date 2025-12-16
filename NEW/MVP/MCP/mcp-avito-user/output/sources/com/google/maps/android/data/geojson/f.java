package com.google.maps.android.data.geojson;

import androidx.camera.camera2.internal.G;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Arrays;

/* compiled from: GeoJsonLineStringStyle.java */
/* loaded from: classes6.dex */
public class f extends com.google.maps.android.data.m implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f362259d = {"LineString", "MultiLineString", "GeometryCollection"};

    public f() {
        this.f362267b = new PolylineOptions();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineStringStyle{\n geometry type=");
        sb2.append(Arrays.toString(f362259d));
        sb2.append(",\n color=");
        sb2.append(this.f362267b.f354448d);
        sb2.append(",\n clickable=");
        sb2.append(this.f362267b.f354452h);
        sb2.append(",\n geodesic=");
        sb2.append(this.f362267b.f354451g);
        sb2.append(",\n visible=");
        sb2.append(this.f362267b.f354450f);
        sb2.append(",\n width=");
        sb2.append(this.f362267b.f354447c);
        sb2.append(",\n z index=");
        return G.d(this.f362267b.f354449e, "\n}\n", sb2);
    }
}
