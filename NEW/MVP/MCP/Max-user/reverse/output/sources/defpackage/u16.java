package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class u16 extends ulf {
    public x16 o;
    public dt0 p;

    @Override // defpackage.ulf
    public final long c(qyg qygVar) {
        byte[] bArr = qygVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            qygVar.F(4);
            qygVar.A();
        }
        int iC = kcj.c(i, qygVar);
        qygVar.E(0);
        return iC;
    }

    @Override // defpackage.ulf
    public final boolean e(qyg qygVar, long j, enb enbVar) {
        byte[] bArr = qygVar.a;
        x16 x16Var = this.o;
        if (x16Var == null) {
            x16 x16Var2 = new x16(bArr, 17, 0);
            this.o = x16Var2;
            enbVar.b = x16Var2.d(Arrays.copyOfRange(bArr, 9, qygVar.c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            dt0 dt0Var = this.p;
            if (dt0Var != null) {
                dt0Var.b = j;
                enbVar.c = dt0Var;
            }
            ((gf6) enbVar.b).getClass();
            return false;
        }
        h79 h79VarE = gt.e(qygVar);
        x16 x16Var3 = new x16(x16Var.b, x16Var.c, x16Var.d, x16Var.e, x16Var.f, x16Var.h, x16Var.i, x16Var.k, h79VarE, (sy9) x16Var.m);
        this.o = x16Var3;
        dt0 dt0Var2 = new dt0(1);
        dt0Var2.d = x16Var3;
        dt0Var2.o = h79VarE;
        dt0Var2.b = -1L;
        dt0Var2.c = -1L;
        this.p = dt0Var2;
        return true;
    }

    @Override // defpackage.ulf
    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = null;
            this.p = null;
        }
    }
}
