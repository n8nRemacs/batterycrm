package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: TypeProjectionBase.java */
/* loaded from: classes8.dex */
public abstract class y0 implements x0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return c() == x0Var.c() && a() == x0Var.a() && getType().equals(x0Var.getType());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (G0.n(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : getType().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == Variance.f410069d) {
            return getType().toString();
        }
        return a() + " " + getType();
    }
}
