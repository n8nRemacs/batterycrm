package defpackage;

/* loaded from: classes2.dex */
public final class yea {
    public final long a;
    public final String b;
    public final Boolean c;

    public yea(long j, String str, Boolean bool) {
        this.a = j;
        this.b = str;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yea)) {
            return false;
        }
        yea yeaVar = (yea) obj;
        return this.a == yeaVar.a && fni.a(this.b, yeaVar.b) && fni.a(this.c, yeaVar.c);
    }

    public final int hashCode() {
        int iE = u45.e(Long.hashCode(this.a) * 31, 31, this.b);
        Boolean bool = this.c;
        return iE + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("NeuroAvatarInfo(id=", this.a, ", url=", this.b);
        sbN.append(", default=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
