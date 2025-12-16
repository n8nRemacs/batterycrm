package defpackage;

/* loaded from: classes2.dex */
public final class ayd {
    public final long a;
    public final long b;

    public ayd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayd)) {
            return false;
        }
        ayd aydVar = (ayd) obj;
        return this.a == aydVar.a && this.b == aydVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ho7.k(az1.l(this.a, "SavedMessagesChatEntity(userId=", ", chatId="), this.b, ")");
    }
}
