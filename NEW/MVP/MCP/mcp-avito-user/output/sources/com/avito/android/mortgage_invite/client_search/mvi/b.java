package com.avito.android.mortgage_invite.client_search.mvi;

import Y41.p;
import com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction;
import com.avito.android.mortgage_invite.client_search.mvi.entity.PagingState;
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

/* compiled from: ClientSearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_search.mvi.ClientSearchActor$process$2", f = "ClientSearchActor.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super ClientSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205413q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205414r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W10.c f205415s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f205416t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(W10.c cVar, d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f205415s = cVar;
        this.f205416t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f205415s, this.f205416t, continuation);
        bVar.f205414r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205413q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f205414r;
            W10.c cVar = this.f205415s;
            if (cVar.f17563f == PagingState.f205438c) {
                InterfaceC43160i interfaceC43160iA = this.f205416t.f205426a.a(cVar.f17562e.size(), cVar.f17561d);
                this.f205413q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
