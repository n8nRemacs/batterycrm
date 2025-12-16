package com.avito.android.onboarding.steps.mvi;

import H40.b;
import com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction;
import com.avito.android.remote.model.OnboardingStep;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OnboardingStepsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.onboarding.steps.mvi.OnboardingStepsActor$process$2", f = "OnboardingStepsActor.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OnboardingStepsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209319q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f209320r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H40.d f209321s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H40.b f209322t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f209323u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(H40.d dVar, H40.b bVar, e eVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f209321s = dVar;
        this.f209322t = bVar;
        this.f209323u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f209321s, this.f209322t, this.f209323u, continuation);
        bVar.f209320r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OnboardingStepsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f209319q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f209320r;
            List<OnboardingStep> items = this.f209321s.f6944c.getItems();
            b.c cVar = (b.c) this.f209322t;
            OnboardingStep onboardingStep = (OnboardingStep) C42745f0.K(cVar.f6938a, items);
            AttributedText title = onboardingStep != null ? onboardingStep.getTitle() : null;
            e eVar = this.f209323u;
            CharSequence charSequenceD = eVar.f209334d.d(title);
            eVar.f209332b.a(charSequenceD != null ? charSequenceD.toString() : null);
            OnboardingStepsInternalAction.OnPageSelected onPageSelected = new OnboardingStepsInternalAction.OnPageSelected(cVar.f6938a);
            this.f209319q = 1;
            if (interfaceC43172j.emit(onPageSelected, this) == coroutine_suspended) {
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
