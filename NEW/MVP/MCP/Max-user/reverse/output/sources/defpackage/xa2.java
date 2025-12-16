package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class xa2 extends g9c {
    public static final xa2 c = new xa2(fb2.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        ua2 ua2Var = (ua2) obj;
        char cG = yl3Var.g(this.b, i);
        ua2Var.b(ua2Var.d() + 1);
        char[] cArr = ua2Var.a;
        int i2 = ua2Var.b;
        ua2Var.b = i2 + 1;
        cArr[i2] = cG;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        ua2 ua2Var = new ua2();
        ua2Var.a = cArr;
        ua2Var.b = cArr.length;
        ua2Var.b(10);
        return ua2Var;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new char[0];
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            bVar.g(this.b, i2);
            bVar.e(c2);
        }
    }
}
