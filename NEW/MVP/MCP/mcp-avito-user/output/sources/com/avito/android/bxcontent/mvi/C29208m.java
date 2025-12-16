package com.avito.android.bxcontent.mvi;

import androidx.core.os.C22777e;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.home.o;
import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BxContentActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "step", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<anonymous>", "(Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$subscribeMainStartOnboardingSteps$2", f = "BxContentActor.kt", i = {0}, l = {1695}, m = "invokeSuspend", n = {"step"}, s = {"L$0"})
/* renamed from: com.avito.android.bxcontent.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29208m extends SuspendLambda implements Y41.p<MainStartOnboardingStep, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f112483q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f112484r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29105a f112485s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29208m(C29105a c29105a, Continuation<? super C29208m> continuation) {
        super(2, continuation);
        this.f112485s = c29105a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29208m c29208m = new C29208m(this.f112485s, continuation);
        c29208m.f112484r = obj;
        return c29208m;
    }

    @Override // Y41.p
    public final Object invoke(MainStartOnboardingStep mainStartOnboardingStep, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>> continuation) {
        return ((C29208m) create(mainStartOnboardingStep, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        MainStartOnboardingStep mainStartOnboardingStep;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f112483q;
        C29105a c29105a = this.f112485s;
        if (i12 == 0) {
            C42729a0.b(obj);
            MainStartOnboardingStep mainStartOnboardingStep2 = (MainStartOnboardingStep) this.f112484r;
            if (kotlin.jvm.internal.L.f(mainStartOnboardingStep2, MainStartOnboardingStep.Authorization.f184215b)) {
                return new C43210w(new BxContentInternalAction.MainStartOnboardingStepShow(mainStartOnboardingStep2));
            }
            boolean z12 = mainStartOnboardingStep2 instanceof MainStartOnboardingStep.OnBoardingSheet;
            com.avito.android.deeplink_handler.handler.composite.a aVar = c29105a.f111527a;
            if (z12) {
                aVar.r6(C22777e.b(new kotlin.Q("main_start_onboarding_sheet_bundle_key", mainStartOnboardingStep2)), ((MainStartOnboardingStep.OnBoardingSheet) mainStartOnboardingStep2).f184221b, "main_start_onboarding_sheet_request_key");
                return C43175k.w();
            }
            if (mainStartOnboardingStep2 instanceof MainStartOnboardingStep.MiuiProblemSheet) {
                aVar.r6(C22777e.b(new kotlin.Q("main_start_onboarding_miui_sheet_bundle_key", mainStartOnboardingStep2)), ((MainStartOnboardingStep.MiuiProblemSheet) mainStartOnboardingStep2).f184219b, "main_start_onboarding_miui_sheet_request_key");
                return C43175k.w();
            }
            if (mainStartOnboardingStep2 instanceof MainStartOnboardingStep.NotificationPermission) {
                aVar.r6(C22777e.b(new kotlin.Q("main_start_onboarding_notification_bundle_key", mainStartOnboardingStep2)), ((MainStartOnboardingStep.NotificationPermission) mainStartOnboardingStep2).f184220b, "main_start_onboarding_notification_request_key");
                return C43175k.w();
            }
            if (kotlin.jvm.internal.L.f(mainStartOnboardingStep2, MainStartOnboardingStep.LocationPermission.f184216b)) {
                return new C43210w(new BxContentInternalAction.MainStartOnboardingStepShow(mainStartOnboardingStep2));
            }
            if (kotlin.jvm.internal.L.f(mainStartOnboardingStep2, MainStartOnboardingStep.MiniMenuOnBoarding.f184218b)) {
                return new C43210w(new BxContentInternalAction.MainStartOnboardingStepShow(mainStartOnboardingStep2));
            }
            if (!kotlin.jvm.internal.L.f(mainStartOnboardingStep2, MainStartOnboardingStep.ReplaceMainExitOnboarding.f184222b)) {
                if (kotlin.jvm.internal.L.f(mainStartOnboardingStep2, MainStartOnboardingStep.LoyaltyOnboarding.f184217b)) {
                    return new C43210w(new BxContentInternalAction.MainStartOnboardingStepShow(mainStartOnboardingStep2));
                }
                if (!(mainStartOnboardingStep2 instanceof MainStartOnboardingStep.Tooltip)) {
                    throw new NoWhenBranchMatchedException();
                }
                MainStartOnboardingStep.Tooltip tooltip = (MainStartOnboardingStep.Tooltip) mainStartOnboardingStep2;
                o.a.a(c29105a.f111549w, tooltip.f184223b, tooltip.f184224c, tooltip.f184225d, 8);
                return C43175k.w();
            }
            this.f112484r = mainStartOnboardingStep2;
            this.f112483q = 1;
            Object objA = c29105a.f111552z.a(this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            mainStartOnboardingStep = mainStartOnboardingStep2;
            obj = objA;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mainStartOnboardingStep = (MainStartOnboardingStep) this.f112484r;
            C42729a0.b(obj);
        }
        ReplaceMainExitOnboarding replaceMainExitOnboarding = (ReplaceMainExitOnboarding) obj;
        if (replaceMainExitOnboarding != null) {
            return new C43210w(new BxContentInternalAction.ShowReplaceMainExitOnboarding(replaceMainExitOnboarding));
        }
        c29105a.f111548v.c(mainStartOnboardingStep);
        return C43175k.w();
    }
}
