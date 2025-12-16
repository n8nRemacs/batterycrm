package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class zb7 implements qe4 {
    public final qe4 a;
    public final int b;
    public final znc c;
    public final byte[] d;
    public int o;

    public zb7(qe4 qe4Var, int i, znc zncVar) {
        fsi.b(i > 0);
        this.a = qe4Var;
        this.b = i;
        this.c = zncVar;
        this.d = new byte[1];
        this.o = i;
    }

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qe4
    public final void S(vgg vggVar) {
        vggVar.getClass();
        this.a.S(vggVar);
    }

    @Override // defpackage.qe4
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.o;
        qe4 qe4Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (qe4Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = qe4Var.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        qyg qygVar = new qyg(i5, bArr3);
                        znc zncVar = this.c;
                        long jMax = !zncVar.x0 ? zncVar.t0 : Math.max(zncVar.y0.g(), zncVar.t0);
                        int iC = qygVar.c();
                        gxd gxdVar = zncVar.w0;
                        gxdVar.getClass();
                        gxdVar.c(iC, qygVar);
                        gxdVar.b(jMax, 1, iC, 0, null);
                        zncVar.x0 = true;
                    }
                }
                this.o = this.b;
            }
            return -1;
        }
        int i8 = qe4Var.read(bArr, i, Math.min(this.o, i2));
        if (i8 != -1) {
            this.o -= i8;
        }
        return i8;
    }

    @Override // defpackage.qe4
    public final Map x() {
        return this.a.x();
    }
}
