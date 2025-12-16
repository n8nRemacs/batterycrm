package defpackage;

import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class i8j {
    public static final Object a(lrd lrdVar, em6 em6Var, Continuation continuation) {
        nrd nrdVar = new nrd(lrdVar, em6Var, null);
        rgg rggVar = (rgg) continuation.getContext().get(rgg.c);
        r44 r44Var = rggVar != null ? rggVar.a : null;
        if (r44Var != null) {
            return svi.i(r44Var, nrdVar, continuation);
        }
        x74 context = continuation.getContext();
        l42 l42Var = new l42(1, hni.f(continuation));
        l42Var.o();
        try {
            uee ueeVar = lrdVar.c;
            if (ueeVar == null) {
                ueeVar = null;
            }
            ueeVar.execute(new b6i(6, context, l42Var, lrdVar, nrdVar, false));
        } catch (RejectedExecutionException e) {
            l42Var.h(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        return l42Var.n();
    }
}
