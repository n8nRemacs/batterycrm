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
@DebugMetadata(c = "com.avito.android.virtual_deal_room.client_room.mvi.ClientRoomActor$process$2", f = "ClientRoomActor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super ClientRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f326346q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f326347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ EN0.c f326348s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f326349t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EN0.c cVar, e eVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f326348s = cVar;
        this.f326349t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f326348s, this.f326349t, continuation);
        bVar.f326347r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f326346q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f326347r;
            EN0.c cVar = this.f326348s;
            String str = cVar.f3973i;
            if (str == null) {
                str = "";
            }
            String str2 = cVar.f3974j;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = cVar.f3975k;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = cVar.f3976l;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = cVar.f3972h;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = cVar.f3977m;
            ClientRoomInternalAction.EditClicked editClicked = new ClientRoomInternalAction.EditClicked(str, str2, str3, str4, str5, str6 == null ? "" : str6);
            this.f326346q = 1;
            if (interfaceC43172j.emit(editClicked, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.f326349t.f326361b.c();
        return G0.f406611a;
    }
}
