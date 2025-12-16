package com.avito.android.wallet.page.history.mvi.component;

import com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PaymentHistoryInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.page.history.mvi.component.PaymentHistoryInteractor$loadInitial$1", f = "PaymentHistoryInteractor.kt", i = {0, 1}, l = {18, 19, 21, 30}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PaymentHistoryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f328038q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f328039r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f328040s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f328040s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f328040s, continuation);
        kVar.f328039r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PaymentHistoryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f328038q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.C42729a0.b(r8)
            goto La7
        L23:
            java.lang.Object r1 = r7.f328039r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L5f
        L2b:
            java.lang.Object r1 = r7.f328039r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L48
        L33:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f328039r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction$InitialLoad r1 = com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction.InitialLoad.f328068b
            r7.f328039r = r8
            r7.f328038q = r5
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L47
            return r0
        L47:
            r1 = r8
        L48:
            com.avito.android.wallet.page.history.mvi.component.m r8 = r7.f328040s
            h31.e<aP0.a> r5 = r8.f328045a
            java.lang.Object r5 = r5.get()
            aP0.a r5 = (aP0.InterfaceC19802a) r5
            r7.f328039r = r1
            r7.f328038q = r4
            java.lang.String r8 = r8.f328046b
            java.lang.Object r8 = r5.c(r8, r6, r7)
            if (r8 != r0) goto L5f
            return r0
        L5f:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r4 == 0) goto L85
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r8 = r8.getResult()
            YO0.b r8 = (YO0.b) r8
            com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction$Items r2 = new com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction$Items
            java.util.List r4 = r8.a()
            java.lang.String r8 = r8.getNextPageToken()
            r2.<init>(r4, r6, r8)
            r7.f328039r = r6
            r7.f328038q = r3
            java.lang.Object r8 = r1.emit(r2, r7)
            if (r8 != r0) goto La7
            return r0
        L85:
            boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto Laa
            com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
            com.avito.android.remote.error.ApiError r3 = r8.getError()
            java.lang.Throwable r8 = r8.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r3, r8)
            com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction$InitialLoadError r3 = new com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction$InitialLoadError
            r3.<init>(r8)
            r7.f328039r = r6
            r7.f328038q = r2
            java.lang.Object r8 = r1.emit(r3, r7)
            if (r8 != r0) goto La7
            return r0
        La7:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Laa:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.page.history.mvi.component.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
