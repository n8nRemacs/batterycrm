package defpackage;

/* loaded from: classes2.dex */
public final class dw9 implements fw9 {
    public final long a;
    public final String b;

    public dw9(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw9)) {
            return false;
        }
        dw9 dw9Var = (dw9) obj;
        return this.a == dw9Var.a && fni.a(this.b, dw9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("DownloadCompleted(messageId=", this.a, ", attachLocalId=", this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
