package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class dr0 extends g9c {
    public static final dr0 c = new dr0(er0.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        cr0 cr0Var = (cr0) obj;
        boolean zY = yl3Var.y(this.b, i);
        cr0Var.b(cr0Var.d() + 1);
        boolean[] zArr = cr0Var.a;
        int i2 = cr0Var.b;
        cr0Var.b = i2 + 1;
        zArr[i2] = zY;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        cr0 cr0Var = new cr0();
        cr0Var.a = zArr;
        cr0Var.b = zArr.length;
        cr0Var.b(10);
        return cr0Var;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new boolean[0];
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            bVar.c(this.b, i2, zArr[i2]);
        }
    }
}
