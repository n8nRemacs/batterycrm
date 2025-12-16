package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class uj8 extends g9c {
    public static final uj8 c = new uj8(ck8.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        tj8 tj8Var = (tj8) obj;
        long jX = yl3Var.x(this.b, i);
        tj8Var.b(tj8Var.d() + 1);
        long[] jArr = tj8Var.a;
        int i2 = tj8Var.b;
        tj8Var.b = i2 + 1;
        jArr[i2] = jX;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        tj8 tj8Var = new tj8();
        tj8Var.a = jArr;
        tj8Var.b = jArr.length;
        tj8Var.b(10);
        return tj8Var;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new long[0];
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            bVar.g(this.b, i2);
            bVar.l(j);
        }
    }
}
