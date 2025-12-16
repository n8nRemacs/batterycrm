package defpackage;

/* loaded from: classes2.dex */
public final class ug3 implements wg3 {
    public final long a;

    public ug3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug3) && this.a == ((ug3) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Add(chatId=", ")");
    }
}
