package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class m3a implements fp5 {
    public final long a;
    public final qyg b;
    public final g4a c;
    public final xq6 d;
    public final t9f e;
    public final q65 f;
    public jp5 g;
    public rfg h;
    public rfg i;
    public int j;
    public sy9 k;
    public long l;
    public long m;
    public long n;
    public int o;
    public p9e p;
    public boolean q;
    public boolean r;
    public long s;

    public m3a(int i) {
        this(-9223372036854775807L);
    }

    public final zs3 a(hp5 hp5Var, boolean z) {
        qyg qygVar = this.b;
        hp5Var.i(0, qygVar.a, 4);
        qygVar.E(0);
        int iF = qygVar.f();
        g4a g4aVar = this.c;
        g4aVar.a(iF);
        return new zs3(hp5Var.getLength(), hp5Var.getPosition(), g4aVar.g, g4aVar.d, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.hp5 r9) {
        /*
            r8 = this;
            p9e r0 = r8.p
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
            qyg r0 = r8.b     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.n(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m3a.b(hp5):boolean");
    }

    public final boolean c(hp5 hp5Var, boolean z) throws ParserException, EOFException {
        int iO;
        int i;
        int iC;
        int i2 = z ? 32768 : 131072;
        hp5Var.y();
        if (hp5Var.getPosition() == 0) {
            qyg qygVar = (qyg) this.e.b;
            sy9 sy9VarD = null;
            int i3 = 0;
            while (true) {
                try {
                    hp5Var.i(0, qygVar.a, 10);
                    qygVar.E(0);
                    if (qygVar.u() != 4801587) {
                        break;
                    }
                    qygVar.F(3);
                    int iR = qygVar.r();
                    int i4 = iR + 10;
                    if (sy9VarD == null) {
                        byte[] bArr = new byte[i4];
                        System.arraycopy(qygVar.a, 0, bArr, 0, 10);
                        hp5Var.i(10, bArr, iR);
                        sy9VarD = new kc7(null).d(i4, bArr);
                    } else {
                        hp5Var.q(iR);
                    }
                    i3 += i4;
                } catch (EOFException unused) {
                }
            }
            hp5Var.y();
            hp5Var.q(i3);
            this.k = sy9VarD;
            if (sy9VarD != null) {
                this.d.b(sy9VarD);
            }
            iO = (int) hp5Var.o();
            if (!z) {
                hp5Var.z(iO);
            }
            i = 0;
        } else {
            iO = 0;
            i = 0;
        }
        int i5 = i;
        int i6 = i5;
        while (true) {
            if (!b(hp5Var)) {
                qyg qygVar2 = this.b;
                qygVar2.E(0);
                int iF = qygVar2.f();
                if ((i == 0 || ((-128000) & iF) == (i & (-128000))) && (iC = yei.c(iF)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(iF);
                        i = iF;
                    }
                    hp5Var.q(iC - 4);
                } else {
                    int i7 = i6 + 1;
                    if (i6 == i2) {
                        if (z) {
                            return false;
                        }
                        throw ParserException.a(null, "Searched too many bytes.");
                    }
                    if (z) {
                        hp5Var.y();
                        hp5Var.q(iO + i7);
                    } else {
                        hp5Var.z(1);
                    }
                    i5 = 0;
                    i6 = i7;
                    i = 0;
                }
            } else if (i5 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            hp5Var.z(iO + i6);
        } else {
            hp5Var.y();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.o = 0;
        this.s = j2;
        p9e p9eVar = this.p;
        if (!(p9eVar instanceof sj7) || ((sj7) p9eVar).d(j2)) {
            return;
        }
        this.r = true;
        this.i = this.f;
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.g = jp5Var;
        rfg rfgVarB = jp5Var.B(0, 1);
        this.h = rfgVarB;
        this.i = rfgVarB;
        this.g.w();
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) {
        return c(hp5Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a2 A[LOOP:2: B:122:0x02a0->B:123:0x02a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.hp5 r44, defpackage.n7 r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m3a.i(hp5, n7):int");
    }

    @Override // defpackage.fp5
    public final void release() {
    }

    public m3a(long j) {
        this.a = j;
        this.b = new qyg(10);
        this.c = new g4a(0);
        this.d = new xq6();
        this.l = -9223372036854775807L;
        this.e = new t9f();
        q65 q65Var = new q65();
        this.f = q65Var;
        this.i = q65Var;
    }
}
