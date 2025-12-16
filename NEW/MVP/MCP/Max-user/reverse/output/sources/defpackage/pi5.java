package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class pi5 implements ixd {
    public boolean X;
    public int Y;
    public final gf6 a;
    public long[] c;
    public boolean d;
    public si5 o;
    public final xt4 b = new xt4(17);
    public long Z = -9223372036854775807L;

    public pi5(si5 si5Var, gf6 gf6Var, boolean z) {
        this.a = gf6Var;
        this.o = si5Var;
        this.c = si5Var.b;
        a(si5Var, z);
    }

    public final void a(si5 si5Var, boolean z) {
        int i = this.Y;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.o = si5Var;
        long[] jArr = si5Var.b;
        this.c = jArr;
        long j3 = this.Z;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.Y = xxg.b(jArr, j2, false);
            }
        } else {
            int iB = xxg.b(jArr, j3, true);
            this.Y = iB;
            if (this.d && iB == this.c.length) {
                j = j3;
            }
            this.Z = j;
        }
    }

    @Override // defpackage.ixd
    public final void b() {
    }

    @Override // defpackage.ixd
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ixd
    public final int g(long j) {
        int iMax = Math.max(this.Y, xxg.b(this.c, j, true));
        int i = iMax - this.Y;
        this.Y = iMax;
        return i;
    }

    @Override // defpackage.ixd
    public final int i(i5i i5iVar, oh4 oh4Var, int i) throws IOException {
        int i2 = this.Y;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            oh4Var.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.X) {
            i5iVar.b = this.a;
            this.X = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.Y = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrT = this.b.t(this.o.a[i2]);
            oh4Var.y(bArrT.length);
            oh4Var.d.put(bArrT);
        }
        oh4Var.X = this.c[i2];
        oh4Var.b = 1;
        return -4;
    }
}
