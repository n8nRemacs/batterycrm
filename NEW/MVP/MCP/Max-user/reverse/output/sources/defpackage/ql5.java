package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ql5 implements ra8, pa8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ em5 b;

    public /* synthetic */ ql5(em5 em5Var, int i) {
        this.a = i;
        this.b = em5Var;
    }

    @Override // defpackage.ra8
    public void f(Object obj, a26 a26Var) {
        ((r3c) obj).f0(this.b.Y, new p3c(a26Var));
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        r3c r3cVar = (r3c) obj;
        switch (this.a) {
            case 3:
                r3cVar.B0(this.b.Y0);
                break;
            default:
                r3cVar.j0(this.b.a1);
                break;
        }
    }
}
