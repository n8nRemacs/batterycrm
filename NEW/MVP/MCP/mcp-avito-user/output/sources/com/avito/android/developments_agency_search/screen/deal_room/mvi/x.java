package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealRoomInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomInteractorImpl$onFirstSuccessfulLoading$1", f = "DealRoomInteractor.kt", i = {0}, l = {110, 118}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class x extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137786q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137787r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GetDealRoomInfoResponse f137788s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f137789t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(GetDealRoomInfoResponse getDealRoomInfoResponse, v vVar, Continuation<? super x> continuation) {
        super(2, continuation);
        this.f137788s = getDealRoomInfoResponse;
        this.f137789t = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        x xVar = new x(this.f137788s, this.f137789t, continuation);
        xVar.f137787r = obj;
        return xVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((x) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        GetDealRoomInfoResponse.Deal.Progress progress;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137786q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f137787r;
            DealRoomInternalAction.i iVar = DealRoomInternalAction.i.f137664b;
            this.f137787r = interfaceC43172j;
            this.f137786q = 1;
            if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f137787r;
            C42729a0.b(obj);
        }
        GetDealRoomInfoResponse getDealRoomInfoResponse = this.f137788s;
        GetDealRoomInfoResponse.Deal deal = (GetDealRoomInfoResponse.Deal) C42745f0.G(getDealRoomInfoResponse.getDeals());
        GetDealRoomInfoResponse.Deal.Progress.State currentState = (deal == null || (progress = deal.getProgress()) == null) ? null : progress.getCurrentState();
        v vVar = this.f137789t;
        if (currentState != null) {
            vVar.f137733f.a(deal.getProgress().getCurrentState(), getDealRoomInfoResponse.getClient().getId());
        }
        if ((deal != null ? deal.getId() : null) != null) {
            InterfaceC43160i interfaceC43160iI = C43175k.I(vVar.f137730c.a(), C43175k.G(new w(vVar, deal.getId(), null)));
            this.f137787r = null;
            this.f137786q = 2;
            if (C43175k.u(this, interfaceC43160iI, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
