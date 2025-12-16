package com.avito.android.orders.feature.beduin_orders_list.mvi;

import com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LoadContentUseCase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.orders.feature.beduin_orders_list.mvi.LoadContentUseCase$invoke$1", f = "LoadContentUseCase.kt", i = {0, 1}, l = {22, 23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class y extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BeduinOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f210168q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f210169r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f210170s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f210170s = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        y yVar = new y(this.f210170s, continuation);
        yVar.f210169r = obj;
        return yVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BeduinOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((y) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f210168q
            r2 = 4
            r3 = 3
            r4 = 2
            com.avito.android.orders.feature.beduin_orders_list.mvi.z r5 = r9.f210170s
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L39
            if (r1 == r6) goto L31
            if (r1 == r4) goto L29
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            kotlin.C42729a0.b(r10)
            goto Lb1
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            kotlin.C42729a0.b(r10)
            goto Lb6
        L29:
            java.lang.Object r1 = r9.f210169r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L64
        L31:
            java.lang.Object r1 = r9.f210169r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L51
        L39:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f210169r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$LoadingStarted r1 = new com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$LoadingStarted
            r1.<init>(r7, r6, r7)
            r9.f210169r = r10
            r9.f210168q = r6
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L50
            return r0
        L50:
            r1 = r10
        L51:
            com.avito.android.orders.feature.beduin_orders_list.data.a r10 = r5.f210171a
            r9.f210169r = r1
            r9.f210168q = r4
            java.util.Map r4 = kotlin.collections.P0.c()
            com.avito.android.orders.feature.beduin_orders_list.i r6 = r5.f210173c
            java.lang.Object r10 = r10.a(r6, r4, r9)
            if (r10 != r0) goto L64
            return r0
        L64:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r4 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto L80
            com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$LoadingFailed r2 = new com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$LoadingFailed
            com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
            com.avito.android.remote.error.ApiError r10 = r10.getError()
            r2.<init>(r10)
            r9.f210169r = r7
            r9.f210168q = r3
            java.lang.Object r10 = r1.emit(r2, r9)
            if (r10 != r0) goto Lb6
            return r0
        L80:
            boolean r3 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r3 == 0) goto Lb6
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r10 = r10.getResult()
            com.avito.android.orders.api.model.BeduinOrdersResponse r10 = (com.avito.android.orders.api.model.BeduinOrdersResponse) r10
            com.avito.android.orders.feature.beduin_orders_list.f r3 = r5.f210172b
            a50.C19683a.a(r3, r10)
            com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$ContentLoaded r3 = new com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction$ContentLoaded
            java.lang.String r4 = r10.getTopFormId()
            java.lang.String r6 = r10.getMainFormId()
            java.lang.String r8 = r10.getBottomFormId()
            java.util.List r10 = r10.getOnRefreshScreenActions()
            r3.<init>(r4, r6, r8, r10)
            r9.f210169r = r7
            r9.f210168q = r2
            java.lang.Object r10 = r1.emit(r3, r9)
            if (r10 != r0) goto Lb1
            return r0
        Lb1:
            n50.b r10 = r5.f210174d
            r10.Y5()
        Lb6:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.orders.feature.beduin_orders_list.mvi.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
