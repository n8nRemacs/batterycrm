package defpackage;

/* loaded from: classes2.dex */
public final class wr0 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public wr0(String str, long j, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr0)) {
            return false;
        }
        wr0 wr0Var = (wr0) obj;
        return this.a == wr0Var.a && fni.a(this.b, wr0Var.b) && fni.a(this.c, wr0Var.c) && fni.a(this.d, wr0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iE = u45.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("BotItem(botId=", this.a, ", botTag=", this.b);
        ho7.r(sbN, ", commandName=", this.c, ", commandDescription=", this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
