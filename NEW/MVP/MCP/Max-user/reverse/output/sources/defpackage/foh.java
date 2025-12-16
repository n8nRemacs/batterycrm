package defpackage;

/* loaded from: classes2.dex */
public final class foh extends dvi {
    public final /* synthetic */ goh a;

    public foh(goh gohVar) {
        this.a = gohVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cm6, hn6] */
    @Override // defpackage.dvi
    public final void b() {
        ((hn6) this.a.d).invoke();
    }

    @Override // defpackage.dvi
    public final void c() {
        wqi.c((String) this.a.a, "onAuthenticationFailed", new Object[0]);
    }

    @Override // defpackage.dvi
    public final void d(fo0 fo0Var) {
        goh gohVar = this.a;
        wqi.c((String) gohVar.a, "onAuthenticationSuccess", new Object[0]);
        ((em6) gohVar.c).invoke(fo0Var.a);
    }
}
