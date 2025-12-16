package defpackage;

/* loaded from: classes2.dex */
public final class s8e implements u8e {
    public final n5g a;
    public final int b;

    public s8e(n5g n5gVar) {
        int i = rbb.f;
        this.a = n5gVar;
        this.b = qbb.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8e) || !this.a.equals(((s8e) obj).a)) {
            return false;
        }
        long j = rbb.d;
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
        return rbb.d;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return az1.v(4) + a9h.a(xrf.k(1, Integer.hashCode(this.a.c) * 31, 31), 31, rbb.d);
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
        return "Header(title=" + this.a + ", sectionId=1, itemId=" + rbb.d + ", sectionItemType=" + ctd.v(4) + ")";
    }
}
