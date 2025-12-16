package defpackage;

/* loaded from: classes.dex */
public final class kv7 implements gp5 {
    public r2a Y;
    public ip5 Z;
    public kp5 b;
    public int c;
    public int d;
    public int o;
    public v32 s0;
    public u3a t0;
    public final umb a = new umb(2);
    public long X = -1;

    public final void a() {
        kp5 kp5Var = this.b;
        kp5Var.getClass();
        kp5Var.w();
        this.b.Q(new ge0(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.t0 = null;
        } else if (this.c == 5) {
            u3a u3aVar = this.t0;
            u3aVar.getClass();
            u3aVar.d(j, j2);
        }
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        umb umbVar = this.a;
        umbVar.G(2);
        ip5Var.i(0, umbVar.a, 2);
        if (umbVar.D() == 65496) {
            umbVar.G(2);
            ip5Var.i(0, umbVar.a, 2);
            int iD = umbVar.D();
            this.d = iD;
            if (iD == 65504) {
                umbVar.G(2);
                ip5Var.i(0, umbVar.a, 2);
                ip5Var.q(umbVar.D() - 2);
                umbVar.G(2);
                ip5Var.i(0, umbVar.a, 2);
                this.d = umbVar.D();
            }
            if (this.d == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gp5
    public final void release() {
        u3a u3aVar = this.t0;
        if (u3aVar != null) {
            u3aVar.getClass();
        }
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.b = kp5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r26, defpackage.n7 r27) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv7.y(ip5, n7):int");
    }
}
