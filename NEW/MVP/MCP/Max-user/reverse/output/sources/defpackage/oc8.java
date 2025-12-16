package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class oc8 {
    public final long a;
    public final float b;
    public final long c;

    public oc8(nc8 nc8Var) {
        this.a = nc8Var.a;
        this.b = nc8Var.b;
        this.c = nc8Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc8)) {
            return false;
        }
        oc8 oc8Var = (oc8) obj;
        return this.a == oc8Var.a && this.b == oc8Var.b && this.c == oc8Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
