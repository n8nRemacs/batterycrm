package defpackage;

/* loaded from: classes2.dex */
public final class x8e implements y8e {
    public final boe X;
    public final int Y;
    public final int a;
    public final n5g b;
    public final int c;
    public final long d;
    public final s5g o;

    public x8e(int i, n5g n5gVar, int i2, long j, n5g n5gVar2, boe boeVar, int i3) {
        n5gVar2 = (i3 & 32) != 0 ? null : n5gVar2;
        this.a = i;
        this.b = n5gVar;
        this.c = i2;
        this.d = j;
        this.o = n5gVar2;
        this.X = boeVar;
        this.Y = tbb.H;
    }

    @Override // defpackage.y8e, defpackage.ioe
    public final s5g a() {
        return this.o;
    }

    @Override // defpackage.y8e, defpackage.ioe
    public final foe d() {
        return this.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8e)) {
            return false;
        }
        x8e x8eVar = (x8e) obj;
        return this.a == x8eVar.a && this.b.equals(x8eVar.b) && this.c == x8eVar.c && this.d == x8eVar.d && fni.a(this.o, x8eVar.o) && this.X.equals(x8eVar.X);
    }

    @Override // defpackage.y8e
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

    @Override // defpackage.y8e, defpackage.ioe
    public final hoe getType() {
        return hoe.b;
    }

    public final int hashCode() {
        int iHashCode = (hoe.b.hashCode() + a9h.a(xrf.k(this.c, xrf.k(this.b.c, az1.v(this.a) * 31, 31), 31), 31, this.d)) * 31;
        s5g s5gVar = this.o;
        return this.X.hashCode() + ((iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.Y;
    }

    @Override // defpackage.ioe
    public final int t() {
        return this.c;
    }

    public final String toString() {
        return "SettingStorageItem(sectionItemType=" + ctd.v(this.a) + ", title=" + this.b + ", sectionId=" + this.c + ", itemId=" + this.d + ", type=" + hoe.b + ", descriptionRes=" + this.o + ", endView=" + this.X + ")";
    }
}
