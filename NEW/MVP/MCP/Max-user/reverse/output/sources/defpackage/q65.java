package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class q65 implements rfg {
    public final byte[] a = new byte[4096];

    @Override // defpackage.rfg
    public final int a(je4 je4Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = je4Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.rfg
    public final void b(long j, int i, int i2, int i3, pfg pfgVar) {
    }

    @Override // defpackage.rfg
    public final void c(int i, qyg qygVar) {
        qygVar.F(i);
    }

    @Override // defpackage.rfg
    public final void d(gf6 gf6Var) {
    }
}
