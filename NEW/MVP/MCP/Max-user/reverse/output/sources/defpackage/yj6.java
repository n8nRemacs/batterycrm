package defpackage;

/* loaded from: classes.dex */
public final class yj6 {
    public final hf6 a;
    public final long b;

    public yj6(hf6 hf6Var, long j) {
        gf3 gf3Var = hf6Var.D;
        int i = hf6Var.v;
        int i2 = hf6Var.u;
        hsi.a("format colorInfo must be set", gf3Var != null);
        hsi.a("format width must be positive, but is: " + i2, i2 > 0);
        hsi.a("format height must be positive, but is: " + i, i > 0);
        this.a = hf6Var;
        this.b = j;
    }
}
