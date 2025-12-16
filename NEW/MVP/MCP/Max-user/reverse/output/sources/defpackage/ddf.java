package defpackage;

/* loaded from: classes2.dex */
public final class ddf {
    public final cdf a;
    public final edf b;

    public ddf(cdf cdfVar, edf edfVar) {
        this.a = cdfVar;
        this.b = edfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddf)) {
            return false;
        }
        ddf ddfVar = (ddf) obj;
        return fni.a(this.a, ddfVar.a) && fni.a(this.b, ddfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StatesBackgroundColors(active=" + this.a + ", disabled=" + this.b + ")";
    }
}
