package com.avito.android.publish.free_delivery.mvi;

import com.avito.android.publish.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import ge0.C40669a;
import he0.C40926c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FreeDeliveryActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.free_delivery.mvi.FreeDeliveryActor$process$8", f = "FreeDeliveryActor.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FreeDeliveryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f235840q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f235841r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C40926c f235842s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C40926c c40926c, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f235842s = c40926c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f235842s, continuation);
        hVar.f235841r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FreeDeliveryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f235840q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f235841r;
            C40926c c40926c = this.f235842s;
            C40669a c40669a = c40926c.f397338j;
            if ((c40669a != null ? c40669a.f396665n : null) != null && !c40926c.f397341m) {
                FreeDeliveryInternalAction.ShowToast showToast = new FreeDeliveryInternalAction.ShowToast(c40669a.f396665n);
                this.f235840q = 1;
                if (interfaceC43172j.emit(showToast, this) == coroutine_suspended) {
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
