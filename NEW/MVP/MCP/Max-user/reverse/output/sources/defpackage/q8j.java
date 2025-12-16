package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class q8j {
    public static Object a(ms4 ms4Var, long j, Continuation continuation) {
        if (j > 0) {
            l42 l42Var = new l42(1, hni.f(continuation));
            l42Var.o();
            ms4Var.mo14scheduleResumeAfterDelay(j, l42Var);
            Object objN = l42Var.n();
            if (objN == g84.a) {
                return objN;
            }
        }
        return qqg.a;
    }

    public static kk3 b(sm6 sm6Var) {
        return new kk3(0, new z9a(bd5.a, sm6Var));
    }
}
