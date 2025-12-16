package com.avito.android.profile.remove.confirm;

import Cd.C13243a;
import J90.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile.remove.ProfileRemoveActivity;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.profile.remove.o;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ProfileRemoveConfirmFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/remove/confirm/ProfileRemoveConfirmFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileRemoveConfirmFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f223786x0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f223787n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f223788o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ProfileRemoveAnalytics f223789p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public o f223790q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.remote.error.f f223791r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.remove.m f223792s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f223793t0;

    /* renamed from: u0, reason: collision with root package name */
    public Input f223794u0;

    /* renamed from: v0, reason: collision with root package name */
    public ComponentContainer f223795v0;

    /* renamed from: w0, reason: collision with root package name */
    public Button f223796w0;

    /* compiled from: ProfileRemoveConfirmFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/confirm/ProfileRemoveConfirmFragment$a;", "", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ProfileRemoveConfirmFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile.remove.confirm.ProfileRemoveConfirmFragment$a$a, reason: collision with other inner class name */
        public static final class C6772a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ DeepLink f223797l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6772a(DeepLink deepLink) {
                super(1);
                this.f223797l = deepLink;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arg_deeplink", this.f223797l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ProfileRemoveConfirmFragment a(@Y61.l DeepLink deepLink) {
            ProfileRemoveConfirmFragment profileRemoveConfirmFragment = new ProfileRemoveConfirmFragment();
            C35966w1.a(profileRemoveConfirmFragment, -1, new C6772a(deepLink));
            return profileRemoveConfirmFragment;
        }

        public a() {
        }
    }

    /* compiled from: ProfileRemoveConfirmFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<J90.c, G0> {
        @Override // Y41.l
        public final G0 invoke(J90.c cVar) {
            J90.c cVar2 = cVar;
            ProfileRemoveConfirmFragment profileRemoveConfirmFragment = (ProfileRemoveConfirmFragment) this.receiver;
            a aVar = ProfileRemoveConfirmFragment.f223786x0;
            profileRemoveConfirmFragment.getClass();
            if (cVar2 instanceof c.C0512c) {
                o oVar = profileRemoveConfirmFragment.f223790q0;
                (oVar != null ? oVar : null).G();
            } else if (cVar2 instanceof c.a) {
                o oVar2 = profileRemoveConfirmFragment.f223790q0;
                (oVar2 != null ? oVar2 : null).n1();
            } else if (cVar2 instanceof c.b) {
                o oVar3 = profileRemoveConfirmFragment.f223790q0;
                (oVar3 != null ? oVar3 : null).N0(((c.b) cVar2).f8818a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileRemoveConfirmFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<J90.d, G0> {
        @Override // Y41.l
        public final G0 invoke(J90.d dVar) {
            J90.d dVar2 = dVar;
            ProfileRemoveConfirmFragment profileRemoveConfirmFragment = (ProfileRemoveConfirmFragment) this.receiver;
            Button button = profileRemoveConfirmFragment.f223796w0;
            if (button == null) {
                button = null;
            }
            boolean z12 = dVar2.f8822a;
            button.setLoading(z12);
            Button button2 = profileRemoveConfirmFragment.f223796w0;
            if (button2 == null) {
                button2 = null;
            }
            boolean z13 = !z12;
            button2.setClickable(z13);
            Input input = profileRemoveConfirmFragment.f223794u0;
            if (input == null) {
                input = null;
            }
            input.setEnabled(z13);
            String str = dVar2.f8823b;
            if (str != null) {
                ComponentContainer componentContainer = profileRemoveConfirmFragment.f223795v0;
                if (componentContainer == null) {
                    componentContainer = null;
                }
                Input input2 = profileRemoveConfirmFragment.f223794u0;
                ComponentContainer.l(componentContainer, new int[]{(input2 != null ? input2 : null).getId()}, str, 4);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f223798l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f223798l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f223798l);
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
            return ProfileRemoveConfirmFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f223800l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f223800l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f223800l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f223801l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f223801l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f223801l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f223802l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f223802l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f223802l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ProfileRemoveConfirmFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/profile/remove/confirm/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/profile/remove/confirm/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<l> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            m mVar = ProfileRemoveConfirmFragment.this.f223787n0;
            if (mVar == null) {
                mVar = null;
            }
            return (l) mVar.get();
        }
    }

    public ProfileRemoveConfirmFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f223788o0 = new O0(m0.f406844a.b(l.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f223793t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.profile_remove_confirm_password_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.profile.remove.m mVar = this.f223792s0;
        if (mVar == null) {
            mVar = null;
        }
        mVar.p1(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(@Y61.k android.view.View r11, @Y61.l android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.remove.confirm.ProfileRemoveConfirmFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.profile.remove.confirm.di.a.a().a((ProfileRemoveActivity) requireActivity(), (com.avito.android.profile.remove.confirm.di.c) C29972i.a(C29972i.b(this), com.avito.android.profile.remove.confirm.di.c.class), s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f223793t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
