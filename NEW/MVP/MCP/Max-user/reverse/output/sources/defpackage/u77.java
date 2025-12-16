package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u77 {
    public final jbd b;
    public int e;
    public int f;
    public int g = 4096;
    public final ArrayList a = new ArrayList();
    public c17[] c = new c17[8];
    public int d = 7;

    public u77(o87 o87Var) {
        this.b = new jbd(o87Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.c.length;
            while (true) {
                length--;
                i2 = this.d;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.c[length].a;
                i -= i4;
                this.f -= i4;
                this.e--;
                i3++;
            }
            c17[] c17VarArr = this.c;
            System.arraycopy(c17VarArr, i2 + 1, c17VarArr, i2 + 1 + i3, this.e);
            this.d += i3;
        }
        return i3;
    }

    public final xx0 b(int i) throws IOException {
        if (i >= 0) {
            c17[] c17VarArr = w77.a;
            if (i <= c17VarArr.length - 1) {
                return c17VarArr[i].b;
            }
        }
        int length = this.d + 1 + (i - w77.a.length);
        if (length >= 0) {
            c17[] c17VarArr2 = this.c;
            if (length < c17VarArr2.length) {
                return c17VarArr2[length].b;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(c17 c17Var) {
        this.a.add(c17Var);
        int i = c17Var.a;
        int i2 = this.g;
        if (i > i2) {
            ys.s(this.c, null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
            return;
        }
        a((this.f + i) - i2);
        int i3 = this.e + 1;
        c17[] c17VarArr = this.c;
        if (i3 > c17VarArr.length) {
            c17[] c17VarArr2 = new c17[c17VarArr.length * 2];
            System.arraycopy(c17VarArr, 0, c17VarArr2, c17VarArr.length, c17VarArr.length);
            this.d = this.c.length - 1;
            this.c = c17VarArr2;
        }
        int i4 = this.d;
        this.d = i4 - 1;
        this.c[i4] = c17Var;
        this.e++;
        this.f += i;
    }

    public final xx0 d() {
        jbd jbdVar = this.b;
        byte b = jbdVar.readByte();
        byte[] bArr = yxg.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i, 127);
        if (!z) {
            return jbdVar.e(jE);
        }
        qu0 qu0Var = new qu0();
        fua fuaVar = ra7.c;
        fua fuaVar2 = fuaVar;
        int i3 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = jbdVar.readByte();
            byte[] bArr2 = yxg.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = i3 - 8;
                fuaVar2 = ((fua[]) fuaVar2.d)[(i2 >>> i4) & 255];
                if (((fua[]) fuaVar2.d) == null) {
                    qu0Var.q0(fuaVar2.b);
                    i3 -= fuaVar2.c;
                    fuaVar2 = fuaVar;
                } else {
                    i3 = i4;
                }
            }
        }
        while (i3 > 0) {
            fua fuaVar3 = ((fua[]) fuaVar2.d)[(i2 << (8 - i3)) & 255];
            fua[] fuaVarArr = (fua[]) fuaVar3.d;
            int i5 = fuaVar3.c;
            if (fuaVarArr != null || i5 > i3) {
                break;
            }
            qu0Var.q0(fuaVar3.b);
            i3 -= i5;
            fuaVar2 = fuaVar;
        }
        return qu0Var.e(qu0Var.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.b.readByte();
            byte[] bArr = yxg.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
