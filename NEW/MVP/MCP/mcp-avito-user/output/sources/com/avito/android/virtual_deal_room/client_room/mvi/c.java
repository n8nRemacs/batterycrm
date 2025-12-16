package com.avito.android.virtual_deal_room.client_room.mvi;

import Y41.p;
import com.avito.android.virtual_deal_room.client_room.mvi.entity.ClientRoomInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientRoomActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.virtual_deal_room.client_room.mvi.ClientRoomActor$process$3", f = "ClientRoomActor.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super ClientRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f326351q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f326352r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EN0.c f326353s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f326354t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EN0.c cVar, e eVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f326353s = cVar;
        this.f326354t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f326353s, this.f326354t, continuation);
        cVar.f326352r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f326351q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f326352r;
            String str = this.f326353s.f3972h;
            if (str != null) {
                ClientRoomInternalAction.CallCopyClicked callCopyClicked = new ClientRoomInternalAction.CallCopyClicked(str);
                this.f326351q = 1;
                if (interfaceC43172j.emit(callCopyClicked, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        this.f326354t.f326361b.d();
        return G0.f406611a;
    }
}
