package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import Cw.InterfaceC13362a;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import com.avito.android.util.T2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealRoomActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomActor$process$10", f = "DealRoomActor.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29843a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137612q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137613r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C13364c f137614s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C29856n f137615t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13362a f137616u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29843a(InterfaceC13362a interfaceC13362a, C13364c c13364c, C29856n c29856n, Continuation continuation) {
        super(2, continuation);
        this.f137614s = c13364c;
        this.f137615t = c29856n;
        this.f137616u = interfaceC13362a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29843a c29843a = new C29843a(this.f137616u, this.f137614s, this.f137615t, continuation);
        c29843a.f137613r = obj;
        return c29843a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29843a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        GetDealRoomInfoResponse.ClientInfo client;
        String id2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137612q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137613r;
            GetDealRoomInfoResponse getDealRoomInfoResponse = (GetDealRoomInfoResponse) T2.a(this.f137614s.f2779b);
            if (getDealRoomInfoResponse == null || (client = getDealRoomInfoResponse.getClient()) == null || (id2 = client.getId()) == null) {
                return G0.f406611a;
            }
            C29856n c29856n = this.f137615t;
            c29856n.f137711b.b(id2);
            InterfaceC43160i<DealRoomInternalAction> interfaceC43160iC = c29856n.f137710a.c(((InterfaceC13362a.q) this.f137616u).f2758a);
            this.f137612q = 1;
            if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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
