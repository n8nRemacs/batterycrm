package defpackage;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ss4 implements Serializable {
    public final long a;
    public final boolean b;

    public ss4(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final Map a() {
        return to8.j(new imb("timeToFire", Long.valueOf(this.a)), new imb("notifySender", Boolean.valueOf(this.b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss4)) {
            return false;
        }
        ss4 ss4Var = (ss4) obj;
        return this.a == ss4Var.a && this.b == ss4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DelayedAttributes(timeToFire=" + d8j.a(Long.valueOf(this.a)) + ", notifySender=" + this.b + ")";
    }
}
