package com.avito.android.mortgage.pre_approval.form.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: NavigationInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.pre_approval.form.mvi.domain.NavigationInteractor$nextScreen$1", f = "NavigationInteractor.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements p<InterfaceC43172j<? super PreApprovalFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201907q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201908r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ R00.b f201909s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(R00.b bVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f201909s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        f fVar = new f(this.f201909s, continuation);
        fVar.f201908r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PreApprovalFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        String f12770a;
        String f12770a2;
        String f12770a3;
        String f12770a4;
        String f12770a5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201907q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f201908r;
            R00.b bVar = this.f201909s;
            P00.a aVar = bVar.f14056b.get("purposeId");
            String f12770a6 = aVar != null ? aVar.getF12770a() : null;
            Map<String, P00.a> map = bVar.f14056b;
            P00.a aVar2 = map.get("regionId");
            String f12770a7 = aVar2 != null ? aVar2.getF12770a() : null;
            P00.a aVar3 = map.get("propertyCost");
            Integer numY0 = (aVar3 == null || (f12770a5 = aVar3.getF12770a()) == null) ? null : C43066x.y0(f12770a5);
            P00.a aVar4 = map.get("landCost");
            Integer numY02 = (aVar4 == null || (f12770a4 = aVar4.getF12770a()) == null) ? null : C43066x.y0(f12770a4);
            P00.a aVar5 = map.get("downPayment");
            Integer numY03 = (aVar5 == null || (f12770a3 = aVar5.getF12770a()) == null) ? null : C43066x.y0(f12770a3);
            P00.a aVar6 = map.get("creditTerm");
            Integer numY04 = (aVar6 == null || (f12770a2 = aVar6.getF12770a()) == null) ? null : C43066x.y0(f12770a2);
            P00.a aVar7 = map.get("age");
            String f12770a8 = aVar7 != null ? aVar7.getF12770a() : null;
            P00.a aVar8 = map.get("occupation");
            String f12770a9 = aVar8 != null ? aVar8.getF12770a() : null;
            P00.a aVar9 = map.get("currentExperience");
            String f12770a10 = aVar9 != null ? aVar9.getF12770a() : null;
            P00.a aVar10 = map.get("income");
            Integer numY05 = (aVar10 == null || (f12770a = aVar10.getF12770a()) == null) ? null : C43066x.y0(f12770a);
            P00.a aVar11 = map.get("proofOfIncome");
            String f12770a11 = aVar11 != null ? aVar11.getF12770a() : null;
            P00.a aVar12 = map.get("mortgageProgram");
            PreApprovalFormInternalAction.NextScreen nextScreen = new PreApprovalFormInternalAction.NextScreen(new PreApprovalArguments(f12770a6, f12770a7, numY0, numY02, numY03, numY04, f12770a8, f12770a9, f12770a10, numY05, f12770a11, aVar12 != null ? aVar12.getF12770a() : null, bVar.f14059e));
            this.f201907q = 1;
            if (interfaceC43172j.emit(nextScreen, this) == coroutine_suspended) {
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
