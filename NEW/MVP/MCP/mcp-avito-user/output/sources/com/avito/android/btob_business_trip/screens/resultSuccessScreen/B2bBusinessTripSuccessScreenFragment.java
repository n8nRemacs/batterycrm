package com.avito.android.btob_business_trip.screens.resultSuccessScreen;

import Ak.InterfaceC13045b;
import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.remote.model.AnimationOverlayUrl;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import z1.AbstractC50339a;

/* compiled from: B2bBusinessTripSuccessScreenFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/B2bBusinessTripSuccessScreenFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "LAk/c;", VoiceInfo.STATE, "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B2bBusinessTripSuccessScreenFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f108035s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f108036n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public j f108037o0;

    /* renamed from: p0, reason: collision with root package name */
    @k
    public final O0 f108038p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f108039q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final AnimationOverlayUrl f108040r0;

    /* compiled from: B2bBusinessTripSuccessScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/B2bBusinessTripSuccessScreenFragment$a;", "", "<init>", "()V", "", "B2B_BUSINESS_TRIP_SUCCESS_SCREEN_KEY", "Ljava/lang/String;", "HEARTS_LANDSCAPE_JSON", "HEARTS_PORTRAIT_JSON", "HEARTS_PORTRAIT_TABLET_JSON", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: B2bBusinessTripSuccessScreenFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ComposeView f108041l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ B2bBusinessTripSuccessScreenFragment f108042m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComposeView composeView, B2bBusinessTripSuccessScreenFragment b2bBusinessTripSuccessScreenFragment) {
            super(2);
            this.f108041l = composeView;
            this.f108042m = b2bBusinessTripSuccessScreenFragment;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                this.f108041l.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
                a aVar = B2bBusinessTripSuccessScreenFragment.f108035s0;
                B2bBusinessTripSuccessScreenFragment b2bBusinessTripSuccessScreenFragment = this.f108042m;
                com.akita.compose.theme.re23.c.a(false, r.c(-1566353921, new com.avito.android.btob_business_trip.screens.resultSuccessScreen.f(b2bBusinessTripSuccessScreenFragment, C22126m3.b(((com.avito.android.btob_business_trip.screens.resultSuccessScreen.i) b2bBusinessTripSuccessScreenFragment.f108038p0.getValue()).getState(), a13)), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: B2bBusinessTripSuccessScreenFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends C42801a implements p<InterfaceC13045b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(InterfaceC13045b interfaceC13045b, Continuation<? super G0> continuation) {
            InterfaceC13045b interfaceC13045b2 = interfaceC13045b;
            B2bBusinessTripSuccessScreenFragment b2bBusinessTripSuccessScreenFragment = (B2bBusinessTripSuccessScreenFragment) this.receiver;
            a aVar = B2bBusinessTripSuccessScreenFragment.f108035s0;
            b2bBusinessTripSuccessScreenFragment.getClass();
            if (L.f(interfaceC13045b2, InterfaceC13045b.C0024b.f595a)) {
                b2bBusinessTripSuccessScreenFragment.requireActivity().finish();
            } else if (L.f(interfaceC13045b2, InterfaceC13045b.c.f596a)) {
                com.avito.android.lib.design.animation.animation_overlay.e eVar = com.avito.android.lib.design.animation.animation_overlay.e.f178326a;
                AnimationView.RepeatMode repeatMode = AnimationView.RepeatMode.f178282c;
                eVar.getClass();
                com.avito.android.lib.design.animation.animation_overlay.e.a(b2bBusinessTripSuccessScreenFragment.requireView(), b2bBusinessTripSuccessScreenFragment.f108040r0, 0, repeatMode, b2bBusinessTripSuccessScreenFragment.getContext());
            } else if (interfaceC13045b2 instanceof InterfaceC13045b.a) {
                DeepLink deepLink = ((InterfaceC13045b.a) interfaceC13045b2).f594a;
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = b2bBusinessTripSuccessScreenFragment.f108036n0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, deepLink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f108043l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f108043l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f108043l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return B2bBusinessTripSuccessScreenFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f108045l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f108045l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f108045l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f108046l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f108046l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f108046l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f108047l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f108047l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f108047l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: B2bBusinessTripSuccessScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.btob_business_trip.screens.resultSuccessScreen.i> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.btob_business_trip.screens.resultSuccessScreen.i invoke() {
            j jVar = B2bBusinessTripSuccessScreenFragment.this.f108037o0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.btob_business_trip.screens.resultSuccessScreen.i) jVar.get();
        }
    }

    public B2bBusinessTripSuccessScreenFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f108038p0 = new O0(m0.f406844a.b(com.avito.android.btob_business_trip.screens.resultSuccessScreen.i.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f108040r0 = new AnimationOverlayUrl("https://avito.st/s/app/real_estate/animations/hearts_portrait.json", "https://avito.st/s/app/real_estate/animations/hearts_landscape.json", "https://avito.st/s/app/real_estate/animations/hearts_portrait_tablet.json");
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f108039q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.btob_business_trip_fragment_for_compose_view, viewGroup, false);
        ComposeView composeView = (ComposeView) viewInflate.findViewById(R.id.compose_container);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(448379364, new b(composeView, this), true));
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43175k.K(new C43197r1(new c(2, this, B2bBusinessTripSuccessScreenFragment.class, "handleEvents", "handleEvents(Lcom/avito/android/btob_business_trip/screens/resultSuccessScreen/mvi/entity/B2bBusinessTripSuccessScreenOneTimeEvent;)V", 4), C23069w.a(((com.avito.android.btob_business_trip.screens.resultSuccessScreen.i) this.f108038p0.getValue()).getEvents(), getViewLifecycleOwner().getLifecycle(), Lifecycle.State.f46682e)), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f108039q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // com.avito.android.ui.fragments.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p5(@Y61.l android.os.Bundle r8) {
        /*
            r7 = this;
            com.avito.android.analytics.screens.D$a r8 = com.avito.android.analytics.screens.D.f90335a
            r8.getClass()
            com.avito.android.analytics.screens.F r8 = com.avito.android.analytics.screens.D.a.a()
            com.avito.android.analytics.screens.k r6 = new com.avito.android.analytics.screens.k
            com.avito.android.btob_business_trip.screens.resultSuccessScreen.B2bBusinessTripSuccessScreen r1 = com.avito.android.btob_business_trip.screens.resultSuccessScreen.B2bBusinessTripSuccessScreen.f108034d
            com.avito.android.analytics.screens.r r2 = com.avito.android.analytics.screens.s.c(r7)
            r5 = 0
            r3 = 0
            r4 = 4
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 < r1) goto L2e
            android.os.Bundle r0 = r7.getArguments()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = com.avito.android.auto_reseller_contacts.deepLink.t.z(r0)
            com.avito.android.btob_business_trip.models.SuccessScreenInfo r0 = (com.avito.android.btob_business_trip.models.SuccessScreenInfo) r0
            goto L40
        L2c:
            r0 = r2
            goto L40
        L2e:
            android.os.Bundle r0 = r7.getArguments()
            if (r0 == 0) goto L3d
            java.lang.String r1 = "B2B_BUSINESS_TRIP_SUCCESS_SCREEN"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.avito.android.btob_business_trip.models.SuccessScreenInfo r0 = (com.avito.android.btob_business_trip.models.SuccessScreenInfo) r0
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 == 0) goto L2c
        L40:
            if (r0 == 0) goto L6a
            com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.a$a r1 = com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.b.a()
            com.avito.android.K r3 = com.avito.android.di.C29972i.b(r7)
            java.lang.Class<sk.a> r4 = sk.InterfaceC48375a.class
            com.avito.android.di.h r3 = com.avito.android.di.C29972i.a(r3, r4)
            sk.a r3 = (sk.InterfaceC48375a) r3
            cv.a r4 = cv.c.b(r7)
            com.avito.android.btob_business_trip.screens.resultSuccessScreen.di.a r0 = r1.a(r3, r4, r6, r0)
            r0.a(r7)
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r0 = r7.f108039q0
            if (r0 == 0) goto L62
            r2 = r0
        L62:
            long r0 = r8.b()
            r2.a(r0)
            return
        L6a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Argument B2B_BUSINESS_TRIP_SUCCESS_SCREEN must be set"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.btob_business_trip.screens.resultSuccessScreen.B2bBusinessTripSuccessScreenFragment.p5(android.os.Bundle):void");
    }
}
