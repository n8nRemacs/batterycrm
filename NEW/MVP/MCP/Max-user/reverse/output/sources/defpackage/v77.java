package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v77 {
    public boolean b;
    public int f;
    public int g;
    public final qu0 h;
    public int a = Integer.MAX_VALUE;
    public int c = 4096;
    public c17[] d = new c17[8];
    public int e = 7;

    public v77(qu0 qu0Var) {
        this.h = qu0Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.d[length].a;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
                length--;
            }
            c17[] c17VarArr = this.d;
            int i5 = i2 + 1;
            System.arraycopy(c17VarArr, i5, c17VarArr, i5 + i3, this.f);
            c17[] c17VarArr2 = this.d;
            int i6 = this.e + 1;
            Arrays.fill(c17VarArr2, i6, i6 + i3, (Object) null);
            this.e += i3;
        }
    }

    public final void b(c17 c17Var) {
        int i = c17Var.a;
        int i2 = this.c;
        if (i > i2) {
            c17[] c17VarArr = this.d;
            Arrays.fill(c17VarArr, 0, c17VarArr.length, (Object) null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        c17[] c17VarArr2 = this.d;
        if (i3 > c17VarArr2.length) {
            c17[] c17VarArr3 = new c17[c17VarArr2.length * 2];
            System.arraycopy(c17VarArr2, 0, c17VarArr3, c17VarArr2.length, c17VarArr2.length);
            this.e = this.d.length - 1;
            this.d = c17VarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = c17Var;
        this.f++;
        this.g += i;
    }

    public final void c(xx0 xx0Var) throws EOFException {
        int[] iArr = ra7.a;
        int iD = xx0Var.d();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iD; i++) {
            byte bH = xx0Var.h(i);
            byte[] bArr = yxg.a;
            j2 += ra7.b[bH & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iD2 = xx0Var.d();
        qu0 qu0Var = this.h;
        if (i2 >= iD2) {
            e(xx0Var.d(), 127, 0);
            xx0Var.m(qu0Var, xx0Var.d());
            return;
        }
        qu0 qu0Var2 = new qu0();
        int[] iArr2 = ra7.a;
        int iD3 = xx0Var.d();
        int i3 = 0;
        for (int i4 = 0; i4 < iD3; i4++) {
            byte bH2 = xx0Var.h(i4);
            byte[] bArr2 = yxg.a;
            int i5 = bH2 & 255;
            int i6 = ra7.a[i5];
            byte b = ra7.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                qu0Var2.q0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            qu0Var2.q0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        xx0 xx0VarE = qu0Var2.e(qu0Var2.b);
        e(xx0VarE.d(), 127, 128);
        xx0VarE.m(qu0Var, xx0VarE.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v77.d(java.util.ArrayList):void");
    }

    public final void e(int i, int i2, int i3) {
        qu0 qu0Var = this.h;
        if (i < i2) {
            qu0Var.q0(i | i3);
            return;
        }
        qu0Var.q0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            qu0Var.q0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        qu0Var.q0(i4);
    }
}
