package defpackage;

/* loaded from: classes.dex */
public final class u90 {
    public final int a;
    public final int b;
    public final tu1 c;

    public u90(int i, int i2, tu1 tu1Var) {
        this.a = i;
        this.b = i2;
        this.c = tu1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u90) {
            u90 u90Var = (u90) obj;
            if (this.a == u90Var.a && this.b == u90Var.b && this.c.equals(u90Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
