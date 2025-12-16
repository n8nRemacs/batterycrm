package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.arch.mvi.utils.o;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$flowWithMutablePrivateStateAccess$1", f = "CalculatorActor.kt", i = {}, l = {702}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32746g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CalculatorInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204629q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f204630r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> f204631s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f204632t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D10.c f204633u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32746g(Y41.q qVar, com.avito.android.arch.mvi.utils.o oVar, D10.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f204631s = qVar;
        this.f204632t = oVar;
        this.f204633u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32746g c32746g = new C32746g(this.f204631s, this.f204632t, this.f204633u, continuation);
        c32746g.f204630r = obj;
        return c32746g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32746g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204629q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j = (InterfaceC43172j) this.f204630r;
            o.a aVar = this.f204632t.f92114c;
            this.f204629q = 1;
            if (((x) this.f204631s).invoke(interfaceC43172j, aVar, this) == coroutine_suspended) {
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
