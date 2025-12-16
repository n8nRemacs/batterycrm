package defpackage;

/* loaded from: classes.dex */
public final class b21 implements e21 {
    public final s5g X;
    public final doe Y;
    public final s18 Z;
    public final int a;
    public final n5g b;
    public final int c;
    public final long d;
    public final hoe o;
    public final boolean s0;
    public final int t0;

    public b21(int i, n5g n5gVar, int i2, long j, n5g n5gVar2, doe doeVar, Integer num, int i3) {
        n5gVar2 = (i3 & 32) != 0 ? null : n5gVar2;
        s18 s18Var = new s18(num.intValue(), 0, 6);
        this.a = i;
        this.b = n5gVar;
        this.c = i2;
        this.d = j;
        this.o = hoe.b;
        this.X = n5gVar2;
        this.Y = doeVar;
        this.Z = s18Var;
        this.s0 = true;
        this.t0 = j0b.g;
    }

    @Override // defpackage.e21, defpackage.ioe
    public final s5g a() {
        return this.X;
    }

    @Override // defpackage.e21, defpackage.ioe
    public final foe d() {
        return this.Y;
    }

    @Override // defpackage.e21, defpackage.ioe
    public final u18 e() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b21)) {
            return false;
        }
        b21 b21Var = (b21) obj;
        return this.a == b21Var.a && fni.a(this.b, b21Var.b) && this.c == b21Var.c && this.d == b21Var.d && this.o == b21Var.o && fni.a(this.X, b21Var.X) && fni.a(this.Y, b21Var.Y) && fni.a(this.Z, b21Var.Z) && this.s0 == b21Var.s0;
    }

    @Override // defpackage.e21
    public final int f() {
        return this.a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.d;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.b;
    }

    @Override // defpackage.e21, defpackage.ioe
    public final hoe getType() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + a9h.a(xrf.k(this.c, xrf.k(this.b.c, az1.v(this.a) * 31, 31), 31), 31, this.d)) * 31;
        s5g s5gVar = this.X;
        int iHashCode2 = (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        doe doeVar = this.Y;
        int iHashCode3 = (iHashCode2 + (doeVar == null ? 0 : doeVar.hashCode())) * 31;
        s18 s18Var = this.Z;
        return Boolean.hashCode(this.s0) + ((iHashCode3 + (s18Var != null ? s18Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.t0;
    }

    @Override // defpackage.ioe
    public final int t() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallAdminSettingsItem(sectionItemType=");
        sb.append(ctd.v(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        sb.append(this.c);
        sb.append(", itemId=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.o);
        sb.append(", descriptionRes=");
        sb.append(this.X);
        sb.append(", endView=");
        sb.append(this.Y);
        sb.append(", leadingElementProperties=");
        sb.append(this.Z);
        return vb9.f(sb, ", clickable=", this.s0, ")");
    }
}
