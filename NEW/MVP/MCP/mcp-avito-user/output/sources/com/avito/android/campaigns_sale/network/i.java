package com.avito.android.campaigns_sale.network;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$pollItemsV1$1", f = "CampaignsSaleInteractorImpl.kt", i = {0, 1}, l = {113, 116, 117, 119, 124}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114363q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114364r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f114365s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Boolean f114366t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, Boolean bool, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f114365s = hVar;
        this.f114366t = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f114365s, this.f114366t, continuation);
        iVar.f114364r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f114363q
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            com.avito.android.campaigns_sale.network.h r7 = r11.f114365s
            r8 = 1
            if (r1 == 0) goto L38
            if (r1 == r8) goto L30
            if (r1 == r6) goto L28
            if (r1 == r5) goto L23
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            goto L23
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            kotlin.C42729a0.b(r12)
            goto Lbf
        L28:
            java.lang.Object r1 = r11.f114364r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
            goto L7c
        L30:
            java.lang.Object r1 = r11.f114364r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
            goto L5b
        L38:
            kotlin.C42729a0.b(r12)
            java.lang.Object r12 = r11.f114364r
            kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
            h31.e<om.a> r1 = r7.f114335b
            java.lang.Object r1 = r1.get()
            om.a r1 = (om.InterfaceC44818a) r1
            com.avito.android.campaigns_sale.model.CampaignsSaleArguments r9 = r7.f114334a
            java.lang.String r9 = r9.f114050b
            r11.f114364r = r12
            r11.f114363q = r8
            java.lang.Boolean r8 = r11.f114366t
            java.lang.Object r1 = r1.k(r9, r8, r11)
            if (r1 != r0) goto L58
            return r0
        L58:
            r10 = r1
            r1 = r12
            r12 = r10
        L5b:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r8 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto La5
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r3 = r12.getResult()
            com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleItemsResult r3 = (com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleItemsResult) r3
            boolean r3 = r3.getLoading()
            if (r3 == 0) goto L8b
            r11.f114364r = r1
            r11.f114363q = r6
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r12 = kotlinx.coroutines.C43131e0.b(r3, r11)
            if (r12 != r0) goto L7c
            return r0
        L7c:
            kotlinx.coroutines.flow.i r12 = r7.h(r2)
            r11.f114364r = r2
            r11.f114363q = r5
            java.lang.Object r12 = kotlinx.coroutines.flow.C43175k.u(r11, r12, r1)
            if (r12 != r0) goto Lbf
            return r0
        L8b:
            com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$ItemMinDiscountPairsLoaded r3 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$ItemMinDiscountPairsLoaded
            java.lang.Object r12 = r12.getResult()
            com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleItemsResult r12 = (com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleItemsResult) r12
            java.util.List r12 = r12.c()
            r3.<init>(r12)
            r11.f114364r = r2
            r11.f114363q = r4
            java.lang.Object r12 = r1.emit(r3, r11)
            if (r12 != r0) goto Lbf
            return r0
        La5:
            boolean r4 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto Lbf
            com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$HandleApiError r4 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$HandleApiError
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r12 = r12.getError()
            r4.<init>(r12)
            r11.f114364r = r2
            r11.f114363q = r3
            java.lang.Object r12 = r1.emit(r4, r11)
            if (r12 != r0) goto Lbf
            return r0
        Lbf:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.network.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
