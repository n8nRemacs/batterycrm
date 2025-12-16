package defpackage;

/* loaded from: classes2.dex */
public final class ic2 {
    public final long a;
    public final String b;

    public ic2(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic2)) {
            return false;
        }
        ic2 ic2Var = (ic2) obj;
        return this.a == ic2Var.a && fni.a(this.b, ic2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("ChatAndFolderCrossRef(chatId=", this.a, ", folderId=", this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
