package defpackage;

/* loaded from: classes.dex */
public class ys3 implements i9e {
    public final long X;
    public final boolean Y;
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int o;

    public ys3(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.o = i;
        this.Y = z;
        if (j == -1) {
            this.d = -1L;
            this.X = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.X = (Math.max(0L, j3) * 8000000) / i;
        }
    }

    @Override // defpackage.i9e
    public final boolean c() {
        return this.d != -1 || this.Y;
    }

    @Override // defpackage.i9e
    public final g9e e(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.Y) {
            m9e m9eVar = new m9e(0L, j3);
            return new g9e(m9eVar, m9eVar);
        }
        int i = this.o;
        long j4 = this.c;
        long jMin = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / i;
        m9e m9eVar2 = new m9e(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new g9e(m9eVar2, new m9e((Math.max(0L, j5 - j3) * 8000000) / i, j5));
            }
        }
        return new g9e(m9eVar2, m9eVar2);
    }

    @Override // defpackage.i9e
    public final long f() {
        return this.X;
    }
}
