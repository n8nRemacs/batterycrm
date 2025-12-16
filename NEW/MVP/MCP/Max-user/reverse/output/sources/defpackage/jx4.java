package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class jx4 implements sfg {
    public final byte[] a = new byte[4096];

    @Override // defpackage.sfg
    public final void a(long j, int i, int i2, int i3, qfg qfgVar) {
    }

    @Override // defpackage.sfg
    public final void b(umb umbVar, int i, int i2) {
        umbVar.K(i);
    }

    @Override // defpackage.sfg
    public final int c(ke4 ke4Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = ke4Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.sfg
    public final void d(hf6 hf6Var) {
    }
}
