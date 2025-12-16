package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class si4 implements pa8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ si4(id idVar, boolean z, int i) {
        this.a = i;
        this.b = idVar;
        this.c = z;
    }

    @Override // defpackage.pa8, defpackage.oa8
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((jd) obj).w(this.b, this.c);
                break;
            case 1:
                jd jdVar = (jd) obj;
                jdVar.getClass();
                jdVar.M0(this.b, this.c);
                break;
            case 2:
                ((jd) obj).u(this.b, this.c);
                break;
            default:
                ((jd) obj).B(this.b, this.c);
                break;
        }
    }
}
