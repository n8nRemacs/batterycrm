package com.avito.android.virtual_deal_room_client_creation.clients.mvi;

import NN0.a;
import Y41.p;
import com.avito.android.virtual_deal_room_client_creation.clients.mvi.entity.ClientsInternalAction;
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

/* compiled from: ClientsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.mvi.ClientsActor$process$1", f = "ClientsActor.kt", i = {0}, l = {35, 36}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ClientsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f326637q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f326638r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NN0.a f326639s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f326640t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NN0.a aVar, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f326639s = aVar;
        this.f326640t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f326639s, this.f326640t, continuation);
        aVar.f326638r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f326637q;
        NN0.a aVar = this.f326639s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f326638r;
            ClientsInternalAction.SearchInput searchInput = new ClientsInternalAction.SearchInput(((a.e) aVar).f11398a);
            this.f326638r = interfaceC43172j;
            this.f326637q = 1;
            if (interfaceC43172j.emit(searchInput, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f326638r;
            C42729a0.b(obj);
        }
        InterfaceC43160i<ClientsInternalAction> interfaceC43160iA = this.f326640t.f326641a.a(((a.e) aVar).f11398a);
        this.f326638r = null;
        this.f326637q = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
