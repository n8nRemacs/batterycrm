package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes.dex */
public final class rog implements tof {
    public final float X;
    public final int Y;
    public final umb a = new umb();
    public final boolean b;
    public final int c;
    public final int d;
    public final String o;

    public rog(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.o = "sans-serif";
            this.b = false;
            this.X = 0.85f;
            this.Y = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.o = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.Y = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.X = zxg.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.X = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    wy1.o(3, spannableStringBuilder, i3, i4, i6);
                } else {
                    wy1.o(1, spannableStringBuilder, i3, i4, i6);
                }
            } else if (z2) {
                wy1.o(2, spannableStringBuilder, i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            wy1.o(0, spannableStringBuilder, i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tof
    public final void r(byte[] bArr, int i, int i2, sof sofVar, fu3 fu3Var) {
        String strV;
        int i3;
        int i4;
        umb umbVar = this.a;
        umbVar.H(i + i2, bArr);
        umbVar.J(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        hsi.b(umbVar.a() >= 2);
        int iD = umbVar.D();
        if (iD == 0) {
            strV = "";
        } else {
            int i8 = umbVar.b;
            Charset charsetF = umbVar.F();
            int i9 = iD - (umbVar.b - i8);
            if (charsetF == null) {
                charsetF = StandardCharsets.UTF_8;
            }
            strV = umbVar.v(i9, charsetF);
        }
        if (strV.isEmpty()) {
            t76 t76Var = wg7.b;
            fu3Var.accept(new kb4(-9223372036854775807L, -9223372036854775807L, zjd.o));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strV);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.o;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.X;
        while (umbVar.a() >= 8) {
            int i10 = umbVar.b;
            int iJ = umbVar.j();
            int iJ2 = umbVar.j();
            if (iJ2 == 1937013100) {
                hsi.b(umbVar.a() >= i7 ? i5 : i6);
                int iD2 = umbVar.D();
                int i11 = i6;
                while (i11 < iD2) {
                    hsi.b(umbVar.a() >= 12 ? i5 : i6);
                    int iD3 = umbVar.D();
                    int iD4 = umbVar.D();
                    umbVar.K(i7);
                    int i12 = i11;
                    int iX = umbVar.x();
                    umbVar.K(i5);
                    int iJ3 = umbVar.j();
                    if (iD4 > spannableStringBuilder.length()) {
                        StringBuilder sbM = ho7.m(iD4, "Truncating styl end (", ") to cueText.length() (");
                        sbM.append(spannableStringBuilder.length());
                        sbM.append(").");
                        a8i.l("Tx3gParser", sbM.toString());
                        iD4 = spannableStringBuilder.length();
                    }
                    if (iD3 >= iD4) {
                        a8i.l("Tx3gParser", wy1.g("Ignoring styl with start (", iD3, ") >= end (", iD4, ")."));
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = iD4;
                        b(spannableStringBuilder, iX, this.c, iD3, i13, 0);
                        a(spannableStringBuilder, iJ3, this.d, iD3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (iJ2 == 1952608120 && this.b) {
                i3 = 2;
                hsi.b(umbVar.a() >= 2);
                fH = zxg.h(umbVar.D() / this.Y, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            umbVar.J(i10 + iJ);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        fu3Var.accept(new kb4(-9223372036854775807L, -9223372036854775807L, wg7.m(new hb4(spannableStringBuilder, null, null, null, fH, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }

    @Override // defpackage.tof
    public final int u() {
        return 2;
    }
}
