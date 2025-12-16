package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi;

import Y41.p;
import com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.entity.IacProblemsBottomSheetInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nJ.x;

/* compiled from: IacProblemsBottomSheetActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/mvi/entity/IacProblemsBottomSheetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.IacProblemsBottomSheetActor$onShowOnboardingClicked$1", f = "IacProblemsBottomSheetActor.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super IacProblemsBottomSheetInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f168908q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f168909r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f168910s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f168910s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f168910s, continuation);
        bVar.f168909r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super IacProblemsBottomSheetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f168908q;
        int i13 = 1;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f168909r;
            this.f168910s.f168912b.c(new x(null, IacEnablingScenario.f164285f, i13, 0 == true ? 1 : 0));
            IacProblemsBottomSheetInternalAction.OpenOnboarding openOnboarding = IacProblemsBottomSheetInternalAction.OpenOnboarding.f168920b;
            this.f168908q = 1;
            if (interfaceC43172j.emit(openOnboarding, this) == coroutine_suspended) {
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
