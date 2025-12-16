package defpackage;

/* loaded from: classes2.dex */
public final class tfc extends id0 {
    public final long b;
    public final dfc c;

    public tfc(long j, dfc dfcVar) {
        super(14);
        this.b = j;
        this.c = dfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfc)) {
            return false;
        }
        tfc tfcVar = (tfc) obj;
        return this.b == tfcVar.b && this.c == tfcVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChangeLink(id=" + this.b + ", type=" + this.c + ")";
    }
}
