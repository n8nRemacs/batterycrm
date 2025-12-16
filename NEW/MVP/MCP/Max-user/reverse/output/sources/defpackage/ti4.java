package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ti4 implements pa8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;
    public final /* synthetic */ String c;

    public /* synthetic */ ti4(id idVar, String str, int i) {
        this.a = i;
        this.b = idVar;
        this.c = str;
    }

    @Override // defpackage.pa8, defpackage.oa8
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                jd jdVar = (jd) obj;
                jdVar.getClass();
                jdVar.E(this.b, this.c);
                break;
            case 1:
                ((jd) obj).o0(this.b, this.c);
                break;
            case 2:
                jd jdVar2 = (jd) obj;
                jdVar2.getClass();
                jdVar2.K0(this.b, this.c);
                break;
            default:
                ((jd) obj).z(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ ti4(id idVar, String str, long j, long j2, int i) {
        this.a = i;
        this.b = idVar;
        this.c = str;
    }
}
