package defpackage;

/* loaded from: classes2.dex */
public final class v9d {
    public final x8d a;
    public final long b;
    public final String c;

    public v9d(long j, x8d x8dVar, String str) {
        this.a = x8dVar;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9d)) {
            return false;
        }
        v9d v9dVar = (v9d) obj;
        return fni.a(this.a, v9dVar.a) && this.b == v9dVar.b && fni.a(this.c, v9dVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + u45.e(a9h.a(a9h.a(this.a.hashCode() * 31, 31, this.b), 31, 0L), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddReaction(selfReaction=");
        sb.append((Object) this.a);
        sb.append(", msgLocalId=");
        sb.append(this.b);
        return ctd.j(sb, ", msgTime=0, effectLottieUrl=", this.c, ", checkIsVisibleInWindow=false)");
    }
}
