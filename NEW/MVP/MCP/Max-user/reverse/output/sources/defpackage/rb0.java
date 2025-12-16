package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class rb0 {
    public final Size a;
    public final Rect b;
    public final n22 c;
    public final int d;
    public final boolean e;

    public rb0(Size size, Rect rect, n22 n22Var, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.b = rect;
        this.c = n22Var;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        n22 n22Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rb0) {
            rb0 rb0Var = (rb0) obj;
            Size size = rb0Var.a;
            n22 n22Var2 = rb0Var.c;
            if (this.a.equals(size) && this.b.equals(rb0Var.b) && ((n22Var = this.c) != null ? n22Var.equals(n22Var2) : n22Var2 == null) && this.d == rb0Var.d && this.e == rb0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        n22 n22Var = this.c;
        return ((((iHashCode ^ (n22Var == null ? 0 : n22Var.hashCode())) * 1000003) ^ this.d) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return az1.k(sb, this.e, "}");
    }
}
