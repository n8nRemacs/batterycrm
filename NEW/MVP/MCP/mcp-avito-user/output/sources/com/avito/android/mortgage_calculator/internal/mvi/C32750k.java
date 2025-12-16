package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
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
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$handleOfferDescriptionTabClicked$1", f = "CalculatorActor.kt", i = {}, l = {548}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32750k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CalculatorInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204652q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f204653r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b.g f204654s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32739a f204655t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E10.c f204656u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32750k(b.g gVar, C32739a c32739a, E10.c cVar, Continuation<? super C32750k> continuation) {
        super(2, continuation);
        this.f204654s = gVar;
        this.f204655t = c32739a;
        this.f204656u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32750k c32750k = new C32750k(this.f204654s, this.f204655t, this.f204656u, continuation);
        c32750k.f204653r = obj;
        return c32750k;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32750k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204652q;
        b.g gVar = this.f204654s;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f204653r;
            CalculatorInternalAction.UpdateOfferDescriptionTab updateOfferDescriptionTab = new CalculatorInternalAction.UpdateOfferDescriptionTab(gVar.f204577b);
            this.f204652q = 1;
            if (interfaceC43172j.emit(updateOfferDescriptionTab, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.f204655t.f204470c.h(this.f204656u, gVar.f204577b);
        return G0.f406611a;
    }
}
