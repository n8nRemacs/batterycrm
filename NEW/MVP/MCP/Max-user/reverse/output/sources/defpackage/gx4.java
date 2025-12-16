package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class gx4 {
    public final Uri a;
    public final String b;
    public final String c;

    public gx4(Uri uri, String str, String str2, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx4)) {
            return false;
        }
        gx4 gx4Var = (gx4) obj;
        return fni.a(this.a, gx4Var.a) && this.b.equals(gx4Var.b) && fni.a(this.c, gx4Var.c);
    }

    public final int hashCode() {
        int iE = u45.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(0) + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectionsOption(uri=");
        sb.append(this.a);
        sb.append(", tag=");
        sb.append(this.b);
        sb.append(", pkg=");
        return ho7.l(sb, this.c, ", matchMode=0)");
    }
}
