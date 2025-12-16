package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name;

import Cd.C13243a;
import Q50.b;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.C22823h0;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ProfileLink;
import com.avito.android.deep_linking.links.ProfileSettingsLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_ui_components.p;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.mvi.entity.ReAgentSetProfileNameState;
import com.avito.android.passport.profile_add.perf_const.ReAgentSetProfileNameScreen;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ReAgentSetProfileNameFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/ReAgentSetProfileNameFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReAgentSetProfileNameFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f211382C0;

    /* renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f211383D0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211384A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f211385B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.j f211386n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f211387o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f211388p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f211389q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_add.l f211390r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211391s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211392t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211393u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211394v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211395w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211396x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211397y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211398z0;

    /* compiled from: ReAgentSetProfileNameFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/ReAgentSetProfileNameFragment$a;", "", "<init>", "()V", "", "ARGS_RE_AGENT_SET_PROFILE_NAME", "Ljava/lang/String;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReAgentSetProfileNameFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ReAgentSetProfileNameState.InputState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ReAgentSetProfileNameState.InputState inputState = ReAgentSetProfileNameState.InputState.f211493b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ReAgentSetProfileNameFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/ReAgentSetProfileNameArgs;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<ReAgentSetProfileNameArgs> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final ReAgentSetProfileNameArgs invoke() {
            Bundle bundleRequireArguments = ReAgentSetProfileNameFragment.this.requireArguments();
            return (ReAgentSetProfileNameArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("passport.add_profile.re_agent_set_profile_name.args", ReAgentSetProfileNameArgs.class) : bundleRequireArguments.getParcelable("passport.add_profile.re_agent_set_profile_name.args"));
        }
    }

    /* compiled from: ReAgentSetProfileNameFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Q50.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Q50.b bVar) {
            Q50.b bVar2 = bVar;
            ReAgentSetProfileNameFragment reAgentSetProfileNameFragment = (ReAgentSetProfileNameFragment) this.receiver;
            a aVar = ReAgentSetProfileNameFragment.f211382C0;
            reAgentSetProfileNameFragment.getClass();
            if (bVar2 instanceof b.C0887b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = reAgentSetProfileNameFragment.f211389q0;
                b.C0887b c0887b = (b.C0887b) bVar2;
                (aVar2 != null ? aVar2 : null).r6(c0887b.f13476c, c0887b.f13474a, c0887b.f13475b);
            } else if (bVar2 instanceof b.a) {
                ActivityC22955m activityC22955mL1 = reAgentSetProfileNameFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                }
            } else if (bVar2 instanceof b.c) {
                com.avito.android.passport.profile_add.l lVar = reAgentSetProfileNameFragment.f211390r0;
                if (lVar == null) {
                    lVar = null;
                }
                lVar.a();
                b.c cVar = (b.c) bVar2;
                ProfileCreateExtendedFlow.Profile.Upgrade upgrade = ProfileCreateExtendedFlow.Profile.Upgrade.f211175d;
                ProfileCreateExtendedFlow profileCreateExtendedFlow = cVar.f13477a;
                boolean zF2 = L.f(profileCreateExtendedFlow, upgrade);
                boolean z12 = cVar.f13478b;
                if (zF2) {
                    ScreenFlowLink screenFlowLink = new ScreenFlowLink(new ProfileLink(false, 1, null), z12 ? new ScreenFlowLink(new ProfileSettingsLink(null, null, 2, null), new ToastMessageLink(reAgentSetProfileNameFragment.getString(R.string.passport_lib_public_profile_create_finish_success_toast), ToastMessageLink.ToastType.f133735d, null, null, null, false, null, 124, null)) : new ProfileSettingsLink(null, null, 2, null));
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = reAgentSetProfileNameFragment.f211389q0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    b.a.a(aVar3, screenFlowLink, null, null, 6);
                } else if (L.f(profileCreateExtendedFlow, ProfileCreateExtendedFlow.Passport.Create.f211172d)) {
                    DeepLink screenFlowLink2 = z12 ? new ScreenFlowLink(new ProfileLink(false, 1, null), new ToastMessageLink(reAgentSetProfileNameFragment.getString(R.string.passport_lib_public_profile_create_finish_success_toast), ToastMessageLink.ToastType.f133734c, null, null, null, false, null, 124, null)) : new ProfileLink(false, 1, null);
                    com.avito.android.deeplink_handler.handler.composite.a aVar4 = reAgentSetProfileNameFragment.f211389q0;
                    if (aVar4 == null) {
                        aVar4 = null;
                    }
                    b.a.a(aVar4, screenFlowLink2, null, null, 6);
                }
                ActivityC22955m activityC22955mL12 = reAgentSetProfileNameFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
            } else if (bVar2 instanceof b.d) {
                p pVar = p.f153373a;
                C47313c c47313c = reAgentSetProfileNameFragment.f211391s0;
                n<Object> nVar = ReAgentSetProfileNameFragment.f211383D0[0];
                ScrollView scrollView = (ScrollView) c47313c.a();
                b.d dVar = (b.d) bVar2;
                ScreenPerformanceTracker screenPerformanceTracker = reAgentSetProfileNameFragment.f211388p0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                p.c(pVar, scrollView, dVar.f13479a, screenPerformanceTracker, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReAgentSetProfileNameFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<ReAgentSetProfileNameState, G0> {
        @Override // Y41.l
        public final G0 invoke(ReAgentSetProfileNameState reAgentSetProfileNameState) {
            int[] iArr;
            int[] iArr2;
            ReAgentSetProfileNameState reAgentSetProfileNameState2 = reAgentSetProfileNameState;
            ReAgentSetProfileNameFragment reAgentSetProfileNameFragment = (ReAgentSetProfileNameFragment) this.receiver;
            a aVar = ReAgentSetProfileNameFragment.f211382C0;
            reAgentSetProfileNameFragment.getClass();
            int iOrdinal = reAgentSetProfileNameState2.f211488d.ordinal();
            if (iOrdinal == 0) {
                Input.f179303W.getClass();
                iArr = Input.f179304a0;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                Input.f179303W.getClass();
                iArr = Input.f179305b0;
            }
            int iOrdinal2 = reAgentSetProfileNameState2.f211489e.ordinal();
            if (iOrdinal2 == 0) {
                Input.f179303W.getClass();
                iArr2 = Input.f179304a0;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                Input.f179303W.getClass();
                iArr2 = Input.f179305b0;
            }
            C47313c c47313c = reAgentSetProfileNameFragment.f211384A0;
            n<Object>[] nVarArr = ReAgentSetProfileNameFragment.f211383D0;
            n<Object> nVar = nVarArr[8];
            Button button = (Button) c47313c.a();
            boolean z12 = reAgentSetProfileNameState2.f211492h;
            button.setLoading(z12);
            n<Object> nVar2 = nVarArr[8];
            ((Button) c47313c.a()).setClickable(true ^ z12);
            reAgentSetProfileNameFragment.q5().setState(iArr);
            reAgentSetProfileNameFragment.s5().setState(iArr2);
            Input.t(reAgentSetProfileNameFragment.q5(), reAgentSetProfileNameState2.f211486b, false, 6);
            Input.t(reAgentSetProfileNameFragment.s5(), reAgentSetProfileNameState2.f211487c, false, 6);
            PrintableText printableText = reAgentSetProfileNameState2.f211490f;
            String strK0 = printableText != null ? printableText.k0(reAgentSetProfileNameFragment.requireContext()) : null;
            PrintableText printableText2 = reAgentSetProfileNameState2.f211491g;
            String strK02 = printableText2 != null ? printableText2.k0(reAgentSetProfileNameFragment.requireContext()) : null;
            C47313c c47313c2 = reAgentSetProfileNameFragment.f211397y0;
            if (strK0 == null || C43066x.K(strK0)) {
                n<Object> nVar3 = nVarArr[6];
                D6.g((TextView) c47313c2.a());
            } else {
                n<Object> nVar4 = nVarArr[6];
                ((TextView) c47313c2.a()).setText(strK0);
                n<Object> nVar5 = nVarArr[6];
                D6.H((TextView) c47313c2.a());
            }
            if (strK02 == null || C43066x.K(strK02)) {
                D6.g(reAgentSetProfileNameFragment.r5());
            } else {
                reAgentSetProfileNameFragment.r5().setText(strK02);
                D6.H(reAgentSetProfileNameFragment.r5());
            }
            if (z12) {
                D6.h(reAgentSetProfileNameFragment.q5());
                D6.h(reAgentSetProfileNameFragment.s5());
            } else {
                D6.k(reAgentSetProfileNameFragment.q5());
                D6.k(reAgentSetProfileNameFragment.s5());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReAgentSetProfileNameFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ50/a;", "it", "Lkotlin/G0;", "invoke", "(LQ50/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Q50.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Q50.a aVar) {
            a aVar2 = ReAgentSetProfileNameFragment.f211382C0;
            ReAgentSetProfileNameFragment.this.t5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f211401l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f211401l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f211401l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ReAgentSetProfileNameFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f211403l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f211403l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f211403l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f211404l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f211404l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f211404l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f211405l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f211405l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f211405l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ReAgentSetProfileNameFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.i> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.i invoke() {
            com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.j jVar = ReAgentSetProfileNameFragment.this.f211386n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.i) jVar.get();
        }
    }

    static {
        Y y12 = new Y(ReAgentSetProfileNameFragment.class, "contentScrollView", "getContentScrollView()Landroid/widget/ScrollView;", 0);
        n0 n0Var = m0.f406844a;
        f211383D0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ReAgentSetProfileNameFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ReAgentSetProfileNameFragment.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ReAgentSetProfileNameFragment.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ReAgentSetProfileNameFragment.class, "firstNameInput", "getFirstNameInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ReAgentSetProfileNameFragment.class, "secondNameInput", "getSecondNameInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ReAgentSetProfileNameFragment.class, "firstNameEmptyErrorText", "getFirstNameEmptyErrorText()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ReAgentSetProfileNameFragment.class, "secondNameEmptyErrorText", "getSecondNameEmptyErrorText()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ReAgentSetProfileNameFragment.class, "createProfileButton", "getCreateProfileButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f211382C0 = new a(null);
    }

    public ReAgentSetProfileNameFragment() {
        super(R.layout.passport_create_profile_re_agent_set_profile_name_fragment);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f211387o0 = new O0(m0.f406844a.b(com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.i.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f211391s0 = new C47313c(null, 1, null);
        this.f211392t0 = new C47313c(null, 1, null);
        this.f211393u0 = new C47313c(null, 1, null);
        this.f211394v0 = new C47313c(null, 1, null);
        this.f211395w0 = new C47313c(null, 1, null);
        this.f211396x0 = new C47313c(null, 1, null);
        this.f211397y0 = new C47313c(null, 1, null);
        this.f211398z0 = new C47313c(null, 1, null);
        this.f211384A0 = new C47313c(null, 1, null);
        this.f211385B0 = C42727D.c(new c());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f211388p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f211388p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, t5(), new d(1, this, ReAgentSetProfileNameFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameOneTimeEvent;)V", 0), new e(1, this, ReAgentSetProfileNameFragment.class, "render", "render(Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/mvi/entity/ReAgentSetProfileNameState;)V", 0));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C22823h0.K(requireActivity().getWindow().getDecorView(), null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.re_agent_set_profile_name_scroll_view);
        C47313c c47313c = this.f211391s0;
        n<Object>[] nVarArr = f211383D0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, scrollView);
        NavBar navBar = (NavBar) view.findViewById(R.id.re_agent_set_profile_nav_bar);
        C47313c c47313c2 = this.f211392t0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, navBar);
        TextView textView = (TextView) view.findViewById(R.id.re_agent_set_profile_name_title);
        C47313c c47313c3 = this.f211393u0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, textView);
        TextView textView2 = (TextView) view.findViewById(R.id.re_agent_set_profile_name_subtitle);
        C47313c c47313c4 = this.f211394v0;
        n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, textView2);
        Input input = (Input) view.findViewById(R.id.re_agent_set_profile_name_first_name_input);
        C47313c c47313c5 = this.f211395w0;
        n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, input);
        Input input2 = (Input) view.findViewById(R.id.re_agent_set_profile_name_second_name_input);
        C47313c c47313c6 = this.f211396x0;
        n<Object> nVar6 = nVarArr[5];
        c47313c6.b(this, input2);
        TextView textView3 = (TextView) view.findViewById(R.id.re_agent_set_profile_name_first_name_empty_error);
        C47313c c47313c7 = this.f211397y0;
        n<Object> nVar7 = nVarArr[6];
        c47313c7.b(this, textView3);
        TextView textView4 = (TextView) view.findViewById(R.id.re_agent_set_profile_name_second_name_empty_error);
        C47313c c47313c8 = this.f211398z0;
        n<Object> nVar8 = nVarArr[7];
        c47313c8.b(this, textView4);
        Button button = (Button) view.findViewById(R.id.re_agent_set_profile_name_create_profile);
        C47313c c47313c9 = this.f211384A0;
        n<Object> nVar9 = nVarArr[8];
        c47313c9.b(this, button);
        q5().b(new s("", new com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.f(this)));
        s5().b(new s("", new com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.g(this)));
        s5().setOnEditorActionListener(new C27140f(this, 9));
        q5().v();
        n<Object> nVar10 = nVarArr[8];
        ((Button) c47313c9.a()).setOnClickListener(new com.avito.android.order.feature.c(this, 3));
        n<Object> nVar11 = nVarArr[1];
        ((NavBar) c47313c2.a()).setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_arrowBack24, requireContext()), new com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.e(this), false, null, null, null, null, 124, null));
        C22823h0.K(requireActivity().getWindow().getDecorView(), new com.avito.android.offlinization.ui.a(this, 2));
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f211389q0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.d(this, null), y.a(aVar.V9())), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f211388p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.di.a.a().a((ReAgentSetProfileNameArgs) this.f211385B0.getValue(), getF42820b(), cv.c.b(this), (com.avito.android.passport.profile_add.di.a) C29972i.a(C29972i.b(this), com.avito.android.passport.profile_add.di.a.class), com.avito.android.analytics.screens.s.c(this), ReAgentSetProfileNameScreen.f213620d, new f()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f211388p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final Input q5() {
        C47313c c47313c = this.f211395w0;
        n<Object> nVar = f211383D0[4];
        return (Input) c47313c.a();
    }

    public final TextView r5() {
        C47313c c47313c = this.f211398z0;
        n<Object> nVar = f211383D0[7];
        return (TextView) c47313c.a();
    }

    public final Input s5() {
        C47313c c47313c = this.f211396x0;
        n<Object> nVar = f211383D0[5];
        return (Input) c47313c.a();
    }

    public final com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.i t5() {
        return (com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.i) this.f211387o0.getValue();
    }
}
