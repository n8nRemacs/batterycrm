package com.avito.android.developments_advice.data;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.developments_advice.mvi.entity.DevelopmentsAdviceInternalAction;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ow.InterfaceC44946a;

/* compiled from: ConsultationFormInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_advice.data.ConsultationFormInteractorImpl$getContactInfo$2", f = "ConsultationFormInteractor.kt", i = {0}, l = {60, 62, 66}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super DevelopmentsAdviceInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f135972q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f135973r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f135974s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f135974s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f135974s, continuation);
        bVar.f135973r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DevelopmentsAdviceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f135972q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f135973r;
            InterfaceC44946a interfaceC44946a = this.f135974s.f135987a;
            this.f135973r = interfaceC43172j;
            this.f135972q = 1;
            obj = interfaceC44946a.c(null, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f135973r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            DevelopmentsAdviceInternalAction.LoadingComplete loadingComplete = new DevelopmentsAdviceInternalAction.LoadingComplete((ContactInfoResponse) ((TypedResult.Success) typedResult).getResult());
            this.f135973r = null;
            this.f135972q = 2;
            if (interfaceC43172j.emit(loadingComplete, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (typedResult instanceof TypedResult.Error) {
            DevelopmentsAdviceInternalAction.LoadingError loadingError = new DevelopmentsAdviceInternalAction.LoadingError(((TypedResult.Error) typedResult).getError());
            this.f135973r = null;
            this.f135972q = 3;
            if (interfaceC43172j.emit(loadingError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
