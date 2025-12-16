package defpackage;

/* loaded from: classes.dex */
public final class kae implements bz0 {
    public final i25 a;
    public final long b;
    public final int c;
    public long d;
    public int o;

    public kae(i25 i25Var, long j, int i, long j2, int i2) {
        this.a = i25Var;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.o = i2;
    }

    @Override // defpackage.bz0
    public final void a(long j, long j2, long j3) {
        long j4 = this.d + j3;
        this.d = j4;
        this.a.b(this.b, j4, b());
    }

    public final float b() {
        long j = this.b;
        if (j != -1 && j != 0) {
            return zxg.Y(this.d, j);
        }
        int i = this.c;
        if (i != 0) {
            return zxg.Y(this.o, i);
        }
        return -1.0f;
    }
}
