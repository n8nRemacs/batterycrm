package defpackage;

/* loaded from: classes.dex */
public final class m9e {
    public static final m9e c = new m9e(0, 0);
    public final long a;
    public final long b;

    public m9e(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m9e.class == obj.getClass()) {
            m9e m9eVar = (m9e) obj;
            if (this.a == m9eVar.a && this.b == m9eVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return ho7.k(sb, this.b, "]");
    }
}
