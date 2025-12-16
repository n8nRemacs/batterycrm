package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes.dex */
public abstract class ezi {
    public static final Object a(x74 x74Var, Object obj, Object obj2, sm6 sm6Var, Continuation continuation) {
        Object objInvoke;
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(x74Var, obj2);
        try {
            o9f o9fVar = new o9f(x74Var, continuation);
            if (sm6Var == null) {
                objInvoke = hni.h(sm6Var, obj, o9fVar);
            } else {
                uog.d(2, sm6Var);
                objInvoke = sm6Var.invoke(obj, o9fVar);
            }
            ThreadContextKt.restoreThreadContext(x74Var, objUpdateThreadContext);
            return objInvoke;
        } catch (Throwable th) {
            ThreadContextKt.restoreThreadContext(x74Var, objUpdateThreadContext);
            throw th;
        }
    }
}
