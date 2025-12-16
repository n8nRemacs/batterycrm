package com.avito.android.mortgage_calculator.internal.mvi;

import F10.a;
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
import y10.C50037b;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$updateDownPaymentBySlider$1", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class I extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204439q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32739a f204440r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b.w f204441s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C32739a c32739a, b.w wVar, Continuation<? super I> continuation) {
        super(3, continuation);
        this.f204440r = c32739a;
        this.f204441s = wVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        I i12 = new I(this.f204440r, this.f204441s, continuation);
        i12.f204439q = lVar;
        return i12.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        D10.a aVarA;
        y10.e eVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.arch.mvi.utils.l lVar = this.f204439q;
        D10.a aVar = (D10.a) lVar.getValue();
        a.C0271a c0271a = aVar.f2845b;
        boolean z12 = c0271a.f4477d;
        b.w wVar = this.f204441s;
        C32739a c32739a = this.f204440r;
        if (z12) {
            float f12 = wVar.f204597b;
            c32739a.getClass();
            C50037b c50037b = c0271a.f4476c;
            aVarA = D10.a.a(aVar, null, a.C0271a.c(aVar.f2845b, null, c50037b.b(f12).d(c50037b.f442845d.a((long) f12)), false, 11), null, null, 0L, null, null, null, null, null, null, null, null, null, 16381);
        } else {
            a.b bVar = aVar.f2844a;
            if (!bVar.f4483e) {
                return G0.f406611a;
            }
            float f13 = wVar.f204597b;
            c32739a.getClass();
            long j12 = bVar.f4480b.f442846e.f442853b;
            C50037b c50037b2 = bVar.f4481c;
            long jC2 = kotlin.math.b.c((j12 + ((c50037b2 == null || (eVar = c50037b2.f442846e) == null) ? 0L : eVar.f442853b)) * (f13 / 100.0f));
            C50037b c50037b3 = bVar.f4482d;
            aVarA = D10.a.a(aVar, a.b.c(aVar.f2844a, null, null, C50037b.a(c50037b3, null, com.avito.android.mortgage_calculator.internal.utils.c.a(f13), null, null, 27).b(f13).d(c50037b3.f442845d.a(jC2)), false, 23), null, null, null, 0L, null, null, null, null, null, null, null, null, null, 16382);
        }
        lVar.setValue(aVarA);
        return G0.f406611a;
    }
}
