package com.avito.android.mortgage_calculator.internal.mvi;

import F10.a;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;
import y10.C50037b;
import y10.C50038c;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$applyBusinessRules$2", f = "CalculatorActor.kt", i = {}, l = {625}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32741c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CalculatorInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204503q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f204504r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.l<D10.a> f204505s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32739a f204506t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32741c(com.avito.android.arch.mvi.utils.l<D10.a> lVar, C32739a c32739a, Continuation<? super C32741c> continuation) {
        super(2, continuation);
        this.f204505s = lVar;
        this.f204506t = c32739a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32741c c32741c = new C32741c(this.f204505s, this.f204506t, continuation);
        c32741c.f204504r = obj;
        return c32741c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32741c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C50037b c50037bD;
        C50038c c50038c;
        C50038c c50038c2;
        y10.e eVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204503q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f204504r;
            com.avito.android.arch.mvi.utils.l<D10.a> lVar = this.f204505s;
            D10.a value = lVar.getValue();
            a.b bVar = value.f2844a;
            this.f204506t.getClass();
            Long lZ02 = C43066x.z0(bVar.f4480b.f442846e.f442852a);
            C50037b c50037b = bVar.f4480b;
            C50037b c50037bD2 = c50037b.d(c50037b.f442845d.a(lZ02 != null ? lZ02.longValue() : c50037b.f442846e.f442853b));
            C50037b c50037b2 = bVar.f4481c;
            if (c50037b2 != null) {
                y10.e eVar2 = c50037b2.f442846e;
                Long lZ03 = C43066x.z0(eVar2.f442852a);
                c50037bD = c50037b2.d(c50037b2.f442845d.a(lZ03 != null ? lZ03.longValue() : eVar2.f442853b));
            } else {
                c50037bD = null;
            }
            long j12 = c50037bD2.f442846e.f442853b + ((c50037bD == null || (eVar = c50037bD.f442846e) == null) ? 0L : eVar.f442853b);
            C50037b c50037b3 = bVar.f4482d;
            y10.d dVar = c50037b3.f442843b;
            float f12 = ((dVar == null || (c50038c2 = dVar.f442849a) == null) ? 0.0f : c50038c2.f442848b) / 100;
            float f13 = (dVar == null || (c50038c = dVar.f442850b) == null) ? 90.0f : c50038c.f442848b;
            float f14 = j12;
            long jC2 = kotlin.math.b.c(f12 * f14);
            long jC3 = kotlin.math.b.c((f13 / r14) * f14);
            c50037b3.f442845d.getClass();
            y10.f fVar = new y10.f(jC2, jC3);
            y10.e eVar3 = c50037b3.f442846e;
            Long lZ04 = C43066x.z0(eVar3.f442852a);
            long jA2 = fVar.a(lZ04 != null ? lZ04.longValue() : eVar3.f442853b);
            float f15 = (jA2 / f14) * 100.0f;
            a.b bVarC = a.b.c(bVar, c50037bD2, c50037bD, C50037b.a(bVar.f4482d, null, com.avito.android.mortgage_calculator.internal.utils.c.a(f15), fVar, null, 19).d(jA2).b(f15), false, 17);
            a.C0271a c0271a = value.f2845b;
            Long lZ05 = C43066x.z0(c0271a.f4475b.f442846e.f442852a);
            C50037b c50037b4 = c0271a.f4475b;
            long jA3 = c50037b4.f442845d.a(lZ05 != null ? lZ05.longValue() : c50037b4.f442846e.f442853b);
            C50037b c50037bB = c50037b4.d(jA3).b(jA3);
            C50037b c50037b5 = c0271a.f4476c;
            Long lZ06 = C43066x.z0(c50037b5.f442846e.f442852a);
            long jA4 = c50037b5.f442845d.a(lZ06 != null ? lZ06.longValue() : c50037b5.f442846e.f442853b);
            lVar.setValue(D10.a.a(value, bVarC, a.C0271a.c(c0271a, c50037bB, c50037b5.d(jA4).b(jA4), false, 9), null, null, 0L, null, null, null, null, null, null, null, null, null, 16380));
            if (!kotlin.jvm.internal.L.f(lVar.getValue(), value)) {
                CalculatorInternalAction.LoadOffers loadOffers = new CalculatorInternalAction.LoadOffers(lVar.getValue());
                this.f204503q = 1;
                if (interfaceC43172j.emit(loadOffers, this) == coroutine_suspended) {
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
