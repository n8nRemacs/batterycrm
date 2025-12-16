package defpackage;

/* loaded from: classes.dex */
public final class me7 {
    public static final me7 c = new me7("UNKNOWN", null);
    public final String a;
    public final String b;

    public me7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me7)) {
            return false;
        }
        me7 me7Var = (me7) obj;
        return fni.a(this.a, me7Var.a) && fni.a(this.b, me7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.a;
    }
}
