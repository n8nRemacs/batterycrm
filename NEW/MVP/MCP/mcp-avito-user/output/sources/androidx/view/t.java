package androidx.view;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: FullyDrawnReporter.kt */
@s0
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {185}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
/* loaded from: classes.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f21283q;

    /* renamed from: r, reason: collision with root package name */
    public int f21284r;

    public t() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
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
            r3.f21283q = r4
            int r0 = r3.f21284r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r3.f21284r = r0
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.f21284r
            r1 = 0
            if (r0 == 0) goto L22
            r2 = 1
            if (r0 != r2) goto L1a
            kotlin.C42729a0.b(r4)     // Catch: java.lang.Throwable -> L19
            throw r1
        L19:
            throw r1
        L1a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L22:
            kotlin.C42729a0.b(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
