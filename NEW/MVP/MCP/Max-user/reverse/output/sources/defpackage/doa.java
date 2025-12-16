package defpackage;

/* loaded from: classes2.dex */
public final class doa implements foa {
    public final n5g a;
    public final int b;

    public doa(n5g n5gVar) {
        int i = a8b.d;
        this.a = n5gVar;
        this.b = z7b.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doa) || !this.a.equals(((doa) obj).a)) {
            return false;
        }
        long j = a8b.a;
        return j == j;
    }

    @Override // defpackage.foa
    public final boolean g() {
        return false;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return a8b.a;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(a8b.a) + xrf.k(3, Integer.hashCode(this.a.c) * 31, 31);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.b;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 3;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=3, itemId=" + a8b.a + ")";
    }
}
