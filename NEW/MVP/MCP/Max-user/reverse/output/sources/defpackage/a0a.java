package defpackage;

/* loaded from: classes2.dex */
public final class a0a {
    public final String a;
    public final String b;
    public final String c;

    public a0a(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0a)) {
            return false;
        }
        a0a a0aVar = (a0a) obj;
        return fni.a(this.a, a0aVar.a) && fni.a(this.b, a0aVar.b) && fni.a(this.c, a0aVar.c);
    }

    public final int hashCode() {
        int iE = u45.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ho7.l(wy1.l("MiniAppData(title=", this.a, ", url=", this.b, ", queryId="), this.c, ")");
    }
}
