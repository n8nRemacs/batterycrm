package kotlinx.coroutines.internal;

import defpackage.cm6;
import defpackage.em6;
import defpackage.js;
import defpackage.ki5;
import defpackage.qqg;
import defpackage.r7g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u0015\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"T", "Lkotlin/coroutines/Continuation;", "Lkpd;", "result", "Lkotlin/Function1;", "", "Lqqg;", "onCancellation", "resumeCancellableWith", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lem6;)V", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "", "yieldUndispatched", "(Lkotlinx/coroutines/internal/DispatchedContinuation;)Z", "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "executeUnconfined", "(Lkotlinx/coroutines/internal/DispatchedContinuation;Ljava/lang/Object;IZLcm6;)Z", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DispatchedContinuationKt {
    private static final Symbol UNDEFINED = new Symbol("UNDEFINED");
    public static final Symbol REUSABLE_CLAIMED = new Symbol("REUSABLE_CLAIMED");

    private static final boolean executeUnconfined(DispatchedContinuation<?> dispatchedContinuation, Object obj, int i, boolean z, cm6 cm6Var) {
        ki5 ki5VarA = r7g.a();
        if (z) {
            js jsVar = ki5VarA.c;
            if (jsVar != null ? jsVar.isEmpty() : true) {
                return false;
            }
        }
        if (ki5VarA.Q()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            ki5VarA.w(dispatchedContinuation);
            return true;
        }
        ki5VarA.P(true);
        try {
            cm6Var.invoke();
            do {
            } while (ki5VarA.h0());
            return false;
        } catch (Throwable th) {
            try {
                dispatchedContinuation.handleFatalException$kotlinx_coroutines_core(th, null);
                return false;
            } finally {
                ki5VarA.d(true);
            }
        }
    }

    public static boolean executeUnconfined$default(DispatchedContinuation dispatchedContinuation, Object obj, int i, boolean z, cm6 cm6Var, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        ki5 ki5VarA = r7g.a();
        if (z) {
            js jsVar = ki5VarA.c;
            if (jsVar != null ? jsVar.isEmpty() : true) {
                return false;
            }
        }
        if (ki5VarA.Q()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            ki5VarA.w(dispatchedContinuation);
            return true;
        }
        ki5VarA.P(true);
        try {
            cm6Var.invoke();
            do {
            } while (ki5VarA.h0());
            return false;
        } catch (Throwable th) {
            try {
                dispatchedContinuation.handleFatalException$kotlinx_coroutines_core(th, null);
                return false;
            } finally {
                ki5VarA.d(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[Catch: all -> 0x0060, DONT_GENERATE, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x003c, B:14:0x004a, B:16:0x0050, B:29:0x0088, B:19:0x0062, B:21:0x0072, B:26:0x007f, B:28:0x0085, B:34:0x0095, B:37:0x009e, B:36:0x009b, B:24:0x0078), top: B:46:0x003c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void resumeCancellableWith(kotlin.coroutines.Continuation<? super T> r6, java.lang.Object r7, defpackage.em6 r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto La9
            kotlinx.coroutines.internal.DispatchedContinuation r6 = (kotlinx.coroutines.internal.DispatchedContinuation) r6
            java.lang.Object r8 = defpackage.d5j.b(r7, r8)
            z74 r0 = r6.dispatcher
            x74 r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L25
            r6._state = r8
            r6.resumeMode = r1
            z74 r7 = r6.dispatcher
            x74 r8 = r6.getContext()
            r7.mo13dispatch(r8, r6)
            return
        L25:
            ki5 r0 = defpackage.r7g.a()
            boolean r2 = r0.Q()
            if (r2 == 0) goto L38
            r6._state = r8
            r6.resumeMode = r1
            r0.w(r6)
            goto La3
        L38:
            r0.P(r1)
            r2 = 0
            x74 r3 = r6.getContext()     // Catch: java.lang.Throwable -> L60
            wha r4 = defpackage.wha.w0     // Catch: java.lang.Throwable -> L60
            v74 r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L60
            qt7 r3 = (defpackage.qt7) r3     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L60
            if (r4 != 0) goto L62
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L60
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch: java.lang.Throwable -> L60
            ipd r8 = new ipd     // Catch: java.lang.Throwable -> L60
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L60
            r6.resumeWith(r8)     // Catch: java.lang.Throwable -> L60
            goto L88
        L60:
            r7 = move-exception
            goto L9f
        L62:
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L60
            x74 r4 = r8.getContext()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L60
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L60
            if (r3 == r5) goto L77
            lqg r8 = defpackage.z6j.d(r8, r4, r3)     // Catch: java.lang.Throwable -> L60
            goto L78
        L77:
            r8 = r2
        L78:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L92
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L85
            boolean r7 = r8.D()     // Catch: java.lang.Throwable -> L60
            if (r7 == 0) goto L88
        L85:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L60
        L88:
            boolean r7 = r0.h0()     // Catch: java.lang.Throwable -> L60
            if (r7 != 0) goto L88
        L8e:
            r0.d(r1)
            goto La3
        L92:
            r7 = move-exception
            if (r8 == 0) goto L9b
            boolean r8 = r8.D()     // Catch: java.lang.Throwable -> L60
            if (r8 == 0) goto L9e
        L9b:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L60
        L9e:
            throw r7     // Catch: java.lang.Throwable -> L60
        L9f:
            r6.handleFatalException$kotlinx_coroutines_core(r7, r2)     // Catch: java.lang.Throwable -> La4
            goto L8e
        La3:
            return
        La4:
            r6 = move-exception
            r0.d(r1)
            throw r6
        La9:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(kotlin.coroutines.Continuation, java.lang.Object, em6):void");
    }

    public static /* synthetic */ void resumeCancellableWith$default(Continuation continuation, Object obj, em6 em6Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            em6Var = null;
        }
        resumeCancellableWith(continuation, obj, em6Var);
    }

    public static final boolean yieldUndispatched(DispatchedContinuation<? super qqg> dispatchedContinuation) {
        ki5 ki5VarA = r7g.a();
        js jsVar = ki5VarA.c;
        if (jsVar != null ? jsVar.isEmpty() : true) {
            return false;
        }
        if (ki5VarA.Q()) {
            dispatchedContinuation._state = qqg.a;
            dispatchedContinuation.resumeMode = 1;
            ki5VarA.w(dispatchedContinuation);
            return true;
        }
        ki5VarA.P(true);
        try {
            dispatchedContinuation.run();
            do {
            } while (ki5VarA.h0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
