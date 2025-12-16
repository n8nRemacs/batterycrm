package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class hxh {
    public final byte[] a;
    public final String b;
    public final String c;

    public hxh(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxh)) {
            return false;
        }
        hxh hxhVar = (hxh) obj;
        return fni.a(this.a, hxhVar.a) && fni.a(this.b, hxhVar.b) && fni.a(this.c, hxhVar.c);
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        int iHashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ho7.l(wy1.l("WebAppShareFileInfo(file=", Arrays.toString(this.a), ", fileName=", this.b, ", fileMimeType="), this.c, ")");
    }
}
