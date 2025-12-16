package defpackage;

/* loaded from: classes2.dex */
public final class t8e implements u8e {
    public final foe X;
    public final u18 Y;
    public final boolean Z;
    public final int a;
    public final s5g b;
    public final int c;
    public final long d;
    public final hoe o;
    public final String s0;
    public final int t0;

    public t8e(int i, s5g s5gVar, int i2, long j, foe foeVar, s18 s18Var, String str, int i3) {
        hoe hoeVar = (i3 & 16) != 0 ? hoe.b : hoe.a;
        foeVar = (i3 & 64) != 0 ? null : foeVar;
        s18Var = (i3 & 128) != 0 ? null : s18Var;
        boolean z = (i3 & 256) == 0;
        str = (i3 & 512) != 0 ? null : str;
        this.a = i;
        this.b = s5gVar;
        this.c = i2;
        this.d = j;
        this.o = hoeVar;
        this.X = foeVar;
        this.Y = s18Var;
        this.Z = z;
        this.s0 = str;
        this.t0 = qbb.e;
    }

    @Override // defpackage.u8e, defpackage.ioe
    public final s5g a() {
        return null;
    }

    @Override // defpackage.u8e, defpackage.ioe
    public final foe d() {
        return this.X;
    }

    @Override // defpackage.u8e, defpackage.ioe
    public final u18 e() {
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8e)) {
            return false;
        }
        t8e t8eVar = (t8e) obj;
        return this.a == t8eVar.a && this.b.equals(t8eVar.b) && this.c == t8eVar.c && this.d == t8eVar.d && this.o == t8eVar.o && fni.a(this.X, t8eVar.X) && fni.a(this.Y, t8eVar.Y) && this.Z == t8eVar.Z && fni.a(this.s0, t8eVar.s0);
    }

    @Override // defpackage.u8e
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

    @Override // defpackage.u8e, defpackage.ioe
    public final hoe getType() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + a9h.a(xrf.k(this.c, xc0.d(az1.v(this.a) * 31, 31, this.b), 31), 31, this.d)) * 961;
        foe foeVar = this.X;
        int iHashCode2 = (iHashCode + (foeVar == null ? 0 : foeVar.hashCode())) * 31;
        u18 u18Var = this.Y;
        int iB = a9h.b((iHashCode2 + (u18Var == null ? 0 : u18Var.hashCode())) * 31, 31, this.Z);
        String str = this.s0;
        return iB + (str != null ? str.hashCode() : 0);
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
        StringBuilder sb = new StringBuilder("SettingSelectRingtoneItem(sectionItemType=");
        sb.append(ctd.v(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        sb.append(this.c);
        sb.append(", itemId=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.o);
        sb.append(", descriptionRes=null, endView=");
        sb.append(this.X);
        sb.append(", leadingElementProperties=");
        sb.append(this.Y);
        sb.append(", canRemove=");
        sb.append(this.Z);
        return ctd.j(sb, ", filePath=", this.s0, ")");
    }
}
