package defpackage;

/* loaded from: classes2.dex */
public final class fff implements t98 {
    public static final fff w0 = new fff(0, 0, 0, null, null, null, 0, 0, false, false, 0, 8190);
    public final String X;
    public final int Y;
    public final int Z;
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String o;
    public final boolean s0;
    public final boolean t0;
    public final long u0;
    public final int v0;

    public fff(long j, long j2, long j3, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.o = str2;
        this.X = str3;
        this.Y = i;
        this.Z = i2;
        this.s0 = z;
        this.t0 = z2;
        this.u0 = j4;
        this.v0 = (str3 == null || str3.length() == 0) ? (str2 == null || str2.length() == 0) ? uab.h : uab.i : uab.j;
    }

    public static fff l(fff fffVar, boolean z, boolean z2, int i) {
        return new fff(fffVar.a, fffVar.b, fffVar.c, fffVar.d, fffVar.o, fffVar.X, fffVar.Y, fffVar.Z, (i & 1024) != 0 ? fffVar.s0 : z, (i & 2048) != 0 ? fffVar.t0 : z2, fffVar.u0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fff)) {
            return false;
        }
        fff fffVar = (fff) obj;
        return this.a == fffVar.a && this.b == fffVar.b && this.c == fffVar.c && fni.a(this.d, fffVar.d) && fni.a(this.o, fffVar.o) && fni.a(this.X, fffVar.X) && this.Y == fffVar.Y && this.Z == fffVar.Z && this.s0 == fffVar.s0 && this.t0 == fffVar.t0 && this.u0 == fffVar.u0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.u0;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.u0 == t98Var.getItemId();
    }

    public final int hashCode() {
        int iA = a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.o;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.X;
        return Long.hashCode(this.u0) + a9h.b(a9h.b(a9h.b(xrf.k(this.Z, xrf.k(this.Y, xrf.k(0, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31), 31, false), 31, this.s0), 31, this.t0);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        boolean z;
        if ((t98Var instanceof fff) && this.t0 != (z = ((fff) t98Var).t0)) {
            return new eff(z);
        }
        return null;
    }

    @Override // defpackage.t98
    public final int m() {
        return this.v0;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "StickerModel(id=", ", setId=");
        sbL.append(this.b);
        az1.r(this.c, ", originalSetId=", ", previewUrl=", sbL);
        ho7.r(sbL, this.d, ", lottieUrl=", this.o, ", videoUrl=");
        sbL.append(this.X);
        sbL.append(", markerType=0, width=");
        sbL.append(this.Y);
        sbL.append(", height=");
        sbL.append(this.Z);
        sbL.append(", external=false, favorite=");
        sbL.append(this.s0);
        sbL.append(", selected=");
        sbL.append(this.t0);
        sbL.append(", itemId=");
        sbL.append(this.u0);
        sbL.append(")");
        return sbL.toString();
    }

    public /* synthetic */ fff(long j, long j2, long j3, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, long j4, int i3) {
        this(j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? 0L : j3, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? 0 : i2, (i3 & 1024) != 0 ? false : z, (i3 & 2048) != 0 ? false : z2, (i3 & 4096) != 0 ? j : j4);
    }
}
