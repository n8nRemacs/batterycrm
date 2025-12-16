package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PersonFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction$CloseFlow;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$closeFlowClick$1", f = "PersonFormActor.kt", i = {}, l = {440}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.person_form.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32651c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PersonFormInternalAction.CloseFlow>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201030q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201031r;

    public C32651c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32651c c32651c = new C32651c(2, continuation);
        c32651c.f201031r = obj;
        return c32651c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PersonFormInternalAction.CloseFlow> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32651c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201030q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201031r;
            PersonFormInternalAction.CloseFlow closeFlow = PersonFormInternalAction.CloseFlow.f201176b;
            this.f201030q = 1;
            if (interfaceC43172j.emit(closeFlow, this) == coroutine_suspended) {
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
