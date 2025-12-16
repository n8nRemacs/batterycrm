package defpackage;

/* loaded from: classes.dex */
public final class hh1 implements t98 {
    public final boolean X;
    public final boolean Y;
    public final long Z;
    public final zi1 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean o;
    public final Integer s0;
    public final long t0;

    public hh1(zi1 zi1Var, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, long j, Integer num) {
        this.a = zi1Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.o = z2;
        this.X = z3;
        this.Y = z4;
        this.Z = j;
        this.s0 = num;
        this.t0 = zi1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh1)) {
            return false;
        }
        hh1 hh1Var = (hh1) obj;
        return fni.a(this.a, hh1Var.a) && fni.a(this.b, hh1Var.b) && fni.a(this.c, hh1Var.c) && this.d == hh1Var.d && this.o == hh1Var.o && this.X == hh1Var.X && this.Y == hh1Var.Y && this.Z == hh1Var.Z && fni.a(this.s0, hh1Var.s0);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.t0;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.t0 == t98Var.getItemId();
    }

    public final int hashCode() {
        int iA = a9h.a(a9h.b(a9h.b(a9h.b(a9h.b(u45.e(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.o), 31, this.X), 31, this.Y), 31, this.Z);
        Integer num = this.s0;
        return iA + (num == null ? 0 : num.hashCode());
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        hh1 hh1Var = (hh1) t98Var;
        boolean z = hh1Var.d;
        boolean z2 = hh1Var.Y;
        boolean z3 = hh1Var.o;
        String str = hh1Var.c;
        Integer num = hh1Var.s0;
        zi1 zi1Var = hh1Var.a;
        o98 o98VarD = ve3.d();
        String str2 = hh1Var.b;
        String str3 = this.b;
        if (!fni.a(str3, str2)) {
            o98VarD.add(new fh1(str2));
        }
        if (!this.s0.equals(num)) {
            o98VarD.add(new ch1(num));
        }
        boolean zEquals = this.c.equals(str);
        zi1 zi1Var2 = this.a;
        if (!zEquals || !fni.a(zi1Var2, zi1Var) || !fni.a(str3, str2)) {
            o98VarD.add(new bh1(zi1Var, str2, str));
        }
        if (!fni.a(zi1Var2, zi1Var) || this.o != z3 || this.Y != z2) {
            o98VarD.add(new dh1(zi1Var, z3, z2));
        }
        if (this.d != z || !fni.a(zi1Var2, zi1Var)) {
            o98VarD.add(new eh1(zi1Var, z));
        }
        return ve3.a(o98VarD);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallOpponentInfoState(opponentId=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", hasMoreAction=");
        sb.append(this.d);
        sb.append(", hasMenuAction=");
        az1.t(", isAdmin=", ", isRaiseHand=", sb, this.o, this.X);
        sb.append(this.Y);
        sb.append(", isRaiseHandTime=");
        sb.append(this.Z);
        sb.append(", description=");
        sb.append(this.s0);
        sb.append(")");
        return sb.toString();
    }
}
