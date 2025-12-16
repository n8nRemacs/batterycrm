package defpackage;

/* loaded from: classes.dex */
public final class fh7 implements ksc {
    public static final fh7 d;
    public int a;
    public boolean b;
    public boolean c;

    static {
        fh7 fh7Var = new fh7();
        fh7Var.a = Integer.MAX_VALUE;
        fh7Var.b = true;
        fh7Var.c = true;
        d = fh7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fh7)) {
            return false;
        }
        fh7 fh7Var = (fh7) obj;
        return this.a == fh7Var.a && this.b == fh7Var.b && this.c == fh7Var.c;
    }

    public final int hashCode() {
        return (this.a ^ (this.b ? 4194304 : 0)) ^ (this.c ? 8388608 : 0);
    }
}
