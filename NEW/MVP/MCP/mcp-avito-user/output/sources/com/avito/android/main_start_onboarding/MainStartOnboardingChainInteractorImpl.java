package com.avito.android.main_start_onboarding;

import JX.i;
import JX.m;
import JX.q;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.O2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: MainStartOnboardingChainInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingChainInteractorImpl;", "Lcom/avito/android/main_start_onboarding/a;", "State", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MainStartOnboardingChainInteractorImpl implements com.avito.android.main_start_onboarding.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final JX.a f184197a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f184198b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final m f184199c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final JX.e f184200d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final q f184201e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC28373a f184202f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Z1<LinkedList<MainStartOnboardingStep>> f184203g = p2.a(new LinkedList());

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Z1<HashSet<MainStartOnboardingStep>> f184204h = p2.a(new HashSet());

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Z1<State> f184205i = p2.a(State.f184208b);

    /* renamed from: j, reason: collision with root package name */
    @k
    public final e2 f184206j = f2.b(1, 5, null, 4);

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Z1<HashSet<MainStartOnboardingStep>> f184207k = p2.a(new HashSet());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MainStartOnboardingChainInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingChainInteractorImpl$State;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f184208b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f184209c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f184210d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ State[] f184211e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f184212f;

        static {
            State state = new State("NOT_STARTED", 0);
            f184208b = state;
            State state2 = new State("RUNNING", 1);
            f184209c = state2;
            State state3 = new State("FINISHED", 2);
            f184210d = state3;
            State[] stateArr = {state, state2, state3};
            f184211e = stateArr;
            f184212f = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f184211e.clone();
        }
    }

    /* compiled from: MainStartOnboardingChainInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;", "step", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/main_start_onboarding/MainStartOnboardingStep;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.main_start_onboarding.MainStartOnboardingChainInteractorImpl$stepForShowing$1", f = "MainStartOnboardingChainInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<MainStartOnboardingStep, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f184213q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = MainStartOnboardingChainInteractorImpl.this.new a(continuation);
            aVar.f184213q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(MainStartOnboardingStep mainStartOnboardingStep, Continuation<? super G0> continuation) {
            return ((a) create(mainStartOnboardingStep, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            MainStartOnboardingStep mainStartOnboardingStep = (MainStartOnboardingStep) this.f184213q;
            boolean z12 = mainStartOnboardingStep instanceof MainStartOnboardingStep.MiuiProblemSheet;
            MainStartOnboardingChainInteractorImpl mainStartOnboardingChainInteractorImpl = MainStartOnboardingChainInteractorImpl.this;
            if (z12) {
                mainStartOnboardingChainInteractorImpl.f184198b.b();
            }
            if (L.f(mainStartOnboardingStep, MainStartOnboardingStep.Authorization.f184215b)) {
                str = "authorization";
            } else if (L.f(mainStartOnboardingStep, MainStartOnboardingStep.LocationPermission.f184216b)) {
                str = "locationPermission";
            } else if (L.f(mainStartOnboardingStep, MainStartOnboardingStep.MiniMenuOnBoarding.f184218b)) {
                str = "miniMenuOnBoarding";
            } else if (L.f(mainStartOnboardingStep, MainStartOnboardingStep.ReplaceMainExitOnboarding.f184222b)) {
                str = "replaceMainExit";
            } else if (L.f(mainStartOnboardingStep, MainStartOnboardingStep.LoyaltyOnboarding.f184217b)) {
                str = "loyaltyOnboarding";
            } else if (z12) {
                str = "miuiProblemSheet";
            } else if (mainStartOnboardingStep instanceof MainStartOnboardingStep.NotificationPermission) {
                str = "notificationPermission";
            } else if (mainStartOnboardingStep instanceof MainStartOnboardingStep.OnBoardingSheet) {
                str = "onBoardingSheet";
            } else {
                if (!(mainStartOnboardingStep instanceof MainStartOnboardingStep.Tooltip)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = TooltipAttribute.ATTRIBUTE_TYPE;
            }
            mainStartOnboardingChainInteractorImpl.f184202f.c(new y.a("newOnboarding.".concat(str), 0L, 2, null));
            return G0.f406611a;
        }
    }

    @Inject
    public MainStartOnboardingChainInteractorImpl(@k JX.a aVar, @k i iVar, @k m mVar, @k JX.e eVar, @k q qVar, @k InterfaceC28373a interfaceC28373a) {
        this.f184197a = aVar;
        this.f184198b = iVar;
        this.f184199c = mVar;
        this.f184200d = eVar;
        this.f184201e = qVar;
        this.f184202f = interfaceC28373a;
    }

    @Override // com.avito.android.main_start_onboarding.a
    @k
    public final n2<State> a() {
        return this.f184205i;
    }

    @Override // com.avito.android.main_start_onboarding.a
    public final void b(@k MainStartOnboardingStep mainStartOnboardingStep) {
        this.f184207k.getValue().add(mainStartOnboardingStep);
    }

    @Override // com.avito.android.main_start_onboarding.a
    public final void c(@k MainStartOnboardingStep mainStartOnboardingStep) {
        Z1<HashSet<MainStartOnboardingStep>> z12 = this.f184204h;
        if (z12.getValue().contains(mainStartOnboardingStep)) {
            return;
        }
        z12.getValue().add(mainStartOnboardingStep);
        e();
    }

    @Override // com.avito.android.main_start_onboarding.a
    @k
    public final InterfaceC43160i<MainStartOnboardingStep> d() {
        if (this.f184205i.getValue() == State.f184210d) {
            return C43175k.w();
        }
        return new C43197r1(new a(null), this.f184206j);
    }

    public final void e() {
        Z1<LinkedList<MainStartOnboardingStep>> z12 = this.f184203g;
        boolean zIsEmpty = z12.getValue().isEmpty();
        e2 e2Var = this.f184206j;
        Z1<State> z13 = this.f184205i;
        if (!zIsEmpty) {
            MainStartOnboardingStep mainStartOnboardingStepRemove = z12.getValue().remove();
            if (z13.getValue() == State.f184208b) {
                z13.setValue(State.f184209c);
            }
            e2Var.K5(mainStartOnboardingStepRemove);
            return;
        }
        Z1<HashSet<MainStartOnboardingStep>> z14 = this.f184207k;
        if (!z14.getValue().isEmpty()) {
            Iterator<T> it = z14.getValue().iterator();
            while (it.hasNext()) {
                e2Var.K5((MainStartOnboardingStep) it.next());
            }
        }
        z13.setValue(State.f184210d);
    }

    @Override // com.avito.android.main_start_onboarding.a
    public final boolean isRunning() {
        return this.f184205i.getValue() == State.f184209c;
    }

    @Override // com.avito.android.main_start_onboarding.a
    public final void start() {
        if (this.f184205i.getValue() == State.f184210d) {
            return;
        }
        LinkedList<MainStartOnboardingStep> linkedList = new LinkedList<>();
        MainStartOnboardingStep.ReplaceMainExitOnboarding replaceMainExitOnboardingA = this.f184201e.a();
        if (replaceMainExitOnboardingA != null) {
            linkedList.add(replaceMainExitOnboardingA);
        }
        MainStartOnboardingStep.Authorization authorizationA = this.f184197a.a();
        if (authorizationA != null) {
            linkedList.add(authorizationA);
        }
        MainStartOnboardingStep.NotificationPermission notificationPermissionA = this.f184199c.a();
        if (notificationPermissionA != null) {
            linkedList.add(notificationPermissionA);
        }
        MainStartOnboardingStep.MiuiProblemSheet miuiProblemSheetA = this.f184198b.a();
        if (miuiProblemSheetA != null) {
            linkedList.add(miuiProblemSheetA);
        }
        MainStartOnboardingStep.LocationPermission locationPermissionA = this.f184200d.a();
        if (locationPermissionA != null) {
            linkedList.add(locationPermissionA);
        }
        Z1<LinkedList<MainStartOnboardingStep>> z12 = this.f184203g;
        z12.setValue(linkedList);
        if (O2.a(z12.getValue())) {
            e();
        }
    }
}
