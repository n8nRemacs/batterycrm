package defpackage;

/* loaded from: classes2.dex */
public final class eng implements fng {
    public final s5g X;
    public final foe Y;
    public final int Z;
    public final int a;
    public final n5g b;
    public final int c;
    public final long d;
    public final hoe o;

    public eng(int i, n5g n5gVar, int i2, long j, r5g r5gVar, int i3) {
        hoe hoeVar = (i3 & 16) != 0 ? hoe.b : hoe.d;
        r5gVar = (i3 & 32) != 0 ? null : r5gVar;
        yne yneVar = (i3 & 64) != 0 ? yne.a : null;
        this.a = i;
        this.b = n5gVar;
        this.c = i2;
        this.d = j;
        this.o = hoeVar;
        this.X = r5gVar;
        this.Y = yneVar;
        this.Z = e0d.oneme_settings_twofa_configuration_setting_item;
    }

    @Override // defpackage.fng, defpackage.ioe
    public final s5g a() {
        return this.X;
    }

    @Override // defpackage.fng, defpackage.ioe
    public final foe d() {
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eng)) {
            return false;
        }
        eng engVar = (eng) obj;
        return this.a == engVar.a && this.b.equals(engVar.b) && this.c == engVar.c && this.d == engVar.d && this.o == engVar.o && fni.a(this.X, engVar.X) && fni.a(this.Y, engVar.Y);
    }

    @Override // defpackage.fng
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

    @Override // defpackage.fng, defpackage.ioe
    public final hoe getType() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + a9h.a(xrf.k(this.c, xrf.k(this.b.c, az1.v(this.a) * 31, 31), 31), 31, this.d)) * 31;
        s5g s5gVar = this.X;
        int iHashCode2 = (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        foe foeVar = this.Y;
        return iHashCode2 + (foeVar != null ? foeVar.hashCode() : 0);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.Z;
    }

    @Override // defpackage.ioe
    public final int t() {
        return this.c;
    }

    public final String toString() {
        return "Setting(sectionItemType=" + ctd.v(this.a) + ", title=" + this.b + ", sectionId=" + this.c + ", itemId=" + this.d + ", type=" + this.o + ", descriptionRes=" + this.X + ", endView=" + this.Y + ")";
    }
}
