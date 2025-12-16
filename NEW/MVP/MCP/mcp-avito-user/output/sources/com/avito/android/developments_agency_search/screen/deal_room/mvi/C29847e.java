package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import Cw.InterfaceC13362a;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import com.avito.android.util.T2;
import java.util.List;
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

/* compiled from: DealRoomActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomActor$process$3", f = "DealRoomActor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29847e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137627q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137628r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C13364c f137629s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C29856n f137630t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13362a f137631u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29847e(InterfaceC13362a interfaceC13362a, C13364c c13364c, C29856n c29856n, Continuation continuation) {
        super(2, continuation);
        this.f137629s = c13364c;
        this.f137630t = c29856n;
        this.f137631u = interfaceC13362a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29847e c29847e = new C29847e(this.f137631u, this.f137629s, this.f137630t, continuation);
        c29847e.f137628r = obj;
        return c29847e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29847e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<GetDealRoomInfoResponse.Deal> deals;
        GetDealRoomInfoResponse.Deal deal;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137627q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137628r;
            GetDealRoomInfoResponse getDealRoomInfoResponse = (GetDealRoomInfoResponse) T2.a(this.f137629s.f2779b);
            if (getDealRoomInfoResponse == null || (deals = getDealRoomInfoResponse.getDeals()) == null || (deal = (GetDealRoomInfoResponse.Deal) C42745f0.G(deals)) == null) {
                return G0.f406611a;
            }
            u uVar = this.f137630t.f137710a;
            String id2 = deal.getId();
            String str = ((InterfaceC13362a.h) this.f137631u).f2748a;
            String notes = deal.getNotes();
            if (notes == null) {
                notes = "";
            }
            InterfaceC43160i<DealRoomInternalAction> interfaceC43160iG = uVar.g(id2, str, notes);
            this.f137627q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
