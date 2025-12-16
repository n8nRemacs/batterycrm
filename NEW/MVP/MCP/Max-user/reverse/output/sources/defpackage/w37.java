package defpackage;

/* loaded from: classes.dex */
public final class w37 implements t98 {
    public final String X;
    public final String Y;
    public final boolean Z;
    public final long a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final boolean o;
    public final CharSequence s0;
    public final int t0;
    public final o37 u0;
    public final long v0;

    public w37(long j, long j2, CharSequence charSequence, String str, boolean z, String str2, String str3, boolean z2, CharSequence charSequence2, int i, o37 o37Var) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.d = str;
        this.o = z;
        this.X = str2;
        this.Y = str3;
        this.Z = z2;
        this.s0 = charSequence2;
        this.t0 = i;
        this.u0 = o37Var;
        this.v0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w37)) {
            return false;
        }
        w37 w37Var = (w37) obj;
        return this.a == w37Var.a && this.b == w37Var.b && fni.a(this.c, w37Var.c) && fni.a(this.d, w37Var.d) && this.o == w37Var.o && fni.a(this.X, w37Var.X) && this.Y.equals(w37Var.Y) && this.Z == w37Var.Z && fni.a(this.s0, w37Var.s0) && this.t0 == w37Var.t0 && this.u0.equals(w37Var.u0);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.v0;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.v0 == t98Var.getItemId();
    }

    public final int hashCode() {
        int iG = u45.g(this.c, a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31);
        String str = this.d;
        return this.u0.hashCode() + utb.k(this.t0, u45.g(this.s0, a9h.b(u45.e(u45.e(a9h.b((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.o), 31, this.X), 31, this.Y), 31, this.Z), 31), 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        w37 w37Var = (w37) t98Var;
        CharSequence charSequence = w37Var.s0;
        String str = w37Var.Y;
        o98 o98VarD = ve3.d();
        String str2 = w37Var.X;
        if (!fni.a(this.X, str2)) {
            o98VarD.add(new t37(str2));
        }
        if (!fni.a(this.d, w37Var.d) || this.b != w37Var.b || !fni.a(this.c, w37Var.c) || this.o != w37Var.o) {
            o98VarD.add(new p37(w37Var.b, w37Var.c, w37Var.d, w37Var.o));
        }
        if (!this.Y.equals(str)) {
            o98VarD.add(new u37(str));
        }
        boolean z = w37Var.Z;
        if (this.Z != z) {
            o98VarD.add(new s37(z));
        }
        if (!fni.a(this.s0, charSequence)) {
            o98VarD.add(new r37(charSequence));
        }
        int i = w37Var.t0;
        if (this.t0 != i) {
            o98VarD.add(new q37(i));
        }
        return ve3.a(o98VarD);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 1;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "HistoryItemState(id=", ", avatarColorId=");
        sbL.append(this.b);
        sbL.append(", abbreviation=");
        sbL.append((Object) this.c);
        sbL.append(", avatar=");
        sbL.append(this.d);
        sbL.append(", isCallLink=");
        sbL.append(this.o);
        ho7.r(sbL, ", callName=", this.X, ", time=", this.Y);
        sbL.append(", isMissing=");
        sbL.append(this.Z);
        sbL.append(", description=");
        sbL.append((Object) this.s0);
        sbL.append(", callMediaType=");
        sbL.append(u45.v(this.t0));
        sbL.append(", callType=");
        sbL.append(this.u0);
        sbL.append(")");
        return sbL.toString();
    }
}
