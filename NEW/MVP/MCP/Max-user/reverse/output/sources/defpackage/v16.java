package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v16 extends ulf {
    public x16 o;
    public dt0 p;

    @Override // defpackage.ulf
    public final long b(umb umbVar) {
        byte[] bArr = umbVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            umbVar.K(4);
            umbVar.E();
        }
        int iG = z7.g(i, umbVar);
        umbVar.J(0);
        return iG;
    }

    @Override // defpackage.ulf
    public final boolean d(umb umbVar, long j, vhb vhbVar) {
        byte[] bArr = umbVar.a;
        x16 x16Var = this.o;
        if (x16Var == null) {
            x16 x16Var2 = new x16(bArr, 17, 1);
            this.o = x16Var2;
            ff6 ff6VarA = x16Var2.e(Arrays.copyOfRange(bArr, 9, umbVar.c), null).a();
            ff6VarA.l = xz9.n("audio/ogg");
            vhbVar.b = new hf6(ff6VarA);
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
                vhbVar.c = dt0Var;
            }
            ((hf6) vhbVar.b).getClass();
            return false;
        }
        s7c s7cVarC = j40.c(umbVar);
        x16 x16Var3 = new x16(x16Var.b, x16Var.c, x16Var.d, x16Var.e, x16Var.f, x16Var.h, x16Var.i, x16Var.k, s7cVarC, (ty9) x16Var.m);
        this.o = x16Var3;
        dt0 dt0Var2 = new dt0(2);
        dt0Var2.d = x16Var3;
        dt0Var2.o = s7cVarC;
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
