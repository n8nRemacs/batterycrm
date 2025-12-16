package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes.dex */
public final class iwf implements c6f, hc3, rl3 {
    @Override // defpackage.hc3
    public long getTime() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        ia3 ia3Var = new ia3();
        o6 o6Var = new o6(6);
        ReferenceQueue referenceQueue = ia3Var.a;
        Set set = ia3Var.b;
        set.add(new kii(ia3Var, referenceQueue, set, o6Var));
        Thread thread = new Thread(new owf(referenceQueue, set, false, 7), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return ia3Var;
    }
}
