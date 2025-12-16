package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class chg {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public chg(String str, int i, int i2, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final ft0 a() {
        ft0 ft0Var = new ft0();
        ft0Var.a = this.a;
        ft0Var.c = this.b;
        ft0Var.d = this.c;
        ft0Var.b = this.d;
        return ft0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chg)) {
            return false;
        }
        chg chgVar = (chg) obj;
        return this.a == chgVar.a && Objects.equals(this.b, chgVar.b) && Objects.equals(this.c, chgVar.c) && this.d == chgVar.d;
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationRequest{outputHeight=");
        sb.append(this.a);
        sb.append(", audioMimeType='");
        sb.append(this.b);
        sb.append("', videoMimeType='");
        sb.append(this.c);
        sb.append("', hdrMode=");
        return xc0.h(sb, this.d, '}');
    }
}
