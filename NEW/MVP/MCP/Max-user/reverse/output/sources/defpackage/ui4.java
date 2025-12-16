package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ui4 implements pa8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;
    public final /* synthetic */ int c;

    public /* synthetic */ ui4(id idVar, int i, int i2) {
        this.a = i2;
        this.b = idVar;
        this.c = i;
    }

    @Override // defpackage.pa8, defpackage.oa8
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((jd) obj).R0(this.b, this.c);
                break;
            case 1:
                ((jd) obj).G(this.b, this.c);
                break;
            case 2:
                ((jd) obj).J(this.b, this.c);
                break;
            case 3:
                ((jd) obj).t0(this.b, this.c);
                break;
            case 4:
                ((jd) obj).P(this.b, this.c);
                break;
            case 5:
                jd jdVar = (jd) obj;
                jdVar.getClass();
                jdVar.s0(this.b, this.c);
                break;
            case 6:
                ((jd) obj).Z(this.b, this.c);
                break;
            default:
                ((jd) obj).g0(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ ui4(id idVar, int i, long j) {
        this.a = 2;
        this.b = idVar;
        this.c = i;
    }

    public /* synthetic */ ui4(id idVar, k09 k09Var, int i) {
        this.a = 7;
        this.b = idVar;
        this.c = i;
    }
}
