package defpackage;

/* loaded from: classes.dex */
public final class mb4 {
    public static final mb4 m = new mb4(null, null, null, false, false, false, 8190);
    public final gxi a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final c9c k;
    public final co5 l;

    public mb4(gxi gxiVar, long j, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, c9c c9cVar, co5 co5Var) {
        this.a = gxiVar;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = c9cVar;
        this.l = co5Var;
    }

    public static mb4 a(mb4 mb4Var, gxi gxiVar, long j, String str, String str2, boolean z, boolean z2, boolean z3, c9c c9cVar, co5 co5Var, int i) {
        gxi gxiVar2 = (i & 1) != 0 ? mb4Var.a : gxiVar;
        long j2 = (i & 2) != 0 ? mb4Var.b : j;
        String str3 = (i & 4) != 0 ? mb4Var.c : str;
        String str4 = (i & 8) != 0 ? mb4Var.d : str2;
        boolean z4 = (i & 16) != 0 ? mb4Var.e : z;
        boolean z5 = (i & 32) != 0 ? mb4Var.f : true;
        boolean z6 = (i & 64) != 0 ? mb4Var.g : z2;
        boolean z7 = mb4Var.h;
        boolean z8 = (i & 256) != 0 ? mb4Var.i : z3;
        boolean z9 = (i & 512) != 0 ? mb4Var.j : true;
        c9c c9cVar2 = (i & 1024) != 0 ? mb4Var.k : c9cVar;
        mb4Var.getClass();
        co5 co5Var2 = (i & 4096) != 0 ? mb4Var.l : co5Var;
        mb4Var.getClass();
        return new mb4(gxiVar2, j2, str3, str4, z4, z5, z6, z7, z8, z9, c9cVar2, co5Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb4)) {
            return false;
        }
        mb4 mb4Var = (mb4) obj;
        return fni.a(this.a, mb4Var.a) && this.b == mb4Var.b && fni.a(this.c, mb4Var.c) && fni.a(this.d, mb4Var.d) && this.e == mb4Var.e && this.f == mb4Var.f && this.g == mb4Var.g && this.h == mb4Var.h && this.i == mb4Var.i && this.j == mb4Var.j && fni.a(this.k, mb4Var.k) && fni.a(this.l, mb4Var.l);
    }

    public final int hashCode() {
        gxi gxiVar = this.a;
        int iA = a9h.a((gxiVar == null ? 0 : gxiVar.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iB = a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        c9c c9cVar = this.k;
        return this.l.hashCode() + a9h.b((iB + (c9cVar == null ? 0 : c9cVar.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurrentCallInfo(target=");
        sb.append(this.a);
        sb.append(", startedAt=");
        sb.append(this.b);
        ho7.r(sb, ", conversationId=", this.c, ", joinLink=", this.d);
        hf3.f(", hasOpponentsOnce=", ", isConnectedOnce=", sb, this.e, this.f);
        hf3.f(", isAccepted=", ", isIncoming=", sb, this.g, this.h);
        hf3.f(", isGroupCall=", ", isMediaConnectedCalledOnce=", sb, this.i, this.j);
        sb.append(", previousCallState=");
        sb.append(this.k);
        sb.append(", isInviteToP2PAvailable=false, state=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mb4(gxi gxiVar, String str, String str2, boolean z, boolean z2, boolean z3, int i) {
        co5 co5Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = (i & 4) != 0 ? null : str;
        String str4 = (i & 8) != 0 ? null : str2;
        boolean z4 = (i & 64) != 0 ? false : z;
        boolean z5 = (i & 128) != 0 ? false : z2;
        boolean z6 = (i & 256) != 0 ? false : z3;
        if ((i & 4096) != 0) {
            co5Var = xn5.a;
        } else {
            co5Var = yn5.a;
        }
        this(gxiVar, jCurrentTimeMillis, str3, str4, false, false, z4, z5, z6, false, null, co5Var);
    }
}
