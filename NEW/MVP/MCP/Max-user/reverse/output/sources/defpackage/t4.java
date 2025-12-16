package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class t4 implements fp5 {
    public final r4 a = new r4(null, 1);
    public final qyg b = new qyg(16384);
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
        int i;
        qyg qygVar = new qyg(10);
        int i2 = 0;
        while (true) {
            mm4Var = (mm4) hp5Var;
            mm4Var.n(qygVar.a, 0, 10, false);
            qygVar.E(0);
            if (qygVar.u() != 4801587) {
                break;
            }
            qygVar.F(3);
            int iR = qygVar.r();
            i2 += iR + 10;
            mm4Var.b(iR, false);
        }
        mm4Var.X = 0;
        mm4Var.b(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            mm4Var.n(qygVar.a, 0, 7, false);
            qygVar.E(0);
            int iX = qygVar.x();
            if (iX == 44096 || iX == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = qygVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iX == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                mm4Var.b(i - 7, false);
            } else {
                mm4Var.X = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                mm4Var.b(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // defpackage.fp5
    public final int i(hp5 hp5Var, n7 n7Var) throws EOFException, InterruptedIOException {
        qyg qygVar = this.b;
        int i = ((mm4) hp5Var).read(qygVar.a, 0, 16384);
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
