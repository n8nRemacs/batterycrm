package defpackage;

/* loaded from: classes.dex */
public final class dae {
    public final long a;
    public final long b;

    public dae(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dae.class == obj.getClass()) {
            dae daeVar = (dae) obj;
            if (this.a == daeVar.a && this.b == daeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
