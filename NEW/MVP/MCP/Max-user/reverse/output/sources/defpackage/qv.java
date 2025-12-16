package defpackage;

/* loaded from: classes2.dex */
public final class qv extends rv {
    public final long a;
    public final boolean b;

    public qv(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv)) {
            return false;
        }
        qv qvVar = (qv) obj;
        return this.a == qvVar.a && this.b == qvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "LoadingPrev(time=", ", isRemoteCaused=", this.b);
        sbJ.append(")");
        return sbJ.toString();
    }
}
