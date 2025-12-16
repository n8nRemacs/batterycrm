package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class yy0 {
    public final long a;
    public final ArrayList b;

    public yy0(long j, ArrayList arrayList) {
        this.a = j;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy0)) {
            return false;
        }
        yy0 yy0Var = (yy0) obj;
        return this.a == yy0Var.a && this.b.equals(yy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CacheState(totalSizeBytes=" + this.a + ", items=" + this.b + ")";
    }
}
