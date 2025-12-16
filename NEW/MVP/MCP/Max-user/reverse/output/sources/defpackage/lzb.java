package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lzb implements ry9 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public lzb(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static lzb b(umb umbVar) {
        int iJ = umbVar.j();
        String strN = xz9.n(umbVar.v(umbVar.j(), StandardCharsets.US_ASCII));
        String strV = umbVar.v(umbVar.j(), StandardCharsets.UTF_8);
        int iJ2 = umbVar.j();
        int iJ3 = umbVar.j();
        int iJ4 = umbVar.j();
        int iJ5 = umbVar.j();
        int iJ6 = umbVar.j();
        byte[] bArr = new byte[iJ6];
        umbVar.h(0, bArr, iJ6);
        return new lzb(iJ, strN, strV, iJ2, iJ3, iJ4, iJ5, bArr);
    }

    @Override // defpackage.ry9
    public final void a(u19 u19Var) {
        u19Var.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lzb.class == obj.getClass()) {
            lzb lzbVar = (lzb) obj;
            if (this.a == lzbVar.a && this.b.equals(lzbVar.b) && this.c.equals(lzbVar.c) && this.d == lzbVar.d && this.e == lzbVar.e && this.f == lzbVar.f && this.g == lzbVar.g && Arrays.equals(this.h, lzbVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((u45.e(u45.e((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
