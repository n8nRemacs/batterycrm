package defpackage;

/* loaded from: classes2.dex */
public final class ub9 extends yb9 {
    public final CharSequence X;
    public final CharSequence Y;
    public final boolean Z;
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String o;
    public final int s0 = fzc.profile_media_view_type_link;

    public ub9(long j, long j2, long j3, String str, String str2, String str3, String str4, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.o = str2;
        this.X = str3;
        this.Y = str4;
        this.Z = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub9)) {
            return false;
        }
        ub9 ub9Var = (ub9) obj;
        return this.a == ub9Var.a && this.b == ub9Var.b && this.c == ub9Var.c && fni.a(this.d, ub9Var.d) && fni.a(this.o, ub9Var.o) && fni.a(this.X, ub9Var.X) && fni.a(this.Y, ub9Var.Y) && this.Z == ub9Var.Z;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iA = a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iE = u45.e((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.o);
        CharSequence charSequence = this.X;
        int iHashCode = (iE + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.Y;
        return Boolean.hashCode(this.Z) + ((iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
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
        return this.Z;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.s0;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "Link(itemId=", ", messageId=");
        sbL.append(this.b);
        az1.r(this.c, ", attachId=", ", previewUrl=", sbL);
        ho7.r(sbL, this.d, ", title=", this.o, ", subtitle=");
        sbL.append((Object) this.X);
        sbL.append(", link=");
        sbL.append((Object) this.Y);
        sbL.append(", isContentLevel=");
        return az1.k(sbL, this.Z, ")");
    }
}
