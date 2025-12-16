package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class lc9 implements t98 {
    public final CharSequence X;
    public final boolean Y;
    public final boolean Z;
    public final long a;
    public final String b;
    public final CharSequence c;
    public final s5g d;
    public final Uri o;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final int v0;
    public final s5g w0;

    public lc9(long j, String str, CharSequence charSequence, s5g s5gVar, Uri uri, CharSequence charSequence2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, s5g s5gVar2) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
        this.d = s5gVar;
        this.o = uri;
        this.X = charSequence2;
        this.Y = z;
        this.Z = z2;
        this.s0 = z3;
        this.t0 = z4;
        this.u0 = z5;
        this.v0 = i;
        this.w0 = s5gVar2;
    }

    public static lc9 l(lc9 lc9Var, boolean z) {
        return new lc9(lc9Var.a, lc9Var.b, lc9Var.c, lc9Var.d, lc9Var.o, lc9Var.X, lc9Var.Y, lc9Var.Z, z, lc9Var.t0, lc9Var.u0, lc9Var.v0, lc9Var.w0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc9)) {
            return false;
        }
        lc9 lc9Var = (lc9) obj;
        return this.a == lc9Var.a && this.b.equals(lc9Var.b) && fni.a(this.c, lc9Var.c) && fni.a(this.d, lc9Var.d) && fni.a(this.o, lc9Var.o) && this.X.equals(lc9Var.X) && this.Y == lc9Var.Y && this.Z == lc9Var.Z && this.s0 == lc9Var.s0 && this.t0 == lc9Var.t0 && this.u0 == lc9Var.u0 && this.v0 == lc9Var.v0 && fni.a(this.w0, lc9Var.w0);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.a == t98Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        CharSequence charSequence = this.c;
        int iD = xc0.d((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d);
        Uri uri = this.o;
        int iK = xrf.k(this.v0, a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(u45.g(this.X, (iD + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31, this.Y), 31, this.Z), 31, this.s0), 31, this.t0), 31, this.u0), 31);
        s5g s5gVar = this.w0;
        return iK + (s5gVar != null ? s5gVar.hashCode() : 0);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberListItem(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", shortName=");
        sb.append((Object) this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.o);
        sb.append(", abbreviation=");
        sb.append((Object) this.X);
        hf3.f(", isVerified=", ", isSelf=", sb, this.Y, this.Z);
        hf3.f(", isOwner=", ", isEnabled=", sb, this.s0, this.t0);
        sb.append(", isSelectable=");
        sb.append(this.u0);
        sb.append(", presence=");
        sb.append(this.v0);
        sb.append(", alias=");
        sb.append(this.w0);
        sb.append(")");
        return sb.toString();
    }
}
