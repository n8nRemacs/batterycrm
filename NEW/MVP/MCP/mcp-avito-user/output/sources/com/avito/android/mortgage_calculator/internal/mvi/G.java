package com.avito.android.mortgage_calculator.internal.mvi;

import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import y10.C50036a;

/* compiled from: CalculatorActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "LD10/a;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$updateCreditTerm$1", f = "CalculatorActor.kt", i = {}, l = {454}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class G extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CalculatorInternalAction>, com.avito.android.arch.mvi.utils.l<D10.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f204432q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f204433r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f204434s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.u f204435t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C32739a f204436u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(b.u uVar, C32739a c32739a, Continuation<? super G> continuation) {
        super(3, continuation);
        this.f204435t = uVar;
        this.f204436u = c32739a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super CalculatorInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<D10.a> lVar, Continuation<? super G0> continuation) {
        G g12 = new G(this.f204435t, this.f204436u, continuation);
        g12.f204433r = interfaceC43172j;
        g12.f204434s = lVar;
        return g12.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f204432q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f204433r;
            com.avito.android.arch.mvi.utils.l lVar = this.f204434s;
            D10.a aVar = (D10.a) lVar.getValue();
            InterfaceC27333b interfaceC27333b = this.f204435t.f204595b;
            if (!(interfaceC27333b instanceof C50036a.C12884a)) {
                return G0.f406611a;
            }
            C50036a c50036a = aVar.f2846c;
            List<C50036a.C12884a> list = c50036a.f442837b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (C50036a.C12884a c12884aA : list) {
                if (c12884aA.f442839c == ((C50036a.C12884a) interfaceC27333b).f442839c) {
                    c12884aA = C50036a.C12884a.a(c12884aA, true);
                } else if (c12884aA.f442840d) {
                    c12884aA = C50036a.C12884a.a(c12884aA, false);
                }
                arrayList.add(c12884aA);
            }
            lVar.setValue(D10.a.a(aVar, null, null, new C50036a(c50036a.f442836a, arrayList), null, 0L, null, null, null, null, null, null, null, null, null, 16379));
            this.f204436u.f204470c.f((D10.a) lVar.getValue());
            CalculatorInternalAction.LoadOffers loadOffers = new CalculatorInternalAction.LoadOffers((D10.a) lVar.getValue());
            this.f204433r = null;
            this.f204432q = 1;
            if (interfaceC43172j.emit(loadOffers, this) == coroutine_suspended) {
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
