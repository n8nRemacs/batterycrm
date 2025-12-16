package defpackage;

/* loaded from: classes.dex */
public final class ju4 {
    public final String a;
    public final String b;
    public final String c;

    public ju4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ju4.class == obj.getClass()) {
            ju4 ju4Var = (ju4) obj;
            if (xxg.a(this.a, ju4Var.a) && xxg.a(this.b, ju4Var.b) && xxg.a(this.c, ju4Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
