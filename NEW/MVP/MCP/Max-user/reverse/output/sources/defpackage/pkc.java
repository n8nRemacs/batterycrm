package defpackage;

/* loaded from: classes2.dex */
public final class pkc extends id0 {
    public final long b;
    public final br2 c;

    public pkc(long j, br2 br2Var) {
        super(16);
        this.b = j;
        this.c = br2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkc)) {
            return false;
        }
        pkc pkcVar = (pkc) obj;
        return this.b == pkcVar.b && this.c == pkcVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChatMembers(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
