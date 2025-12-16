package com.avito.android.onboarding.steps.mvi;

import com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OnboardingStepsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.onboarding.steps.mvi.OnboardingStepsActor$process$3", f = "OnboardingStepsActor.kt", i = {0}, l = {47, 49}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OnboardingStepsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209324q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f209325r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H40.d f209326s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H40.b f209327t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f209328u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(H40.d dVar, H40.b bVar, e eVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f209326s = dVar;
        this.f209327t = bVar;
        this.f209328u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f209326s, this.f209327t, this.f209328u, continuation);
        cVar.f209325r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OnboardingStepsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f209324q
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.C42729a0.b(r9)
            goto L93
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            java.lang.Object r1 = r8.f209325r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L80
        L24:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f209325r
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            H40.d r9 = r8.f209326s
            com.avito.android.remote.model.OnboardingStepsResult r9 = r9.f6944c
            java.util.List r9 = r9.getItems()
            H40.b r5 = r8.f209327t
            H40.b$a r5 = (H40.b.a) r5
            int r5 = r5.f6936a
            java.lang.Object r9 = kotlin.collections.C42745f0.K(r5, r9)
            com.avito.android.remote.model.OnboardingStep r9 = (com.avito.android.remote.model.OnboardingStep) r9
            if (r9 == 0) goto L47
            com.avito.android.remote.model.OnboardingStep$Button r9 = r9.getButton()
            goto L48
        L47:
            r9 = r2
        L48:
            com.avito.android.onboarding.steps.mvi.e r5 = r8.f209328u
            if (r9 == 0) goto L57
            com.avito.android.remote.model.OnboardingStep$Event r6 = r9.getEvent()
            if (r6 == 0) goto L57
            G40.c r7 = r5.f209332b
            r7.b(r6)
        L57:
            if (r9 == 0) goto L83
            com.avito.android.deep_linking.links.DeepLink r6 = r9.getDeeplink()
            if (r6 == 0) goto L83
            com.avito.android.deeplink_handler.handler.composite.a r5 = r5.f209333c
            r7 = 6
            com.avito.android.deeplink_handler.handler.b.a.a(r5, r6, r2, r2, r7)
            java.lang.Boolean r9 = r9.getCloseOnClick()
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            boolean r9 = kotlin.jvm.internal.L.f(r9, r5)
            if (r9 == 0) goto L80
            com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction$CloseScreen r9 = com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction.CloseScreen.f209336b
            r8.f209325r = r1
            r8.f209324q = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L80
            return r0
        L80:
            kotlin.G0 r9 = kotlin.G0.f406611a
            goto L84
        L83:
            r9 = r2
        L84:
            if (r9 != 0) goto L93
            com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction$CloseScreen r9 = com.avito.android.onboarding.steps.mvi.entity.OnboardingStepsInternalAction.CloseScreen.f209336b
            r8.f209325r = r2
            r8.f209324q = r3
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L93
            return r0
        L93:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.steps.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
