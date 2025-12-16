package defpackage;

/* loaded from: classes.dex */
public abstract class pz8 implements lw0 {
    public static final zb8 X;
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean o;

    static {
        new nz8().a();
        X = new zb8(28);
    }

    public pz8(nz8 nz8Var) {
        this.a = nz8Var.a;
        this.b = nz8Var.b;
        this.c = nz8Var.c;
        this.d = nz8Var.d;
        this.o = nz8Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz8)) {
            return false;
        }
        pz8 pz8Var = (pz8) obj;
        return this.a == pz8Var.a && this.b == pz8Var.b && this.c == pz8Var.c && this.d == pz8Var.d && this.o == pz8Var.o;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.o ? 1 : 0);
    }
}
