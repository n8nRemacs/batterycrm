package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class jj4 implements pa8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ub8 b;
    public final /* synthetic */ g19 c;

    public /* synthetic */ jj4(id idVar, ub8 ub8Var, g19 g19Var) {
        this.b = ub8Var;
        this.c = g19Var;
    }

    @Override // defpackage.pa8, defpackage.oa8
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                jd jdVar = (jd) obj;
                jdVar.getClass();
                jdVar.R(this.b, this.c);
                break;
            default:
                ((jd) obj).H(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ jj4(id idVar, ub8 ub8Var, g19 g19Var, int i) {
        this.b = ub8Var;
        this.c = g19Var;
    }
}
