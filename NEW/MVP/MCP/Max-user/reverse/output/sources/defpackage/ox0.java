package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class ox0 extends g9c {
    public static final ox0 c = new ox0(tx0.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        nx0 nx0Var = (nx0) obj;
        byte bI = yl3Var.i(this.b, i);
        nx0Var.b(nx0Var.d() + 1);
        byte[] bArr = nx0Var.a;
        int i2 = nx0Var.b;
        nx0Var.b = i2 + 1;
        bArr[i2] = bI;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        nx0 nx0Var = new nx0();
        nx0Var.a = bArr;
        nx0Var.b = bArr.length;
        nx0Var.b(10);
        return nx0Var;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new byte[0];
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            bVar.g(this.b, i2);
            bVar.d(b);
        }
    }
}
