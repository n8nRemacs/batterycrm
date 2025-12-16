package defpackage;

/* loaded from: classes2.dex */
public final class y25 {
    public final long a;
    public final String b;

    public y25(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y25)) {
            return false;
        }
        y25 y25Var = (y25) obj;
        return this.a == y25Var.a && fni.a(this.b, y25Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("DraftMediaUploadKey(chatId=", this.a, ", attachLocalId=", this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
