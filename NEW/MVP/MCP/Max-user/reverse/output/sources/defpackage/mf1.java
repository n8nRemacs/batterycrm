package defpackage;

/* loaded from: classes.dex */
public final class mf1 implements nf1 {
    public final long a;
    public final String b;
    public final boolean c;
    public final String d;

    public mf1(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf1)) {
            return false;
        }
        mf1 mf1Var = (mf1) obj;
        return this.a == mf1Var.a && this.b.equals(mf1Var.b) && this.c == mf1Var.c && this.d.equals(mf1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a9h.b(u45.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("Exist(serverChatId=", this.a, ", link=", this.b);
        sbN.append(", isLinkCall=");
        sbN.append(this.c);
        sbN.append(", title=");
        sbN.append((Object) this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
