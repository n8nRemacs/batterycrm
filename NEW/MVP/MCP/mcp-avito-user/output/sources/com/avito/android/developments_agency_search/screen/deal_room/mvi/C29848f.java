package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
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
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealRoomActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomActor$process$4", f = "DealRoomActor.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29848f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137676q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137677r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C13364c f137678s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29848f(C13364c c13364c, Continuation<? super C29848f> continuation) {
        super(2, continuation);
        this.f137678s = c13364c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29848f c29848f = new C29848f(this.f137678s, continuation);
        c29848f.f137677r = obj;
        return c29848f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29848f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        GetDealRoomInfoResponse.ClientInfo client;
        List<GetDealRoomInfoResponse.Deal> deals;
        GetDealRoomInfoResponse.Deal deal;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137676q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137677r;
            C13364c c13364c = this.f137678s;
            GetDealRoomInfoResponse getDealRoomInfoResponse = (GetDealRoomInfoResponse) T2.a(c13364c.f2779b);
            DeepLink preferencesUri = (getDealRoomInfoResponse == null || (deals = getDealRoomInfoResponse.getDeals()) == null || (deal = (GetDealRoomInfoResponse.Deal) C42745f0.G(deals)) == null) ? null : deal.getPreferencesUri();
            ItemsSearchLink itemsSearchLink = preferencesUri instanceof ItemsSearchLink ? (ItemsSearchLink) preferencesUri : null;
            GetDealRoomInfoResponse getDealRoomInfoResponse2 = (GetDealRoomInfoResponse) T2.a(c13364c.f2779b);
            DealRoomInternalAction.k kVar = new DealRoomInternalAction.k(itemsSearchLink != null ? itemsSearchLink.f133403b : null, (getDealRoomInfoResponse2 == null || (client = getDealRoomInfoResponse2.getClient()) == null) ? null : client.getId());
            this.f137676q = 1;
            if (interfaceC43172j.emit(kVar, this) == coroutine_suspended) {
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
