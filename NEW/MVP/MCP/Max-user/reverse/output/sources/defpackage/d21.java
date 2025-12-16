package defpackage;

/* loaded from: classes.dex */
public final class d21 implements e21 {
    public final n5g a;
    public final int b;

    public d21(n5g n5gVar) {
        int i = k0b.u;
        this.a = n5gVar;
        this.b = j0b.e;
    }

    @Override // defpackage.e21, defpackage.ioe
    public final s5g a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d21) || !this.a.equals(((d21) obj).a)) {
            return false;
        }
        long j = k0b.a;
        return j == j;
    }

    @Override // defpackage.e21
    public final int f() {
        return 4;
    }

    @Override // defpackage.e21
    public final boolean g() {
        return false;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return k0b.a;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return utb.k(4, a9h.a(xrf.k(0, Integer.hashCode(this.a.c) * 31, 31), 31, k0b.a), 31);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.b;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 0;
    }

    public final String toString() {
        return "HeaderBottom(title=" + this.a + ", sectionId=0, itemId=" + k0b.a + ", sectionItemType=" + ctd.v(4) + ", descriptionRes=null)";
    }
}
