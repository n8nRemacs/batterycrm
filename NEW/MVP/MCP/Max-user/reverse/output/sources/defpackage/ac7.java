package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class ac7 implements se4 {
    public final se4 a;
    public final int b;
    public final aoc c;
    public final byte[] d;
    public int o;

    public ac7(se4 se4Var, int i, aoc aocVar) {
        hsi.b(i > 0);
        this.a = se4Var;
        this.b = i;
        this.c = aocVar;
        this.d = new byte[1];
        this.o = i;
    }

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.se4
    public final void I(wgg wggVar) {
        wggVar.getClass();
        this.a.I(wggVar);
    }

    @Override // defpackage.se4
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.se4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.o;
        se4 se4Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            if (se4Var.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int i7 = se4Var.read(bArr3, i6, i5);
                        if (i7 != -1) {
                            i6 += i7;
                            i5 -= i7;
                        }
                    }
                    while (i4 > 0 && bArr3[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        umb umbVar = new umb(i4, bArr3);
                        aoc aocVar = this.c;
                        long jMax = !aocVar.v0 ? aocVar.s0 : Math.max(aocVar.w0.i(true), aocVar.s0);
                        int iA = umbVar.a();
                        sfg sfgVar = aocVar.u0;
                        sfgVar.getClass();
                        sfgVar.b(umbVar, iA, 0);
                        sfgVar.a(jMax, 1, iA, 0, null);
                        aocVar.v0 = true;
                    }
                }
                this.o = this.b;
            }
            return -1;
        }
        int i8 = se4Var.read(bArr, i, Math.min(this.o, i2));
        if (i8 != -1) {
            this.o -= i8;
        }
        return i8;
    }

    @Override // defpackage.se4
    public final Map x() {
        return this.a.x();
    }
}
