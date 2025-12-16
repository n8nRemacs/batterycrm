package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class boc implements ixd {
    public final int a;
    public final /* synthetic */ foc b;

    public boc(foc focVar, int i) {
        this.b = focVar;
        this.a = i;
    }

    @Override // defpackage.ixd
    public final void b() throws IOException {
        int i = this.a;
        foc focVar = this.b;
        focVar.B0[i].t();
        hc8 hc8Var = focVar.t0;
        int iQ = focVar.d.q(focVar.K0);
        IOException iOException = (IOException) hc8Var.d;
        if (iOException != null) {
            throw iOException;
        }
        cc8 cc8Var = (cc8) hc8Var.c;
        if (cc8Var != null) {
            if (iQ == Integer.MIN_VALUE) {
                iQ = cc8Var.b;
            }
            IOException iOException2 = cc8Var.d;
            if (iOException2 != null && cc8Var.o > iQ) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.ixd
    public final boolean e() {
        foc focVar = this.b;
        return !focVar.u() && focVar.B0[this.a].r(focVar.T0);
    }

    @Override // defpackage.ixd
    public final int g(long j) throws Throwable {
        foc focVar = this.b;
        if (focVar.u()) {
            return 0;
        }
        int i = this.a;
        focVar.n(i);
        gxd gxdVar = focVar.B0[i];
        int iP = gxdVar.p(j, focVar.T0);
        gxdVar.z(iP);
        if (iP == 0) {
            focVar.q(i);
        }
        return iP;
    }

    @Override // defpackage.ixd
    public final int i(i5i i5iVar, oh4 oh4Var, int i) {
        foc focVar = this.b;
        if (focVar.u()) {
            return -3;
        }
        int i2 = this.a;
        focVar.n(i2);
        int iW = focVar.B0[i2].w(i5iVar, oh4Var, i, focVar.T0);
        if (iW == -3) {
            focVar.q(i2);
        }
        return iW;
    }
}
