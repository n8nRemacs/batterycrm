package defpackage;

/* loaded from: classes.dex */
public final class l9e {
    public static final l9e c = new l9e(0, 0);
    public final long a;
    public final long b;

    public l9e(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l9e.class == obj.getClass()) {
            l9e l9eVar = (l9e) obj;
            if (this.a == l9eVar.a && this.b == l9eVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return ho7.k(sb, this.b, "]");
    }
}
