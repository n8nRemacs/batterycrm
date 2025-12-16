package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D1 {
    public static final <U, T extends U> Object a(B1<U, ? super T> b12, Y41.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar) throws Throwable {
        Object e12;
        Q0.g(b12, new C43272q0(C43131e0.d(b12.f411885e.getF411960f()).g(b12.f410675f, b12, b12.f410748d)), 3);
        try {
            if (pVar instanceof BaseContinuationImpl) {
                kotlin.jvm.internal.v0.e(2, pVar);
                e12 = pVar.invoke(b12, b12);
            } else {
                e12 = IntrinsicsKt.wrapWithContinuationImpl(pVar, b12, b12);
            }
        } catch (Throwable th2) {
            e12 = new E(th2, false, 2, null);
        }
        if (e12 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object objQ0 = b12.q0(e12);
        if (objQ0 == C43077a1.f410750b) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (objQ0 instanceof E) {
            Throwable th3 = ((E) objQ0).f410693a;
            if (!(th3 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th3).f410721b != b12) {
                throw th3;
            }
            if (e12 instanceof E) {
                throw ((E) e12).f410693a;
            }
        } else {
            e12 = C43077a1.a(objQ0);
        }
        return e12;
    }

    @Y61.l
    public static final <T> Object b(long j12, @Y61.k Y41.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, @Y61.k Continuation<? super T> continuation) throws Throwable {
        if (j12 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objA = a(new B1(j12, continuation), pVar);
        if (objA == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.B1] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r7, @Y61.k Y41.p r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.C1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.C1 r0 = (kotlinx.coroutines.C1) r0
            int r1 = r0.f410679t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410679t = r1
            goto L18
        L13:
            kotlinx.coroutines.C1 r0 = new kotlinx.coroutines.C1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f410678s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f410679t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            kotlin.jvm.internal.l0$h r7 = r0.f410677r
            Y41.p r8 = r0.f410676q
            Y41.p r8 = (Y41.p) r8
            kotlin.C42729a0.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L30
            goto L6b
        L30:
            r8 = move-exception
            goto L6c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.C42729a0.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L44
            return r3
        L44:
            kotlin.jvm.internal.l0$h r10 = new kotlin.jvm.internal.l0$h
            r10.<init>()
            r0.f410676q = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            r0.f410677r = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            r0.f410679t = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            kotlinx.coroutines.B1 r2 = new kotlinx.coroutines.B1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            r10.f406842b = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            java.lang.Object r7 = a(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            if (r7 != r8) goto L67
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L64
            goto L67
        L64:
            r8 = move-exception
            r7 = r10
            goto L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            kotlinx.coroutines.N0 r9 = r8.f410721b
            T r7 = r7.f406842b
            if (r9 != r7) goto L73
            return r3
        L73:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.D1.c(long, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
