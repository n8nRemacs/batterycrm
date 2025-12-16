package defpackage;

/* loaded from: classes.dex */
public final class he0 implements gp5 {
    public kp5 X;
    public ie0 Y;
    public long Z;
    public final umb a;
    public final u70 b;
    public final boolean c;
    public final jbe d;
    public int o;
    public i93[] s0;
    public long t0;
    public i93 u0;
    public int v0;
    public long w0;
    public long x0;
    public int y0;
    public boolean z0;

    public he0(int i, jbe jbeVar) {
        this.d = jbeVar;
        this.c = (i & 1) == 0;
        this.a = new umb(12);
        this.b = new u70(3);
        this.X = new tha(25);
        this.s0 = new i93[0];
        this.w0 = -1L;
        this.x0 = -1L;
        this.v0 = -1;
        this.Z = -9223372036854775807L;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        this.t0 = -1L;
        this.u0 = null;
        for (i93 i93Var : this.s0) {
            if (i93Var.k == 0) {
                i93Var.i = 0;
            } else {
                i93Var.i = i93Var.n[zxg.e(i93Var.m, j, true)];
            }
        }
        if (j != 0) {
            this.o = 6;
        } else if (this.s0.length == 0) {
            this.o = 0;
        } else {
            this.o = 3;
        }
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        umb umbVar = this.a;
        ip5Var.i(0, umbVar.a, 12);
        umbVar.J(0);
        if (umbVar.l() == 1179011410) {
            umbVar.K(4);
            if (umbVar.l() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.o = 0;
        if (this.c) {
            kp5Var = new dl6(kp5Var, this.d);
        }
        this.X = kp5Var;
        this.t0 = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r23, defpackage.n7 r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he0.y(ip5, n7):int");
    }
}
