package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final /* synthetic */ class rmc implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pnc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ rmc(pnc pncVar, long j, boolean z, int i) {
        this.a = i;
        this.b = pncVar;
        this.c = j;
        this.d = z;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        ecb ecbVar = (ecb) obj;
        switch (this.a) {
            case 0:
                pnc pncVar = this.b;
                yac yacVar = pncVar.T0;
                if (ecbVar != ecb.o) {
                    boolean z = yacVar.p() && yacVar.q();
                    c6i c6iVar = (c6i) pncVar.Z.getValue();
                    long j = this.c;
                    c6iVar.b(new kge(j, this.d));
                    if (z) {
                        xfh.r(pncVar.F0, new vkc(j, pncVar.c));
                    }
                }
                return qqg.a;
            default:
                int iOrdinal = ecbVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                    pnc pncVar2 = this.b;
                    svi.e(pncVar2.a, pncVar2.w(), null, new knc(pncVar2, this.c, this.d, null), 2);
                } else if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return qqg.a;
        }
    }
}
