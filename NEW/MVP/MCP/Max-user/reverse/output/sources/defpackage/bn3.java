package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class bn3 {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final Uri e;

    public bn3(long j, String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = Uri.parse(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn3)) {
            return false;
        }
        bn3 bn3Var = (bn3) obj;
        return fni.a(this.a, bn3Var.a) && this.b == bn3Var.b && this.c == bn3Var.c && this.d == bn3Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = utb.m(this.b, "Item(url=", this.a, ", width=", ", height=");
        sbM.append(this.c);
        sbM.append(", duration=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
