package defpackage;

/* loaded from: classes.dex */
public final class rsc {
    public final k09 a;
    public final long b;
    public final long c;

    public rsc(k09 k09Var, long j, long j2) {
        this.a = k09Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsc)) {
            return false;
        }
        rsc rscVar = (rsc) obj;
        return this.b == rscVar.b && this.a.equals(rscVar.a) && this.c == rscVar.c;
    }

    public final int hashCode() {
        long j = this.b;
        int iHashCode = (this.a.hashCode() + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        long j2 = this.c;
        return iHashCode + ((int) ((j2 >>> 32) ^ j2));
    }
}
