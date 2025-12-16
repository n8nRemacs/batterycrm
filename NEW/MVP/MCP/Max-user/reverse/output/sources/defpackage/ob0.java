package defpackage;

import android.util.Range;
import android.util.Size;

/* loaded from: classes.dex */
public final class ob0 {
    public static final Range f = new Range(0, 0);
    public final Size a;
    public final u75 b;
    public final Range c;
    public final ao3 d;
    public final boolean e;

    public ob0(Size size, u75 u75Var, Range range, ao3 ao3Var, boolean z) {
        this.a = size;
        this.b = u75Var;
        this.c = range;
        this.d = ao3Var;
        this.e = z;
    }

    public final xa6 a() {
        xa6 xa6Var = new xa6();
        xa6Var.a = this.a;
        xa6Var.b = this.b;
        xa6Var.c = this.c;
        xa6Var.d = this.d;
        xa6Var.o = Boolean.valueOf(this.e);
        return xa6Var;
    }

    public final boolean equals(Object obj) {
        ao3 ao3Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ob0) {
            ob0 ob0Var = (ob0) obj;
            Size size = ob0Var.a;
            ao3 ao3Var2 = ob0Var.d;
            if (this.a.equals(size) && this.b.equals(ob0Var.b) && this.c.equals(ob0Var.c) && ((ao3Var = this.d) != null ? ao3Var.equals(ao3Var2) : ao3Var2 == null) && this.e == ob0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        ao3 ao3Var = this.d;
        return ((iHashCode ^ (ao3Var == null ? 0 : ao3Var.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", dynamicRange=");
        sb.append(this.b);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.c);
        sb.append(", implementationOptions=");
        sb.append(this.d);
        sb.append(", zslDisabled=");
        return az1.k(sb, this.e, "}");
    }
}
