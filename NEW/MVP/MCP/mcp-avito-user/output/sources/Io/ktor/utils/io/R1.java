package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LookAheadSession.kt */
@kotlin.jvm.internal.s0
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.LookAheadSessionKt", f = "LookAheadSession.kt", i = {0, 0, 1, 1, 1}, l = {54, 59}, m = "consumeEachRemaining", n = {"$this$consumeEachRemaining", "visitor", "$this$consumeEachRemaining", "visitor", "s"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
/* loaded from: classes8.dex */
final class R1 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public T1 f400739q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.p f400740r;

    /* renamed from: s, reason: collision with root package name */
    public int f400741s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f400742t;

    /* renamed from: u, reason: collision with root package name */
    public int f400743u;

    public R1() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (((java.lang.Boolean) r10).booleanValue() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        if (r10 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        return kotlin.G0.f406611a;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:24:0x0080). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            r9.f400742t = r10
            int r0 = r9.f400743u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r9.f400743u = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f400743u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L27
            int r1 = r9.f400741s
            Y41.p r4 = r9.f400740r
            Y41.p r4 = (Y41.p) r4
            io.ktor.utils.io.T1 r5 = r9.f400739q
            kotlin.C42729a0.b(r10)
            r6 = r1
            r1 = r9
            goto L80
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2f:
            Y41.p r1 = r9.f400740r
            Y41.p r1 = (Y41.p) r1
            io.ktor.utils.io.T1 r4 = r9.f400739q
            kotlin.C42729a0.b(r10)
            r5 = r4
            r4 = r1
            r1 = r9
            goto L5d
        L3c:
            kotlin.C42729a0.b(r10)
            r10 = 0
            r4 = r10
            r5 = r4
            r10 = r9
        L43:
            r1 = 0
            java.nio.ByteBuffer r1 = r5.c(r1, r3)
            if (r1 != 0) goto L67
            r10.f400739q = r5
            r1 = r4
            Y41.p r1 = (Y41.p) r1
            r10.f400740r = r1
            r10.f400743u = r3
            java.lang.Object r1 = r5.b(r3, r10)
            if (r1 != r0) goto L5a
            goto L8e
        L5a:
            r8 = r1
            r1 = r10
            r10 = r8
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8c
        L65:
            r10 = r1
            goto L43
        L67:
            int r6 = r1.remaining()
            r10.f400739q = r5
            r7 = r4
            Y41.p r7 = (Y41.p) r7
            r10.f400740r = r7
            r10.f400741s = r6
            r10.f400743u = r2
            java.lang.Object r1 = r4.invoke(r1, r10)
            if (r1 != r0) goto L7d
            goto L8e
        L7d:
            r8 = r1
            r1 = r10
            r10 = r8
        L80:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r5.a(r6)
            if (r10 == 0) goto L8c
            goto L65
        L8c:
            kotlin.G0 r0 = kotlin.G0.f406611a
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.R1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
