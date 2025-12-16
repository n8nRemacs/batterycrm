package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class l26 extends g9c {
    public static final l26 c = new l26(p26.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        k26 k26Var = (k26) obj;
        float fH = yl3Var.h(this.b, i);
        k26Var.b(k26Var.d() + 1);
        float[] fArr = k26Var.a;
        int i2 = k26Var.b;
        k26Var.b = i2 + 1;
        fArr[i2] = fH;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        k26 k26Var = new k26();
        k26Var.a = fArr;
        k26Var.b = fArr.length;
        k26Var.b(10);
        return k26Var;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new float[0];
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            bVar.g(this.b, i2);
            bVar.h(f);
        }
    }
}
