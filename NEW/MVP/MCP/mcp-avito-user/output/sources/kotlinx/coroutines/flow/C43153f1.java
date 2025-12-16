package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: Reduce.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
/* renamed from: kotlinx.coroutines.flow.f1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43153f1<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f411389q;

    /* renamed from: r, reason: collision with root package name */
    public C43150e1 f411390r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f411391s;

    /* renamed from: t, reason: collision with root package name */
    public int f411392t;

    public C43153f1() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            r6.f411391s = r7
            int r0 = r6.f411392t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r6.f411392t = r0
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.f411392t
            kotlinx.coroutines.internal.a0 r1 = kotlinx.coroutines.flow.internal.z.f411583a
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L21
            kotlinx.coroutines.flow.e1 r0 = r6.f411390r
            kotlin.jvm.internal.l0$h r3 = r6.f411389q
            kotlin.C42729a0.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L1f
            goto L43
        L1f:
            r7 = move-exception
            goto L3f
        L21:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L29:
            kotlin.jvm.internal.l0$h r7 = androidx.compose.foundation.H.t(r7)
            r7.f406842b = r1
            kotlinx.coroutines.flow.e1 r0 = new kotlinx.coroutines.flow.e1
            r0.<init>(r7)
            r6.f411389q = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3b
            r6.f411390r = r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3b
            r6.f411392t = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3b
            throw r2
        L3b:
            r3 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
        L3f:
            java.lang.Object r4 = r7.f411440b
            if (r4 != r0) goto L4a
        L43:
            T r7 = r3.f406842b
            if (r7 != r1) goto L48
            goto L49
        L48:
            r2 = r7
        L49:
            return r2
        L4a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43153f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
