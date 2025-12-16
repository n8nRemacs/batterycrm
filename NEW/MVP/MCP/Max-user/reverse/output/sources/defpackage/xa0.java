package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class xa0 {
    public final Object a;
    public final ck5 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final r02 h;

    public xa0(Object obj, ck5 ck5Var, int i, Size size, Rect rect, int i2, Matrix matrix, r02 r02Var) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.a = obj;
        this.b = ck5Var;
        this.c = i;
        this.d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.e = rect;
        this.f = i2;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.g = matrix;
        if (r02Var == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.h = r02Var;
    }

    public final boolean equals(Object obj) {
        ck5 ck5Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xa0) {
            xa0 xa0Var = (xa0) obj;
            Object obj2 = xa0Var.a;
            ck5 ck5Var2 = xa0Var.b;
            if (this.a.equals(obj2) && ((ck5Var = this.b) != null ? ck5Var.equals(ck5Var2) : ck5Var2 == null) && this.c == xa0Var.c && this.d.equals(xa0Var.d) && this.e.equals(xa0Var.e) && this.f == xa0Var.f && this.g.equals(xa0Var.g) && this.h.equals(xa0Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        ck5 ck5Var = this.b;
        return ((((((((((((iHashCode ^ (ck5Var == null ? 0 : ck5Var.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
