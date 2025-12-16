package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* loaded from: classes.dex */
public final class d90 {
    public final qb0 a;
    public final int b;
    public final Size c;
    public final u75 d;
    public final List e;
    public final ao3 f;
    public final Range g;

    public d90(qb0 qb0Var, int i, Size size, u75 u75Var, List list, ao3 ao3Var, Range range) {
        if (qb0Var == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.a = qb0Var;
        this.b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.c = size;
        if (u75Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.d = u75Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.e = list;
        this.f = ao3Var;
        this.g = range;
    }

    public final boolean equals(Object obj) {
        ao3 ao3Var;
        Range range;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d90) {
            d90 d90Var = (d90) obj;
            qb0 qb0Var = d90Var.a;
            Range range2 = d90Var.g;
            ao3 ao3Var2 = d90Var.f;
            if (this.a.equals(qb0Var) && this.b == d90Var.b && this.c.equals(d90Var.c) && this.d.equals(d90Var.d) && this.e.equals(d90Var.e) && ((ao3Var = this.f) != null ? ao3Var.equals(ao3Var2) : ao3Var2 == null) && ((range = this.g) != null ? range.equals(range2) : range2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        ao3 ao3Var = this.f;
        int iHashCode2 = (iHashCode ^ (ao3Var == null ? 0 : ao3Var.hashCode())) * 1000003;
        Range range = this.g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + "}";
    }
}
