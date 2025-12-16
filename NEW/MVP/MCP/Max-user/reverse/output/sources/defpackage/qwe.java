package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class qwe extends g9c {
    public static final qwe c = new qwe(ywe.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        pwe pweVar = (pwe) obj;
        short sL = yl3Var.l(this.b, i);
        pweVar.b(pweVar.d() + 1);
        short[] sArr = pweVar.a;
        int i2 = pweVar.b;
        pweVar.b = i2 + 1;
        sArr[i2] = sL;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        pwe pweVar = new pwe();
        pweVar.a = sArr;
        pweVar.b = sArr.length;
        pweVar.b(10);
        return pweVar;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new short[0];
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            bVar.g(this.b, i2);
            bVar.q(s);
        }
    }
}
