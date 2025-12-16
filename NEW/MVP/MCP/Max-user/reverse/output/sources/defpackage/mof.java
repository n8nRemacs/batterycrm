package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mof implements gp5 {
    public sfg X;
    public int Y;
    public int Z;
    public final tof a;
    public final hf6 b;
    public final ArrayList c;
    public long[] s0;
    public long t0;
    public byte[] o = zxg.b;
    public final umb d = new umb();

    public mof(tof tofVar, hf6 hf6Var) {
        hf6 hf6Var2;
        this.a = tofVar;
        if (hf6Var != null) {
            ff6 ff6VarA = hf6Var.a();
            ff6VarA.m = xz9.n("application/x-media3-cues");
            ff6VarA.j = hf6Var.n;
            ff6VarA.K = tofVar.u();
            hf6Var2 = new hf6(ff6VarA);
        } else {
            hf6Var2 = null;
        }
        this.b = hf6Var2;
        this.c = new ArrayList();
        this.Z = 0;
        this.s0 = zxg.c;
        this.t0 = -9223372036854775807L;
    }

    public final void a(lof lofVar) {
        hsi.h(this.X);
        byte[] bArr = lofVar.b;
        int length = bArr.length;
        umb umbVar = this.d;
        umbVar.getClass();
        umbVar.H(bArr.length, bArr);
        this.X.b(umbVar, length, 0);
        this.X.a(lofVar.a, 1, length, 0, null);
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        int i = this.Z;
        hsi.g((i == 0 || i == 5) ? false : true);
        this.t0 = j2;
        if (this.Z == 2) {
            this.Z = 1;
        }
        if (this.Z == 4) {
            this.Z = 3;
        }
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        return true;
    }

    @Override // defpackage.gp5
    public final void release() {
        if (this.Z == 5) {
            return;
        }
        this.a.reset();
        this.Z = 5;
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        hsi.g(this.Z == 0);
        sfg sfgVarMo163B = kp5Var.mo163B(0, 3);
        this.X = sfgVarMo163B;
        hf6 hf6Var = this.b;
        if (hf6Var != null) {
            sfgVarMo163B.d(hf6Var);
            kp5Var.w();
            kp5Var.Q(new rj7(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.Z = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x007e A[EXC_TOP_SPLITTER, PHI: r22
  0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r21, defpackage.n7 r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mof.y(ip5, n7):int");
    }
}
