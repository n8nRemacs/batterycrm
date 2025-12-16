package defpackage;

/* loaded from: classes.dex */
public abstract class aw8 extends e93 {
    public final long t0;

    public aw8(se4 se4Var, ze4 ze4Var, hf6 hf6Var, int i, Object obj, long j, long j2, long j3) {
        super(se4Var, ze4Var, 1, hf6Var, i, obj, j, j2);
        hf6Var.getClass();
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
