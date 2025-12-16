package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class zx8 implements jy8, pa8, ra8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly8 b;

    public /* synthetic */ zx8(ly8 ly8Var, int i) {
        this.a = i;
        this.b = ly8Var;
    }

    @Override // defpackage.jy8
    public void d(eb7 eb7Var, int i) {
        switch (this.a) {
            case 0:
                eb7Var.Q(this.b.c, i);
                break;
            case 1:
                eb7Var.E(this.b.c, i);
                break;
            case 2:
                eb7Var.B(this.b.c, i);
                break;
            case 3:
            case 4:
            case 5:
            default:
                eb7Var.m(this.b.c, i);
                break;
            case 6:
                eb7Var.e(this.b.c, i);
                break;
        }
    }

    @Override // defpackage.ra8
    public void f(Object obj, a26 a26Var) {
        ((r3c) obj).f0(this.b.a, new p3c(a26Var));
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        r3c r3cVar = (r3c) obj;
        switch (this.a) {
            case 3:
                r3cVar.B0(this.b.x);
                break;
            default:
                r3cVar.B0(this.b.x);
                break;
        }
    }
}
