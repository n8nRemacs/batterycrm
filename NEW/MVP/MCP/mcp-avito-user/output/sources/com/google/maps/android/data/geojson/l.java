package com.google.maps.android.data.geojson;

import androidx.appcompat.app.r;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.Arrays;

/* compiled from: GeoJsonPointStyle.java */
/* loaded from: classes6.dex */
public class l extends com.google.maps.android.data.m implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f362260d = {"Point", "MultiPoint", "GeometryCollection"};

    public l() {
        this.f362266a = new MarkerOptions();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointStyle{\n geometry type=");
        sb2.append(Arrays.toString(f362260d));
        sb2.append(",\n alpha=");
        sb2.append(this.f362266a.f354428n);
        sb2.append(",\n anchor U=");
        sb2.append(this.f362266a.f354420f);
        sb2.append(",\n anchor V=");
        sb2.append(this.f362266a.f354421g);
        sb2.append(",\n draggable=");
        sb2.append(this.f362266a.f354422h);
        sb2.append(",\n flat=");
        sb2.append(this.f362266a.f354424j);
        sb2.append(",\n info window anchor U=");
        sb2.append(this.f362266a.f354426l);
        sb2.append(",\n info window anchor V=");
        sb2.append(this.f362266a.f354427m);
        sb2.append(",\n rotation=");
        sb2.append(this.f362266a.f354425k);
        sb2.append(",\n snippet=");
        sb2.append(this.f362266a.f354418d);
        sb2.append(",\n title=");
        sb2.append(this.f362266a.f354417c);
        sb2.append(",\n visible=");
        return r.s("\n}\n", sb2, this.f362266a.f354423i);
    }
}
