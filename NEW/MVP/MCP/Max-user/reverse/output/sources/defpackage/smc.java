package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final /* synthetic */ class smc implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pnc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ smc(pnc pncVar, boolean z, int i) {
        this.a = i;
        this.b = pncVar;
        this.c = z;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        ecb ecbVar = (ecb) obj;
        switch (this.a) {
            case 0:
                int iOrdinal = ecbVar.ordinal();
                pnc pncVar = this.b;
                if (iOrdinal == 0 || iOrdinal == 1) {
                    pncVar.u();
                } else if (iOrdinal == 2) {
                    pncVar.W0 = false;
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pncVar.W0 = false;
                } else {
                    pncVar.H(this.c);
                }
                return qqg.a;
            case 1:
                int iOrdinal2 = ecbVar.ordinal();
                pnc pncVar2 = this.b;
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    pncVar2.J();
                    pncVar2.u();
                } else if (iOrdinal2 == 2) {
                    pncVar2.W0 = false;
                } else if (iOrdinal2 != 3) {
                    if (iOrdinal2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pncVar2.W0 = false;
                } else {
                    pncVar2.F(this.c);
                }
                return qqg.a;
            default:
                int iOrdinal3 = ecbVar.ordinal();
                pnc pncVar3 = this.b;
                if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                    pncVar3.J();
                } else if (iOrdinal3 == 2) {
                    pncVar3.W0 = false;
                } else if (iOrdinal3 != 3) {
                    if (iOrdinal3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pncVar3.W0 = false;
                } else {
                    pncVar3.I(this.c);
                }
                return qqg.a;
        }
    }
}
