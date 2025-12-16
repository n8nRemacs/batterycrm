package defpackage;

/* loaded from: classes.dex */
public final class vc1 {
    public final String a;
    public final gxi b;
    public final gxi c;
    public final boolean d;
    public final co5 e;
    public final d51 f;
    public final boolean g;
    public final cnb h;
    public final in1 i;
    public final gn1 j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final zi1 p;
    public final ms8 q;
    public final ms8 r;
    public final boolean s;
    public final boolean t;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ vc1() {
        xn5 xn5Var = xn5.a;
        in1 in1Var = in1.g;
        gn1 gn1Var = gn1.g;
        ms8 ms8Var = ms8.o;
        this(null, null, null, false, xn5Var, null, false, null, in1Var, gn1Var, null, false, false, false, true, null, ms8Var, ms8Var, false, false);
    }

    public static vc1 a(vc1 vc1Var, gxi gxiVar, co5 co5Var, d51 d51Var, boolean z, ms8 ms8Var, ms8 ms8Var2, boolean z2, int i) {
        zi1 zi1Var;
        ms8 ms8Var3;
        boolean z3;
        boolean z4;
        String str = vc1Var.a;
        gxi gxiVar2 = vc1Var.b;
        gxi gxiVar3 = (i & 4) != 0 ? vc1Var.c : gxiVar;
        boolean z5 = vc1Var.d;
        co5 co5Var2 = (i & 16) != 0 ? vc1Var.e : co5Var;
        d51 d51Var2 = (i & 32) != 0 ? vc1Var.f : d51Var;
        boolean z6 = (i & 64) != 0 ? vc1Var.g : z;
        cnb cnbVar = vc1Var.h;
        in1 in1Var = vc1Var.i;
        gn1 gn1Var = vc1Var.j;
        String str2 = vc1Var.k;
        boolean z7 = vc1Var.l;
        boolean z8 = vc1Var.m;
        boolean z9 = vc1Var.n;
        boolean z10 = vc1Var.o;
        zi1 zi1Var2 = vc1Var.p;
        if ((i & 65536) != 0) {
            zi1Var = zi1Var2;
            ms8Var3 = vc1Var.q;
        } else {
            zi1Var = zi1Var2;
            ms8Var3 = ms8Var;
        }
        ms8 ms8Var4 = ms8Var3;
        ms8 ms8Var5 = (i & 131072) != 0 ? vc1Var.r : ms8Var2;
        boolean z11 = vc1Var.s;
        if ((i & 524288) != 0) {
            z3 = z11;
            z4 = vc1Var.t;
        } else {
            z3 = z11;
            z4 = z2;
        }
        vc1Var.getClass();
        return new vc1(str, gxiVar2, gxiVar3, z5, co5Var2, d51Var2, z6, cnbVar, in1Var, gn1Var, str2, z7, z8, z9, z10, zi1Var, ms8Var4, ms8Var5, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc1)) {
            return false;
        }
        vc1 vc1Var = (vc1) obj;
        return fni.a(this.a, vc1Var.a) && fni.a(this.b, vc1Var.b) && fni.a(this.c, vc1Var.c) && this.d == vc1Var.d && fni.a(this.e, vc1Var.e) && fni.a(this.f, vc1Var.f) && this.g == vc1Var.g && fni.a(this.h, vc1Var.h) && fni.a(this.i, vc1Var.i) && fni.a(this.j, vc1Var.j) && fni.a(this.k, vc1Var.k) && this.l == vc1Var.l && this.m == vc1Var.m && this.n == vc1Var.n && this.o == vc1Var.o && fni.a(this.p, vc1Var.p) && this.q == vc1Var.q && this.r == vc1Var.r && this.s == vc1Var.s && this.t == vc1Var.t;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        gxi gxiVar = this.b;
        int iHashCode2 = (iHashCode + (gxiVar == null ? 0 : gxiVar.hashCode())) * 31;
        gxi gxiVar2 = this.c;
        int iHashCode3 = (this.e.hashCode() + a9h.b((iHashCode2 + (gxiVar2 == null ? 0 : gxiVar2.hashCode())) * 31, 31, this.d)) * 31;
        d51 d51Var = this.f;
        int iB = a9h.b((iHashCode3 + (d51Var == null ? 0 : d51Var.hashCode())) * 31, 31, this.g);
        cnb cnbVar = this.h;
        int iHashCode4 = (this.j.hashCode() + ((this.i.hashCode() + ((iB + (cnbVar == null ? 0 : cnbVar.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.k;
        int iB2 = a9h.b(a9h.b(a9h.b(a9h.b((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        zi1 zi1Var = this.p;
        return Boolean.hashCode(this.t) + a9h.b((this.r.hashCode() + ((this.q.hashCode() + ((iB2 + (zi1Var != null ? zi1Var.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallInfoState(conversationId=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", recallTarget=");
        sb.append(this.c);
        sb.append(", isIncoming=");
        sb.append(this.d);
        sb.append(", callState=");
        sb.append(this.e);
        sb.append(", chatInfo=");
        sb.append(this.f);
        sb.append(", isGroupCall=");
        sb.append(this.g);
        sb.append(", me=");
        sb.append(this.h);
        sb.append(", screenSharingState=");
        sb.append(this.i);
        sb.append(", recordSharingState=");
        sb.append(this.j);
        sb.append(", joinLink=");
        sb.append(this.k);
        sb.append(", hasOpponentsOnce=");
        sb.append(this.l);
        sb.append(", isConnectedOnce=");
        az1.t(", isMeCallAdmin=", ", isInCallMeOnly=", sb, this.m, this.n);
        sb.append(this.o);
        sb.append(", primarySpeaker=");
        sb.append(this.p);
        sb.append(", isVideoEnabled=");
        sb.append(this.q);
        sb.append(", isMicrophoneEnabled=");
        sb.append(this.r);
        sb.append(", isCallUnavailable=");
        sb.append(this.s);
        sb.append(", hasAnyCameraEnabled=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }

    public vc1(String str, gxi gxiVar, gxi gxiVar2, boolean z, co5 co5Var, d51 d51Var, boolean z2, cnb cnbVar, in1 in1Var, gn1 gn1Var, String str2, boolean z3, boolean z4, boolean z5, boolean z6, zi1 zi1Var, ms8 ms8Var, ms8 ms8Var2, boolean z7, boolean z8) {
        this.a = str;
        this.b = gxiVar;
        this.c = gxiVar2;
        this.d = z;
        this.e = co5Var;
        this.f = d51Var;
        this.g = z2;
        this.h = cnbVar;
        this.i = in1Var;
        this.j = gn1Var;
        this.k = str2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = zi1Var;
        this.q = ms8Var;
        this.r = ms8Var2;
        this.s = z7;
        this.t = z8;
    }
}
