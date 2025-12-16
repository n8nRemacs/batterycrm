package defpackage;

/* loaded from: classes2.dex */
public final class tl9 {
    public final long a;
    public final x8d b;

    public tl9(long j, x8d x8dVar) {
        this.a = j;
        this.b = x8dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl9)) {
            return false;
        }
        tl9 tl9Var = (tl9) obj;
        return this.a == tl9Var.a && fni.a(this.b, tl9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntryData(userId=" + this.a + ", reaction=" + ((Object) this.b) + ")";
    }
}
