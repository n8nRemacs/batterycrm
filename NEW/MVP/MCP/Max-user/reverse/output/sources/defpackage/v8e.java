package defpackage;

/* loaded from: classes2.dex */
public final class v8e implements y8e {
    public final n5g a;
    public final long b;
    public final r5g c;
    public final int d = tbb.F;

    public v8e(n5g n5gVar, long j, r5g r5gVar) {
        this.a = n5gVar;
        this.b = j;
        this.c = r5gVar;
    }

    @Override // defpackage.y8e, defpackage.ioe
    public final s5g a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8e)) {
            return false;
        }
        v8e v8eVar = (v8e) obj;
        return this.a.equals(v8eVar.a) && this.b == v8eVar.b && this.c.equals(v8eVar.c);
    }

    @Override // defpackage.y8e
    public final int f() {
        return 3;
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
        return this.c.hashCode() + utb.k(3, a9h.a(xrf.k(1, Integer.hashCode(this.a.c) * 31, 31), 31, this.b), 31);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.d;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 1;
    }

    public final String toString() {
        return "ClearCacheButton(title=" + this.a + ", sectionId=1, itemId=" + this.b + ", sectionItemType=LAST, descriptionRes=" + this.c + ")";
    }
}
