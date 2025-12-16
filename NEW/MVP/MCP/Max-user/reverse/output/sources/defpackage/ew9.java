package defpackage;

/* loaded from: classes2.dex */
public final class ew9 implements fw9 {
    public final long a;
    public final String b;

    public ew9(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew9)) {
            return false;
        }
        ew9 ew9Var = (ew9) obj;
        return this.a == ew9Var.a && fni.a(this.b, ew9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("DownloadFailed(messageId=", this.a, ", attachLocalId=", this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
