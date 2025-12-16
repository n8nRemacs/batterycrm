package com.avito.android.verification.verification_disclaimer;

import Cd.C13243a;
import NM0.b;
import NM0.c;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
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
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.HelpCenterUrlShowLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.verification.verification_disclaimer.VerificationDisclaimerScreenData;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import xM0.C49864d;
import z1.AbstractC50339a;

/* compiled from: VerificationDisclaimerFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/VerificationDisclaimerFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationDisclaimerFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f325020t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public l f325021n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f325022o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f325023p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f325024q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public m f325025r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final b f325026s0;

    /* compiled from: VerificationDisclaimerFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/VerificationDisclaimerFragment$a;", "", "<init>", "()V", "", "KEY_VERIFICATION_DISCLAIMER_ARGS", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationDisclaimerFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNM0/b;", "it", "Lkotlin/G0;", "invoke", "(LNM0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<NM0.b, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(NM0.b bVar) {
            NM0.b bVar2 = bVar;
            if (bVar2 instanceof b.a) {
                a.i.C4057a.d(VerificationDisclaimerFragment.this.f5(), ((b.a) bVar2).f11388a, null, null, null, 0, null, null, null, 2046);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationDisclaimerFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNM0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LNM0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<NM0.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(NM0.c cVar) throws Resources.NotFoundException {
            boolean z12;
            VerificationDisclaimerScreenData verificationDisclaimerScreenData;
            String supportUrl;
            int i12;
            G0 g02;
            NM0.c cVar2 = cVar;
            a aVar = VerificationDisclaimerFragment.f325020t0;
            VerificationDisclaimerFragment verificationDisclaimerFragment = VerificationDisclaimerFragment.this;
            com.avito.android.verification.verification_disclaimer.c cVar3 = new com.avito.android.verification.verification_disclaimer.c(1, (k) verificationDisclaimerFragment.f325022o0.getValue(), k.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            m mVar = verificationDisclaimerFragment.f325025r0;
            if (mVar != null) {
                com.avito.android.verification.verification_disclaimer.d dVar = new com.avito.android.verification.verification_disclaimer.d(0, verificationDisclaimerFragment.requireActivity(), ActivityC22955m.class, "onBackPressed", "onBackPressed()V", 0);
                com.avito.android.verification.verification_disclaimer.e eVar = new com.avito.android.verification.verification_disclaimer.e(0, verificationDisclaimerFragment.requireActivity(), ActivityC22955m.class, "finish", "finish()V", 0);
                B b12 = new B(29, cVar3);
                NavBar navBar = mVar.f325075c;
                navBar.c(R.attr.ic_arrowBack24, dVar);
                com.avito.android.seller_promotions.b bVar = new com.avito.android.seller_promotions.b(i, cVar3);
                com.avito.android.tariff.cpx.configure.levels.d dVar2 = new com.avito.android.tariff.cpx.configure.levels.d(26, cVar3, mVar);
                C49864d c49864d = mVar.f325080h;
                c49864d.a(bVar, dVar2);
                if (cVar2 instanceof c.b) {
                    VerificationDisclaimerScreenData verificationDisclaimerScreenData2 = ((c.b) cVar2).f11391b;
                    mVar.f325073a.l(verificationDisclaimerScreenData2.f325035a, null);
                    TextView textView = mVar.f325077e;
                    AttributedText attributedText = verificationDisclaimerScreenData2.f325037c;
                    com.avito.android.util.text.j.a(textView, attributedText, null);
                    if (attributedText != null) {
                        attributedText.setOnDeepLinkClickListener(b12);
                    }
                    VerificationDisclaimerScreenData.Button button = verificationDisclaimerScreenData2.f325036b;
                    Button button2 = mVar.f325079g;
                    button2.setText(button.f325041a);
                    button2.setEnabled(!button.f325043c);
                    button2.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(27, cVar3, button));
                    int iOrdinal = button.f325044d.ordinal();
                    if (iOrdinal == 0) {
                        i12 = R.attr.buttonDefaultLarge;
                    } else if (iOrdinal == 1) {
                        i12 = R.attr.buttonPrimaryLarge;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i12 = R.attr.buttonSecondaryLarge;
                    }
                    button2.setAppearance(C35835l0.j(i12, button2.getContext()));
                    Context context = mVar.f325074b;
                    UniversalImage universalImage = verificationDisclaimerScreenData2.f325039e;
                    SimpleDraweeView simpleDraweeView = mVar.f325076d;
                    if (universalImage != null) {
                        C35949t5.c(mVar.f325076d, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context))), null, null, null, 14);
                        D6.H(simpleDraweeView);
                        g02 = G0.f406611a;
                    } else {
                        g02 = null;
                    }
                    if (g02 == null) {
                        D6.w(simpleDraweeView);
                    }
                    mVar.f325078f.l(new PV.a(y6.b(universalImage == null ? 12 : 24), y6.b(32), 0, 0, 12, null), -1);
                    List list = verificationDisclaimerScreenData2.f325038d;
                    if (list == null) {
                        list = C42784z0.f406748b;
                    }
                    com.avito.android.lib.design.bottom_sheet.o oVar = new com.avito.android.lib.design.bottom_sheet.o(context, new o(list, b12));
                    if (list.isEmpty()) {
                        navBar.setActions(new View[0]);
                    } else {
                        ImageView imageViewA = navBar.a(R.attr.ic_more24);
                        imageViewA.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(oVar, 13));
                        navBar.setActions(imageViewA);
                    }
                    c49864d.b();
                    if (verificationDisclaimerScreenData2.f325040f) {
                        navBar.c(R.attr.ic_close24, eVar);
                    }
                    z12 = false;
                } else if (cVar2.equals(c.C0731c.f11392b)) {
                    z12 = false;
                    navBar.setActions(new View[0]);
                    C49864d.d(c49864d);
                } else {
                    z12 = false;
                    if (cVar2 instanceof c.a) {
                        navBar.c(R.attr.ic_close24, dVar);
                        c.a aVar2 = (c.a) cVar2;
                        String str = aVar2.f11389b;
                        CM0.e eVar2 = aVar2.f11390c;
                        C49864d.c(c49864d, new p(eVar2, str));
                        if (eVar2 == null || (supportUrl = eVar2.getSupportUrl()) == null) {
                            supportUrl = "";
                        }
                        c49864d.f442450h = new HelpCenterUrlShowLink(C43066x.U("https://support.avito.ru/", supportUrl));
                    }
                }
            } else {
                z12 = false;
            }
            c.b bVar2 = cVar2 instanceof c.b ? (c.b) cVar2 : null;
            verificationDisclaimerFragment.f325026s0.d((bVar2 == null || (verificationDisclaimerScreenData = bVar2.f11391b) == null) ? z12 : verificationDisclaimerScreenData.f325040f);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f325029l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f325029l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f325029l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VerificationDisclaimerFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f325031l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f325031l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f325031l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325032l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325032l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f325032l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325033l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325033l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f325033l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VerificationDisclaimerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/verification/verification_disclaimer/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<k> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final k invoke() {
            l lVar = VerificationDisclaimerFragment.this.f325021n0;
            if (lVar == null) {
                lVar = null;
            }
            return (k) lVar.get();
        }
    }

    public VerificationDisclaimerFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f325022o0 = new O0(m0.f406844a.b(k.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f325026s0 = new b();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f325023p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f325023p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (k) this.f325022o0.getValue(), new c(), new d());
        return layoutInflater.inflate(R.layout.fragment_verification_disclaimer, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f325025r0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.d dVar = this.f325024q0;
        if (dVar == null) {
            dVar = null;
        }
        this.f325025r0 = new m(view, dVar);
        requireActivity().getF21241d().a(getViewLifecycleOwner(), this.f325026s0);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325023p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        com.avito.android.verification.di.disclaimer.a.a().a(s.c(this), getResources(), (VerificationDisclaimerArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key.verification_disclaimer_args", VerificationDisclaimerArgs.class) : bundleRequireArguments.getParcelable("key.verification_disclaimer_args")), new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 17), (com.avito.android.verification.di.disclaimer.c) C29972i.a(C29972i.b(this), com.avito.android.verification.di.disclaimer.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325023p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    /* renamed from: q5, reason: merged with bridge method [inline-methods] */
    public final com.avito.android.deeplink_handler.view.impl.l f5() {
        return new com.avito.android.deeplink_handler.view.impl.l(requireContext(), requireView().findViewById(R.id.verification_disclaimer_button), requireView().findViewById(R.id.verification_disclaimer_nav_bar), null, null, 24, null);
    }

    /* compiled from: VerificationDisclaimerFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/verification/verification_disclaimer/VerificationDisclaimerFragment$b", "Landroidx/activity/x;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
        }
    }
}
