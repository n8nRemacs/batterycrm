package defpackage;

/* loaded from: classes.dex */
public abstract class zv8 extends b93 {
    public final long t0;

    public zv8(qe4 qe4Var, ye4 ye4Var, gf6 gf6Var, int i, Object obj, long j, long j2, long j3) {
        super(qe4Var, ye4Var, 1, gf6Var, i, obj, j, j2);
        gf6Var.getClass();
        this.t0 = j3;
    }

    public long a() {
        long j = this.t0;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
