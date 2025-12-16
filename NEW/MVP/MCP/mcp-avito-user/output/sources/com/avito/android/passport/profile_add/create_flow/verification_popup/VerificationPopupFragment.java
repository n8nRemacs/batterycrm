package com.avito.android.passport.profile_add.create_flow.verification_popup;

import Cd.C13243a;
import W50.a;
import W50.b;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.verification_popup.di.b;
import com.avito.android.passport.profile_add.perf_const.VerificationPopupScreen;
import com.avito.android.remote.model.VerificationDisclaimer;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.architecture_components.D;
import com.avito.android.util.y6;
import cv.InterfaceC39417a;
import j.InterfaceC42150f;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: VerificationPopupFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/verification_popup/VerificationPopupFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationPopupFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f212207x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f212208y0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_add.create_flow.verification_popup.j f212209n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f212210o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f212211p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public D<Navigation> f212212q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212213r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212214s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f212215t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f212216u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f212217v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f212218w0;

    /* compiled from: VerificationPopupFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/verification_popup/VerificationPopupFragment$a;", "", "<init>", "()V", "", "ARGS_VERIFICATION_POPUP", "Ljava/lang/String;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationPopupFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/VerificationPopupArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<VerificationPopupArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final VerificationPopupArguments invoke() {
            Bundle bundleRequireArguments = VerificationPopupFragment.this.requireArguments();
            return (VerificationPopupArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("passport.add_profile.verification_popup.verification_popup_args", VerificationPopupArguments.class) : bundleRequireArguments.getParcelable("passport.add_profile.verification_popup.verification_popup_args"));
        }
    }

    /* compiled from: VerificationPopupFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<W50.b, G0> {
        @Override // Y41.l
        public final G0 invoke(W50.b bVar) {
            W50.b bVar2 = bVar;
            VerificationPopupFragment verificationPopupFragment = (VerificationPopupFragment) this.receiver;
            a aVar = VerificationPopupFragment.f212207x0;
            verificationPopupFragment.getClass();
            if (bVar2 instanceof b.C1251b) {
                D<Navigation> d12 = verificationPopupFragment.f212212q0;
                (d12 != null ? d12 : null).setValue(((b.C1251b) bVar2).f17745a);
            } else if (bVar2 instanceof b.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = verificationPopupFragment.f212211p0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a aVar3 = (b.a) bVar2;
                aVar3.getClass();
                b.a.a(aVar2, aVar3.f17744a, "passport.add_profile.verification_popup.start_verification", null, 4);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationPopupFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW50/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LW50/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<W50.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(W50.c cVar) {
            a aVar = VerificationPopupFragment.f212207x0;
            VerificationPopupFragment verificationPopupFragment = VerificationPopupFragment.this;
            com.avito.android.passport.profile_add.create_flow.verification_popup.b bVar = new com.avito.android.passport.profile_add.create_flow.verification_popup.b(1, verificationPopupFragment.t5(), com.avito.android.passport.profile_add.create_flow.verification_popup.i.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            verificationPopupFragment.s5().removeAllViews();
            VerificationDisclaimer verificationDisclaimer = cVar.f17746b;
            String title = verificationDisclaimer.getTitle();
            if (title != null) {
                ViewGroup viewGroupS5 = verificationPopupFragment.s5();
                com.avito.android.lib.design.text_view.a aVarQ5 = verificationPopupFragment.q5(y6.b(16), R.attr.textH20);
                I5.a(aVarQ5, title, false);
                viewGroupS5.addView(aVarQ5);
            }
            List<VerificationDisclaimer.InfoBlock> infoBlocks = verificationDisclaimer.getInfoBlocks();
            if (infoBlocks == null) {
                infoBlocks = C42784z0.f406748b;
            }
            Iterator<T> it = infoBlocks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VerificationDisclaimer.InfoBlock infoBlock = (VerificationDisclaimer.InfoBlock) it.next();
                if (infoBlock.getTitle() != null) {
                    ViewGroup viewGroupS52 = verificationPopupFragment.s5();
                    com.avito.android.lib.design.text_view.a aVarQ52 = verificationPopupFragment.q5(y6.b(16), R.attr.textH30);
                    I5.a(aVarQ52, infoBlock.getTitle(), false);
                    viewGroupS52.addView(aVarQ52);
                }
                ViewGroup viewGroupS53 = verificationPopupFragment.s5();
                com.avito.android.lib.design.text_view.a aVarQ53 = verificationPopupFragment.q5(y6.b(12), R.attr.textM10);
                com.avito.android.util.text.j.a(aVarQ53, infoBlock.getText(), null);
                aVarQ53.setMovementMethod(LinkMovementMethod.getInstance());
                infoBlock.getText().setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(verificationPopupFragment, 26));
                viewGroupS53.addView(aVarQ53);
            }
            C47313c c47313c = verificationPopupFragment.f212214s0;
            kotlin.reflect.n<Object> nVar = VerificationPopupFragment.f212208y0[1];
            Button button = (Button) c47313c.a();
            VerificationDisclaimer.Button submitButton = verificationDisclaimer.getSubmitButton();
            com.avito.android.lib.design.button.b.a(button, submitButton != null ? submitButton.getTitle() : null, false);
            bVar.invoke(a.e.f17743a);
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationPopupFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW50/a;", "it", "Lkotlin/G0;", "invoke", "(LW50/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<W50.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(W50.a aVar) {
            a aVar2 = VerificationPopupFragment.f212207x0;
            VerificationPopupFragment.this.t5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/U", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return VerificationPopupFragment.this.requireActivity().getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return VerificationPopupFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/W", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return VerificationPopupFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f212225l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f212225l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f212225l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VerificationPopupFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f212227l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f212227l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f212227l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212228l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212228l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f212228l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212229l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212229l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f212229l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VerificationPopupFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/verification_popup/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/create_flow/verification_popup/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.passport.profile_add.create_flow.verification_popup.i> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.passport.profile_add.create_flow.verification_popup.i invoke() {
            com.avito.android.passport.profile_add.create_flow.verification_popup.j jVar = VerificationPopupFragment.this.f212209n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.passport.profile_add.create_flow.verification_popup.i) jVar.get();
        }
    }

    static {
        Y y12 = new Y(VerificationPopupFragment.class, "textContainer", "getTextContainer()Landroid/view/ViewGroup;", 0);
        n0 n0Var = m0.f406844a;
        f212208y0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(VerificationPopupFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(VerificationPopupFragment.class, "appBar", "getAppBar()Lru/avito/component/appbar/AppBar;", 0, n0Var)};
        f212207x0 = new a(null);
    }

    public VerificationPopupFragment() {
        super(R.layout.passport_create_profile_verification_popup_fragment);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        n0 n0Var = m0.f406844a;
        this.f212210o0 = new O0(n0Var.b(com.avito.android.passport.profile_add.create_flow.verification_popup.i.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f212213r0 = new C47313c(null, 1, null);
        this.f212214s0 = new C47313c(null, 1, null);
        this.f212215t0 = new C47313c(null, 1, null);
        this.f212216u0 = new O0(n0Var.b(com.avito.android.passport.profile_add.f.class), new f(), new h(), new g());
        this.f212217v0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f212218w0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f212218w0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, t5(), new c(1, this, VerificationPopupFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupOneTimeEvent;)V", 0), new d());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        M81.c cVar = new M81.c(view, null, false, 4, null);
        C47313c c47313c = this.f212215t0;
        kotlin.reflect.n<Object>[] nVarArr = f212208y0;
        kotlin.reflect.n<Object> nVar = nVarArr[2];
        c47313c.b(this, cVar);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.verification_popup_text_container);
        C47313c c47313c2 = this.f212213r0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        c47313c2.b(this, viewGroup);
        Button button = (Button) view.findViewById(R.id.verification_popup_continue_button);
        C47313c c47313c3 = this.f212214s0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        c47313c3.b(this, button);
        InterfaceC42726C interfaceC42726C = this.f212217v0;
        ProfileCreateExtendedFlow profileCreateExtendedFlow = ((VerificationPopupArguments) interfaceC42726C.getValue()).f212202d;
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport) {
            r5().g5(R.drawable.ic_close_24_black, null);
            r5().f5(new com.avito.android.passport.profile_add.create_flow.verification_popup.d(this));
        } else {
            if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile.Upgrade ? true : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile.BusinessRegistrationUpgrade) {
                r5().g5(R.drawable.ic_back_24_black, null);
                r5().f5(new com.avito.android.passport.profile_add.create_flow.verification_popup.e(this));
                if (!((VerificationPopupArguments) interfaceC42726C.getValue()).f212204f) {
                    r5().setMenu(R.menu.extend_profile_menu);
                    r5().h5(R.attr.blue600);
                    C43175k.K(new C43197r1(new com.avito.android.passport.profile_add.create_flow.verification_popup.f(this, null), new com.avito.android.passport.profile_add.create_flow.verification_popup.c(C23069w.a(y.a(r5().e5()), getViewLifecycleOwner().getLifecycle(), Lifecycle.State.f46682e))), C22984Q.a(getViewLifecycleOwner()));
                }
            } else if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification) {
                r5().g5(R.drawable.ic_back_24_black, null);
                r5().f5(new com.avito.android.passport.profile_add.create_flow.verification_popup.g(this));
            }
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f212211p0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.passport.profile_add.create_flow.verification_popup.a(this, null), y.a(aVar.V9())), C22984Q.a(getViewLifecycleOwner()));
        kotlin.reflect.n<Object> nVar4 = nVarArr[1];
        ((Button) c47313c3.a()).setOnClickListener(new com.avito.android.order.feature.c(this, 7));
        ScreenPerformanceTracker screenPerformanceTracker = this.f212218w0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.passport.profile_add.create_flow.verification_popup.di.a.a();
        com.avito.android.passport.profile_add.di.a aVar = (com.avito.android.passport.profile_add.di.a) C29972i.a(C29972i.b(this), com.avito.android.passport.profile_add.di.a.class);
        S0 f42820b = getF42820b();
        VerificationPopupArguments verificationPopupArguments = (VerificationPopupArguments) this.f212217v0.getValue();
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        O0 o02 = this.f212216u0;
        Z1<String> z12 = ((com.avito.android.passport.profile_add.f) o02.getValue()).f212375K;
        Z1<AnalyticScreen> z13 = ((com.avito.android.passport.profile_add.f) o02.getValue()).f212376L;
        com.avito.android.passport.profile_add.f fVar = (com.avito.android.passport.profile_add.f) o02.getValue();
        aVarA.a(aVar, f42820b, verificationPopupArguments, interfaceC39417aB, z12, z13, fVar.f212373E, s.c(this), VerificationPopupScreen.f213625d, new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f212218w0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.lib.design.text_view.a q5(int i12, @InterfaceC42150f int i13) {
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(s5().getContext(), null, 0, 0, 14, null);
        aVar.setTextAppearance(C35835l0.j(i13, s5().getContext()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i12, 0, 0);
        aVar.setLayoutParams(layoutParams);
        return aVar;
    }

    public final M81.b r5() {
        C47313c c47313c = this.f212215t0;
        kotlin.reflect.n<Object> nVar = f212208y0[2];
        return (M81.b) c47313c.a();
    }

    public final ViewGroup s5() {
        C47313c c47313c = this.f212213r0;
        kotlin.reflect.n<Object> nVar = f212208y0[0];
        return (ViewGroup) c47313c.a();
    }

    public final com.avito.android.passport.profile_add.create_flow.verification_popup.i t5() {
        return (com.avito.android.passport.profile_add.create_flow.verification_popup.i) this.f212210o0.getValue();
    }
}
