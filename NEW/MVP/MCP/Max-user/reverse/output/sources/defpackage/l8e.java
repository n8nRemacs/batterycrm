package defpackage;

/* loaded from: classes2.dex */
public final class l8e implements m8e {
    public final int X = gbb.A;
    public final int a;
    public final n5g b;
    public final int c;
    public final long d;
    public final foe o;

    public l8e(int i, n5g n5gVar, int i2, long j, foe foeVar) {
        this.a = i;
        this.b = n5gVar;
        this.c = i2;
        this.d = j;
        this.o = foeVar;
    }

    @Override // defpackage.m8e, defpackage.ioe
    public final s5g a() {
        return null;
    }

    @Override // defpackage.m8e, defpackage.ioe
    public final foe d() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8e)) {
            return false;
        }
        l8e l8eVar = (l8e) obj;
        return this.a == l8eVar.a && this.b.equals(l8eVar.b) && this.c == l8eVar.c && this.d == l8eVar.d && this.o.equals(l8eVar.o);
    }

    @Override // defpackage.m8e
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

    @Override // defpackage.m8e, defpackage.ioe
    public final hoe getType() {
        return hoe.b;
    }

    public final int hashCode() {
        return this.o.hashCode() + ((hoe.b.hashCode() + a9h.a(xrf.k(this.c, xrf.k(this.b.c, az1.v(this.a) * 31, 31), 31), 31, this.d)) * 961);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.X;
    }

    @Override // defpackage.ioe
    public final int t() {
        return this.c;
    }

    public final String toString() {
        return "SettingPrivacyItem(sectionItemType=" + ctd.v(this.a) + ", title=" + this.b + ", sectionId=" + this.c + ", itemId=" + this.d + ", type=" + hoe.b + ", descriptionRes=null, endView=" + this.o + ")";
    }
}
