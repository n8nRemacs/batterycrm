package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class phe extends hge {
    public final long b;
    public final long c;

    public phe(dq0 dq0Var) {
        this.b = dq0Var.b;
        this.c = dq0Var.c;
    }

    @Override // defpackage.hge
    public final void u() {
        long jC;
        String name = phe.class.getName();
        long j = this.b;
        Long lValueOf = Long.valueOf(j);
        long j2 = this.c;
        wqi.c(name, "process, chatId = %d, botId = %d, suspend = %b", lValueOf, Long.valueOf(j2), Boolean.TRUE);
        if (e().M(j) == null) {
            return;
        }
        ve2 ve2VarE = e();
        ve2VarE.getClass();
        ve2VarE.r(j, false, new ke2(true, 1));
        e().z(j);
        hwa hwaVarA = a();
        long j3 = this.b;
        if (hwaVarA.j(j3)) {
            jC = hwaVarA.u().c(new ssf(hwaVarA.t().a.k(), j3, true, this.c), false, 0L, (12 & 8) != 0 ? 0 : 1);
        } else {
            jC = 0;
        }
        r().c(new n73(Collections.singletonList(Long.valueOf(j)), true, false, null, null, 124));
        r().c(new t24(jC, Collections.singletonList(Long.valueOf(j2))));
        r().c(new tsf(j));
    }
}
