package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ucd implements m7c, tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vcd b;

    public /* synthetic */ ucd(vcd vcdVar, int i) {
        this.a = i;
        this.b = vcdVar;
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                vcd vcdVar = this.b;
                vcdVar.getClass();
                return new kk3(1, new v64(vcdVar, 5, (ku3) obj));
            default:
                vcd vcdVar2 = this.b;
                vcdVar2.getClass();
                return q8j.b(new wcd(vcdVar2, (pb2) obj, null));
        }
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        ku3 ku3VarN;
        switch (this.a) {
            case 0:
                pb2 pb2Var = (pb2) obj;
                return !this.b.a.Y(pb2Var) && pb2Var.b.Z != 0 && pb2Var.Q() && ((ku3VarN = pb2Var.n()) == null || !ku3VarN.u());
            default:
                pb2 pb2VarP = this.b.a.P(((ku3) obj).p());
                return pb2VarP == null || pb2VarP.b.Y == 0;
        }
    }
}
