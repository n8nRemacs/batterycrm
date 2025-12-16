package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.InterfaceC13362a;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealRoomActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomActor$processAction$1", f = "DealRoomActor.kt", i = {0}, l = {196, 197}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29854l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137703q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137704r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13362a.b f137705s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29854l(InterfaceC13362a.b bVar, Continuation<? super C29854l> continuation) {
        super(2, continuation);
        this.f137705s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29854l c29854l = new C29854l(this.f137705s, continuation);
        c29854l.f137704r = obj;
        return c29854l;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29854l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137703q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f137704r;
            DealRoomInternalAction.q qVar = new DealRoomInternalAction.q(((InterfaceC13362a.b.c) this.f137705s).f2741a);
            this.f137704r = interfaceC43172j;
            this.f137703q = 1;
            if (interfaceC43172j.emit(qVar, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f137704r;
            C42729a0.b(obj);
        }
        DealRoomInternalAction.m mVar = DealRoomInternalAction.m.f137670b;
        this.f137704r = null;
        this.f137703q = 2;
        if (interfaceC43172j.emit(mVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
