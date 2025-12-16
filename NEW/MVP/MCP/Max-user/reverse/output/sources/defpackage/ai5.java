package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ai5 implements bof, nqc {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public ai5(Executor executor) {
        this.c = executor;
    }

    public final void a(os5 os5Var) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(ee4.class)) {
                    this.a.put(ee4.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(ee4.class)).put(os5Var, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
