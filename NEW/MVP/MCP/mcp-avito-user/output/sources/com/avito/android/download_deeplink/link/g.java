package com.avito.android.download_deeplink.link;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DownloadFileLinkInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.download_deeplink.link.DownloadFileLinkInteractor$tickerFlow$1", f = "DownloadFileLinkInteractor.kt", i = {0, 1, 2}, l = {69, 71, 72}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes13.dex */
final class g extends SuspendLambda implements p<InterfaceC43172j<? super G0>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f144936q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f144937r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f144938s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f144939t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j12, long j13, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f144938s = j12;
        this.f144939t = j13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        g gVar = new g(this.f144938s, this.f144939t, continuation);
        gVar.f144937r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0060 -> B:15:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f144936q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f144937r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L56
        L22:
            java.lang.Object r1 = r6.f144937r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L3f
        L2a:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f144937r
            r1 = r7
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            r6.f144937r = r1
            r6.f144936q = r4
            long r4 = r6.f144938s
            java.lang.Object r7 = kotlinx.coroutines.C43131e0.c(r4, r6)
            if (r7 != r0) goto L3f
            return r0
        L3f:
            kotlin.coroutines.CoroutineContext r7 = r6.getF411447c()
            boolean r7 = kotlinx.coroutines.Q0.h(r7)
            if (r7 == 0) goto L63
            kotlin.G0 r7 = kotlin.G0.f406611a
            r6.f144937r = r1
            r6.f144936q = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            r6.f144937r = r1
            r6.f144936q = r2
            long r4 = r6.f144939t
            java.lang.Object r7 = kotlinx.coroutines.C43131e0.c(r4, r6)
            if (r7 != r0) goto L3f
            return r0
        L63:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.download_deeplink.link.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
