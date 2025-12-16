package defpackage;

/* loaded from: classes2.dex */
public final class lje {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final sse g;
    public final boolean h;

    public lje(long j, String str, String str2, String str3, String str4, int i, sse sseVar, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = sseVar;
        this.h = z;
    }

    public static lje a(lje ljeVar, int i, sse sseVar, boolean z, int i2) {
        long j = ljeVar.a;
        String str = ljeVar.b;
        String str2 = ljeVar.c;
        String str3 = ljeVar.d;
        String str4 = ljeVar.e;
        if ((i2 & 64) != 0) {
            sseVar = ljeVar.g;
        }
        sse sseVar2 = sseVar;
        if ((i2 & 128) != 0) {
            z = ljeVar.h;
        }
        ljeVar.getClass();
        return new lje(j, str, str2, str3, str4, i, sseVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lje)) {
            return false;
        }
        lje ljeVar = (lje) obj;
        return this.a == ljeVar.a && fni.a(this.b, ljeVar.b) && fni.a(this.c, ljeVar.c) && fni.a(this.d, ljeVar.d) && fni.a(this.e, ljeVar.e) && this.f == ljeVar.f && fni.a(this.g, ljeVar.g) && this.h == ljeVar.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE = u45.e(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iE2 = u45.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iK = utb.k(this.f, (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        sse sseVar = this.g;
        int iHashCode = (iK + (sseVar != null ? sseVar.a.hashCode() : 0)) * 31;
        boolean z = this.h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionState(versionCode=");
        sb.append(this.a);
        sb.append(", versionName=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", sessionUuid=");
        sb.append(this.d);
        sb.append(", processName=");
        sb.append(this.e);
        sb.append(", status=");
        int i = this.f;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NATIVE" : "ANR" : "CRASH" : "BLANK");
        sb.append(", maxSeverity=");
        sb.append(this.g);
        sb.append(", isInBackground=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
