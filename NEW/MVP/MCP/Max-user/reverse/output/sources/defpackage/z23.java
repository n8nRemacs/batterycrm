package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final /* synthetic */ class z23 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b43 b;
    public final /* synthetic */ long c;

    public /* synthetic */ z23(b43 b43Var, long j, int i) {
        this.a = i;
        this.b = b43Var;
        this.c = j;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        i84 i84Var = i84.c;
        qqg qqgVar = qqg.a;
        long j = this.c;
        b43 b43Var = this.b;
        ecb ecbVar = (ecb) obj;
        switch (i) {
            case 0:
                int iOrdinal = ecbVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    svi.d(b43Var.a, ((q2b) b43Var.Y).b().plus(bia.a), i84Var, new z33(b43Var, j, null));
                    ald.a((ald) b43Var.Z.getValue(), j);
                } else if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        b43Var.A(j);
                    } else if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return qqgVar;
            case 1:
                int iOrdinal2 = ecbVar.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    svi.d(b43Var.a, ((q2b) b43Var.Y).b().plus(bia.a), i84Var, new z33(b43Var, j, null));
                } else if (iOrdinal2 == 3) {
                    b43Var.B(j);
                }
                return qqgVar;
            default:
                if (ecbVar != ecb.o) {
                    yy7[] yy7VarArr = b43.W0;
                    ((c6i) b43Var.F0.getValue()).b(new kge(j, false));
                }
                return qqgVar;
        }
    }
}
