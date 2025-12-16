package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class crb {
    public final List a;
    public final long b;

    public crb(long j, List list) {
        this.a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crb)) {
            return false;
        }
        crb crbVar = (crb) obj;
        return fni.a(this.a, crbVar.a) && this.b == crbVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PerfSpansPreparedForEvent(spans=" + this.a + ", totalDuration=" + this.b + ")";
    }
}
