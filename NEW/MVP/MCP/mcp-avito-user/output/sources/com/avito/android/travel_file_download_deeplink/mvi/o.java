package com.avito.android.travel_file_download_deeplink.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FileDownloadInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.mvi.FileDownloadInteractor$tickerFlow$1", f = "FileDownloadInteractor.kt", i = {0, 1}, l = {87, 88}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
final class o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super G0>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f301830q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f301831r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(2, continuation);
        oVar.f301831r = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0050 -> B:7:0x0015). Please report as a decompilation issue!!! */
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
            int r1 = r6.f301830q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r6.f301831r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
        L15:
            r7 = r1
            goto L2e
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            java.lang.Object r1 = r6.f301831r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L46
        L27:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f301831r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
        L2e:
            kotlin.coroutines.CoroutineContext r1 = r6.getF411447c()
            boolean r1 = kotlinx.coroutines.Q0.h(r1)
            if (r1 == 0) goto L53
            r6.f301831r = r7
            r6.f301830q = r3
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = kotlinx.coroutines.C43131e0.b(r4, r6)
            if (r1 != r0) goto L45
            return r0
        L45:
            r1 = r7
        L46:
            kotlin.G0 r7 = kotlin.G0.f406611a
            r6.f301831r = r1
            r6.f301830q = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L15
            return r0
        L53:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_file_download_deeplink.mvi.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
