package com.google.maps.android.data.geojson;

import androidx.camera.camera2.internal.G;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.Arrays;

/* compiled from: GeoJsonPolygonStyle.java */
/* loaded from: classes6.dex */
public class n extends com.google.maps.android.data.m implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f362261d = {"Polygon", "MultiPolygon", "GeometryCollection"};

    public n() {
        this.f362268c = new PolygonOptions();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PolygonStyle{\n geometry type=");
        sb2.append(Arrays.toString(f362261d));
        sb2.append(",\n fill color=");
        sb2.append(this.f362268c.f354439f);
        sb2.append(",\n geodesic=");
        sb2.append(this.f362268c.f354442i);
        sb2.append(",\n stroke color=");
        sb2.append(this.f362268c.f354438e);
        sb2.append(",\n stroke width=");
        sb2.append(this.f362268c.f354437d);
        sb2.append(",\n visible=");
        sb2.append(this.f362268c.f354441h);
        sb2.append(",\n z index=");
        return G.d(this.f362268c.f354440g, "\n}\n", sb2);
    }
}
