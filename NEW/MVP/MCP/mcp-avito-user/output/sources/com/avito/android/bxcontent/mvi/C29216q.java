package com.avito.android.bxcontent.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.mvi.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29216q implements InterfaceC43160i<BxContentInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f112502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C29105a f112503c;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.mvi.q$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f112504b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C29105a f112505c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$subscribeOnboardingSteps$$inlined$mapNotNull$1$2", f = "BxContentActor.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.mvi.q$a$a, reason: collision with other inner class name */
        public static final class C3307a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f112506q;

            /* renamed from: r, reason: collision with root package name */
            public int f112507r;

            public C3307a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f112506q = obj;
                this.f112507r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C29105a c29105a) {
            this.f112504b = interfaceC43172j;
            this.f112505c = c29105a;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.bxcontent.mvi.C29216q.a.C3307a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.bxcontent.mvi.q$a$a r0 = (com.avito.android.bxcontent.mvi.C29216q.a.C3307a) r0
                int r1 = r0.f112507r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f112507r = r1
                goto L18
            L13:
                com.avito.android.bxcontent.mvi.q$a$a r0 = new com.avito.android.bxcontent.mvi.q$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f112506q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f112507r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L95
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                com.avito.android.onboarding.model.BxOnboardingStep r6 = (com.avito.android.onboarding.model.BxOnboardingStep) r6
                int r7 = com.avito.android.bxcontent.mvi.C29105a.f111516L
                com.avito.android.bxcontent.mvi.a r7 = r5.f112505c
                boolean r2 = r6 instanceof com.avito.android.onboarding.model.BxOnboardingStep.View
                if (r2 == 0) goto L46
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$BxOnboardingStepShow r7 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$BxOnboardingStepShow
                com.avito.android.onboarding.model.BxOnboardingStep$View r6 = (com.avito.android.onboarding.model.BxOnboardingStep.View) r6
                r7.<init>(r6)
                goto L8a
            L46:
                boolean r2 = r6 instanceof com.avito.android.onboarding.model.BxOnboardingStep.OnBoardingSheet
                if (r2 == 0) goto L54
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$OpenDeeplink r7 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$OpenDeeplink
                com.avito.android.onboarding.model.BxOnboardingStep$OnBoardingSheet r6 = (com.avito.android.onboarding.model.BxOnboardingStep.OnBoardingSheet) r6
                com.avito.android.deep_linking.links.DeepLink r6 = r6.f209125d
                r7.<init>(r6)
                goto L8a
            L54:
                boolean r2 = r6 instanceof com.avito.android.onboarding.model.BxOnboardingStep.NotificationPermission
                if (r2 == 0) goto L62
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$OpenDeeplink r7 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$OpenDeeplink
                com.avito.android.onboarding.model.BxOnboardingStep$NotificationPermission r6 = (com.avito.android.onboarding.model.BxOnboardingStep.NotificationPermission) r6
                com.avito.android.deep_linking.links.DeepLink r6 = r6.f209124d
                r7.<init>(r6)
                goto L8a
            L62:
                boolean r2 = r6 instanceof com.avito.android.onboarding.model.BxOnboardingStep.ShowReplaceMainExitOnboarding
                com.avito.android.onboarding.q r4 = r7.f111521E
                if (r2 == 0) goto L75
                r4.g(r3)
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$ShowReplaceMainExitOnboarding r7 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$ShowReplaceMainExitOnboarding
                com.avito.android.onboarding.model.BxOnboardingStep$ShowReplaceMainExitOnboarding r6 = (com.avito.android.onboarding.model.BxOnboardingStep.ShowReplaceMainExitOnboarding) r6
                com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding r6 = r6.f209126d
                r7.<init>(r6)
                goto L8a
            L75:
                boolean r2 = r6 instanceof com.avito.android.onboarding.model.BxOnboardingStep.MiuiProblemSheet
                if (r2 == 0) goto L98
                r4.g(r3)
                nM.a r7 = r7.f111522F
                r7.d()
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$OpenDeeplink r7 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$OpenDeeplink
                com.avito.android.onboarding.model.BxOnboardingStep$MiuiProblemSheet r6 = (com.avito.android.onboarding.model.BxOnboardingStep.MiuiProblemSheet) r6
                com.avito.android.deep_linking.links.DeepLink r6 = r6.f209123d
                r7.<init>(r6)
            L8a:
                r0.f112507r = r3
                kotlinx.coroutines.flow.j r6 = r5.f112504b
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L95
                return r1
            L95:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L98:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29216q.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C29216q(InterfaceC43160i interfaceC43160i, C29105a c29105a) {
        this.f112502b = interfaceC43160i;
        this.f112503c = c29105a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f112502b.collect(new a(interfaceC43172j, this.f112503c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
