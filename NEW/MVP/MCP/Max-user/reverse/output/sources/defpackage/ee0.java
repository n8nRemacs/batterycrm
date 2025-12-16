package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ee0 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public ee0(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static ee0 a(umb umbVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            umbVar.K(4);
            int iX = (umbVar.x() & 3) + 1;
            if (iX == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iX2 = umbVar.x() & 31;
            for (int i9 = 0; i9 < iX2; i9++) {
                int iD = umbVar.D();
                int i10 = umbVar.b;
                umbVar.K(iD);
                byte[] bArr = umbVar.a;
                byte[] bArr2 = new byte[iD + 4];
                System.arraycopy(ed3.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iD);
                arrayList.add(bArr2);
            }
            int iX3 = umbVar.x();
            for (int i11 = 0; i11 < iX3; i11++) {
                int iD2 = umbVar.D();
                int i12 = umbVar.b;
                umbVar.K(iD2);
                byte[] bArr3 = umbVar.a;
                byte[] bArr4 = new byte[iD2 + 4];
                System.arraycopy(ed3.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iD2);
                arrayList.add(bArr4);
            }
            if (iX2 > 0) {
                gca gcaVarL = hfi.l(4, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                int i13 = gcaVarL.e;
                int i14 = gcaVarL.f;
                int i15 = gcaVarL.h + 8;
                int i16 = gcaVarL.i + 8;
                int i17 = gcaVarL.p;
                int i18 = gcaVarL.q;
                int i19 = gcaVarL.r;
                int i20 = gcaVarL.s;
                float f2 = gcaVarL.g;
                int i21 = gcaVarL.a;
                int i22 = gcaVarL.b;
                int i23 = gcaVarL.c;
                byte[] bArr5 = ed3.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new ee0(arrayList, iX, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
