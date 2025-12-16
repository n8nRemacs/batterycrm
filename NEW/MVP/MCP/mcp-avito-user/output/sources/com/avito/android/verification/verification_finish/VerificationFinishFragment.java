package com.avito.android.verification.verification_finish;

import Cd.C13243a;
import QM0.a;
import QM0.b;
import QM0.c;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.verification.verification_finish.p;
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

/* compiled from: VerificationFinishFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_finish/VerificationFinishFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationFinishFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final a f325228r0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.verification.verification_finish.b f325229n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f325230o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f325231p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f325232q0;

    /* compiled from: VerificationFinishFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_finish/VerificationFinishFragment$a;", "", "<init>", "()V", "", "KEY_VERIFICATION_FINISH_ARGS", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationFinishFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQM0/b;", "it", "Lkotlin/G0;", "invoke", "(LQM0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<QM0.b, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(QM0.b bVar) {
            if (bVar.equals(b.a.f13698a)) {
                VerificationFinishFragment.this.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationFinishFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQM0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LQM0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<QM0.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s f325234l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ VerificationFinishFragment f325235m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar, VerificationFinishFragment verificationFinishFragment) {
            super(1);
            this.f325234l = sVar;
            this.f325235m = verificationFinishFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(QM0.c cVar) throws Resources.NotFoundException {
            QM0.c cVar2 = cVar;
            a aVar = VerificationFinishFragment.f325228r0;
            final com.avito.android.verification.verification_finish.g gVar = new com.avito.android.verification.verification_finish.g(1, (com.avito.android.verification.verification_finish.a) this.f325235m.f325230o0.getValue(), com.avito.android.verification.verification_finish.a.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            final s sVar = this.f325234l;
            q qVar = new q(0, gVar);
            com.avito.android.seller_promotions.b bVar = new com.avito.android.seller_promotions.b(25, gVar);
            final int i12 = 2;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.avito.android.verification.verification_finish.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            ((g) gVar).invoke(new a.C0900a(((p.a) sVar).f325319c));
                            break;
                        case 1:
                            ((g) gVar).invoke(new a.C0900a(((p.a) sVar).f325319c));
                            break;
                        default:
                            gVar.invoke(new a.c(((s) sVar).f325331g.f442450h));
                            break;
                    }
                }
            };
            C49864d c49864d = sVar.f325331g;
            c49864d.a(bVar, onClickListener);
            boolean z12 = cVar2 instanceof c.b;
            NavBar navBar = sVar.f325326b;
            Button button = sVar.f325330f;
            Button button2 = sVar.f325329e;
            if (z12) {
                p pVar = ((c.b) cVar2).f13700b;
                final p.a aVar2 = pVar.f325314d;
                com.avito.android.lib.design.button.b.a(button2, aVar2.f325317a, false);
                button2.setAppearance(C35835l0.j(aVar2.f325318b, button2.getContext()));
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.verification.verification_finish.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i) {
                            case 0:
                                ((g) gVar).invoke(new a.C0900a(((p.a) aVar2).f325319c));
                                break;
                            case 1:
                                ((g) gVar).invoke(new a.C0900a(((p.a) aVar2).f325319c));
                                break;
                            default:
                                gVar.invoke(new a.c(((s) aVar2).f325331g.f442450h));
                                break;
                        }
                    }
                });
                G0 g02 = G0.f406611a;
                if (g02 == null) {
                    D6.w(button2);
                }
                final p.a aVar3 = pVar.f325315e;
                com.avito.android.lib.design.button.b.a(button, aVar3.f325317a, false);
                button.setAppearance(C35835l0.j(aVar3.f325318b, button2.getContext()));
                final int i13 = 1;
                button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.verification.verification_finish.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                ((g) gVar).invoke(new a.C0900a(((p.a) aVar3).f325319c));
                                break;
                            case 1:
                                ((g) gVar).invoke(new a.C0900a(((p.a) aVar3).f325319c));
                                break;
                            default:
                                gVar.invoke(new a.c(((s) aVar3).f325331g.f442450h));
                                break;
                        }
                    }
                });
                if (g02 == null) {
                    D6.w(button);
                }
                I5.a(sVar.f325327c, pVar.f325311a, false);
                TextView textView = sVar.f325328d;
                AttributedText attributedText = pVar.f325312b;
                com.avito.android.util.text.j.a(textView, attributedText, null);
                if (attributedText != null) {
                    attributedText.setOnDeepLinkClickListener(qVar);
                }
                sVar.f325325a.l(pVar.f325313c, null);
                navBar.setVisibility(pVar.f325316f ? 0 : 8);
                c49864d.b();
            } else if (cVar2 instanceof c.C0901c) {
                C49864d.d(c49864d);
                D6.w(button2);
                D6.w(button);
                navBar.setVisibility(8);
            } else if (cVar2 instanceof c.a) {
                D6.H(navBar);
                C49864d.c(c49864d, t.f325333l);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationFinishFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = VerificationFinishFragment.f325228r0;
            ((com.avito.android.verification.verification_finish.a) VerificationFinishFragment.this.f325230o0.getValue()).accept(a.b.f13695a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f325237l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f325237l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f325237l);
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
            return VerificationFinishFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f325239l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f325239l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f325239l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325240l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325240l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f325240l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325241l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325241l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f325241l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VerificationFinishFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/verification/verification_finish/a;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/verification/verification_finish/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.verification.verification_finish.a> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.verification.verification_finish.a invoke() {
            com.avito.android.verification.verification_finish.b bVar = VerificationFinishFragment.this.f325229n0;
            if (bVar == null) {
                bVar = null;
            }
            return (com.avito.android.verification.verification_finish.a) bVar.get();
        }
    }

    public VerificationFinishFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f325230o0 = new O0(m0.f406844a.b(com.avito.android.verification.verification_finish.a.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f325232q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_verification_finish, viewGroup, false);
        com.avito.konveyor.adapter.d dVar = this.f325231p0;
        if (dVar == null) {
            dVar = null;
        }
        s sVar = new s(dVar, viewInflate, new d());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f325232q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.verification.verification_finish.a) this.f325230o0.getValue(), new b(), new c(sVar, this));
        requireActivity().getF21241d().a(getViewLifecycleOwner(), new com.avito.android.verification.verification_finish.f());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325232q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        requireActivity().setResult(-1);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        com.avito.android.verification.di.finish.a.a().a(com.avito.android.analytics.screens.s.c(this), (VerificationFinishArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key.verification_finish_args", VerificationFinishArgs.class) : bundleRequireArguments.getParcelable("key.verification_finish_args")), new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 18), (com.avito.android.verification.di.finish.c) C29972i.a(C29972i.b(this), com.avito.android.verification.di.finish.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325232q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
