package defpackage;

/* loaded from: classes2.dex */
public final class clh {
    public final long a;
    public final String b;
    public final ukh c;
    public final wa2 d;

    public clh(long j, String str, ukh ukhVar, wa2 wa2Var) {
        this.a = j;
        this.b = str;
        this.c = ukhVar;
        this.d = wa2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clh)) {
            return false;
        }
        clh clhVar = (clh) obj;
        return this.a == clhVar.a && fni.a(this.b, clhVar.b) && this.c == clhVar.c && this.d.equals(clhVar.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() + ((this.c.hashCode() + u45.e(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("WebAppAnalyticsParam(botId=", this.a, ", webAppName=", this.b);
        sbN.append(", entryPoint=");
        sbN.append(this.c);
        sbN.append(", sourceType=");
        sbN.append(this.d);
        sbN.append(", label=null)");
        return sbN.toString();
    }
}
