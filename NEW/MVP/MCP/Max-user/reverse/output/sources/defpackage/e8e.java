package defpackage;

/* loaded from: classes2.dex */
public final class e8e implements i8e {
    public final s5g a;
    public final em6 b;
    public final int c;

    public e8e(s5g s5gVar, llc llcVar) {
        int i = lbb.p;
        this.a = s5gVar;
        this.b = llcVar;
        this.c = kbb.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8e)) {
            return false;
        }
        e8e e8eVar = (e8e) obj;
        if (!this.a.equals(e8eVar.a)) {
            return false;
        }
        long j = lbb.n;
        return j == j && fni.a(this.b, e8eVar.b);
    }

    @Override // defpackage.i8e
    public final int f() {
        return 3;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return lbb.n;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int iK = utb.k(3, a9h.a(xrf.k(0, this.a.hashCode() * 31, 31), 31, lbb.n), 31);
        em6 em6Var = this.b;
        return iK + (em6Var != null ? em6Var.hashCode() : 0);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.c;
    }

    @Override // defpackage.i8e
    public final em6 r() {
        return this.b;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 0;
    }

    public final String toString() {
        return "Warning(title=" + this.a + ", sectionId=0, itemId=" + lbb.n + ", sectionItemType=LAST, sectionBorderColor=" + this.b + ")";
    }
}
