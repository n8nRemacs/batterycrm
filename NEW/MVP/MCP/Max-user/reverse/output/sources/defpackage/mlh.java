package defpackage;

/* loaded from: classes2.dex */
public final class mlh {
    public static final llh Companion = new llh();
    public static final zy7[] d = {null, null, epf.Companion.serializer()};
    public final String a;
    public final String b;
    public final epf c;

    public /* synthetic */ mlh(int i, String str, String str2, epf epfVar) {
        if (7 != (i & 7)) {
            g5j.c(i, 7, klh.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = epfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlh)) {
            return false;
        }
        mlh mlhVar = (mlh) obj;
        return fni.a(this.a, mlhVar.a) && fni.a(this.b, mlhVar.b) && this.c == mlhVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + u45.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("WebAppBiometryAuthResponse(requestId=", this.a, ", token=", this.b, ", status=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }

    public mlh(String str, String str2) {
        epf epfVar = epf.X;
        this.a = str;
        this.b = str2;
        this.c = epfVar;
    }
}
