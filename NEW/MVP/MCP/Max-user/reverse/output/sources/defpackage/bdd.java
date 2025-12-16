package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class bdd implements tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ddd b;

    public /* synthetic */ bdd(ddd dddVar, int i) {
        this.a = i;
        this.b = dddVar;
    }

    @Override // defpackage.tm6
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                scd scdVar = (scd) obj;
                ddd dddVar = this.b;
                return new ik3(new hs8(new wr8(dddVar.b(), new xu9(dddVar, scdVar, 23), 1), 1, xcd.a(scdVar, 0L)), 2, new bdd(dddVar, 1));
            default:
                pcd pcdVar = (pcd) obj;
                ddd dddVar2 = this.b;
                pcdVar.c = ((w4e) dddVar2.b).j();
                return new ik3(dddVar2.b(), 2, new xu9(25, pcdVar));
        }
    }
}
