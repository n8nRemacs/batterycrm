package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.time.DurationUnit;
import kotlin.time.e;

/* compiled from: Delay.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43131e0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.C43128d0
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.C43128d0) r0
            int r1 = r0.f411045r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411045r = r1
            goto L18
        L13:
            kotlinx.coroutines.d0 r0 = new kotlinx.coroutines.d0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f411044q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411045r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            kotlin.C42729a0.b(r4)
            goto L52
        L31:
            kotlin.C42729a0.b(r4)
            r0.f411045r = r3
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r4.<init>(r3, r2)
            r4.p()
            java.lang.Object r4 = r4.o()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r2) goto L4f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C43131e0.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public static final Object b(long j12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        if (j12 <= 0) {
            return kotlin.G0.f406611a;
        }
        r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        if (j12 < Long.MAX_VALUE) {
            d(rVar.f411960f).f(j12, rVar);
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : kotlin.G0.f406611a;
    }

    @Y61.l
    public static final Object c(long j12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objB = b(e(j12), continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : kotlin.G0.f406611a;
    }

    @Y61.k
    public static final InterfaceC43082c0 d(@Y61.k CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.INSTANCE);
        InterfaceC43082c0 interfaceC43082c0 = element instanceof InterfaceC43082c0 ? (InterfaceC43082c0) element : null;
        return interfaceC43082c0 == null ? Z.f410747a : interfaceC43082c0;
    }

    public static final long e(long j12) {
        e.a aVar = kotlin.time.e.f410651c;
        boolean z12 = j12 > 0;
        if (z12) {
            return kotlin.time.e.e(kotlin.time.e.k(j12, kotlin.time.g.h(999999L, DurationUnit.f410631c)));
        }
        if (z12) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
