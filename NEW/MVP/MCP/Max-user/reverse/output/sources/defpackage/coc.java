package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class coc implements jxd {
    public final int a;
    public final /* synthetic */ goc b;

    public coc(goc gocVar, int i) {
        this.b = gocVar;
        this.a = i;
    }

    @Override // defpackage.jxd
    public final void b() throws IOException {
        int i = this.a;
        goc gocVar = this.b;
        gocVar.E0[i].w();
        te8 te8Var = gocVar.w0;
        int iQ = gocVar.d.q(gocVar.O0);
        IOException iOException = (IOException) te8Var.c;
        if (iOException != null) {
            throw iOException;
        }
        cc8 cc8Var = (cc8) te8Var.b;
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

    @Override // defpackage.jxd
    public final boolean e() {
        goc gocVar = this.b;
        return !gocVar.D() && gocVar.E0[this.a].u(gocVar.Y0);
    }

    @Override // defpackage.jxd
    public final int g(long j) {
        goc gocVar = this.b;
        if (gocVar.D()) {
            return 0;
        }
        int i = this.a;
        gocVar.v(i);
        hxd hxdVar = gocVar.E0[i];
        int iS = hxdVar.s(j, gocVar.Y0);
        hxdVar.D(iS);
        if (iS == 0) {
            gocVar.y(i);
        }
        return iS;
    }

    @Override // defpackage.jxd
    public final int i(xt4 xt4Var, ph4 ph4Var, int i) {
        goc gocVar = this.b;
        if (gocVar.D()) {
            return -3;
        }
        int i2 = this.a;
        gocVar.v(i2);
        int iZ = gocVar.E0[i2].z(xt4Var, ph4Var, i, gocVar.Y0);
        if (iZ == -3) {
            gocVar.y(i2);
        }
        return iZ;
    }
}
