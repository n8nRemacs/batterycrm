package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.Map;

/* loaded from: classes2.dex */
public final class vb4 implements se4 {
    public final se4 a;
    public final r5j b;
    public final pl0 c;
    public long d = -1;
    public final Handler o = new Handler(Looper.getMainLooper());

    public vb4(se4 se4Var, r5j r5jVar, pl0 pl0Var) {
        this.a = se4Var;
        this.b = r5jVar;
        this.c = pl0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    @Override // defpackage.se4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long H(defpackage.ze4 r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb4.H(ze4):long");
    }

    @Override // defpackage.se4
    public final void I(wgg wggVar) {
        this.a.I(new j6i(this, wggVar));
    }

    @Override // defpackage.se4
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.se4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        ub4 ub4Var = (ub4) this.b.b;
        if (!ub4Var.d && i3 > 0) {
            ub4Var.d = true;
            iv6 iv6Var = ub4Var.b;
            if (iv6Var != null) {
                vgb vgbVar = (vgb) iv6Var.b;
                vgbVar.i.b(vgbVar);
            }
        }
        return i3;
    }

    @Override // defpackage.se4
    public final Map x() {
        return new o17(this.a.x());
    }
}
