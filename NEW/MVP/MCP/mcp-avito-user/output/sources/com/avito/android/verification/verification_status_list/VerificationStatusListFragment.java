package com.avito.android.verification.verification_status_list;

import Cd.C13243a;
import YM0.b;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.verification.di.status_list.b;
import com.avito.android.verification.verification_finish.q;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import xM0.C49864d;
import z1.AbstractC50339a;

/* compiled from: VerificationStatusListFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_status_list/VerificationStatusListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationStatusListFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f325745s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f325746n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f325747o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public l f325748p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f325749q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final b f325750r0;

    /* compiled from: VerificationStatusListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_status_list/VerificationStatusListFragment$a;", "", "<init>", "()V", "", "KEY_VERIFICATION_STATUS_LIST_ARGS", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationStatusListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LYM0/b;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LYM0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<YM0.b, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n f325752m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n nVar) {
            super(1);
            this.f325752m = nVar;
        }

        @Override // Y41.l
        public final G0 invoke(YM0.b bVar) {
            m mVar;
            YM0.b bVar2 = bVar;
            a aVar = VerificationStatusListFragment.f325745s0;
            VerificationStatusListFragment verificationStatusListFragment = VerificationStatusListFragment.this;
            com.avito.android.verification.verification_status_list.c cVar = new com.avito.android.verification.verification_status_list.c(1, (k) verificationStatusListFragment.f325749q0.getValue(), k.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            com.avito.android.verification.verification_status_list.d dVar = new com.avito.android.verification.verification_status_list.d(0, verificationStatusListFragment.requireActivity(), ActivityC22955m.class, "onBackPressed", "onBackPressed()V", 0);
            com.avito.android.verification.verification_status_list.e eVar = new com.avito.android.verification.verification_status_list.e(0, verificationStatusListFragment.requireActivity(), ActivityC22955m.class, "finish", "finish()V", 0);
            n nVar = this.f325752m;
            com.avito.android.seller_promotions.b bVar3 = new com.avito.android.seller_promotions.b(28, cVar);
            com.avito.android.verification.verification_input_inn.o oVar = new com.avito.android.verification.verification_input_inn.o(1, cVar, nVar);
            C49864d c49864d = nVar.f325826d;
            c49864d.a(bVar3, oVar);
            AJ.b bVar4 = new AJ.b(19, cVar);
            SwipeRefreshLayout swipeRefreshLayout = nVar.f325825c;
            swipeRefreshLayout.setOnRefreshListener(bVar4);
            NavBar navBar = nVar.f325824b;
            navBar.c(R.attr.ic_arrowBack24, dVar);
            boolean z12 = bVar2 instanceof b.C1377b;
            boolean z13 = false;
            if (z12) {
                swipeRefreshLayout.setRefreshing(false);
                c49864d.b();
                m mVar2 = ((b.C1377b) bVar2).f19457b;
                nVar.f325823a.l(mVar2.f325781a, null);
                TextView textView = nVar.f325827e;
                AttributedText attributedText = mVar2.f325782b;
                com.avito.android.util.text.j.a(textView, attributedText, null);
                if (attributedText != null) {
                    attributedText.setOnDeepLinkClickListener(new q(1, cVar));
                }
                if (mVar2.f325783c) {
                    navBar.c(R.attr.ic_close24, eVar);
                }
            } else if (bVar2.equals(b.c.f19459b)) {
                C49864d.d(c49864d);
            } else if (bVar2 instanceof b.a) {
                D6.H(navBar);
                C49864d.c(c49864d, o.f325829l);
            }
            b.C1377b c1377b = z12 ? (b.C1377b) bVar2 : null;
            if (c1377b != null && (mVar = c1377b.f19457b) != null) {
                z13 = mVar.f325783c;
            }
            verificationStatusListFragment.f325750r0.d(z13);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f325753l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f325753l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f325753l);
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
            return VerificationStatusListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f325755l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f325755l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f325755l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325756l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325756l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f325756l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325757l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325757l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f325757l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VerificationStatusListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/verification/verification_status_list/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/verification/verification_status_list/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<k> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final k invoke() {
            l lVar = VerificationStatusListFragment.this.f325748p0;
            if (lVar == null) {
                lVar = null;
            }
            return (k) lVar.get();
        }
    }

    public VerificationStatusListFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f325749q0 = new O0(m0.f406844a.b(k.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f325750r0 = new b();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final a.i f5() {
        return new com.avito.android.deeplink_handler.view.impl.l(requireContext(), requireView().findViewById(R.id.verification_status_swipe_refresh), requireView().findViewById(R.id.appbar_container), ToastBarPosition.f181047e, null, 16, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f325747o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_verification_status_list, viewGroup, false);
        com.avito.konveyor.adapter.d dVar = this.f325746n0;
        if (dVar == null) {
            dVar = null;
        }
        n nVar = new n(viewInflate, dVar);
        requireActivity().getF21241d().a(getViewLifecycleOwner(), this.f325750r0);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f325747o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (k) this.f325749q0.getValue(), com.avito.android.analytics.screens.mvi.k.f90658l, new c(nVar));
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325747o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.verification.di.status_list.a.a();
        r rVarC = s.c(this);
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key.verification_status_list_args", VerificationStatusListArgs.class) : bundleRequireArguments.getParcelable("key.verification_status_list_args");
        aVarA.a((VerificationStatusListArgs) parcelable, rVarC, new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 20), new com.avito.android.verification.verification_form_builder.a(this, 1), (com.avito.android.verification.di.status_list.c) C29972i.a(C29972i.b(this), com.avito.android.verification.di.status_list.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325747o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* compiled from: VerificationStatusListFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/verification/verification_status_list/VerificationStatusListFragment$b", "Landroidx/activity/x;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
        }
    }
}
