package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Share.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/s2;", "T", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class s2<T> implements InterfaceC43172j<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43172j<T> f411747b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SuspendLambda f411748c;

    /* JADX WARN: Multi-variable type inference failed */
    public s2(@Y61.k Y41.p pVar, @Y61.k InterfaceC43172j interfaceC43172j) {
        this.f411747b = interfaceC43172j;
        this.f411748c = (SuspendLambda) pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.r2
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.r2 r0 = (kotlinx.coroutines.flow.r2) r0
            int r1 = r0.f411728u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411728u = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.r2 r0 = new kotlinx.coroutines.flow.r2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f411726s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411728u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L75
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlinx.coroutines.flow.internal.A r2 = r0.f411725r
            kotlinx.coroutines.flow.s2 r4 = r0.f411724q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L3c
            goto L5c
        L3c:
            r7 = move-exception
            goto L7b
        L3e:
            kotlin.C42729a0.b(r7)
            kotlinx.coroutines.flow.internal.A r2 = new kotlinx.coroutines.flow.internal.A
            kotlinx.coroutines.flow.j<T> r7 = r6.f411747b
            kotlin.coroutines.CoroutineContext r5 = r0.getF411960f()
            r2.<init>(r7, r5)
            kotlin.coroutines.jvm.internal.SuspendLambda r7 = r6.f411748c     // Catch: java.lang.Throwable -> L3c
            r0.f411724q = r6     // Catch: java.lang.Throwable -> L3c
            r0.f411725r = r2     // Catch: java.lang.Throwable -> L3c
            r0.f411728u = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3c
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r4 = r6
        L5c:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.j<T> r7 = r4.f411747b
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.s2
            if (r2 == 0) goto L78
            kotlinx.coroutines.flow.s2 r7 = (kotlinx.coroutines.flow.s2) r7
            r2 = 0
            r0.f411724q = r2
            r0.f411725r = r2
            r0.f411728u = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L78:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L7b:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.s2.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(T t12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        return this.f411747b.emit(t12, continuation);
    }
}
