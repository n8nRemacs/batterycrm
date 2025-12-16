package defpackage;

/* loaded from: classes2.dex */
public final class ik5 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ik5.class == obj.getClass()) {
            ik5 ik5Var = (ik5) obj;
            if (this.a == ik5Var.a && this.b == ik5Var.b && this.c == ik5Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
