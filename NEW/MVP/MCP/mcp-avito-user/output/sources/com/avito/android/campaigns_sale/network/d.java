package com.avito.android.campaigns_sale.network;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.network.CampaignsSaleInteractorImpl$enterSaleV1$1", f = "CampaignsSaleInteractorImpl.kt", i = {0, 1, 2}, l = {229, 231, 239, 240, 244}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114318q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114319r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f114320s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f114321t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ DeepLink f114322u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, ArrayList arrayList, DeepLink deepLink, Continuation continuation) {
        super(2, continuation);
        this.f114320s = hVar;
        this.f114321t = arrayList;
        this.f114322u = deepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f114320s, this.f114321t, this.f114322u, continuation);
        dVar.f114319r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
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
            int r1 = r11.f114318q
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            com.avito.android.campaigns_sale.network.h r8 = r11.f114320s
            if (r1 == 0) goto L41
            if (r1 == r7) goto L39
            if (r1 == r6) goto L31
            if (r1 == r5) goto L28
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
            goto Lce
        L28:
            java.lang.Object r1 = r11.f114319r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
            goto La5
        L31:
            java.lang.Object r1 = r11.f114319r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
            goto L7f
        L39:
            java.lang.Object r1 = r11.f114319r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r12)
            goto L59
        L41:
            kotlin.C42729a0.b(r12)
            java.lang.Object r12 = r11.f114319r
            r1 = r12
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$PageLoading r12 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$PageLoading
            r12.<init>()
            r11.f114319r = r1
            r11.f114318q = r7
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto L59
            return r0
        L59:
            h31.e<om.a> r12 = r8.f114335b
            java.lang.Object r12 = r12.get()
            om.a r12 = (om.InterfaceC44818a) r12
            com.avito.android.campaigns_sale.model.CampaignsSaleArguments r7 = r8.f114334a
            java.lang.String r7 = r7.f114050b
            com.avito.android.util.A4 r9 = com.avito.android.util.A4.f318516a
            java.util.ArrayList r10 = r11.f114321t
            r9.getClass()
            java.lang.String r9 = "blocks"
            java.util.Map r9 = com.avito.android.util.A4.h(r10, r9)
            r11.f114319r = r1
            r11.f114318q = r6
            java.lang.String r6 = r8.f114338e
            java.lang.Object r12 = r12.c(r7, r6, r9, r11)
            if (r12 != r0) goto L7f
            return r0
        L7f:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r6 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto Lb4
            com.avito.android.deep_linking.links.DeepLink r3 = r11.f114322u
            if (r3 != 0) goto L95
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r12 = r12.getResult()
            pm.d r12 = (pm.C47113d) r12
            com.avito.android.deep_linking.links.DeepLink r3 = r12.getDeeplink()
        L95:
            com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$HandleDeepLink r12 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$HandleDeepLink
            r12.<init>(r3)
            r11.f114319r = r1
            r11.f114318q = r5
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto La5
            return r0
        La5:
            kotlinx.coroutines.flow.i r12 = com.avito.android.campaigns_sale.network.h.g(r8)
            r11.f114319r = r2
            r11.f114318q = r4
            java.lang.Object r12 = kotlinx.coroutines.flow.C43175k.u(r11, r12, r1)
            if (r12 != r0) goto Lce
            return r0
        Lb4:
            boolean r4 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r4 == 0) goto Lce
            com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$HandleApiError r4 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$HandleApiError
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r12 = r12.getError()
            r4.<init>(r12)
            r11.f114319r = r2
            r11.f114318q = r3
            java.lang.Object r12 = r1.emit(r4, r11)
            if (r12 != r0) goto Lce
            return r0
        Lce:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.network.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
