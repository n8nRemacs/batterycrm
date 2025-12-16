package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class p4 implements fp5 {
    public final r4 a = new r4(null, 0);
    public final qyg b = new qyg(2786);
    public boolean c;

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.a.j(jp5Var, new mjg(0, 1, 0, (byte) 0));
        jp5Var.w();
        jp5Var.N(new w16(-9223372036854775807L));
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) throws EOFException, InterruptedIOException {
        mm4 mm4Var;
        int iB;
        qyg qygVar = new qyg(10);
        int i = 0;
        while (true) {
            mm4Var = (mm4) hp5Var;
            mm4Var.n(qygVar.a, 0, 10, false);
            qygVar.E(0);
            if (qygVar.u() != 4801587) {
                break;
            }
            qygVar.F(3);
            int iR = qygVar.r();
            i += iR + 10;
            mm4Var.b(iR, false);
        }
        mm4Var.X = 0;
        mm4Var.b(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            mm4Var.n(qygVar.a, 0, 6, false);
            qygVar.E(0);
            if (qygVar.x() != 2935) {
                mm4Var.X = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                mm4Var.b(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = qygVar.a;
                if (bArr.length < 6) {
                    iB = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iB = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iB = if0.b((b & 192) >> 6, b & 63);
                }
                if (iB == -1) {
                    break;
                }
                mm4Var.b(iB - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.fp5
    public final int i(hp5 hp5Var, n7 n7Var) throws EOFException, InterruptedIOException {
        qyg qygVar = this.b;
        int i = ((mm4) hp5Var).read(qygVar.a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        qygVar.E(0);
        qygVar.D(i);
        boolean z = this.c;
        r4 r4Var = this.a;
        if (!z) {
            r4Var.e(4, 0L);
            this.c = true;
        }
        r4Var.d(qygVar);
        return 0;
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}
