package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class q90 {
    public cg7 b;
    public final Size d;
    public final int e;
    public final int f;
    public final boolean g;
    public final i85 h;
    public final i85 i;
    public k02 a = new m52(0);
    public final cg7 c = null;

    public q90(Size size, int i, int i2, boolean z, i85 i85Var, i85 i85Var2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.d = size;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = i85Var;
        this.i = i85Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q90)) {
            return false;
        }
        q90 q90Var = (q90) obj;
        return this.d.equals(q90Var.d) && this.e == q90Var.e && this.f == q90Var.f && this.g == q90Var.g && this.h.equals(q90Var.h) && this.i.equals(q90Var.i);
    }

    public final int hashCode() {
        return ((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * 583896283) ^ 35) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.d + ", inputFormat=" + this.e + ", outputFormat=" + this.f + ", virtualCamera=" + this.g + ", imageReaderProxyProvider=null, postviewSize=null, postviewImageFormat=35, requestEdge=" + this.h + ", errorEdge=" + this.i + "}";
    }
}
