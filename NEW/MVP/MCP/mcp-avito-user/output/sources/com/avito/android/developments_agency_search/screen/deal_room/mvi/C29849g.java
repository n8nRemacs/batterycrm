package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import Cw.InterfaceC13362a;
import com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction;
import java.util.Set;
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
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room.mvi.DealRoomActor$process$5", f = "DealRoomActor.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29849g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137679q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137680r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C13364c f137681s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13362a f137682t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C29856n f137683u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29849g(InterfaceC13362a interfaceC13362a, C13364c c13364c, C29856n c29856n, Continuation continuation) {
        super(2, continuation);
        this.f137681s = c13364c;
        this.f137682t = interfaceC13362a;
        this.f137683u = c29856n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29849g c29849g = new C29849g(this.f137682t, this.f137681s, this.f137683u, continuation);
        c29849g.f137680r = obj;
        return c29849g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29849g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137679q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137680r;
            Set<String> set = this.f137681s.f2780c;
            InterfaceC13362a.e eVar = (InterfaceC13362a.e) this.f137682t;
            if (!set.contains(eVar.f2745a)) {
                this.f137683u.f137711b.d(eVar.f2745a);
            }
            DealRoomInternalAction.p pVar = new DealRoomInternalAction.p(eVar.f2745a);
            this.f137679q = 1;
            if (interfaceC43172j.emit(pVar, this) == coroutine_suspended) {
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
