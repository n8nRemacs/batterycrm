package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class s8j {
    public static final su1 a(lta ltaVar) {
        return gw0.c(new xvd(ltaVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.q44 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.ns4
            if (r0 == 0) goto L13
            r0 = r4
            ns4 r0 = (defpackage.ns4) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            ns4 r0 = new ns4
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.d
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L29:
            defpackage.g8j.b(r4)
            goto L47
        L2d:
            defpackage.g8j.b(r4)
            r0.o = r2
            l42 r4 = new l42
            kotlin.coroutines.Continuation r0 = defpackage.hni.f(r0)
            r4.<init>(r2, r0)
            r4.o()
            java.lang.Object r4 = r4.n()
            g84 r0 = defpackage.g84.a
            if (r4 != r0) goto L47
            return
        L47:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s8j.b(q44):void");
    }

    public static final Object c(long j, Continuation continuation) {
        qqg qqgVar = qqg.a;
        if (j <= 0) {
            return qqgVar;
        }
        l42 l42Var = new l42(1, hni.f(continuation));
        l42Var.o();
        if (j < BuildConfig.MAX_TIME_TO_UPLOAD) {
            e(l42Var.getContext()).mo14scheduleResumeAfterDelay(j, l42Var);
        }
        Object objN = l42Var.n();
        return objN == g84.a ? objN : qqgVar;
    }

    public static final Object d(long j, Continuation continuation) {
        Object objC = c(f(j), continuation);
        return objC == g84.a ? objC : qqg.a;
    }

    public static final ms4 e(x74 x74Var) {
        v74 v74Var = x74Var.get(jbe.t0);
        ms4 ms4Var = v74Var instanceof ms4 ? (ms4) v74Var : null;
        return ms4Var == null ? lm4.a : ms4Var;
    }

    public static final long f(long j) {
        int i = s65.d;
        boolean z = j > 0;
        if (z) {
            return s65.g(s65.l(j, v9j.i(999999L, y65.NANOSECONDS)));
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
