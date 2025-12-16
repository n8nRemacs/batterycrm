package defpackage;

/* loaded from: classes.dex */
public final class eae {
    public final long a;
    public final long b;

    public eae(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eae.class == obj.getClass()) {
            eae eaeVar = (eae) obj;
            if (this.a == eaeVar.a && this.b == eaeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
