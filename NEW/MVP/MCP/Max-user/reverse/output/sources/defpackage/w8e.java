package defpackage;

/* loaded from: classes2.dex */
public final class w8e implements y8e {
    public final n5g a;
    public final long b;
    public final int c = tbb.G;

    public w8e(n5g n5gVar, long j) {
        this.a = n5gVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8e)) {
            return false;
        }
        w8e w8eVar = (w8e) obj;
        return this.a.equals(w8eVar.a) && this.b == w8eVar.b;
    }

    @Override // defpackage.y8e
    public final int f() {
        return 4;
    }

    @Override // defpackage.y8e
    public final boolean g() {
        return false;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.b;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return az1.v(4) + a9h.a(xrf.k(1, Integer.hashCode(this.a.c) * 31, 31), 31, this.b);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.c;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 1;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=1, itemId=" + this.b + ", sectionItemType=" + ctd.v(4) + ")";
    }
}
