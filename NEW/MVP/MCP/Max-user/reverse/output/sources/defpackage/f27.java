package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f27 {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public f27(List list, int i, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    public static f27 a(qyg qygVar) throws ParserException {
        boolean z;
        int i;
        try {
            qygVar.F(21);
            int iS = qygVar.s() & 3;
            int iS2 = qygVar.s();
            int i2 = qygVar.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z = true;
                if (i4 >= iS2) {
                    break;
                }
                qygVar.F(1);
                int iX = qygVar.x();
                for (int i6 = 0; i6 < iX; i6++) {
                    int iX2 = qygVar.x();
                    i5 += iX2 + 4;
                    qygVar.F(iX2);
                }
                i4++;
            }
            qygVar.E(i2);
            byte[] bArr = new byte[i5];
            float f = 1.0f;
            String strC = null;
            int i7 = 0;
            int i8 = 0;
            while (i7 < iS2) {
                int iS3 = qygVar.s() & 127;
                int iX3 = qygVar.x();
                int i9 = i3;
                while (i9 < iX3) {
                    int iX4 = qygVar.x();
                    boolean z2 = z;
                    System.arraycopy(gfi.a, i3, bArr, i8, 4);
                    int i10 = i8 + 4;
                    System.arraycopy(qygVar.a, qygVar.b, bArr, i10, iX4);
                    if (iS3 == 33 && i9 == 0) {
                        aca acaVarG = gfi.g(i10, bArr, i10 + iX4);
                        float f2 = acaVarG.g;
                        i = iS;
                        strC = mc4.c(acaVarG.a, acaVarG.b, acaVarG.c, acaVarG.d, acaVarG.e, acaVarG.f);
                        f = f2;
                    } else {
                        i = iS;
                    }
                    i8 = i10 + iX4;
                    qygVar.F(iX4);
                    i9++;
                    z = z2;
                    iS = i;
                    i3 = 0;
                }
                i7++;
                i3 = 0;
            }
            return new f27(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iS + 1, f, strC);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing HEVC config");
        }
    }
}
