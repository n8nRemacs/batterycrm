package com.avito.android.comfortable_deal.end_deal.mvi;

import Hp.InterfaceC14016a;
import Y41.p;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EndDealActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.end_deal.mvi.EndDealActor$process$3", f = "EndDealActor.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super EndDealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122300q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f122301r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14016a f122302s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Hp.c f122303t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f122304u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC14016a interfaceC14016a, Hp.c cVar, e eVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f122302s = interfaceC14016a;
        this.f122303t = cVar;
        this.f122304u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f122302s, this.f122303t, this.f122304u, continuation);
        cVar.f122301r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EndDealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
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
            int r1 = r6.f122300q
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.C42729a0.b(r7)
            goto L53
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f122301r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            Hp.a r1 = r6.f122302s
            Hp.a$b r1 = (Hp.InterfaceC14016a.b) r1
            com.avito.android.deep_linking.links.DeepLink r3 = r1.f7711a
            boolean r3 = r3 instanceof com.avito.android.comfortable_deal.deeplink.CommissionCalculationDetailsDeeplink
            if (r3 == 0) goto L42
            Hp.c r3 = r6.f122303t
            com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments r4 = r3.f7736f
            if (r4 == 0) goto L42
            com.avito.android.comfortable_deal.end_deal.mvi.e r4 = r6.f122304u
            com.avito.android.comfortable_deal.end_deal.interactor.a r4 = r4.f122309b
            r4.d()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "CommissionCalculationDetailsArguments"
            com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments r3 = r3.f7736f
            r4.putParcelable(r5, r3)
            goto L43
        L42:
            r4 = 0
        L43:
            com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction$OpenDeeplink r3 = new com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction$OpenDeeplink
            com.avito.android.deep_linking.links.DeepLink r1 = r1.f7711a
            r3.<init>(r1, r4)
            r6.f122300q = r2
            java.lang.Object r7 = r7.emit(r3, r6)
            if (r7 != r0) goto L53
            return r0
        L53:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
