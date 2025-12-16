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
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomActor$process$9", f = "DealRoomActor.kt", i = {0, 0, 0}, l = {140, 141}, m = "invokeSuspend", n = {"$this$flow", "dealId", "clientId"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29853k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f137696q;

    /* renamed from: r, reason: collision with root package name */
    public String f137697r;

    /* renamed from: s, reason: collision with root package name */
    public int f137698s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f137699t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C13364c f137700u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C29856n f137701v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13362a f137702w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29853k(InterfaceC13362a interfaceC13362a, C13364c c13364c, C29856n c29856n, Continuation continuation) {
        super(2, continuation);
        this.f137700u = c13364c;
        this.f137701v = c29856n;
        this.f137702w = interfaceC13362a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29853k c29853k = new C29853k(this.f137702w, this.f137700u, this.f137701v, continuation);
        c29853k.f137699t = obj;
        return c29853k;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29853k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        List<GetDealRoomInfoResponse.Deal> deals;
        GetDealRoomInfoResponse.Deal deal;
        String id2;
        GetDealRoomInfoResponse.ClientInfo client;
        String id3;
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137698s;
        InterfaceC13362a interfaceC13362a = this.f137702w;
        C29856n c29856n = this.f137701v;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f137699t;
            C13364c c13364c = this.f137700u;
            GetDealRoomInfoResponse getDealRoomInfoResponse = (GetDealRoomInfoResponse) T2.a(c13364c.f2779b);
            if (getDealRoomInfoResponse == null || (deals = getDealRoomInfoResponse.getDeals()) == null || (deal = (GetDealRoomInfoResponse.Deal) C42745f0.G(deals)) == null || (id2 = deal.getId()) == null) {
                return G0.f406611a;
            }
            GetDealRoomInfoResponse getDealRoomInfoResponse2 = (GetDealRoomInfoResponse) T2.a(c13364c.f2779b);
            if (getDealRoomInfoResponse2 == null || (client = getDealRoomInfoResponse2.getClient()) == null || (id3 = client.getId()) == null) {
                return G0.f406611a;
            }
            c29856n.f137711b.f(((InterfaceC13362a.i) interfaceC13362a).f2750b, id3);
            DealRoomInternalAction.q qVar = new DealRoomInternalAction.q(null);
            this.f137699t = interfaceC43172j;
            this.f137696q = id2;
            this.f137697r = id3;
            this.f137698s = 1;
            if (interfaceC43172j.emit(qVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = id2;
            str2 = id3;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            str2 = this.f137697r;
            str = this.f137696q;
            interfaceC43172j = (InterfaceC43172j) this.f137699t;
            C42729a0.b(obj);
        }
        InterfaceC13362a.i iVar = (InterfaceC13362a.i) interfaceC13362a;
        InterfaceC43160i interfaceC43160iD = c29856n.f137710a.d(iVar.f2749a, str, str2, iVar.f2750b);
        this.f137699t = null;
        this.f137696q = null;
        this.f137697r = null;
        this.f137698s = 2;
        if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
