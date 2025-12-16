package defpackage;

/* loaded from: classes2.dex */
public final class doh {
    public static final coh Companion = new coh();
    public final String a;
    public final String b;

    public /* synthetic */ doh(int i, String str, String str2) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, boh.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doh)) {
            return false;
        }
        doh dohVar = (doh) obj;
        return fni.a(this.a, dohVar.a) && fni.a(this.b, dohVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return wy1.j("WebAppBiometryOpenSettingsRequest(queryId=", this.a, ", requestId=", this.b, ")");
    }
}
