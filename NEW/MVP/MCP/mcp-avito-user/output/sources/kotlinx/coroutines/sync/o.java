package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: Semaphore.kt */
@s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {81}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class o<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f412279q;

    /* renamed from: r, reason: collision with root package name */
    public int f412280r;

    public o() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r4) {
        /*
            r3 = this;
            r3.f412279q = r4
            int r0 = r3.f412280r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r3.f412280r = r0
            int r2 = kotlinx.coroutines.sync.p.f412281a
            int r0 = r0 - r1
            r3.f412280r = r0
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.f412280r
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 != r2) goto L1e
            kotlin.C42729a0.b(r4)
            throw r1     // Catch: java.lang.Throwable -> L1d
        L1d:
            throw r1
        L1e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L26:
            kotlin.C42729a0.b(r4)
            r3.f412280r = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
