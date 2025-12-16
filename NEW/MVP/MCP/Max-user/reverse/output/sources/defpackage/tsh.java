package defpackage;

/* loaded from: classes2.dex */
public final class tsh {
    public static final ssh Companion = new ssh();
    public final String a;
    public final Boolean b;

    public /* synthetic */ tsh(int i, String str, Boolean bool) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, rsh.a.d());
            throw null;
        }
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsh)) {
            return false;
        }
        tsh tshVar = (tsh) obj;
        return fni.a(this.a, tshVar.a) && fni.a(this.b, tshVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "WebAppOpenCodeReaderRequest(requestId=" + this.a + ", fileSelect=" + this.b + ")";
    }
}
