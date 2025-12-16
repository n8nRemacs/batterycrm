package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class a4a {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;

    public a4a(int i, String str, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        Uri uriQ = xpi.q(str);
        if (uriQ == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.e = uriQ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4a)) {
            return false;
        }
        a4a a4aVar = (a4a) obj;
        return fni.a(this.a, a4aVar.a) && this.b == a4aVar.b && this.c == a4aVar.c && this.d == a4aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return xc0.i(utb.m(this.b, "Item(url=", this.a, ", width=", ", height="), this.c, ", bitrate=", this.d, ")");
    }
}
