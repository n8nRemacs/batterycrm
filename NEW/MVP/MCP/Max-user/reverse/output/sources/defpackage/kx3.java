package defpackage;

/* loaded from: classes2.dex */
public final class kx3 implements qfc {
    public final CharSequence X;
    public final hec Y;
    public final long a;
    public final String b;
    public final s5g c;
    public final String d;
    public final boolean o;

    public kx3(long j, String str, s5g s5gVar, String str2, boolean z, CharSequence charSequence, hec hecVar) {
        this.a = j;
        this.b = str;
        this.c = s5gVar;
        this.d = str2;
        this.o = z;
        this.X = charSequence;
        this.Y = hecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx3)) {
            return false;
        }
        kx3 kx3Var = (kx3) obj;
        return this.a == kx3Var.a && this.b.equals(kx3Var.b) && fni.a(this.c, kx3Var.c) && fni.a(this.d, kx3Var.d) && this.o == kx3Var.o && this.X.equals(kx3Var.X) && this.Y == kx3Var.Y;
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
        return Boolean.hashCode(true) + xrf.k(32768, (this.Y.hashCode() + u45.g(this.X, a9h.b(u45.e(xc0.d(u45.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.o), 31)) * 31, 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 32768;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        String strB = i6j.b(32768);
        StringBuilder sbN = ho7.n("ContactInfoItem(id=", this.a, ", fullName=", this.b);
        sbN.append(", subtitle=");
        sbN.append(this.c);
        sbN.append(", url=");
        sbN.append(this.d);
        sbN.append(", isOnline=");
        sbN.append(this.o);
        sbN.append(", abbreviation=");
        sbN.append((Object) this.X);
        sbN.append(", type=");
        sbN.append(this.Y);
        sbN.append(", itemViewType=");
        sbN.append(strB);
        sbN.append(", newPermissions=true)");
        return sbN.toString();
    }
}
