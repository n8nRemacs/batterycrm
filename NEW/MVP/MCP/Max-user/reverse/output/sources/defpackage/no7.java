package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class no7 extends g9c {
    public static final no7 c = new no7(uo7.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        mo7 mo7Var = (mo7) obj;
        int iU = yl3Var.u(this.b, i);
        mo7Var.b(mo7Var.d() + 1);
        int[] iArr = mo7Var.a;
        int i2 = mo7Var.b;
        mo7Var.b = i2 + 1;
        iArr[i2] = iU;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        mo7 mo7Var = new mo7();
        mo7Var.a = iArr;
        mo7Var.b = iArr.length;
        mo7Var.b(10);
        return mo7Var;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new int[0];
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            bVar.g(this.b, i2);
            bVar.k(i3);
        }
    }
}
