package defpackage;

/* loaded from: classes.dex */
public final class n01 implements ioe {
    public final foe X;
    public final s18 Y;
    public final int Z;
    public final int a;
    public final n5g b;
    public final long c;
    public final hoe d;
    public final s5g o;
    public final boolean s0;

    public n01(n5g n5gVar, long j, n5g n5gVar2, Integer num, int i, boolean z, int i2) {
        hoe hoeVar = (i2 & 16) != 0 ? hoe.b : hoe.o;
        n5gVar2 = (i2 & 32) != 0 ? null : n5gVar2;
        yne yneVar = (i2 & 64) == 0 ? yne.a : null;
        i = (i2 & 256) != 0 ? j0b.q0 : i;
        z = (i2 & 512) != 0 ? true : z;
        s18 s18Var = new s18(num.intValue(), 0, 6);
        this.a = 4;
        this.b = n5gVar;
        this.c = j;
        this.d = hoeVar;
        this.o = n5gVar2;
        this.X = yneVar;
        this.Y = s18Var;
        this.Z = i;
        this.s0 = z;
    }

    @Override // defpackage.ioe
    public final s5g a() {
        return this.o;
    }

    @Override // defpackage.ioe
    public final xne b() {
        return null;
    }

    @Override // defpackage.ioe
    public final s5g c() {
        return null;
    }

    @Override // defpackage.ioe
    public final foe d() {
        return this.X;
    }

    @Override // defpackage.ioe
    public final u18 e() {
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n01)) {
            return false;
        }
        n01 n01Var = (n01) obj;
        return this.a == n01Var.a && fni.a(this.b, n01Var.b) && this.c == n01Var.c && this.d == n01Var.d && fni.a(this.o, n01Var.o) && fni.a(this.X, n01Var.X) && fni.a(this.Y, n01Var.Y) && this.Z == n01Var.Z && this.s0 == n01Var.s0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.b;
    }

    @Override // defpackage.ioe
    public final hoe getType() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + a9h.a(xrf.k(0, xrf.k(this.b.c, az1.v(this.a) * 31, 31), 31), 31, this.c)) * 31;
        s5g s5gVar = this.o;
        int iHashCode2 = (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        foe foeVar = this.X;
        int iHashCode3 = (iHashCode2 + (foeVar == null ? 0 : foeVar.hashCode())) * 31;
        s18 s18Var = this.Y;
        return Boolean.hashCode(this.s0) + xrf.k(this.Z, (iHashCode3 + (s18Var != null ? s18Var.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.Z;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionItem(sectionItemType=");
        sb.append(ctd.v(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=0, itemId=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", descriptionRes=");
        sb.append(this.o);
        sb.append(", endView=");
        sb.append(this.X);
        sb.append(", leadingElementProperties=");
        sb.append(this.Y);
        sb.append(", viewType=");
        sb.append(this.Z);
        return vb9.f(sb, ", isAvailable=", this.s0, ")");
    }
}
