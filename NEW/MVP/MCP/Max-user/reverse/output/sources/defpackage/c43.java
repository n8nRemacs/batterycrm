package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final /* synthetic */ class c43 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k53 b;
    public final /* synthetic */ long c;

    public /* synthetic */ c43(k53 k53Var, long j, int i) {
        this.a = i;
        this.b = k53Var;
        this.c = j;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        long j = this.c;
        k53 k53Var = this.b;
        ecb ecbVar = (ecb) obj;
        switch (i) {
            case 0:
                int iOrdinal = ecbVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    k53Var.C(j);
                } else if (iOrdinal == 3) {
                    k53Var.B(j);
                }
                return qqgVar;
            case 1:
                int iOrdinal2 = ecbVar.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    k53Var.C(j);
                    ald.a((ald) k53Var.Z.getValue(), j);
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 3) {
                        k53Var.z(j);
                    } else if (iOrdinal2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return qqgVar;
            default:
                if (ecbVar != ecb.o) {
                    yy7[] yy7VarArr = k53.d1;
                    ((c6i) k53Var.F0.getValue()).b(new kge(j, false));
                }
                return qqgVar;
        }
    }
}
