package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bj4 implements pa8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;

    public /* synthetic */ bj4(id idVar, int i) {
        this.a = i;
        this.b = idVar;
    }

    @Override // defpackage.pa8, defpackage.oa8
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((jd) obj).r0(this.b);
                break;
            case 1:
                ((jd) obj).u0(this.b);
                break;
            case 2:
                ((jd) obj).V(this.b);
                break;
            case 3:
                ((jd) obj).J0(this.b);
                break;
            case 4:
                ((jd) obj).S0(this.b);
                break;
            default:
                ((jd) obj).v(this.b);
                break;
        }
    }

    public /* synthetic */ bj4(id idVar, nh4 nh4Var, int i) {
        this.a = i;
        this.b = idVar;
    }
}
