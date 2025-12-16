package defpackage;

/* loaded from: classes.dex */
public final class la0 {
    public final String a;
    public final String b;
    public final String c;
    public final zb0 d;
    public final int e;

    public la0(String str, String str2, String str3, zb0 zb0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zb0Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0Var = (la0) obj;
        String str = this.a;
        if (str == null) {
            if (la0Var.a != null) {
                return false;
            }
        } else if (!str.equals(la0Var.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (la0Var.b != null) {
                return false;
            }
        } else if (!str2.equals(la0Var.b)) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null) {
            if (la0Var.c != null) {
                return false;
            }
        } else if (!str3.equals(la0Var.c)) {
            return false;
        }
        zb0 zb0Var = this.d;
        if (zb0Var == null) {
            if (la0Var.d != null) {
                return false;
            }
        } else if (!zb0Var.equals(la0Var.d)) {
            return false;
        }
        int i = this.e;
        return i == 0 ? la0Var.e == 0 : az1.c(i, la0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        zb0 zb0Var = this.d;
        int iHashCode4 = (iHashCode3 ^ (zb0Var == null ? 0 : zb0Var.hashCode())) * 1000003;
        int i = this.e;
        return (i != 0 ? az1.v(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
