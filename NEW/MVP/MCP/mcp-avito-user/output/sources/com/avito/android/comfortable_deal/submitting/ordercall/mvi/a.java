package com.avito.android.comfortable_deal.submitting.ordercall.mvi;

import Y41.p;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallInternalAction;
import com.avito.android.util.C5;
import jq.InterfaceC42413a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OrderCallActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.submitting.ordercall.mvi.OrderCallActor$process$1", f = "OrderCallActor.kt", i = {}, l = {32, 33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super OrderCallInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f123045q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f123046r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42413a f123047s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC42413a interfaceC42413a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f123047s = interfaceC42413a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f123047s, continuation);
        aVar.f123046r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OrderCallInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f123045q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f123046r;
            InterfaceC42413a.c cVar = (InterfaceC42413a.c) this.f123047s;
            boolean zE2 = C5.f318568b.e(cVar.f405821a);
            if (zE2) {
                OrderCallInternalAction.PhoneInputCorrect phoneInputCorrect = new OrderCallInternalAction.PhoneInputCorrect(cVar.f405821a);
                this.f123045q = 1;
                if (interfaceC43172j.emit(phoneInputCorrect, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (!zE2) {
                OrderCallInternalAction.PhoneInputError phoneInputError = new OrderCallInternalAction.PhoneInputError(cVar.f405821a);
                this.f123045q = 2;
                if (interfaceC43172j.emit(phoneInputError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
