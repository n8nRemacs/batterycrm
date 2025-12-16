package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class nb0 {
    public static final nb0 d = new nb0(0, 2, null);
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final bt3 f = new bt3(new nb0(0, 1, null));
    public final int a;
    public final int b;
    public final vb0 c;

    public nb0(int i, int i2, vb0 vb0Var) {
        this.a = i;
        if (i2 == 0) {
            throw new NullPointerException("Null streamState");
        }
        this.b = i2;
        this.c = vb0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        nb0 nb0Var = (nb0) obj;
        int i = nb0Var.a;
        vb0 vb0Var = nb0Var.c;
        if (this.a != i || !az1.c(this.b, nb0Var.b)) {
            return false;
        }
        vb0 vb0Var2 = this.c;
        return vb0Var2 == null ? vb0Var == null : vb0Var2.equals(vb0Var);
    }

    public final int hashCode() {
        int iV = (((this.a ^ 1000003) * 1000003) ^ az1.v(this.b)) * 1000003;
        vb0 vb0Var = this.c;
        return iV ^ (vb0Var == null ? 0 : vb0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.a);
        sb.append(", streamState=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
