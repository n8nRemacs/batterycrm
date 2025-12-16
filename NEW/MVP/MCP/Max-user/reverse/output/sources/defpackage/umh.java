package defpackage;

/* loaded from: classes2.dex */
public final class umh {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public umh(long j, long j2, long j3, String str, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    public static umh a(umh umhVar, boolean z, boolean z2, int i) {
        long j = umhVar.a;
        long j2 = umhVar.b;
        long j3 = umhVar.c;
        String str = (i & 8) != 0 ? umhVar.d : null;
        if ((i & 16) != 0) {
            z = umhVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = umhVar.f;
        }
        return new umh(j, j2, j3, str, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umh)) {
            return false;
        }
        umh umhVar = (umh) obj;
        return this.a == umhVar.a && this.b == umhVar.b && this.c == umhVar.c && fni.a(this.d, umhVar.d) && this.e == umhVar.e && this.f == umhVar.f;
    }

    public final int hashCode() {
        int iA = a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + a9h.b((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "WebAppBiometryEntity(id=", ", userId=");
        sbL.append(this.b);
        az1.r(this.c, ", botId=", ", token=", sbL);
        sbL.append(this.d);
        sbL.append(", accessRequested=");
        sbL.append(this.e);
        sbL.append(", accessGranted=");
        return az1.k(sbL, this.f, ")");
    }

    public umh(long j, long j2, boolean z) {
        this(0L, j, j2, null, true, z);
    }
}
