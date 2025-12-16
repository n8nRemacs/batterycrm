package defpackage;

/* loaded from: classes2.dex */
public final class bl2 implements fl2 {
    public final long a;
    public final String b;

    public bl2(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl2)) {
            return false;
        }
        bl2 bl2Var = (bl2) obj;
        return this.a == bl2Var.a && fni.a(this.b, bl2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("DownloadComplete(messageId=", this.a, ", attachLocalId=", this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
