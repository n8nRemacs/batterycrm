package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class yge extends ghe {
    public final /* synthetic */ int t0 = 0;
    public final long u0;

    public yge(long j, long j2) {
        super(new xge(0, j, j2));
        this.u0 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    @Override // defpackage.ghe, defpackage.hge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yge.u():void");
    }

    @Override // defpackage.ghe
    public final ri9 v() {
        switch (this.t0) {
            case 0:
                return null;
            default:
                ige igeVar = this.a;
                if (igeVar == null) {
                    igeVar = null;
                }
                r10 r10VarQ = po8.q((jef) ((tef) igeVar.j.getValue()).a.get(Long.valueOf(this.u0)));
                x00 x00Var = new x00();
                x00Var.f = r10VarQ;
                x00Var.a = s10.X;
                w10 w10VarA = x00Var.a();
                x10 x10Var = new x10();
                x10Var.a = Collections.singletonList(w10VarA);
                jdc jdcVarC = x10Var.c();
                ri9 ri9Var = new ri9();
                ri9Var.n = jdcVarC;
                return ri9Var;
        }
    }

    public yge(xge xgeVar) {
        super(xgeVar);
        this.u0 = xgeVar.h;
    }
}
