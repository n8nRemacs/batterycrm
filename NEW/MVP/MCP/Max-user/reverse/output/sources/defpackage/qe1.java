package defpackage;

/* loaded from: classes.dex */
public final class qe1 implements te1 {
    public final s5g a;
    public final xne b;
    public final s18 c = new s18(xza.h, 0, 6);
    public final long d = zza.b;
    public final n5g o = new n5g(b0b.i);

    public qe1(s5g s5gVar, wne wneVar) {
        this.a = s5gVar;
        this.b = wneVar;
    }

    @Override // defpackage.te1, defpackage.ioe
    public final s5g a() {
        return this.a;
    }

    @Override // defpackage.te1, defpackage.ioe
    public final xne b() {
        return this.b;
    }

    @Override // defpackage.te1, defpackage.ioe
    public final foe d() {
        return yne.a;
    }

    @Override // defpackage.ioe
    public final u18 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe1)) {
            return false;
        }
        qe1 qe1Var = (qe1) obj;
        return fni.a(this.a, qe1Var.a) && fni.a(this.b, qe1Var.b);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.d;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xne xneVar = this.b;
        return iHashCode + (xneVar == null ? 0 : xneVar.hashCode());
    }

    @Override // defpackage.ioe, defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return yza.m;
    }

    @Override // defpackage.ioe
    public final int t() {
        return 0;
    }

    public final String toString() {
        return "OpenCallChat(descriptionRes=" + this.a + ", counterType=" + this.b + ")";
    }
}
