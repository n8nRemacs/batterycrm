package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class jz4 extends g9c {
    public static final jz4 c = new jz4(oz4.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        iz4 iz4Var = (iz4) obj;
        double dF = yl3Var.f(this.b, i);
        iz4Var.b(iz4Var.d() + 1);
        double[] dArr = iz4Var.a;
        int i2 = iz4Var.b;
        iz4Var.b = i2 + 1;
        dArr[i2] = dF;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        iz4 iz4Var = new iz4();
        iz4Var.a = dArr;
        iz4Var.b = dArr.length;
        iz4Var.b(10);
        return iz4Var;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new double[0];
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            bVar.g(this.b, i2);
            bVar.f(d);
        }
    }
}
