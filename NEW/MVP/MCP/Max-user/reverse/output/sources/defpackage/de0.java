package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class de0 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public de0(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static de0 a(qyg qygVar) throws ParserException {
        byte[] bArr;
        float f;
        String str;
        int i;
        int i2;
        try {
            qygVar.F(4);
            int iS = (qygVar.s() & 3) + 1;
            if (iS == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iS2 = qygVar.s() & 31;
            int i3 = 0;
            while (true) {
                bArr = mc4.a;
                if (i3 >= iS2) {
                    break;
                }
                int iX = qygVar.x();
                int i4 = qygVar.b;
                qygVar.F(iX);
                byte[] bArr2 = qygVar.a;
                byte[] bArr3 = new byte[iX + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i4, bArr3, 4, iX);
                arrayList.add(bArr3);
                i3++;
            }
            int iS3 = qygVar.s();
            for (int i5 = 0; i5 < iS3; i5++) {
                int iX2 = qygVar.x();
                int i6 = qygVar.b;
                qygVar.F(iX2);
                byte[] bArr4 = qygVar.a;
                byte[] bArr5 = new byte[iX2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i6, bArr5, 4, iX2);
                arrayList.add(bArr5);
            }
            if (iS2 > 0) {
                fca fcaVarH = gfi.h(iS, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                int i7 = fcaVarH.e;
                int i8 = fcaVarH.f;
                f = fcaVarH.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(fcaVarH.a), Integer.valueOf(fcaVarH.b), Integer.valueOf(fcaVarH.c));
                i = i7;
                i2 = i8;
            } else {
                f = 1.0f;
                str = null;
                i = -1;
                i2 = -1;
            }
            return new de0(arrayList, iS, i, i2, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
