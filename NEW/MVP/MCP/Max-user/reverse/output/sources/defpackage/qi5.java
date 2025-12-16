package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class qi5 implements jxd {
    public boolean X;
    public int Y;
    public final hf6 a;
    public long[] c;
    public boolean d;
    public ti5 o;
    public final xo8 b = new xo8(17, (byte) 0);
    public long Z = -9223372036854775807L;

    public qi5(ti5 ti5Var, hf6 hf6Var, boolean z) {
        this.a = hf6Var;
        this.o = ti5Var;
        this.c = ti5Var.b;
        a(ti5Var, z);
    }

    public final void a(ti5 ti5Var, boolean z) {
        int i = this.Y;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.o = ti5Var;
        long[] jArr = ti5Var.b;
        this.c = jArr;
        long j3 = this.Z;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.Y = zxg.a(jArr, j2, false);
            }
        } else {
            int iA = zxg.a(jArr, j3, true);
            this.Y = iA;
            if (this.d && iA == this.c.length) {
                j = j3;
            }
            this.Z = j;
        }
    }

    @Override // defpackage.jxd
    public final void b() {
    }

    @Override // defpackage.jxd
    public final boolean e() {
        return true;
    }

    @Override // defpackage.jxd
    public final int g(long j) {
        int iMax = Math.max(this.Y, zxg.a(this.c, j, true));
        int i = iMax - this.Y;
        this.Y = iMax;
        return i;
    }

    @Override // defpackage.jxd
    public final int i(xt4 xt4Var, ph4 ph4Var, int i) throws IOException {
        int i2 = this.Y;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            ph4Var.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.X) {
            xt4Var.c = this.a;
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
            byte[] bArrA = this.b.A(this.o.a[i2]);
            ph4Var.y(bArrA.length);
            ph4Var.o.put(bArrA);
        }
        ph4Var.Y = this.c[i2];
        ph4Var.b = 1;
        return -4;
    }
}
