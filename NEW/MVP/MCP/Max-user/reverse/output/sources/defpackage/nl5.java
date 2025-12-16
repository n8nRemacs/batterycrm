package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nl5 implements pa8, fu3 {
    public final /* synthetic */ w19 a;

    public /* synthetic */ nl5(w19 w19Var) {
        this.a = w19Var;
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        a5c a5cVar = (a5c) obj;
        a5cVar.m0();
        em5 em5Var = a5cVar.a;
        em5Var.A1();
        w19 w19Var = em5Var.a1;
        w19 w19Var2 = this.a;
        if (w19Var2.equals(w19Var)) {
            return;
        }
        em5Var.a1 = w19Var2;
        em5Var.x0.f(15, new ql5(em5Var, 4));
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        ((r3c) obj).i0(this.a);
    }
}
