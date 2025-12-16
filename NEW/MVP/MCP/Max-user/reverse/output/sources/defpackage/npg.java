package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class npg extends g9c {
    public static final npg c = new npg(opg.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((lpg) obj).a.length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        mpg mpgVar = (mpg) obj;
        int iK = yl3Var.a(this.b, i).k();
        mpgVar.b(mpgVar.d() + 1);
        int[] iArr = mpgVar.a;
        int i2 = mpgVar.b;
        mpgVar.b = i2 + 1;
        iArr[i2] = iK;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        int[] iArr = ((lpg) obj).a;
        mpg mpgVar = new mpg();
        mpgVar.a = iArr;
        mpgVar.b = iArr.length;
        mpgVar.b(10);
        return mpgVar;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new lpg(new int[0]);
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        int[] iArr = ((lpg) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            bVar.j(this.b, i2).k(iArr[i2]);
        }
    }
}
