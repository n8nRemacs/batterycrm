package com.avito.android.comfortable_deal.deal.mvi;

import Ep.InterfaceC13517a;
import com.avito.android.comfortable_deal.api.model.CurrentStage;
import com.avito.android.comfortable_deal.deal.mvi.C29453a;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import com.avito.android.mortgage.deeplink.MortgageConsultationLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor$process$15", f = "DealActor.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f121668q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f121669r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13517a f121670s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C29453a f121671t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ep.c f121672u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC13517a interfaceC13517a, Ep.c cVar, C29453a c29453a, Continuation continuation) {
        super(2, continuation);
        this.f121670s = interfaceC13517a;
        this.f121671t = c29453a;
        this.f121672u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29453a c29453a = this.f121671t;
        h hVar = new h(this.f121670s, this.f121672u, c29453a, continuation);
        hVar.f121669r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f121668q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f121669r;
            String str = ((InterfaceC13517a.o) this.f121670s).f4284a;
            CurrentStage currentStage = this.f121672u.f4331h.f4332a;
            this.f121671t.getClass();
            int i13 = currentStage == null ? -1 : C29453a.C3595a.f121587a[currentStage.ordinal()];
            DealInternalAction.OpenDeepLink openDeepLink = new DealInternalAction.OpenDeepLink(new MortgageConsultationLink(null, str, i13 != 1 ? i13 != 2 ? null : "comfort_deal_buyer_found_banner" : "comfort_deal_buyer_search_banner", null), null, 2, 0 == true ? 1 : 0);
            this.f121668q = 1;
            if (interfaceC43172j.emit(openDeepLink, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
