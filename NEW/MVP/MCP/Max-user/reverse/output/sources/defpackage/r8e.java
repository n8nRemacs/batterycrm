package defpackage;

/* loaded from: classes2.dex */
public final class r8e implements u8e {
    public final n5g a;
    public final int b;

    public r8e(n5g n5gVar) {
        int i = rbb.f;
        this.a = n5gVar;
        this.b = qbb.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8e) || !this.a.equals(((r8e) obj).a)) {
            return false;
        }
        long j = rbb.a;
        return j == j;
    }

    @Override // defpackage.u8e
    public final int f() {
        return 4;
    }

    @Override // defpackage.u8e
    public final boolean g() {
        return false;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return rbb.a;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return az1.v(4) + a9h.a(xrf.k(1, Integer.hashCode(this.a.c) * 31, 31), 31, rbb.a);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.b;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 1;
    }

    public final String toString() {
        return "Bottom(title=" + this.a + ", sectionId=1, itemId=" + rbb.a + ", sectionItemType=" + ctd.v(4) + ")";
    }
}
