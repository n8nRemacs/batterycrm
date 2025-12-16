package defpackage;

import java.lang.Thread;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes.dex */
public abstract class sni {
    public static final Object a = new Object();

    public static void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (a) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                uncaughtExceptionHandler = new n72(uncaughtExceptionHandler, defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    public static final Object b(ScopeCoroutine scopeCoroutine, ScopeCoroutine scopeCoroutine2, sm6 sm6Var) {
        Object zk3Var;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            uog.d(2, sm6Var);
            zk3Var = sm6Var.invoke(scopeCoroutine2, scopeCoroutine);
        } catch (Throwable th) {
            zk3Var = new zk3(th, false);
        }
        g84 g84Var = g84.a;
        if (zk3Var == g84Var || (objMakeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(zk3Var)) == tu7.b) {
            return g84Var;
        }
        if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof zk3) {
            throw ((zk3) objMakeCompletingOnce$kotlinx_coroutines_core).a;
        }
        return tu7.a(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public static final void c(esg esgVar) {
        esgVar.b(1, new qu4(28));
        esgVar.d(485, new qu4(29));
        esgVar.d(486, new zv6(8));
    }
}
