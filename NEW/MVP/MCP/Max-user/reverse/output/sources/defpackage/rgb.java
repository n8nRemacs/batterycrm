package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
public final class rgb {
    public final Uri a;
    public final String b;
    public final Map c;
    public final long d;
    public final long e;
    public final int f;

    public rgb(Uri uri, String str, Map map, long j, long j2, int i) {
        this.a = uri;
        this.b = str;
        this.c = map;
        this.d = j;
        this.e = j2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgb)) {
            return false;
        }
        rgb rgbVar = (rgb) obj;
        return fni.a(this.a, rgbVar.a) && fni.a(this.b, rgbVar.b) && fni.a(this.c, rgbVar.c) && this.d == rgbVar.d && this.e == rgbVar.e && this.f == rgbVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + a9h.a(a9h.a((this.c.hashCode() + u45.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneVideoDataSpec(uri=");
        sb.append(this.a);
        sb.append(", httpMethod=");
        sb.append(this.b);
        sb.append(", httpRequestHeaders=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        az1.r(this.e, ", length=", ", flags=", sb);
        return ho7.j(sb, this.f, ")");
    }
}
