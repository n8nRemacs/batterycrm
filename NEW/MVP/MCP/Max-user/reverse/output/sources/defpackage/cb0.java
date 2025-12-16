package defpackage;

/* loaded from: classes.dex */
public final class cb0 {
    public final iac a;
    public final jf7 b;

    public cb0(iac iacVar, jf7 jf7Var) {
        if (iacVar == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.a = iacVar;
        this.b = jf7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cb0) {
            cb0 cb0Var = (cb0) obj;
            if (this.a.equals(cb0Var.a) && this.b.equals(cb0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
