package defpackage;

import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class iz2 {
    public final String a;
    public final String b;
    public final RectF c;

    public iz2(String str, String str2, RectF rectF) {
        this.a = str;
        this.b = str2;
        this.c = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz2)) {
            return false;
        }
        iz2 iz2Var = (iz2) obj;
        return fni.a(this.a, iz2Var.a) && fni.a(this.b, iz2Var.b) && fni.a(this.c, iz2Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RectF rectF = this.c;
        return iHashCode2 + (rectF != null ? rectF.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("ChatTitleIconState(newIconPath=", this.a, ", croppedIconPath=", this.b, ", relativeCrop=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
