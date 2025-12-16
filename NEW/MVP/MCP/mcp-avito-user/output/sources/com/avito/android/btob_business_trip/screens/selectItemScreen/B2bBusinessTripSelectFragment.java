package com.avito.android.btob_business_trip.screens.selectItemScreen;

import Bk.b;
import Cd.C13243a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
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
import com.avito.android.btob_business_trip.models.SuccessScreenInfo;
import com.avito.android.btob_business_trip.screens.resultSuccessScreen.B2bBusinessTripSuccessScreenFragment;
import com.avito.android.deeplink_handler.handler.b;
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

/* compiled from: B2bBusinessTripSelectFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/B2bBusinessTripSelectFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "LBk/c;", VoiceInfo.STATE, "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B2bBusinessTripSelectFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final a f108117r0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f108118n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f108119o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public B f108120p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f108121q0;

    /* compiled from: B2bBusinessTripSelectFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/B2bBusinessTripSelectFragment$a;", "", "<init>", "()V", "", "B2B_BUSINESS_TRIP_SELECT_ITEMS_KEY", "Ljava/lang/String;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: B2bBusinessTripSelectFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ComposeView f108122l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ B2bBusinessTripSelectFragment f108123m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComposeView composeView, B2bBusinessTripSelectFragment b2bBusinessTripSelectFragment) {
            super(2);
            this.f108122l = composeView;
            this.f108123m = b2bBusinessTripSelectFragment;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                this.f108122l.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
                a aVar = B2bBusinessTripSelectFragment.f108117r0;
                B2bBusinessTripSelectFragment b2bBusinessTripSelectFragment = this.f108123m;
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1266033336, new x(b2bBusinessTripSelectFragment, C22126m3.b(b2bBusinessTripSelectFragment.q5().getState(), a13)), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: B2bBusinessTripSelectFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends C42801a implements Y41.p<Bk.b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Bk.b bVar, Continuation<? super G0> continuation) {
            Bk.b bVar2 = bVar;
            B2bBusinessTripSelectFragment b2bBusinessTripSelectFragment = (B2bBusinessTripSelectFragment) this.receiver;
            a aVar = B2bBusinessTripSelectFragment.f108117r0;
            b2bBusinessTripSelectFragment.getClass();
            if (L.f(bVar2, b.c.f1647a)) {
                b2bBusinessTripSelectFragment.getParentFragmentManager().Y();
            } else if (L.f(bVar2, b.d.f1648a)) {
                SuccessScreenInfo successScreenInfo = b2bBusinessTripSelectFragment.q5().getState().getValue().f1658g;
                if (successScreenInfo != null) {
                    B2bBusinessTripSuccessScreenFragment.f108035s0.getClass();
                    B2bBusinessTripSuccessScreenFragment b2bBusinessTripSuccessScreenFragment = new B2bBusinessTripSuccessScreenFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("B2B_BUSINESS_TRIP_SUCCESS_SCREEN", successScreenInfo);
                    b2bBusinessTripSuccessScreenFragment.setArguments(bundle);
                    H hE2 = b2bBusinessTripSelectFragment.getParentFragmentManager().e();
                    hE2.o(R.anim.btob_business_trip_enter_from_right, R.anim.btob_business_trip_exit_to_left, R.anim.btob_business_trip_enter_from_right, R.anim.btob_business_trip_exit_to_right);
                    hE2.n(R.id.fragment_container, b2bBusinessTripSuccessScreenFragment, null);
                    hE2.c("B2bBusinessTripInfoScreen");
                    hE2.e();
                }
            } else if (L.f(bVar2, b.C0070b.f1646a)) {
                b2bBusinessTripSelectFragment.requireActivity().finish();
            } else if (bVar2 instanceof b.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = b2bBusinessTripSelectFragment.f108118n0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((b.a) bVar2).f1645a, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f108124l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f108124l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f108124l);
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
            return B2bBusinessTripSelectFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f108126l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f108126l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f108126l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f108127l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f108127l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f108127l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f108128l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f108128l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f108128l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: B2bBusinessTripSelectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/A;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/btob_business_trip/screens/selectItemScreen/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<A> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final A invoke() {
            B b12 = B2bBusinessTripSelectFragment.this.f108120p0;
            if (b12 == null) {
                b12 = null;
            }
            return (A) b12.get();
        }
    }

    public B2bBusinessTripSelectFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f108121q0 = new O0(m0.f406844a.b(A.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(-603618253, new b(composeView, this), true));
        return composeView;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43175k.K(new C43197r1(new c(2, this, B2bBusinessTripSelectFragment.class, "handleEvents", "handleEvents(Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectOneTimeEvent;)V", 4), C23069w.a(q5().getEvents(), getViewLifecycleOwner().getLifecycle(), Lifecycle.State.f46682e)), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f108119o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.avito.android.ui.fragments.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p5(@Y61.l android.os.Bundle r10) {
        /*
            r9 = this;
            com.avito.android.analytics.screens.D$a r10 = com.avito.android.analytics.screens.D.f90335a
            r10.getClass()
            com.avito.android.analytics.screens.F r10 = com.avito.android.analytics.screens.D.a.a()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 < r1) goto L1f
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = com.avito.android.auto_reseller_contacts.deepLink.t.B(r0)
            com.avito.android.btob_business_trip.models.SelectItemsInfo r0 = (com.avito.android.btob_business_trip.models.SelectItemsInfo) r0
            goto L31
        L1d:
            r0 = r2
            goto L31
        L1f:
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L2e
            java.lang.String r1 = "B2B_BUSINESS_TRIP_SELECT_ITEMS"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.avito.android.btob_business_trip.models.SelectItemsInfo r0 = (com.avito.android.btob_business_trip.models.SelectItemsInfo) r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            if (r0 == 0) goto L1d
        L31:
            if (r0 == 0) goto L6a
            com.avito.android.analytics.screens.k r1 = new com.avito.android.analytics.screens.k
            com.avito.android.btob_business_trip.screens.selectItemScreen.B2bBusinessTripSelectScreen r4 = com.avito.android.btob_business_trip.screens.selectItemScreen.B2bBusinessTripSelectScreen.f108130d
            com.avito.android.analytics.screens.r r5 = com.avito.android.analytics.screens.s.c(r9)
            r8 = 0
            r6 = 0
            r7 = 4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            com.avito.android.btob_business_trip.screens.selectItemScreen.di.a$a r3 = com.avito.android.btob_business_trip.screens.selectItemScreen.di.c.a()
            com.avito.android.K r4 = com.avito.android.di.C29972i.b(r9)
            java.lang.Class<sk.a> r5 = sk.InterfaceC48375a.class
            com.avito.android.di.h r4 = com.avito.android.di.C29972i.a(r4, r5)
            sk.a r4 = (sk.InterfaceC48375a) r4
            cv.a r5 = cv.c.b(r9)
            com.avito.android.btob_business_trip.screens.selectItemScreen.di.a r0 = r3.a(r4, r5, r0, r1)
            r0.a(r9)
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r0 = r9.f108119o0
            if (r0 == 0) goto L62
            r2 = r0
        L62:
            long r0 = r10.b()
            r2.a(r0)
            return
        L6a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Argument B2B_BUSINESS_TRIP_SELECT_ITEMS must be set"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.btob_business_trip.screens.selectItemScreen.B2bBusinessTripSelectFragment.p5(android.os.Bundle):void");
    }

    public final A q5() {
        return (A) this.f108121q0.getValue();
    }
}
