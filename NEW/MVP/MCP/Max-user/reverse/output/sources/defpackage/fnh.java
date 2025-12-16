package defpackage;

/* loaded from: classes2.dex */
public final class fnh {
    public static final enh Companion = new enh();
    public final String a;
    public final String b;

    public /* synthetic */ fnh(int i, String str, String str2) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, dnh.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnh)) {
            return false;
        }
        fnh fnhVar = (fnh) obj;
        return fni.a(this.a, fnhVar.a) && fni.a(this.b, fnhVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return wy1.j("WebAppBiometryGetInfoRequest(queryId=", this.a, ", requestId=", this.b, ")");
    }
}
