package defpackage;

/* loaded from: classes.dex */
public final class zb0 {
    public final String a;
    public final long b;
    public final int c;

    public zb0(long j, String str, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static lk6 a() {
        lk6 lk6Var = new lk6((char) 0, 3);
        lk6Var.d = 0L;
        return lk6Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zb0)) {
            return false;
        }
        zb0 zb0Var = (zb0) obj;
        String str = this.a;
        if (str == null) {
            if (zb0Var.a != null) {
                return false;
            }
        } else if (!str.equals(zb0Var.a)) {
            return false;
        }
        long j = zb0Var.b;
        int i = zb0Var.c;
        if (this.b != j) {
            return false;
        }
        int i2 = this.c;
        return i2 == 0 ? i == 0 : az1.c(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.c;
        return (i2 != 0 ? az1.v(i2) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
