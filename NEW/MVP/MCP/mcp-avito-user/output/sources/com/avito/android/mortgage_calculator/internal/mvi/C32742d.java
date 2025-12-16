package com.avito.android.mortgage_calculator.internal.mvi;

import D10.a;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import com.avito.android.mortgage_calculator.model.MortgageCalculatorConfig;
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

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$applyConfig$1", f = "CalculatorActor.kt", i = {}, l = {285}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32742d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204507q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f204508r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204509s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.C32744a f204510t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C32739a f204511u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32742d(b.C32744a c32744a, C32739a c32739a, Continuation<? super C32742d> continuation) {
        super(3, continuation);
        this.f204510t = c32744a;
        this.f204511u = c32739a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        C32742d c32742d = new C32742d(this.f204510t, this.f204511u, continuation);
        c32742d.f204508r = interfaceC43172j;
        c32742d.f204509s = lVar;
        return c32742d.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204507q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f204508r;
            com.avito.android.arch.mvi.utils.l lVar = this.f204509s;
            D10.a aVar = (D10.a) lVar.getValue();
            b.C32744a c32744a = this.f204510t;
            MortgageCalculatorConfig mortgageCalculatorConfig = c32744a.f204568b;
            if (kotlin.jvm.internal.L.f(aVar.f2852i, mortgageCalculatorConfig.f204836b) && kotlin.jvm.internal.L.f(aVar.f2853j, mortgageCalculatorConfig.f204837c)) {
                return G0.f406611a;
            }
            a.C0143a c0143a = D10.a.f2843o;
            C32739a c32739a = this.f204511u;
            E10.c cVarA = c32739a.f204468a.a();
            c0143a.getClass();
            D10.a aVarA = a.C0143a.a(cVarA);
            String str = mortgageCalculatorConfig.f204836b;
            String str2 = mortgageCalculatorConfig.f204841g;
            lVar.setValue(D10.a.a(aVarA, null, null, null, null, 0L, null, null, null, str, mortgageCalculatorConfig.f204837c, mortgageCalculatorConfig.f204838d, mortgageCalculatorConfig.f204839e, mortgageCalculatorConfig.f204840f, str2 == null ? str : str2, 255));
            c32739a.f204475h.b(null, ((D10.a) lVar.getValue()).f2853j);
            String str3 = ((D10.a) lVar.getValue()).f2853j;
            com.avito.android.mortgage_calculator.data.a aVar2 = c32739a.f204474g;
            aVar2.b(null, str3);
            aVar2.a(null, ((D10.a) lVar.getValue()).f2853j);
            InterfaceC43160i<CalculatorInternalAction> interfaceC43160iB = c32739a.f204472e.b(c32744a.f204568b);
            this.f204508r = null;
            this.f204507q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
