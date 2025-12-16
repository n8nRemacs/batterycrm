package defpackage;

/* loaded from: classes.dex */
public final class g61 implements i61 {
    public final int a;
    public final n5g b;
    public final long c;
    public final int d = j0b.G;

    public g61(int i, long j, n5g n5gVar) {
        this.a = i;
        this.b = n5gVar;
        this.c = j;
    }

    @Override // defpackage.i61, defpackage.ioe
    public final s5g a() {
        return null;
    }

    @Override // defpackage.i61, defpackage.ioe
    public final foe d() {
        return null;
    }

    @Override // defpackage.i61, defpackage.ioe
    public final u18 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g61)) {
            return false;
        }
        g61 g61Var = (g61) obj;
        return this.a == g61Var.a && this.b.equals(g61Var.b) && this.c == g61Var.c;
    }

    @Override // defpackage.i61
    public final int f() {
        return this.a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.b;
    }

    @Override // defpackage.i61, defpackage.ioe
    public final hoe getType() {
        return hoe.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((hoe.b.hashCode() + a9h.a(xrf.k(0, xrf.k(this.b.c, az1.v(this.a) * 31, 31), 31), 31, this.c)) * 923521);
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.d;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 0;
    }

    public final String toString() {
        return "CallDebugMenuItem(sectionItemType=" + ctd.v(this.a) + ", title=" + this.b + ", sectionId=0, itemId=" + this.c + ", type=" + hoe.b + ", descriptionRes=null, endView=null, leadingElementProperties=null, clickable=true)";
    }
}
