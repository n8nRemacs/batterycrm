package defpackage;

/* loaded from: classes.dex */
public final class c21 implements e21 {
    public final n5g a;
    public final int b;
    public final int c;

    public c21(int i, n5g n5gVar) {
        int i2 = k0b.u;
        this.a = n5gVar;
        this.b = i;
        this.c = j0b.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c21)) {
            return false;
        }
        c21 c21Var = (c21) obj;
        if (!this.a.equals(c21Var.a) || this.b != c21Var.b) {
            return false;
        }
        long j = k0b.b;
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
        return k0b.b;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return az1.v(4) + a9h.a(xrf.k(this.b, Integer.hashCode(this.a.c) * 31, 31), 31, k0b.b);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.c;
    }

    @Override // defpackage.ioe
    public final int t() {
        return this.b;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=" + this.b + ", itemId=" + k0b.b + ", sectionItemType=" + ctd.v(4) + ")";
    }
}
