package defpackage;

/* loaded from: classes.dex */
public final class at3 extends ys3 implements q9e {
    public final long Z;
    public final int s0;
    public final int t0;
    public final boolean u0;
    public final long v0;

    public at3(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        long j3 = j;
        this.Z = j2;
        this.s0 = i;
        this.t0 = i2;
        this.u0 = z;
        this.v0 = j3 == -1 ? -1L : j3;
    }

    @Override // defpackage.q9e
    public final long a() {
        return this.v0;
    }

    @Override // defpackage.q9e
    public final long b(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.o;
    }

    @Override // defpackage.q9e
    public final long g() {
        return this.Z;
    }

    @Override // defpackage.q9e
    public final int h() {
        return this.s0;
    }
}
