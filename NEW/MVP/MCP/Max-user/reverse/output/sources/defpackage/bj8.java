package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class bj8 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj8 b;

    public /* synthetic */ bj8(sj8 sj8Var, int i) {
        this.a = i;
        this.b = sj8Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new jj8(gw0.s(this.b.t(), new hj8(2, null)), 0);
            case 1:
                sj8 sj8Var = this.b;
                sj8Var.Z.m(null, ue3.d0((List) sj8Var.Y.take()));
                break;
            default:
                sj8 sj8Var2 = this.b;
                sj8Var2.X.m(null, ue3.d0((List) sj8Var2.o.take()));
                break;
        }
        return qqg.a;
    }
}
