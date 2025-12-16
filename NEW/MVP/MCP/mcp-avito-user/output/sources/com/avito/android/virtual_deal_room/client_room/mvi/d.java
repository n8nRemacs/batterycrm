package com.avito.android.virtual_deal_room.client_room.mvi;

import EN0.a;
import Y41.p;
import com.avito.android.virtual_deal_room.client_room.mvi.entity.ClientRoomInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientRoomActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.virtual_deal_room.client_room.mvi.ClientRoomActor$process$4", f = "ClientRoomActor.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super ClientRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f326355q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f326356r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EN0.c f326357s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ EN0.a f326358t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f326359u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EN0.c cVar, EN0.a aVar, e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f326357s = cVar;
        this.f326358t = aVar;
        this.f326359u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f326357s, this.f326358t, this.f326359u, continuation);
        dVar.f326356r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f326355q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f326356r;
            DN0.b bVar = this.f326357s.f3968d;
            a.i iVar = (a.i) this.f326358t;
            if (!L.f(bVar, iVar.f3953a)) {
                ClientRoomInternalAction.TabSelect tabSelect = new ClientRoomInternalAction.TabSelect(iVar.f3953a);
                this.f326355q = 1;
                if (interfaceC43172j.emit(tabSelect, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        this.f326359u.f326361b.a();
        return G0.f406611a;
    }
}
