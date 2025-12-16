package defpackage;

/* loaded from: classes2.dex */
public final class ej2 {
    public final long a;
    public final m8a b;

    public ej2(long j, m8a m8aVar) {
        this.a = j;
        this.b = m8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej2)) {
            return false;
        }
        ej2 ej2Var = (ej2) obj;
        return this.a == ej2Var.a && fni.a(this.b, ej2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TypingCacheKey(chatId=" + this.a + ", notifs=" + this.b + ")";
    }
}
