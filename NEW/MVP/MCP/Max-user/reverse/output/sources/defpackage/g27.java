package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g27 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final zva o;

    public g27(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, zva zvaVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = zvaVar;
    }

    public static g27 a(umb umbVar, boolean z, zva zvaVar) {
        boolean z2;
        l16 l16VarI;
        int i;
        int i2 = 4;
        try {
            if (z) {
                umbVar.K(4);
            } else {
                umbVar.K(21);
            }
            int iX = umbVar.x() & 3;
            int iX2 = umbVar.x();
            int i3 = umbVar.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= iX2) {
                    break;
                }
                umbVar.K(1);
                int iD = umbVar.D();
                for (int i7 = 0; i7 < iD; i7++) {
                    int iD2 = umbVar.D();
                    i6 += iD2 + 4;
                    umbVar.K(iD2);
                }
                i5++;
            }
            umbVar.J(i3);
            byte[] bArr = new byte[i6];
            zva zvaVar2 = zvaVar;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String strA = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < iX2) {
                int iX3 = umbVar.x() & 63;
                int iD3 = umbVar.D();
                int i20 = i4;
                zva zvaVarK = zvaVar2;
                while (i20 < iD3) {
                    boolean z3 = z2;
                    int iD4 = umbVar.D();
                    int i21 = iX;
                    System.arraycopy(hfi.a, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(umbVar.a, umbVar.b, bArr, i22, iD4);
                    if (iX3 == 32 && i20 == 0) {
                        zvaVarK = hfi.k(i22, bArr, i22 + iD4);
                    } else {
                        if (iX3 == 33 && i20 == 0) {
                            bca bcaVarJ = hfi.j(bArr, i22, i22 + iD4, zvaVarK);
                            i8 = bcaVarJ.a + 1;
                            i9 = bcaVarJ.h;
                            int i23 = bcaVarJ.i;
                            i11 = bcaVarJ.d + 8;
                            i12 = bcaVarJ.e + 8;
                            int i24 = bcaVarJ.l;
                            i10 = i23;
                            int i25 = bcaVarJ.m;
                            int i26 = bcaVarJ.n;
                            float f2 = bcaVarJ.j;
                            int i27 = bcaVarJ.k;
                            yba ybaVar = bcaVarJ.b;
                            if (ybaVar != null) {
                                i = i27;
                                strA = ed3.a(ybaVar.a, ybaVar.b, ybaVar.c, ybaVar.d, ybaVar.e, ybaVar.f);
                            } else {
                                i = i27;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i26;
                            i14 = i25;
                            i13 = i24;
                        } else if (iX3 == 39 && i20 == 0 && (l16VarI = hfi.i(i22, bArr, i22 + iD4)) != null && zvaVarK != null) {
                            i4 = 0;
                            i16 = l16VarI.b == ((xba) ((wg7) zvaVarK.b).get(0)).b ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i19 = i22 + iD4;
                    umbVar.K(iD4);
                    i20++;
                    z2 = z3;
                    iX = i21;
                    i2 = 4;
                }
                i18++;
                zvaVar2 = zvaVarK;
                i2 = 4;
            }
            return new g27(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iX + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, strA, zvaVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
