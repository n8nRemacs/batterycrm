package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class we5 implements ge5, wqa {
    public final LinkedHashMap a = new LinkedHashMap();
    public dv0 b = dv0.b;
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ bf5 d;

    public we5(bf5 bf5Var) {
        this.d = bf5Var;
    }

    public final void a(boolean z) {
        dv0 dv0Var = dv0.b;
        dv0 dv0Var2 = z ? dv0.a : dv0Var;
        if (this.b == dv0Var2) {
            return;
        }
        this.b = dv0Var2;
        if (dv0Var2 == dv0Var) {
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ha8) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.a.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new kr4(entry, 17, dv0Var2));
            } catch (RejectedExecutionException e) {
                gri.c(this.d.a, "Unable to post to the supplied executor.", e);
            }
        }
    }

    @Override // defpackage.wqa
    public final void f(Executor executor, uqa uqaVar) {
        this.d.h.execute(new se5(this, uqaVar, executor, 2));
    }

    @Override // defpackage.wqa
    public final ha8 p() {
        return ixi.a(new te5(this, 0));
    }

    @Override // defpackage.wqa
    public final void r(uqa uqaVar) {
        this.d.h.execute(new kr4(this, 19, uqaVar));
    }
}
