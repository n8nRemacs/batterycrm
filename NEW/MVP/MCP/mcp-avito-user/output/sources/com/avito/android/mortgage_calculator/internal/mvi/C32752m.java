package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import x10.C49742a;

/* compiled from: CalculatorActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$handleSecondaryButtonClick$1", f = "CalculatorActor.kt", i = {}, l = {594}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32752m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CalculatorInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204661q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f204662r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E10.c f204663s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32752m(E10.c cVar, Continuation<? super C32752m> continuation) {
        super(2, continuation);
        this.f204663s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32752m c32752m = new C32752m(this.f204663s, continuation);
        c32752m.f204662r = obj;
        return c32752m;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32752m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink deepLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204661q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f204662r;
            C49742a c49742a = this.f204663s.f3691p;
            if (c49742a != null && (deepLink = c49742a.f442081b) != null) {
                CalculatorInternalAction.HandleDeeplink handleDeeplink = new CalculatorInternalAction.HandleDeeplink(deepLink);
                this.f204661q = 1;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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
