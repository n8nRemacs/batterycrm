package defpackage;

/* loaded from: classes.dex */
public final class y76 implements gp5 {
    public kp5 X;
    public int Y;
    public boolean Z;
    public final umb a = new umb(4);
    public final umb b = new umb(9);
    public final umb c = new umb(11);
    public final umb d = new umb();
    public final s2e o;
    public long s0;
    public int t0;
    public int u0;
    public int v0;
    public long w0;
    public boolean x0;
    public f60 y0;
    public xch z0;

    public y76() {
        s2e s2eVar = new s2e(15, new jx4());
        s2eVar.c = -9223372036854775807L;
        s2eVar.d = new long[0];
        s2eVar.o = new long[0];
        this.o = s2eVar;
        this.Y = 1;
    }

    public final umb a(ip5 ip5Var) {
        int i = this.v0;
        umb umbVar = this.d;
        byte[] bArr = umbVar.a;
        if (i > bArr.length) {
            umbVar.H(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            umbVar.J(0);
        }
        umbVar.I(this.v0);
        ip5Var.readFully(umbVar.a, 0, this.v0);
        return umbVar;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.Y = 1;
            this.Z = false;
        } else {
            this.Y = 3;
        }
        this.t0 = 0;
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        umb umbVar = this.a;
        ip5Var.i(0, umbVar.a, 3);
        umbVar.J(0);
        if (umbVar.A() == 4607062) {
            ip5Var.i(0, umbVar.a, 2);
            umbVar.J(0);
            if ((umbVar.D() & 250) == 0) {
                ip5Var.i(0, umbVar.a, 4);
                umbVar.J(0);
                int iJ = umbVar.j();
                ip5Var.y();
                ip5Var.q(iJ);
                ip5Var.i(0, umbVar.a, 4);
                umbVar.J(0);
                if (umbVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.X = kp5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r31, defpackage.n7 r32) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y76.y(ip5, n7):int");
    }
}
