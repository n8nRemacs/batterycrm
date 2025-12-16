package defpackage;

/* loaded from: classes2.dex */
public final class egc implements igc {
    public final zf3 a;

    public egc(zf3 zf3Var) {
        this.a = zf3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egc) && fni.a(this.a, ((egc) obj).a);
    }

    public final int hashCode() {
        zf3 zf3Var = this.a;
        if (zf3Var == null) {
            return 0;
        }
        return zf3Var.a.hashCode();
    }

    public final String toString() {
        return "ChatNamePayload(errorText=" + this.a + ")";
    }
}
