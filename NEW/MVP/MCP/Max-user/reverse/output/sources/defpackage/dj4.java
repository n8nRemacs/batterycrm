package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class dj4 implements pa8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;
    public final /* synthetic */ hf6 c;

    public /* synthetic */ dj4(id idVar, hf6 hf6Var, sh4 sh4Var, int i) {
        this.a = i;
        this.b = idVar;
        this.c = hf6Var;
    }

    @Override // defpackage.pa8, defpackage.oa8
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((jd) obj).b0(this.b, this.c);
                break;
            default:
                ((jd) obj).L(this.b, this.c);
                break;
        }
    }
}
