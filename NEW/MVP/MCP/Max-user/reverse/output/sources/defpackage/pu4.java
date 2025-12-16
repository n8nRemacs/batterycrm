package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class pu4 {
    public static final AtomicLong b = new AtomicLong(0);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pu4) {
            return this.a == ((pu4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "DevButtonId(value=", ")");
    }
}
