package defpackage;

/* loaded from: classes2.dex */
public final class jb6 implements lb6 {
    public final long a;
    public final String b;
    public final Long c;

    public jb6(long j, String str, Long l) {
        this.a = j;
        this.b = str;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb6)) {
            return false;
        }
        jb6 jb6Var = (jb6) obj;
        return this.a == jb6Var.a && fni.a(this.b, jb6Var.b) && fni.a(this.c, jb6Var.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("OpenApp(appId=", this.a, ", startParam=", this.b);
        sbN.append(", folderId=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
