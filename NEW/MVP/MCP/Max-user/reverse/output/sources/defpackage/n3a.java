package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class n3a implements gp5 {
    public int A0;
    public q9e B0;
    public boolean C0;
    public boolean D0;
    public long E0;
    public final x6i X;
    public final jx4 Y;
    public kp5 Z;
    public final int a;
    public final long b;
    public final umb c;
    public final g4a d;
    public final yq6 o;
    public sfg s0;
    public sfg t0;
    public int u0;
    public ty9 v0;
    public long w0;
    public long x0;
    public long y0;
    public long z0;

    public n3a(int i) {
        this(i, -9223372036854775807L);
    }

    public final void a() {
        i9e i9eVar = this.B0;
        if ((i9eVar instanceof at3) && ((ys3) i9eVar).c()) {
            long j = this.z0;
            if (j == -1 || j == this.B0.a()) {
                return;
            }
            at3 at3Var = (at3) this.B0;
            this.B0 = new at3(this.z0, at3Var.Z, at3Var.s0, at3Var.t0, at3Var.u0);
            kp5 kp5Var = this.Z;
            kp5Var.getClass();
            kp5Var.Q(this.B0);
            this.s0.getClass();
            this.B0.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.ip5 r9) {
        /*
            r8 = this;
            q9e r0 = r8.B0
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.a()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.o()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            umb r0 = r8.c     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.n(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n3a.b(ip5):boolean");
    }

    public final boolean c(ip5 ip5Var, boolean z) throws EOFException {
        int iO;
        int i;
        int iD;
        int i2 = z ? 32768 : 131072;
        ip5Var.y();
        if (ip5Var.getPosition() == 0) {
            umb umbVar = (umb) this.X.b;
            int i3 = 0;
            ty9 ty9VarE = null;
            while (true) {
                try {
                    ip5Var.i(0, umbVar.a, 10);
                    umbVar.J(0);
                    if (umbVar.A() != 4801587) {
                        break;
                    }
                    umbVar.K(3);
                    int iW = umbVar.w();
                    int i4 = iW + 10;
                    if (ty9VarE == null) {
                        byte[] bArr = new byte[i4];
                        System.arraycopy(umbVar.a, 0, bArr, 0, 10);
                        ip5Var.i(10, bArr, iW);
                        ty9VarE = new lc7(null).e(i4, bArr);
                    } else {
                        ip5Var.q(iW);
                    }
                    i3 += i4;
                } catch (EOFException unused) {
                }
            }
            ip5Var.y();
            ip5Var.q(i3);
            this.v0 = ty9VarE;
            if (ty9VarE != null) {
                this.o.b(ty9VarE);
            }
            iO = (int) ip5Var.o();
            if (!z) {
                ip5Var.z(iO);
            }
            i = 0;
        } else {
            iO = 0;
            i = 0;
        }
        int i5 = i;
        int i6 = i5;
        while (true) {
            if (!b(ip5Var)) {
                umb umbVar2 = this.c;
                umbVar2.J(0);
                int iJ = umbVar2.j();
                if ((i == 0 || ((-128000) & iJ) == (i & (-128000))) && (iD = dfi.d(iJ)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(iJ);
                        i = iJ;
                    }
                    ip5Var.q(iD - 4);
                } else {
                    int i7 = i6 + 1;
                    if (i6 == i2) {
                        if (z) {
                            return false;
                        }
                        a();
                        throw new EOFException();
                    }
                    if (z) {
                        ip5Var.y();
                        ip5Var.q(iO + i7);
                    } else {
                        ip5Var.z(1);
                    }
                    i5 = 0;
                    i6 = i7;
                    i = 0;
                }
            } else if (i5 <= 0) {
                a();
                throw new EOFException();
            }
        }
        if (z) {
            ip5Var.z(iO + i6);
        } else {
            ip5Var.y();
        }
        this.u0 = i;
        return true;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        this.u0 = 0;
        this.w0 = -9223372036854775807L;
        this.x0 = 0L;
        this.A0 = 0;
        this.E0 = j2;
        q9e q9eVar = this.B0;
        if (q9eVar instanceof tj7) {
            ((tj7) q9eVar).getClass();
            throw null;
        }
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        return c(ip5Var, true);
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.Z = kp5Var;
        sfg sfgVarMo163B = kp5Var.mo163B(0, 1);
        this.s0 = sfgVarMo163B;
        this.t0 = sfgVarMo163B;
        this.Z.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x033d A[LOOP:2: B:158:0x033b->B:159:0x033d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // defpackage.gp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(defpackage.ip5 r54, defpackage.n7 r55) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n3a.y(ip5, n7):int");
    }

    public n3a(int i, long j) {
        this.a = i;
        this.b = j;
        this.c = new umb(10);
        this.d = new g4a(1);
        this.o = new yq6();
        this.w0 = -9223372036854775807L;
        this.X = new x6i(19);
        jx4 jx4Var = new jx4();
        this.Y = jx4Var;
        this.t0 = jx4Var;
        this.z0 = -1L;
    }
}
