package defpackage;

import android.os.CancellationSignal;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class k7j {
    public static final Object a(lrd lrdVar, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
        x74 x74VarA;
        if (lrdVar.m() && lrdVar.j()) {
            return callable.call();
        }
        rgg rggVar = (rgg) continuation.getContext().get(rgg.c);
        if (rggVar == null || (x74VarA = rggVar.a) == null) {
            x74VarA = l7j.a(lrdVar);
        }
        l42 l42Var = new l42(1, hni.f(continuation));
        l42Var.o();
        l42Var.e(new r84(cancellationSignal, 0, svi.e(nv6.a, x74VarA, null, new s84(callable, l42Var, null), 2)));
        return l42Var.n();
    }

    public static final Object b(lrd lrdVar, Callable callable, Continuation continuation) {
        x74 x74Var;
        if (lrdVar.m() && lrdVar.j()) {
            return callable.call();
        }
        rgg rggVar = (rgg) continuation.getContext().get(rgg.c);
        if (rggVar == null || (x74Var = rggVar.a) == null) {
            Map map = lrdVar.k;
            Object objB = map.get("TransactionDispatcher");
            if (objB == null) {
                uee ueeVar = lrdVar.c;
                if (ueeVar == null) {
                    ueeVar = null;
                }
                objB = taj.b(ueeVar);
                map.put("TransactionDispatcher", objB);
            }
            x74Var = (z74) objB;
        }
        return svi.i(x74Var, new q84(callable, null), continuation);
    }

    public static final void c(esg esgVar) {
        esgVar.d(108, new x7c(7));
    }
}
