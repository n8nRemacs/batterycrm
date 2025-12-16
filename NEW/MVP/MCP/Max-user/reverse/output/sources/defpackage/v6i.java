package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v6i extends ax7 {
    public static final char[] A0 = (char[]) hb2.a.clone();
    public final CharArrayWriter t0;
    public final char u0;
    public char[] v0;
    public int w0;
    public int x0;
    public final int y0;
    public char[] z0;

    /* JADX WARN: Type inference failed for: r3v6, types: [char[], java.io.Serializable] */
    public v6i(b6 b6Var, int i, CharArrayWriter charArrayWriter, char c) {
        super(b6Var, i);
        this.t0 = charArrayWriter;
        if (((char[]) b6Var.g) != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
        ?? A = ((ev0) b6Var.d).a(1, 0);
        b6Var.g = A;
        this.v0 = A;
        this.y0 = A.length;
        this.u0 = c;
        if (c != '\"') {
            int[] iArrCopyOf = hb2.h;
            if (c != '\"') {
                int[][] iArr = gb2.b.a;
                int[] iArr2 = iArr[c];
                if (iArr2 == null) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, 128);
                    if (iArrCopyOf[c] == 0) {
                        iArrCopyOf[c] = -1;
                    }
                    iArr[c] = iArrCopyOf;
                } else {
                    iArrCopyOf = iArr2;
                }
            }
            this.o = iArrCopyOf;
        }
    }

    @Override // defpackage.zw7
    public final void P(double d) throws IOException {
        if (!this.b) {
            String str = eqa.a;
            if ((!Double.isNaN(d) && !Double.isInfinite(d)) || !p0(yw7.QUOTE_NON_NUMERIC_NUMBERS)) {
                v0("write a number");
                z0(String.valueOf(d));
                return;
            }
        }
        m0(String.valueOf(d));
    }

    @Override // defpackage.zw7
    public final void Q(float f) throws IOException {
        if (!this.b) {
            String str = eqa.a;
            if ((!Float.isNaN(f) && !Float.isInfinite(f)) || !p0(yw7.QUOTE_NON_NUMERIC_NUMBERS)) {
                v0("write a number");
                z0(String.valueOf(f));
                return;
            }
        }
        m0(String.valueOf(f));
    }

    @Override // defpackage.zw7
    public final void Z(int i) throws IOException {
        v0("write a number");
        boolean z = this.b;
        int i2 = this.y0;
        if (!z) {
            if (this.x0 + 11 >= i2) {
                s0();
            }
            this.x0 = eqa.d(this.v0, i, this.x0);
            return;
        }
        if (this.x0 + 13 >= i2) {
            s0();
        }
        char[] cArr = this.v0;
        int i3 = this.x0;
        int i4 = i3 + 1;
        this.x0 = i4;
        char c = this.u0;
        cArr[i3] = c;
        int iD = eqa.d(cArr, i, i4);
        char[] cArr2 = this.v0;
        this.x0 = iD + 1;
        cArr2[iD] = c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.v0 != null && p0(yw7.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                fy7 fy7Var = this.c;
                if (!fy7Var.b()) {
                    if (!fy7Var.c()) {
                        break;
                    } else {
                        w();
                    }
                } else {
                    l();
                }
            }
        }
        s0();
        this.w0 = 0;
        this.x0 = 0;
        b6 b6Var = this.d;
        CharArrayWriter charArrayWriter = this.t0;
        if (charArrayWriter != null) {
            if (b6Var.b || p0(yw7.AUTO_CLOSE_TARGET)) {
                charArrayWriter.close();
            } else if (p0(yw7.FLUSH_PASSED_TO_STREAM)) {
                charArrayWriter.flush();
            }
        }
        char[] cArr = this.v0;
        if (cArr != null) {
            this.v0 = null;
            char[] cArr2 = (char[]) b6Var.g;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            b6Var.g = null;
            ((ev0) b6Var.d).b.set(1, cArr);
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        s0();
        CharArrayWriter charArrayWriter = this.t0;
        if (charArrayWriter == null || !p0(yw7.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        charArrayWriter.flush();
    }

    @Override // defpackage.zw7
    public final void h0(long j) throws IOException {
        v0("write a number");
        boolean z = this.b;
        int i = this.y0;
        if (!z) {
            if (this.x0 + 21 >= i) {
                s0();
            }
            this.x0 = eqa.e(j, this.v0, this.x0);
            return;
        }
        if (this.x0 + 23 >= i) {
            s0();
        }
        char[] cArr = this.v0;
        int i2 = this.x0;
        int i3 = i2 + 1;
        this.x0 = i3;
        char c = this.u0;
        cArr[i2] = c;
        int iE = eqa.e(j, cArr, i3);
        char[] cArr2 = this.v0;
        this.x0 = iE + 1;
        cArr2[iE] = c;
    }

    @Override // defpackage.zw7
    public final void i(boolean z) throws IOException {
        int i;
        v0("write a boolean value");
        if (this.x0 + 5 >= this.y0) {
            s0();
        }
        int i2 = this.x0;
        char[] cArr = this.v0;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.x0 = i + 1;
    }

    @Override // defpackage.zw7
    public final void i0(BigDecimal bigDecimal) throws IOException {
        v0("write a number");
        if (bigDecimal == null) {
            w0();
        } else if (this.b) {
            x0(o0(bigDecimal));
        } else {
            z0(o0(bigDecimal));
        }
    }

    @Override // defpackage.zw7
    public final void j0(BigInteger bigInteger) throws IOException {
        v0("write a number");
        if (bigInteger == null) {
            w0();
        } else if (this.b) {
            x0(bigInteger.toString());
        } else {
            z0(bigInteger.toString());
        }
    }

    @Override // defpackage.zw7
    public final void k0() throws IOException {
        v0("start an array");
        fy7 fy7Var = this.c;
        fy7 fy7Var2 = fy7Var.e;
        if (fy7Var2 == null) {
            zva zvaVar = fy7Var.d;
            fy7Var2 = new fy7(1, fy7Var, zvaVar != null ? new zva((Closeable) zvaVar.b) : null);
            fy7Var.e = fy7Var2;
        } else {
            fy7Var2.a = 1;
            fy7Var2.b = -1;
            fy7Var2.f = null;
            fy7Var2.g = false;
            zva zvaVar2 = fy7Var2.d;
            if (zvaVar2 != null) {
                zvaVar2.o = null;
                zvaVar2.c = null;
                zvaVar2.d = null;
            }
        }
        this.c = fy7Var2;
        if (this.x0 >= this.y0) {
            s0();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        this.x0 = i + 1;
        cArr[i] = '[';
    }

    @Override // defpackage.zw7
    public final void l() throws IOException {
        if (!this.c.b()) {
            zw7.d("Current context not Array but ".concat(this.c.e()));
            throw null;
        }
        if (this.x0 >= this.y0) {
            s0();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        this.x0 = i + 1;
        cArr[i] = ']';
        this.c = this.c.c;
    }

    @Override // defpackage.zw7
    public final void l0() throws IOException {
        v0("start an object");
        fy7 fy7Var = this.c;
        fy7 fy7Var2 = fy7Var.e;
        if (fy7Var2 == null) {
            zva zvaVar = fy7Var.d;
            fy7Var2 = new fy7(2, fy7Var, zvaVar != null ? new zva((Closeable) zvaVar.b) : null);
            fy7Var.e = fy7Var2;
        } else {
            fy7Var2.a = 2;
            fy7Var2.b = -1;
            fy7Var2.f = null;
            fy7Var2.g = false;
            zva zvaVar2 = fy7Var2.d;
            if (zvaVar2 != null) {
                zvaVar2.o = null;
                zvaVar2.c = null;
                zvaVar2.d = null;
            }
        }
        this.c = fy7Var2;
        if (this.x0 >= this.y0) {
            s0();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        this.x0 = i + 1;
        cArr[i] = '{';
    }

    @Override // defpackage.zw7
    public final void m0(String str) throws IOException {
        v0("write a string");
        if (str == null) {
            w0();
            return;
        }
        int i = this.x0;
        int i2 = this.y0;
        if (i >= i2) {
            s0();
        }
        char[] cArr = this.v0;
        int i3 = this.x0;
        this.x0 = i3 + 1;
        char c = this.u0;
        cArr[i3] = c;
        y0(str);
        if (this.x0 >= i2) {
            s0();
        }
        char[] cArr2 = this.v0;
        int i4 = this.x0;
        this.x0 = i4 + 1;
        cArr2[i4] = c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r11
  0x0045: PHI (r11v6 int) = (r11v3 int), (r11v7 int) binds: [B:15:0x0041, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.zw7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(char[] r17, int r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6i.n0(char[], int, int):void");
    }

    public final char[] q0() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.z0 = cArr;
        return cArr;
    }

    public final void r0(char c, int i) throws IOException {
        int i2;
        int i3 = this.y0;
        if (i >= 0) {
            if (this.x0 + 2 > i3) {
                s0();
            }
            char[] cArr = this.v0;
            int i4 = this.x0;
            int i5 = i4 + 1;
            this.x0 = i5;
            cArr[i4] = '\\';
            this.x0 = i4 + 2;
            cArr[i5] = (char) i;
            return;
        }
        if (i == -2) {
            throw null;
        }
        if (this.x0 + 5 >= i3) {
            s0();
        }
        int i6 = this.x0;
        char[] cArr2 = this.v0;
        cArr2[i6] = '\\';
        int i7 = i6 + 2;
        cArr2[i6 + 1] = 'u';
        char[] cArr3 = A0;
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i6 + 3;
            cArr2[i7] = cArr3[(i8 & 255) >> 4];
            i2 = i6 + 4;
            cArr2[i9] = cArr3[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i6 + 3;
            cArr2[i7] = '0';
            i2 = i6 + 4;
            cArr2[i10] = '0';
        }
        cArr2[i2] = cArr3[c >> 4];
        cArr2[i2 + 1] = cArr3[c & 15];
        this.x0 = i2 + 2;
    }

    public final void s0() throws IOException {
        int i = this.x0;
        int i2 = this.w0;
        int i3 = i - i2;
        if (i3 > 0) {
            this.w0 = 0;
            this.x0 = 0;
            this.t0.write(this.v0, i2, i3);
        }
    }

    public final int t0(char[] cArr, int i, int i2, char c, int i3) throws IOException {
        int i4;
        CharArrayWriter charArrayWriter = this.t0;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArrQ0 = this.z0;
            if (cArrQ0 == null) {
                cArrQ0 = q0();
            }
            cArrQ0[1] = (char) i3;
            charArrayWriter.write(cArrQ0, 0, 2);
            return i;
        }
        if (i3 == -2) {
            throw null;
        }
        char[] cArr2 = A0;
        if (i <= 5 || i >= i2) {
            char[] cArrQ02 = this.z0;
            if (cArrQ02 == null) {
                cArrQ02 = q0();
            }
            this.w0 = this.x0;
            if (c <= 255) {
                cArrQ02[6] = cArr2[c >> 4];
                cArrQ02[7] = cArr2[c & 15];
                charArrayWriter.write(cArrQ02, 2, 6);
                return i;
            }
            int i6 = c >> '\b';
            cArrQ02[10] = cArr2[(i6 & 255) >> 4];
            cArrQ02[11] = cArr2[i6 & 15];
            cArrQ02[12] = cArr2[(c & 255) >> 4];
            cArrQ02[13] = cArr2[c & 15];
            charArrayWriter.write(cArrQ02, 8, 6);
            return i;
        }
        cArr[i - 6] = '\\';
        int i7 = i - 4;
        cArr[i - 5] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i - 3;
            cArr[i7] = cArr2[(i8 & 255) >> 4];
            i4 = i - 2;
            cArr[i9] = cArr2[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i - 3;
            cArr[i7] = '0';
            i4 = i - 2;
            cArr[i10] = '0';
        }
        cArr[i4] = cArr2[c >> 4];
        cArr[i4 + 1] = cArr2[c & 15];
        return i4 - 4;
    }

    public final void u0(char c, int i) throws IOException {
        int i2;
        CharArrayWriter charArrayWriter = this.t0;
        if (i >= 0) {
            int i3 = this.x0;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.w0 = i4;
                char[] cArr = this.v0;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArrQ0 = this.z0;
            if (cArrQ0 == null) {
                cArrQ0 = q0();
            }
            this.w0 = this.x0;
            cArrQ0[1] = (char) i;
            charArrayWriter.write(cArrQ0, 0, 2);
            return;
        }
        if (i == -2) {
            throw null;
        }
        int i5 = this.x0;
        char[] cArr2 = A0;
        if (i5 < 6) {
            char[] cArrQ02 = this.z0;
            if (cArrQ02 == null) {
                cArrQ02 = q0();
            }
            this.w0 = this.x0;
            if (c <= 255) {
                cArrQ02[6] = cArr2[c >> 4];
                cArrQ02[7] = cArr2[c & 15];
                charArrayWriter.write(cArrQ02, 2, 6);
                return;
            } else {
                int i6 = c >> '\b';
                cArrQ02[10] = cArr2[(i6 & 255) >> 4];
                cArrQ02[11] = cArr2[i6 & 15];
                cArrQ02[12] = cArr2[(c & 255) >> 4];
                cArrQ02[13] = cArr2[c & 15];
                charArrayWriter.write(cArrQ02, 8, 6);
                return;
            }
        }
        char[] cArr3 = this.v0;
        int i7 = i5 - 6;
        this.w0 = i7;
        cArr3[i7] = '\\';
        cArr3[i5 - 5] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            cArr3[i5 - 4] = cArr2[(i8 & 255) >> 4];
            i2 = i5 - 3;
            cArr3[i2] = cArr2[i8 & 15];
            c = (char) (c & 255);
        } else {
            cArr3[i5 - 4] = '0';
            i2 = i5 - 3;
            cArr3[i2] = '0';
        }
        cArr3[i2 + 1] = cArr2[c >> 4];
        cArr3[i2 + 2] = cArr2[c & 15];
    }

    public final void v0(String str) throws IOException {
        char c;
        fy7 fy7Var = this.c;
        int i = fy7Var.a;
        char c2 = 0;
        if (i == 2) {
            if (fy7Var.g) {
                fy7Var.g = false;
                fy7Var.b++;
                c2 = 2;
            } else {
                c2 = 5;
            }
        } else if (i == 1) {
            int i2 = fy7Var.b;
            fy7Var.b = i2 + 1;
            if (i2 >= 0) {
                c2 = 1;
            }
        } else {
            int i3 = fy7Var.b + 1;
            fy7Var.b = i3;
            if (i3 != 0) {
                c2 = 3;
            }
        }
        if (c2 == 1) {
            c = ',';
        } else {
            if (c2 != 2) {
                if (c2 == 3) {
                    if (this.Y != null) {
                        z0(" ");
                        return;
                    }
                    return;
                } else {
                    if (c2 != 5) {
                        return;
                    }
                    zw7.d("Can not " + str + ", expecting field name (context: " + fy7Var.e() + ")");
                    throw null;
                }
            }
            c = ':';
        }
        if (this.x0 >= this.y0) {
            s0();
        }
        char[] cArr = this.v0;
        int i4 = this.x0;
        this.x0 = i4 + 1;
        cArr[i4] = c;
    }

    @Override // defpackage.zw7
    public final void w() throws IOException {
        if (!this.c.c()) {
            zw7.d("Current context not Object but ".concat(this.c.e()));
            throw null;
        }
        if (this.x0 >= this.y0) {
            s0();
        }
        char[] cArr = this.v0;
        int i = this.x0;
        this.x0 = i + 1;
        cArr[i] = '}';
        this.c = this.c.c;
    }

    public final void w0() throws IOException {
        if (this.x0 + 4 >= this.y0) {
            s0();
        }
        int i = this.x0;
        char[] cArr = this.v0;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.x0 = i + 4;
    }

    public final void x0(String str) throws IOException {
        int i = this.x0;
        int i2 = this.y0;
        if (i >= i2) {
            s0();
        }
        char[] cArr = this.v0;
        int i3 = this.x0;
        this.x0 = i3 + 1;
        char c = this.u0;
        cArr[i3] = c;
        z0(str);
        if (this.x0 >= i2) {
            s0();
        }
        char[] cArr2 = this.v0;
        int i4 = this.x0;
        this.x0 = i4 + 1;
        cArr2[i4] = c;
    }

    @Override // defpackage.zw7
    public final void y(String str) throws IOException {
        char c;
        fy7 fy7Var = this.c;
        if (fy7Var.a != 2 || fy7Var.g) {
            c = 4;
        } else {
            fy7Var.g = true;
            fy7Var.f = str;
            zva zvaVar = fy7Var.d;
            if (zvaVar != null && zvaVar.k(str)) {
                throw new JsonGenerationException(ho7.i("Duplicate field '", str, "'"), null, null);
            }
            c = fy7Var.b < 0 ? (char) 0 : (char) 1;
        }
        if (c == 4) {
            zw7.d("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z = c == 1;
        int i = this.x0 + 1;
        int i2 = this.y0;
        if (i >= i2) {
            s0();
        }
        if (z) {
            char[] cArr = this.v0;
            int i3 = this.x0;
            this.x0 = i3 + 1;
            cArr[i3] = ',';
        }
        if (this.Z) {
            y0(str);
            return;
        }
        char[] cArr2 = this.v0;
        int i4 = this.x0;
        this.x0 = i4 + 1;
        char c2 = this.u0;
        cArr2[i4] = c2;
        y0(str);
        if (this.x0 >= i2) {
            s0();
        }
        char[] cArr3 = this.v0;
        int i5 = this.x0;
        this.x0 = i5 + 1;
        cArr3[i5] = c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[PHI: r16
  0x004b: PHI (r16v3 int) = (r16v0 int), (r16v4 int) binds: [B:18:0x0046, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y0(java.lang.String r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6i.y0(java.lang.String):void");
    }

    public final void z0(String str) throws IOException {
        int length = str.length();
        int i = this.x0;
        int i2 = this.y0;
        int i3 = i2 - i;
        if (i3 == 0) {
            s0();
            i3 = i2 - this.x0;
        }
        if (i3 >= length) {
            str.getChars(0, length, this.v0, this.x0);
            this.x0 += length;
            return;
        }
        int i4 = this.x0;
        int i5 = i2 - i4;
        str.getChars(0, i5, this.v0, i4);
        this.x0 += i5;
        s0();
        int length2 = str.length() - i5;
        while (length2 > i2) {
            int i6 = i5 + i2;
            str.getChars(i5, i6, this.v0, 0);
            this.w0 = 0;
            this.x0 = i2;
            s0();
            length2 -= i2;
            i5 = i6;
        }
        str.getChars(i5, i5 + length2, this.v0, 0);
        this.w0 = 0;
        this.x0 = length2;
    }
}
