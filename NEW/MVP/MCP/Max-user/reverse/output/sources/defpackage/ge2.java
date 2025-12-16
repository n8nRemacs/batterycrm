package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ge2 implements iu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ve2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ge2(ve2 ve2Var, Object obj, long j, int i) {
        this.a = i;
        this.b = ve2Var;
        this.d = obj;
        this.c = j;
    }

    @Override // defpackage.iu3
    public final void accept(Object obj) throws Throwable {
        switch (this.a) {
            case 0:
                p3b p3bVar = (p3b) this.d;
                af2 af2Var = (af2) obj;
                ve2 ve2Var = this.b;
                ve2Var.getClass();
                af2Var.c0 = p3bVar;
                af2Var.d0 = this.c;
                af2Var.e0 = ve2Var.o.a.j();
                break;
            default:
                si9 si9Var = (si9) this.d;
                af2 af2Var2 = (af2) obj;
                ve2 ve2Var2 = this.b;
                ve2Var2.getClass();
                if (si9Var != null) {
                    si9 si9VarI = ((qi9) ve2Var2.t.get()).i(this.c, af2Var2.h0);
                    if (si9VarI == null || si9Var.c > si9VarI.c) {
                        af2Var2.h0 = si9Var.b;
                        break;
                    }
                } else {
                    af2Var2.h0 = 0L;
                    break;
                }
                break;
        }
    }
}
