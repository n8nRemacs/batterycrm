package defpackage;

/* loaded from: classes2.dex */
public final class sb9 extends yb9 {
    public final String X;
    public final String Y;
    public final String Z;
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String o;
    public final mcf s0;
    public final mcf t0;
    public final int u0 = fzc.profile_media_view_type_audio;

    public sb9(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, tcf tcfVar, mcf mcfVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.o = str2;
        this.X = str3;
        this.Y = str4;
        this.Z = str5;
        this.s0 = tcfVar;
        this.t0 = mcfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb9)) {
            return false;
        }
        sb9 sb9Var = (sb9) obj;
        return this.a == sb9Var.a && this.b == sb9Var.b && this.c == sb9Var.c && fni.a(this.d, sb9Var.d) && fni.a(this.o, sb9Var.o) && fni.a(this.X, sb9Var.X) && fni.a(this.Y, sb9Var.Y) && this.Z.equals(sb9Var.Z) && fni.a(this.s0, sb9Var.s0) && fni.a(this.t0, sb9Var.t0);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.t0.hashCode() + ((this.s0.hashCode() + u45.e(u45.e(u45.e(u45.e(u45.e(a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.o), 31, this.X), 31, this.Y), 31, this.Z)) * 31)) * 31);
    }

    @Override // defpackage.yb9
    public final long i() {
        return this.c;
    }

    @Override // defpackage.yb9
    public final long j() {
        return this.b;
    }

    @Override // defpackage.yb9
    public final boolean l() {
        return false;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.u0;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "Audio(itemId=", ", messageId=");
        sbL.append(this.b);
        az1.r(this.c, ", attachId=", ", attachLocalId=", sbL);
        ho7.r(sbL, this.d, ", audioUrl=", this.o, ", audioArtist=");
        ho7.r(sbL, this.X, ", subtitle=", this.Y, ", playerTitle=");
        sbL.append(this.Z);
        sbL.append(", state=");
        sbL.append(this.s0);
        sbL.append(", progressState=");
        sbL.append(this.t0);
        sbL.append(", isContentLevel=false)");
        return sbL.toString();
    }
}
