package defpackage;

/* loaded from: classes2.dex */
public final class d8e implements i8e {
    public final s5g X;
    public final foe Y;
    public final u18 Z;
    public final int a;
    public final s5g b;
    public final int c;
    public final long d;
    public final hoe o;
    public final xne s0;
    public final em6 t0;
    public final boolean u0;
    public final int v0;

    public d8e(int i, s5g s5gVar, int i2, long j, s5g s5gVar2, foe foeVar, s18 s18Var, vne vneVar, llc llcVar, boolean z, int i3) {
        hoe hoeVar = (i3 & 16) != 0 ? hoe.b : hoe.d;
        s5gVar2 = (i3 & 32) != 0 ? null : s5gVar2;
        foeVar = (i3 & 64) != 0 ? null : foeVar;
        s18Var = (i3 & 128) != 0 ? null : s18Var;
        vneVar = (i3 & 256) != 0 ? null : vneVar;
        llcVar = (i3 & 512) != 0 ? null : llcVar;
        z = (i3 & 1024) != 0 ? true : z;
        this.a = i;
        this.b = s5gVar;
        this.c = i2;
        this.d = j;
        this.o = hoeVar;
        this.X = s5gVar2;
        this.Y = foeVar;
        this.Z = s18Var;
        this.s0 = vneVar;
        this.t0 = llcVar;
        this.u0 = z;
        this.v0 = kbb.x;
    }

    @Override // defpackage.i8e, defpackage.ioe
    public final s5g a() {
        return this.X;
    }

    @Override // defpackage.i8e, defpackage.ioe
    public final xne b() {
        return this.s0;
    }

    @Override // defpackage.i8e, defpackage.ioe
    public final foe d() {
        return this.Y;
    }

    @Override // defpackage.i8e, defpackage.ioe
    public final u18 e() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8e)) {
            return false;
        }
        d8e d8eVar = (d8e) obj;
        return this.a == d8eVar.a && this.b.equals(d8eVar.b) && this.c == d8eVar.c && this.d == d8eVar.d && this.o == d8eVar.o && fni.a(this.X, d8eVar.X) && fni.a(this.Y, d8eVar.Y) && fni.a(this.Z, d8eVar.Z) && fni.a(this.s0, d8eVar.s0) && fni.a(this.t0, d8eVar.t0) && this.u0 == d8eVar.u0;
    }

    @Override // defpackage.i8e
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

    @Override // defpackage.i8e, defpackage.ioe
    public final hoe getType() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + a9h.a(xrf.k(this.c, xc0.d(az1.v(this.a) * 31, 31, this.b), 31), 31, this.d)) * 31;
        s5g s5gVar = this.X;
        int iHashCode2 = (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        foe foeVar = this.Y;
        int iHashCode3 = (iHashCode2 + (foeVar == null ? 0 : foeVar.hashCode())) * 31;
        u18 u18Var = this.Z;
        int iHashCode4 = (iHashCode3 + (u18Var == null ? 0 : u18Var.hashCode())) * 31;
        xne xneVar = this.s0;
        int iHashCode5 = (iHashCode4 + (xneVar == null ? 0 : xneVar.hashCode())) * 31;
        em6 em6Var = this.t0;
        return Boolean.hashCode(this.u0) + ((iHashCode5 + (em6Var != null ? em6Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.v0;
    }

    @Override // defpackage.i8e
    public final em6 r() {
        return this.t0;
    }

    @Override // defpackage.ioe
    public final int t() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingPrivacyItem(sectionItemType=");
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
        sb.append(", counterType=");
        sb.append(this.s0);
        sb.append(", sectionBorderColor=");
        sb.append(this.t0);
        return vb9.f(sb, ", clickable=", this.u0, ")");
    }
}
