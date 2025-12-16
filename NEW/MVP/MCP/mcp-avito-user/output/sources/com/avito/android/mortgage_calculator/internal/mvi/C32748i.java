package com.avito.android.mortgage_calculator.internal.mvi;

import G10.a;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.CalculatorField;
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
import z10.C50352e;
import z10.InterfaceC50351d;
import z10.InterfaceC50353f;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$handleOfferActionClicked$1", f = "CalculatorActor.kt", i = {}, l = {504}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32748i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204639q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f204640r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204641s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ E10.c f204642t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C32739a f204643u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b.e f204644v;

    /* compiled from: CalculatorActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz10/d;", "it", "", "invoke", "(Lz10/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.i$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC50351d, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b.e f204645l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.e eVar) {
            super(1);
            this.f204645l = eVar;
        }

        @Override // Y41.l
        public final Boolean invoke(InterfaceC50351d interfaceC50351d) {
            return Boolean.valueOf(kotlin.jvm.internal.L.f(interfaceC50351d.getF443779b(), this.f204645l.f204575b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32748i(E10.c cVar, C32739a c32739a, b.e eVar, Continuation<? super C32748i> continuation) {
        super(3, continuation);
        this.f204642t = cVar;
        this.f204643u = c32739a;
        this.f204644v = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        C32748i c32748i = new C32748i(this.f204642t, this.f204643u, this.f204644v, continuation);
        c32748i.f204640r = interfaceC43172j;
        c32748i.f204641s = lVar;
        return c32748i.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204639q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f204640r;
            com.avito.android.arch.mvi.utils.l lVar = this.f204641s;
            D10.a aVar = (D10.a) lVar.getValue();
            a.C0325a c0325aA = this.f204642t.f3689n.a();
            b.e eVar = this.f204644v;
            InterfaceC50351d.a aVarA = c0325aA != null ? C50352e.a(new a(eVar), c0325aA.f6178c) : null;
            InterfaceC50353f.b bVarA = aVarA != null ? aVarA.f443778a.a() : null;
            if (bVarA == null) {
                return G0.f406611a;
            }
            A10.a aVar2 = bVarA.f443785c;
            CalculatorField calculatorField = aVar2.f46b;
            long j12 = aVar2.f49e;
            C32739a c32739a = this.f204643u;
            lVar.setValue(C32739a.c(c32739a, aVar, calculatorField, j12));
            c32739a.f204470c.i(this.f204642t, aVar2.f47c, aVar2.f48d, "program_card", eVar.f204575b);
            InterfaceC43160i interfaceC43160iG = C43175k.G(new C32741c(lVar, c32739a, null));
            this.f204640r = null;
            this.f204639q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
