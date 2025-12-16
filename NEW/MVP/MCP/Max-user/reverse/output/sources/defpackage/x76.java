package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class x76 implements fp5 {
    public final qyg a = new qyg(4);
    public final qyg b = new qyg(9);
    public final qyg c = new qyg(11);
    public final qyg d = new qyg(2, false);
    public final r2e e;
    public jp5 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public e60 o;
    public wch p;

    public x76() {
        r2e r2eVar = new r2e(14, new q65());
        r2eVar.c = -9223372036854775807L;
        r2eVar.d = new long[0];
        r2eVar.o = new long[0];
        this.e = r2eVar;
        this.g = 1;
    }

    public final qyg a(hp5 hp5Var) {
        int i = this.l;
        qyg qygVar = this.d;
        byte[] bArr = qygVar.a;
        if (i > bArr.length) {
            qygVar.C(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            qygVar.E(0);
        }
        qygVar.D(this.l);
        hp5Var.readFully(qygVar.a, 0, this.l);
        return qygVar;
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.f = jp5Var;
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) throws EOFException, InterruptedIOException {
        qyg qygVar = this.a;
        mm4 mm4Var = (mm4) hp5Var;
        mm4Var.n(qygVar.a, 0, 3, false);
        qygVar.E(0);
        if (qygVar.u() == 4607062) {
            mm4Var.n(qygVar.a, 0, 2, false);
            qygVar.E(0);
            if ((qygVar.x() & 250) == 0) {
                mm4Var.n(qygVar.a, 0, 4, false);
                qygVar.E(0);
                int iF = qygVar.f();
                mm4Var.X = 0;
                mm4Var.b(iF, false);
                mm4Var.n(qygVar.a, 0, 4, false);
                qygVar.E(0);
                if (qygVar.f() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016c  */
    @Override // defpackage.fp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.hp5 r32, defpackage.n7 r33) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x76.i(hp5, n7):int");
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
