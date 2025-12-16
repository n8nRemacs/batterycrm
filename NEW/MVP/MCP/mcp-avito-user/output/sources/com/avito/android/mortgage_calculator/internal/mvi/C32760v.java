package com.avito.android.mortgage_calculator.internal.mvi;

import F10.a;
import com.avito.android.mortgage_calculator.internal.mvi.C32739a;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import y10.C50037b;

/* compiled from: CalculatorActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$b;", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "<name for destructuring parameter 0>", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$process$5", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32760v extends SuspendLambda implements Y41.p<kotlin.Q<? extends C32739a.b, ? extends InterfaceC43160i<? extends CalculatorInternalAction>>, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f204710q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32739a f204711r;

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$process$5$invokeSuspend$$inlined$flatMapLatest$1", f = "CalculatorActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.v$a */
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, CalculatorInternalAction, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f204712q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f204713r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f204714s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C32739a f204715t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C32739a c32739a, Continuation continuation) {
            super(3, continuation);
            this.f204715t = c32739a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, CalculatorInternalAction calculatorInternalAction, Continuation<? super G0> continuation) {
            a aVar = new a(this.f204715t, continuation);
            aVar.f204713r = interfaceC43172j;
            aVar.f204714s = calculatorInternalAction;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43160i<CalculatorInternalAction> interfaceC43160iW;
            C50037b c50037b;
            y10.e eVar;
            C50037b c50037b2;
            y10.e eVar2;
            C50037b c50037b3;
            y10.e eVar3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f204712q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f204713r;
                CalculatorInternalAction calculatorInternalAction = (CalculatorInternalAction) this.f204714s;
                if (calculatorInternalAction instanceof CalculatorInternalAction.LoadOffers) {
                    D10.a aVar = ((CalculatorInternalAction.LoadOffers) calculatorInternalAction).f204557b;
                    C32739a c32739a = this.f204715t;
                    F10.a aVarB = aVar.b();
                    CalculatorTabType f4484f = aVarB.getF4484f();
                    a.b bVarA = F10.b.a(aVarB);
                    Long lValueOf = (bVarA == null || (c50037b3 = bVarA.f4480b) == null || (eVar3 = c50037b3.f442846e) == null) ? null : Long.valueOf(eVar3.f442853b);
                    a.b bVarA2 = F10.b.a(aVarB);
                    Long lValueOf2 = (bVarA2 == null || (c50037b2 = bVarA2.f4481c) == null || (eVar2 = c50037b2.f442846e) == null) ? null : Long.valueOf(eVar2.f442853b);
                    a.C0271a c0271a = aVarB instanceof a.C0271a ? (a.C0271a) aVarB : null;
                    interfaceC43160iW = c32739a.f204473f.a(f4484f, aVar.f2852i, aVar.f2853j, aVar.f2848e, aVar.f2847d, lValueOf, lValueOf2, (c0271a == null || (c50037b = c0271a.f4475b) == null || (eVar = c50037b.f442846e) == null) ? null : Long.valueOf(eVar.f442853b), aVarB.getF4482d().f442846e.f442853b, aVar.f2846c.a());
                } else {
                    interfaceC43160iW = C43175k.w();
                }
                this.f204712q = 1;
                if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32760v(C32739a c32739a, Continuation<? super C32760v> continuation) {
        super(2, continuation);
        this.f204711r = c32739a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32760v c32760v = new C32760v(this.f204711r, continuation);
        c32760v.f204710q = obj;
        return c32760v;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends C32739a.b, ? extends InterfaceC43160i<? extends CalculatorInternalAction>> q12, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>> continuation) {
        return ((C32760v) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f204710q;
        C32739a.b bVar = (C32739a.b) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        if (bVar instanceof C32739a.b.C6095a) {
            return interfaceC43160i;
        }
        if (bVar instanceof C32739a.b.C6096b) {
            return C43175k.Y(interfaceC43160i, new a(this.f204711r, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
