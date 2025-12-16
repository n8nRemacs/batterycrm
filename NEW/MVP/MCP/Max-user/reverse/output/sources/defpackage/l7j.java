package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class l7j {
    public static final z74 a(lrd lrdVar) {
        Map map = lrdVar.k;
        Object objB = map.get("QueryDispatcher");
        if (objB == null) {
            Executor executor = lrdVar.b;
            if (executor == null) {
                executor = null;
            }
            objB = taj.b(executor);
            map.put("QueryDispatcher", objB);
        }
        return (z74) objB;
    }

    public static final void b(esg esgVar) {
        esgVar.b(1, new bya(14));
    }
}
