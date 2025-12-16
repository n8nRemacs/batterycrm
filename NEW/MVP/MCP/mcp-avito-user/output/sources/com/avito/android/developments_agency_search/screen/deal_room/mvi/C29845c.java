package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
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
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomActor$process$1", f = "DealRoomActor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29845c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137620q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137621r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29856n f137622s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C13364c f137623t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29845c(C29856n c29856n, C13364c c13364c, Continuation<? super C29845c> continuation) {
        super(2, continuation);
        this.f137622s = c29856n;
        this.f137623t = c13364c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29845c c29845c = new C29845c(this.f137622s, this.f137623t, continuation);
        c29845c.f137621r = obj;
        return c29845c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29845c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137620q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137621r;
            InterfaceC43160i<DealRoomInternalAction> interfaceC43160iB = this.f137622s.f137710a.b(!this.f137623t.f2783f);
            this.f137620q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
