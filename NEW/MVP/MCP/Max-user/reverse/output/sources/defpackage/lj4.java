package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class lj4 implements pa8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;
    public final /* synthetic */ g19 c;

    public /* synthetic */ lj4(id idVar, g19 g19Var, int i) {
        this.a = i;
        this.b = idVar;
        this.c = g19Var;
    }

    @Override // defpackage.pa8, defpackage.oa8
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((jd) obj).T0(this.b, this.c);
                break;
            default:
                ((jd) obj).c0(this.b, this.c);
                break;
        }
    }
}
