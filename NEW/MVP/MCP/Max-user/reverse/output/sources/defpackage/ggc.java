package defpackage;

/* loaded from: classes2.dex */
public final class ggc implements igc {
    public final zf3 a;

    public ggc(zf3 zf3Var) {
        this.a = zf3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggc) && fni.a(this.a, ((ggc) obj).a);
    }

    public final int hashCode() {
        zf3 zf3Var = this.a;
        if (zf3Var == null) {
            return 0;
        }
        return zf3Var.a.hashCode();
    }

    public final String toString() {
        return "LastNamePayload(errorText=" + this.a + ")";
    }
}
