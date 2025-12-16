package defpackage;

/* loaded from: classes2.dex */
public final class kc9 implements t98 {
    public final long X;
    public final CharSequence Y;
    public final x8d Z;
    public final long a;
    public final CharSequence b;
    public final s5g c;
    public final String d;
    public final boolean o;
    public final boolean s0;
    public final boolean t0;

    public kc9(long j, CharSequence charSequence, s5g s5gVar, String str, boolean z, long j2, CharSequence charSequence2, x8d x8dVar, boolean z2, boolean z3) {
        this.a = j;
        this.b = charSequence;
        this.c = s5gVar;
        this.d = str;
        this.o = z;
        this.X = j2;
        this.Y = charSequence2;
        this.Z = x8dVar;
        this.s0 = z2;
        this.t0 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc9)) {
            return false;
        }
        kc9 kc9Var = (kc9) obj;
        return this.a == kc9Var.a && fni.a(this.b, kc9Var.b) && fni.a(this.c, kc9Var.c) && fni.a(this.d, kc9Var.d) && this.o == kc9Var.o && this.X == kc9Var.X && fni.a(this.Y, kc9Var.Y) && fni.a(this.Z, kc9Var.Z) && this.s0 == kc9Var.s0 && this.t0 == kc9Var.t0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iG = u45.g(this.Y, a9h.a(a9h.b(u45.e(xc0.d(u45.g(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.o), 31, this.X), 31);
        x8d x8dVar = this.Z;
        return Boolean.hashCode(this.t0) + a9h.b((iG + (x8dVar == null ? 0 : x8dVar.hashCode())) * 31, 31, this.s0);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        if (!(t98Var instanceof kc9)) {
            return null;
        }
        x8d x8dVar = ((kc9) t98Var).Z;
        if (fni.a(this.Z, x8dVar)) {
            return null;
        }
        return new jc9(x8dVar);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return j7b.F;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberListItem(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", avatar=");
        sb.append(this.d);
        sb.append(", isOnline=");
        sb.append(this.o);
        sb.append(", lastReadMark=");
        sb.append(this.X);
        sb.append(", abbreviation=");
        sb.append((Object) this.Y);
        sb.append(", reaction=");
        sb.append((Object) this.Z);
        sb.append(", isRead=");
        sb.append(this.s0);
        return vb9.f(sb, ", isSelf=", this.t0, ")");
    }
}
