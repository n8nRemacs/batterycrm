package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class uya implements iv4 {
    public final long a = pu4.b.incrementAndGet();
    public final tcf b;
    public final hbd c;
    public final /* synthetic */ k18 d;

    public uya(k18 k18Var) {
        this.d = k18Var;
        tcf tcfVarA = ucf.a(e());
        this.b = tcfVarA;
        this.c = new hbd(tcfVarA);
    }

    @Override // defpackage.iv4
    public final mcf b() {
        return this.c;
    }

    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        if (pu4.a(yg4Var.a, this.a)) {
            k18 k18Var = this.d;
            cne cneVar = ((List) ((gu5) ((rt5) k18Var.getValue())).s.getValue()) != null ? null : new cne(0, null, "TEST", bne.b, new ArrayList(new is(new mke[]{new mke(2165956L, "https://max.ru/s/img/big-logo.png", "Войти в MAX", null, null)}, true)));
            rt5 rt5Var = (rt5) k18Var.getValue();
            List listSingletonList = cneVar != null ? Collections.singletonList(cneVar) : null;
            gu5 gu5Var = (gu5) rt5Var;
            gu5Var.getClass();
            gu5Var.s = new sl7(listSingletonList);
        }
        this.b.setValue(e());
    }

    public final o98 e() {
        o98 o98VarD = ve3.d();
        o98VarD.add(new yg4(this.a, new r5g("Включить баннер MAX в настройках?"), nxc.ic_notification, null, new xg4(((List) ((gu5) ((rt5) this.d.getValue())).s.getValue()) != null), 8));
        return ve3.a(o98VarD);
    }
}
