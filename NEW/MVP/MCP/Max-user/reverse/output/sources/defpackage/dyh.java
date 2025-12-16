package defpackage;

/* loaded from: classes2.dex */
public final class dyh {
    public static final cyh Companion = new cyh();
    public final String a;
    public final String b;

    public /* synthetic */ dyh(int i, String str, String str2) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, byh.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyh)) {
            return false;
        }
        dyh dyhVar = (dyh) obj;
        return fni.a(this.a, dyhVar.a) && fni.a(this.b, dyhVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return wy1.j("WebAppStorageClearRequest(queryId=", this.a, ", requestId=", this.b, ")");
    }
}
