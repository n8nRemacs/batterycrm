package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class sj6 {
    public final Bitmap a;
    public final int b;
    public final int c;

    public sj6(int i, int i2, Bitmap bitmap) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj6)) {
            return false;
        }
        sj6 sj6Var = (sj6) obj;
        return fni.a(this.a, sj6Var.a) && this.b == sj6Var.b && this.c == sj6Var.c;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return Integer.hashCode(this.c) + xrf.k(this.b, (bitmap == null ? 0 : bitmap.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultFrame(bitmap=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return ho7.j(sb, this.c, ")");
    }
}
