package defpackage;

/* loaded from: classes.dex */
public final class kc8 extends j8a {
    public final lii l;
    public j48 m;
    public lc8 n;

    public kc8(lii liiVar) {
        this.l = liiVar;
        if (liiVar.a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        liiVar.a = this;
    }

    @Override // defpackage.cb8
    public final void g() {
        lii liiVar = this.l;
        liiVar.b = true;
        liiVar.d = false;
        liiVar.c = false;
        liiVar.i.drainPermits();
        liiVar.a();
        liiVar.g = new sx(liiVar);
        liiVar.b();
    }

    @Override // defpackage.cb8
    public final void h() {
        this.l.b = false;
    }

    @Override // defpackage.cb8
    public final void j(wta wtaVar) {
        super.j(wtaVar);
        this.m = null;
        this.n = null;
    }

    public final void l() {
        j48 j48Var = this.m;
        lc8 lc8Var = this.n;
        if (j48Var == null || lc8Var == null) {
            return;
        }
        super.j(lc8Var);
        e(j48Var, lc8Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        j8j.b(sb, this.l);
        sb.append("}}");
        return sb.toString();
    }
}
