package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class z2a extends b3a {
    public final long a;

    public z2a(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2a) || this.a != ((z2a) obj).a) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return true;
    }

    public final int hashCode() {
        return TimeUnit.SECONDS.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Defined(position=" + this.a + ", timeUnit=" + TimeUnit.SECONDS + ")";
    }
}
