package defpackage;

/* loaded from: classes.dex */
public abstract class de {
    public static final j0e a;

    static {
        try {
            d07 d07Var = ce.a;
            if (d07Var == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = d07Var;
        } catch (Throwable th) {
            throw bj5.d(th);
        }
    }

    public static j0e a() {
        j0e j0eVar = a;
        if (j0eVar != null) {
            return j0eVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
