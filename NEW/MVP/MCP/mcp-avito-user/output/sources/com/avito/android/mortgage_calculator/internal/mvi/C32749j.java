package com.avito.android.mortgage_calculator.internal.mvi;

import G10.a;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import z10.C50349b;
import z10.InterfaceC50348a;

/* compiled from: CalculatorActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$handleOfferDescriptionActionClicked$1", f = "CalculatorActor.kt", i = {0, 1}, l = {530, 535, 541}, m = "invokeSuspend", n = {"$this$flowWithMutablePrivateStateAndDeeplinkRebuild", "$this$flowWithMutablePrivateStateAndDeeplinkRebuild"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32749j extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204646q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f204647r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204648s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ E10.c f204649t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C32739a f204650u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b.f f204651v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32749j(E10.c cVar, C32739a c32739a, b.f fVar, Continuation<? super C32749j> continuation) {
        super(3, continuation);
        this.f204649t = cVar;
        this.f204650u = c32739a;
        this.f204651v = fVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        C32749j c32749j = new C32749j(this.f204649t, this.f204650u, this.f204651v, continuation);
        c32749j.f204647r = interfaceC43172j;
        c32749j.f204648s = lVar;
        return c32749j.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        C50349b c50349b;
        InterfaceC50348a interfaceC50348a;
        List<C50349b> list;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204646q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f204647r;
            com.avito.android.arch.mvi.utils.l lVar = this.f204648s;
            D10.a aVar = (D10.a) lVar.getValue();
            E10.c cVar = this.f204649t;
            a.C0325a c0325aA = cVar.f3689n.a();
            b.f fVar = this.f204651v;
            if (c0325aA == null || (list = c0325aA.f6179d.f6191a) == null) {
                c50349b = null;
            } else {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((C50349b) next).f443772f, fVar.f204576b)) {
                        break;
                    }
                }
                c50349b = (C50349b) next;
            }
            if (c50349b == null || (interfaceC50348a = c50349b.f443771e) == null) {
                return G0.f406611a;
            }
            boolean z12 = interfaceC50348a instanceof InterfaceC50348a.C12940a;
            C32739a c32739a = this.f204650u;
            if (z12) {
                InterfaceC50348a.C12940a c12940a = (InterfaceC50348a.C12940a) interfaceC50348a;
                lVar.setValue(C32739a.c(c32739a, aVar, c12940a.f443758c, c12940a.f443759d));
                c32739a.f204470c.i(this.f204649t, c12940a.f443760e, c12940a.f443761f, "program_popup_tab", fVar.f204576b);
                InterfaceC43160i interfaceC43160iG = C43175k.G(new C32741c(lVar, c32739a, null));
                this.f204647r = interfaceC43172j;
                this.f204646q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC50348a instanceof InterfaceC50348a.c) {
                c32739a.f204470c.p(cVar);
                CalculatorInternalAction.HandleDeeplink handleDeeplink = new CalculatorInternalAction.HandleDeeplink(((InterfaceC50348a.c) interfaceC50348a).f443766c);
                this.f204647r = interfaceC43172j;
                this.f204646q = 2;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                boolean z13 = interfaceC50348a instanceof InterfaceC50348a.b;
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = this.f204647r;
            C42729a0.b(obj);
        }
        CalculatorInternalAction.CloseOfferDescription closeOfferDescription = CalculatorInternalAction.CloseOfferDescription.f204550b;
        this.f204647r = null;
        this.f204646q = 3;
        if (interfaceC43172j.emit(closeOfferDescription, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
