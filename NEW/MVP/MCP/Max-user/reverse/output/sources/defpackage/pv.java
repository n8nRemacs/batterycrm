package defpackage;

/* loaded from: classes2.dex */
public final class pv extends rv {
    public final long a;
    public final boolean b;

    public pv(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv)) {
            return false;
        }
        pv pvVar = (pv) obj;
        return this.a == pvVar.a && this.b == pvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "LoadingNext(time=", ", isRemoteCaused=", this.b);
        sbJ.append(")");
        return sbJ.toString();
    }
}
