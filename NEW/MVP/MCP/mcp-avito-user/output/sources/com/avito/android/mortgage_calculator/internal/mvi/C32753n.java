package com.avito.android.mortgage_calculator.internal.mvi;

import G10.a;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z10.C50349b;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$handleTeaserClick$1", f = "CalculatorActor.kt", i = {0}, l = {474}, m = "invokeSuspend", n = {"offerType"}, s = {"L$0"})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32753n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CalculatorInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204684q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f204685r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E10.c f204686s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32739a f204687t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32753n(E10.c cVar, C32739a c32739a, Continuation<? super C32753n> continuation) {
        super(2, continuation);
        this.f204686s = cVar;
        this.f204687t = c32739a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32753n c32753n = new C32753n(this.f204686s, this.f204687t, continuation);
        c32753n.f204685r = obj;
        return c32753n;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32753n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204684q;
        E10.c cVar = this.f204686s;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f204685r;
            a.C0325a c0325aA = cVar.f3689n.a();
            if (c0325aA == null) {
                return G0.f406611a;
            }
            C50349b c50349b = (C50349b) C42745f0.G(c0325aA.f6179d.f6191a);
            if (c50349b == null || (str = c50349b.f443772f) == null) {
                return G0.f406611a;
            }
            CalculatorInternalAction.OpenOfferDescription openOfferDescription = new CalculatorInternalAction.OpenOfferDescription(str);
            this.f204685r = str;
            this.f204684q = 1;
            if (interfaceC43172j.emit(openOfferDescription, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.f204685r;
            C42729a0.b(obj);
        }
        C32739a c32739a = this.f204687t;
        c32739a.f204470c.a(cVar, "program_card", str2);
        c32739a.f204470c.n(cVar);
        return G0.f406611a;
    }
}
