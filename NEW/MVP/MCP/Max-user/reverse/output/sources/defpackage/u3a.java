package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u3a implements gp5, i9e {
    public int A0;
    public int B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public long G0;
    public boolean H0;
    public long I0;
    public kp5 J0;
    public s3a[] K0;
    public long[][] L0;
    public int M0;
    public long N0;
    public int O0;
    public r2a P0;
    public final umb X;
    public final ArrayDeque Y;
    public final u9e Z;
    public final rof a;
    public final int b;
    public final umb c;
    public final umb d;
    public final umb o;
    public final ArrayList s0;
    public zjd t0;
    public int u0;
    public int v0;
    public long w0;
    public int x0;
    public umb y0;
    public int z0;

    public u3a(rof rofVar, int i) {
        this.a = rofVar;
        this.b = i;
        t76 t76Var = wg7.b;
        this.t0 = zjd.o;
        this.u0 = (i & 4) != 0 ? 3 : 0;
        this.Z = new u9e();
        this.s0 = new ArrayList();
        this.X = new umb(16);
        this.Y = new ArrayDeque();
        this.c = new umb(hfi.a);
        this.d = new umb(6);
        this.o = new umb();
        this.z0 = -1;
        this.J0 = kp5.u;
        this.K0 = new s3a[0];
    }

    @Override // defpackage.i9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        this.Y.clear();
        this.x0 = 0;
        this.z0 = -1;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = false;
        if (j == 0) {
            if (this.u0 != 3) {
                this.u0 = 0;
                this.x0 = 0;
                return;
            } else {
                u9e u9eVar = this.Z;
                u9eVar.a.clear();
                u9eVar.b = 0;
                this.s0.clear();
                return;
            }
        }
        for (s3a s3aVar : this.K0) {
            ufg ufgVar = s3aVar.b;
            int iE = zxg.e(ufgVar.f, j2, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((ufgVar.g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = ufgVar.a(j2);
            }
            s3aVar.e = iE;
            djg djgVar = s3aVar.d;
            if (djgVar != null) {
                djgVar.b = false;
                djgVar.c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1 A[EDGE_INSN: B:70:0x00e1->B:63:0x00e1 BREAK  A[LOOP:1: B:30:0x006d->B:62:0x00db], SYNTHETIC] */
    @Override // defpackage.i9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.g9e e(long r21) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u3a.e(long):g9e");
    }

    @Override // defpackage.i9e
    public final long f() {
        return this.N0;
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        zjd zjdVarM;
        c6f c6fVarD = pmi.d(ip5Var, false, (this.b & 2) != 0);
        if (c6fVarD != null) {
            zjdVarM = wg7.m(c6fVarD);
        } else {
            t76 t76Var = wg7.b;
            zjdVarM = zjd.o;
        }
        this.t0 = zjdVarM;
        return c6fVarD == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r31) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u3a.j(long):void");
    }

    @Override // defpackage.gp5
    public final List l() {
        return this.t0;
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        if ((this.b & 16) == 0) {
            kp5Var = new dl6(kp5Var, this.a);
        }
        this.J0 = kp5Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x051f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0704 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0701 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r44, defpackage.n7 r45) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u3a.y(ip5, n7):int");
    }
}
