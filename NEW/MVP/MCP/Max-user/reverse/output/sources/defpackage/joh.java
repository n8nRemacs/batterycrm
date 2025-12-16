package defpackage;

/* loaded from: classes2.dex */
public final class joh {
    public static final ioh Companion = new ioh();
    public final String a;
    public final boolean b;
    public final String c;

    public /* synthetic */ joh(String str, int i, String str2, boolean z) {
        if (7 != (i & 7)) {
            g5j.c(i, 7, hoh.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joh)) {
            return false;
        }
        joh johVar = (joh) obj;
        return fni.a(this.a, johVar.a) && this.b == johVar.b && fni.a(this.c, johVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a9h.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryUnavailableResponse(requestId=");
        sb.append(this.a);
        sb.append(", available=");
        sb.append(this.b);
        sb.append(", deviceId=");
        return ho7.l(sb, this.c, ")");
    }

    public joh(String str, String str2) {
        this.a = str;
        this.b = false;
        this.c = str2;
    }
}
