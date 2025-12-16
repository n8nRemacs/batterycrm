package defpackage;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadLocalKt;

/* loaded from: classes.dex */
public abstract class r7g {
    public static final ThreadLocal a = ThreadLocalKt.commonThreadLocal(new Symbol("ThreadLocalEventLoop"));

    public static ki5 a() {
        ThreadLocal threadLocal = a;
        ki5 ki5Var = (ki5) threadLocal.get();
        if (ki5Var != null) {
            return ki5Var;
        }
        pq0 pq0Var = new pq0(Thread.currentThread());
        threadLocal.set(pq0Var);
        return pq0Var;
    }
}
