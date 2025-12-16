package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class qwg extends nc7 {
    public final String b;
    public final String c;

    public qwg(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qwg.class == obj.getClass()) {
            qwg qwgVar = (qwg) obj;
            if (this.a.equals(qwgVar.a) && Objects.equals(this.b, qwgVar.b) && Objects.equals(this.c, qwgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = u45.e(527, 31, this.a);
        String str = this.b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.nc7
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
