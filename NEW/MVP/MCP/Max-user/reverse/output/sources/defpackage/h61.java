package defpackage;

/* loaded from: classes.dex */
public final class h61 implements i61 {
    public final n5g a;
    public final int b;

    public h61(n5g n5gVar) {
        int i = k0b.u;
        this.a = n5gVar;
        this.b = j0b.F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h61) || !this.a.equals(((h61) obj).a)) {
            return false;
        }
        long j = k0b.p;
        return j == j;
    }

    @Override // defpackage.i61
    public final int f() {
        return 4;
    }

    @Override // defpackage.i61
    public final boolean g() {
        return false;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return k0b.p;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return az1.v(4) + a9h.a(xrf.k(0, Integer.hashCode(this.a.c) * 31, 31), 31, k0b.p);
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
        return "Header(title=" + this.a + ", sectionId=0, itemId=" + k0b.p + ", sectionItemType=" + ctd.v(4) + ")";
    }
}
