package defpackage;

/* loaded from: classes2.dex */
public final class tb9 extends yb9 {
    public final String X;
    public final long Y;
    public final String Z;
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String o;
    public final String s0;
    public final String t0;
    public final int u0;
    public final gv5 v0;
    public final hbd w0;
    public final int x0 = fzc.profile_media_view_type_file;

    public tb9(long j, long j2, long j3, String str, String str2, String str3, long j4, String str4, String str5, String str6, int i, gv5 gv5Var, hbd hbdVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.o = str2;
        this.X = str3;
        this.Y = j4;
        this.Z = str4;
        this.s0 = str5;
        this.t0 = str6;
        this.u0 = i;
        this.v0 = gv5Var;
        this.w0 = hbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tb9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        tb9 tb9Var = (tb9) obj;
        return this.a == tb9Var.a && this.b == tb9Var.b && this.c == tb9Var.c && this.Y == tb9Var.Y && fni.a(this.d, tb9Var.d) && fni.a(this.o, tb9Var.o) && this.X.equals(tb9Var.X) && this.Z.equals(tb9Var.Z) && fni.a(this.s0, tb9Var.s0) && fni.a(this.t0, tb9Var.t0) && this.u0 == tb9Var.u0 && fni.a(this.v0, tb9Var.v0);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iB = a9h.b(a9h.a(a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.Y), 31, false);
        String str = this.d;
        int iE = u45.e((this.Z.hashCode() + ((this.X.hashCode() + u45.e((iB + (str != null ? str.hashCode() : 0)) * 31, 31, this.o)) * 31)) * 31, 31, this.s0);
        String str2 = this.t0;
        return this.v0.hashCode() + utb.k(this.u0, (iE + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
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
        return this.x0;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "File(itemId=", ", messageId=");
        sbL.append(this.b);
        az1.r(this.c, ", attachId=", ", previewUrl=", sbL);
        ho7.r(sbL, this.d, ", title=", this.o, ", uploadTime=");
        sbL.append((Object) this.X);
        sbL.append(", rawFileSize=");
        sbL.append(this.Y);
        sbL.append(", fileSize=");
        sbL.append((Object) this.Z);
        sbL.append(", attachLocalId=");
        sbL.append(this.s0);
        sbL.append(", localPath=");
        sbL.append(this.t0);
        sbL.append(", type=");
        int i = this.u0;
        sbL.append(i != 1 ? i != 2 ? i != 3 ? "null" : "UNKNOWN" : "VIDEO" : "PHOTO");
        sbL.append(", extension=");
        sbL.append(this.v0);
        sbL.append(", isContentLevel=false, loadingStateFlow=");
        sbL.append(this.w0);
        sbL.append(")");
        return sbL.toString();
    }
}
