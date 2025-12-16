package defpackage;

/* loaded from: classes2.dex */
public final class z25 {
    public final long a;
    public final String b;

    public z25(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z25)) {
            return false;
        }
        z25 z25Var = (z25) obj;
        return this.a == z25Var.a && fni.a(this.b, z25Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("DraftMediaUploadKeyDb(chatId=", this.a, ", attachLocalId=", this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
