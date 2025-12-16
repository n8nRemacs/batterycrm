package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class mce {
    public final LinkedHashMap a;

    public mce(kce kceVar, ls7 ls7Var, kl4 kl4Var) {
        z74 z74Var = ls7Var.a;
        z74Var.plus(bia.a);
        this.a = new LinkedHashMap();
        x26 x26VarM = gw0.m(gw0.u(new mwd(new p84((lrd) kceVar.b, new String[]{"selected_mentions"}, new jad(kceVar, 7, dsd.c(0, "SELECT * FROM selected_mentions")), null)), z74Var));
        z74 z74Var2 = kl4Var.a;
        gw0.w(new g56(gw0.u(x26VarM, z74Var2), new lce(this, null), 1), d7j.a(z74Var2));
    }

    public final int a(long j) {
        int i;
        jce jceVar = (jce) this.a.get(Long.valueOf(j));
        if (jceVar == null || (i = jceVar.b) == 0) {
            return 1;
        }
        return i;
    }
}
