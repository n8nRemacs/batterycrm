package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class rpd implements brf {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public brf b = null;

    public final void a(brf brfVar) {
        this.b = brfVar;
        for (qpd qpdVar : this.a) {
            if (!qpdVar.f()) {
                qpdVar.o(brfVar);
            }
        }
    }

    @Override // defpackage.brf
    public final Object get() {
        qpd qpdVar = new qpd();
        qpdVar.h = null;
        qpdVar.o(this.b);
        this.a.add(qpdVar);
        return qpdVar;
    }
}
