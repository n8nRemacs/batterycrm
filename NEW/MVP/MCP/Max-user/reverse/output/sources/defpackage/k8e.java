package defpackage;

/* loaded from: classes2.dex */
public final class k8e implements m8e {
    public final n5g a;
    public final int b;
    public final long c;
    public final int d = gbb.z;

    public k8e(int i, long j, n5g n5gVar) {
        this.a = n5gVar;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8e)) {
            return false;
        }
        k8e k8eVar = (k8e) obj;
        return this.a.equals(k8eVar.a) && this.b == k8eVar.b && this.c == k8eVar.c;
    }

    @Override // defpackage.m8e
    public final int f() {
        return 4;
    }

    @Override // defpackage.m8e
    public final boolean g() {
        return false;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return az1.v(4) + a9h.a(xrf.k(this.b, Integer.hashCode(this.a.c) * 31, 31), 31, this.c);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.d;
    }

    @Override // defpackage.ioe
    public final int t() {
        return this.b;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=" + this.b + ", itemId=" + this.c + ", sectionItemType=" + ctd.v(4) + ")";
    }
}
