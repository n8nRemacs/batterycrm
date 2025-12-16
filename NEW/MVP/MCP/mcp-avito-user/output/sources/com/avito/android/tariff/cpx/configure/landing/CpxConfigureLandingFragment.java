package com.avito.android.tariff.cpx.configure.landing;

import Cd.C13243a;
import Y41.l;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.configure.landing.CpxConfigureLandingFragment;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qB0.C47270a;
import qB0.C47271b;
import qB0.C47274e;
import qB0.InterfaceC47272c;
import qB0.InterfaceC47273d;
import qK0.C47312b;
import qK0.C47313c;
import v50.C49166b;
import z1.AbstractC50339a;

/* compiled from: CpxConfigureLandingFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/CpxConfigureLandingFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CpxConfigureLandingFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final a f295861E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f295862F0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47312b f295863A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295864B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295865C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295866D0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpx.configure.landing.h f295867n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f295868o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f295869p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f295870q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f295871r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f295872s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public pB0.c f295873t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f295874u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295875v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295876w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295877x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295878y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f295879z0;

    /* compiled from: CpxConfigureLandingFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/CpxConfigureLandingFragment$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CpxConfigureLandingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC47273d, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC47273d interfaceC47273d) {
            InterfaceC47273d interfaceC47273d2 = interfaceC47273d;
            CpxConfigureLandingFragment cpxConfigureLandingFragment = (CpxConfigureLandingFragment) this.receiver;
            a aVar = CpxConfigureLandingFragment.f295861E0;
            cpxConfigureLandingFragment.getClass();
            if (interfaceC47273d2 instanceof InterfaceC47273d.a) {
                ActivityC22955m activityC22955mL1 = cpxConfigureLandingFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else if (interfaceC47273d2 instanceof InterfaceC47273d.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = cpxConfigureLandingFragment.f295871r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC47273d.b) interfaceC47273d2).f429093a, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CpxConfigureLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LqB0/e;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LqB0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<C47274e, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C47274e c47274e) {
            C47271b c47271b;
            CharSequence charSequenceC;
            Float f12;
            C47274e c47274e2 = c47274e;
            a aVar = CpxConfigureLandingFragment.f295861E0;
            CpxConfigureLandingFragment cpxConfigureLandingFragment = CpxConfigureLandingFragment.this;
            com.avito.android.tariff.cpx.configure.landing.c cVar = new com.avito.android.tariff.cpx.configure.landing.c(1, cpxConfigureLandingFragment.r5(), com.avito.android.tariff.cpx.configure.landing.g.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            Throwable th2 = c47274e2.f429098d;
            C47313c c47313c = cpxConfigureLandingFragment.f295876w0;
            C47313c c47313c2 = cpxConfigureLandingFragment.f295875v0;
            C47313c c47313c3 = cpxConfigureLandingFragment.f295864B0;
            if (th2 != null) {
                n<Object>[] nVarArr = CpxConfigureLandingFragment.f295862F0;
                n<Object> nVar = nVarArr[6];
                D6.w((ViewGroup) c47313c3.a());
                n<Object> nVar2 = nVarArr[0];
                D6.w((View) c47313c2.a());
                D6.w(cpxConfigureLandingFragment.q5());
                n<Object> nVar3 = nVarArr[1];
                ((xZ.e) c47313c.a()).d(z.l(th2));
            } else if (c47274e2.f429099e) {
                n<Object>[] nVarArr2 = CpxConfigureLandingFragment.f295862F0;
                n<Object> nVar4 = nVarArr2[1];
                ((xZ.e) c47313c.a()).c();
                n<Object> nVar5 = nVarArr2[6];
                D6.w((ViewGroup) c47313c3.a());
                D6.w(cpxConfigureLandingFragment.q5());
                n<Object> nVar6 = nVarArr2[0];
                D6.H((View) c47313c2.a());
            } else {
                n<Object>[] nVarArr3 = CpxConfigureLandingFragment.f295862F0;
                n<Object> nVar7 = nVarArr3[6];
                D6.H((ViewGroup) c47313c3.a());
                C47313c c47313c4 = cpxConfigureLandingFragment.f295878y0;
                n<Object> nVar8 = nVarArr3[3];
                ProgressBarRe23 progressBarRe23 = (ProgressBarRe23) c47313c4.a();
                C47270a c47270a = c47274e2.f429100f;
                progressBarRe23.setVisibility((c47270a != null ? c47270a.f429082a : null) != null ? 0 : 8);
                if (c47270a != null && (f12 = c47270a.f429082a) != null) {
                    float fFloatValue = f12.floatValue();
                    n<Object> nVar9 = nVarArr3[3];
                    ((ProgressBarRe23) c47313c4.a()).setProgress(fFloatValue);
                }
                if (c47270a != null && (c47271b = c47270a.f429083b) != null) {
                    Context context = cpxConfigureLandingFragment.getContext();
                    if (context != null) {
                        com.avito.android.util.text.a aVar2 = cpxConfigureLandingFragment.f295872s0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        charSequenceC = aVar2.c(context, c47271b.f429084a);
                    } else {
                        charSequenceC = null;
                    }
                    C47313c c47313c5 = cpxConfigureLandingFragment.f295879z0;
                    n<Object> nVar10 = nVarArr3[4];
                    com.avito.android.lib.design.button.b.a((Button) c47313c5.a(), charSequenceC, false);
                }
                C47313c c47313c6 = cpxConfigureLandingFragment.f295865C0;
                n<Object> nVar11 = nVarArr3[7];
                Button button = (Button) c47313c6.a();
                ButtonAction buttonAction = c47274e2.f429097c;
                com.avito.android.lib.design.button.b.a(button, buttonAction != null ? buttonAction.getTitle() : null, false);
                C47313c c47313c7 = cpxConfigureLandingFragment.f295866D0;
                n<Object> nVar12 = nVarArr3[8];
                TextView textView = (TextView) c47313c7.a();
                com.avito.android.util.text.a aVar3 = cpxConfigureLandingFragment.f295872s0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                AttributedText attributedText = c47274e2.f429101g;
                com.avito.android.util.text.j.a(textView, attributedText, aVar3);
                if (attributedText != null) {
                    attributedText.setOnDeepLinkClickListener(new B(15, cVar));
                }
                com.avito.konveyor.adapter.d dVar = cpxConfigureLandingFragment.f295869p0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l(c47274e2.f429096b, null);
                n<Object> nVar13 = nVarArr3[0];
                D6.w((View) c47313c2.a());
                D6.H(cpxConfigureLandingFragment.q5());
                n<Object> nVar14 = nVarArr3[1];
                ((xZ.e) c47313c.a()).b();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CpxConfigureLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<DeepLink, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CpxConfigureLandingFragment.f295861E0;
            CpxConfigureLandingFragment.this.r5().accept(new InterfaceC47272c.e(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: CpxConfigureLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<String, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = CpxConfigureLandingFragment.f295861E0;
            CpxConfigureLandingFragment.this.r5().accept(new InterfaceC47272c.C12312c(str));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f295883l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f295883l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f295883l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CpxConfigureLandingFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f295885l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f295885l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f295885l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f295886l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f295886l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f295886l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f295887l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f295887l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f295887l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CpxConfigureLandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpx/configure/landing/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.tariff.cpx.configure.landing.g> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpx.configure.landing.g invoke() {
            com.avito.android.tariff.cpx.configure.landing.h hVar = CpxConfigureLandingFragment.this.f295867n0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.tariff.cpx.configure.landing.g) hVar.get();
        }
    }

    static {
        Y y12 = new Y(CpxConfigureLandingFragment.class, "shimmer", "getShimmer()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f295862F0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CpxConfigureLandingFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/mnz_common/ui/MnzProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CpxConfigureLandingFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CpxConfigureLandingFragment.class, "toolbarProgressBar", "getToolbarProgressBar()Lcom/avito/android/lib/design/progress_bar_re23/ProgressBarRe23;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CpxConfigureLandingFragment.class, "toolbarButton", "getToolbarButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CpxConfigureLandingFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CpxConfigureLandingFragment.class, "buttonContainer", "getButtonContainer()Landroid/view/ViewGroup;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CpxConfigureLandingFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CpxConfigureLandingFragment.class, "rulesTextView", "getRulesTextView()Landroid/widget/TextView;", 0, n0Var)};
        f295861E0 = new a(null);
    }

    public CpxConfigureLandingFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f295874u0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpx.configure.landing.g.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f295875v0 = new C47313c(null, 1, null);
        this.f295876w0 = new C47313c(null, 1, null);
        this.f295877x0 = new C47313c(null, 1, null);
        this.f295878y0 = new C47313c(null, 1, null);
        this.f295879z0 = new C47313c(null, 1, null);
        this.f295863A0 = new C47312b(null, 1, null);
        this.f295864B0 = new C47313c(null, 1, null);
        this.f295865C0 = new C47313c(null, 1, null);
        this.f295866D0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f295868o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.cpx_configure_landing_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.shimmer_layout);
        C47313c c47313c = this.f295875v0;
        n<Object>[] nVarArr = f295862F0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, viewFindViewById);
        final int i12 = 0;
        xZ.e eVar = new xZ.e((ViewGroup) view.findViewById(R.id.cpx_configure_landing_content_container), new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.landing.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureLandingFragment f295890c;

            {
                this.f295890c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxConfigureLandingFragment cpxConfigureLandingFragment = this.f295890c;
                switch (i12) {
                    case 0:
                        CpxConfigureLandingFragment.a aVar = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.f.f429091a);
                        break;
                    case 1:
                        CpxConfigureLandingFragment.a aVar2 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.d.f429089a);
                        break;
                    case 2:
                        CpxConfigureLandingFragment.a aVar3 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.a.f429086a);
                        break;
                    default:
                        CpxConfigureLandingFragment.a aVar4 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.b.f429087a);
                        break;
                }
            }
        }, null, 4, null);
        C47313c c47313c2 = this.f295876w0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, eVar);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        C47313c c47313c3 = this.f295877x0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, toolbar);
        ProgressBarRe23 progressBarRe23 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        C47313c c47313c4 = this.f295878y0;
        n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, progressBarRe23);
        Button button = (Button) view.findViewById(R.id.mnz_help_button);
        C47313c c47313c5 = this.f295879z0;
        n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, button);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cpx_configure_landing_recycler_view);
        n<Object> nVar6 = nVarArr[5];
        this.f295863A0.b(this, recyclerView);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cpx_configure_landing_button_container);
        C47313c c47313c6 = this.f295864B0;
        n<Object> nVar7 = nVarArr[6];
        c47313c6.b(this, viewGroup);
        Button button2 = (Button) view.findViewById(R.id.cpx_configure_landing_button);
        C47313c c47313c7 = this.f295865C0;
        n<Object> nVar8 = nVarArr[7];
        c47313c7.b(this, button2);
        TextView textView = (TextView) view.findViewById(R.id.cpx_configure_landing_text_rules);
        C47313c c47313c8 = this.f295866D0;
        n<Object> nVar9 = nVarArr[8];
        c47313c8.b(this, textView);
        n<Object> nVar10 = nVarArr[2];
        final int i13 = 1;
        ((Toolbar) c47313c3.a()).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.landing.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureLandingFragment f295890c;

            {
                this.f295890c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxConfigureLandingFragment cpxConfigureLandingFragment = this.f295890c;
                switch (i13) {
                    case 0:
                        CpxConfigureLandingFragment.a aVar = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.f.f429091a);
                        break;
                    case 1:
                        CpxConfigureLandingFragment.a aVar2 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.d.f429089a);
                        break;
                    case 2:
                        CpxConfigureLandingFragment.a aVar3 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.a.f429086a);
                        break;
                    default:
                        CpxConfigureLandingFragment.a aVar4 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.b.f429087a);
                        break;
                }
            }
        });
        n<Object> nVar11 = nVarArr[4];
        final int i14 = 2;
        ((Button) c47313c5.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.landing.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureLandingFragment f295890c;

            {
                this.f295890c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxConfigureLandingFragment cpxConfigureLandingFragment = this.f295890c;
                switch (i14) {
                    case 0:
                        CpxConfigureLandingFragment.a aVar = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.f.f429091a);
                        break;
                    case 1:
                        CpxConfigureLandingFragment.a aVar2 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.d.f429089a);
                        break;
                    case 2:
                        CpxConfigureLandingFragment.a aVar3 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.a.f429086a);
                        break;
                    default:
                        CpxConfigureLandingFragment.a aVar4 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.b.f429087a);
                        break;
                }
            }
        });
        RecyclerView recyclerViewQ5 = q5();
        com.avito.konveyor.adapter.d dVar = this.f295869p0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerViewQ5.setAdapter(dVar);
        RecyclerView recyclerViewQ52 = q5();
        pB0.c cVar = this.f295873t0;
        if (cVar == null) {
            cVar = null;
        }
        recyclerViewQ52.l(cVar, -1);
        n<Object> nVar12 = nVarArr[7];
        final int i15 = 3;
        ((Button) c47313c7.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.landing.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureLandingFragment f295890c;

            {
                this.f295890c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxConfigureLandingFragment cpxConfigureLandingFragment = this.f295890c;
                switch (i15) {
                    case 0:
                        CpxConfigureLandingFragment.a aVar = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.f.f429091a);
                        break;
                    case 1:
                        CpxConfigureLandingFragment.a aVar2 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.d.f429089a);
                        break;
                    case 2:
                        CpxConfigureLandingFragment.a aVar3 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.a.f429086a);
                        break;
                    default:
                        CpxConfigureLandingFragment.a aVar4 = CpxConfigureLandingFragment.f295861E0;
                        cpxConfigureLandingFragment.r5().accept(InterfaceC47272c.b.f429087a);
                        break;
                }
            }
        });
        n<Object> nVar13 = nVarArr[8];
        ((TextView) c47313c8.a()).setMovementMethod(LinkMovementMethod.getInstance());
        ScreenPerformanceTracker screenPerformanceTracker = this.f295868o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, r5(), new b(1, this, CpxConfigureLandingFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpx/configure/landing/mvi/entity/CpxConfigureLandingOneTimeEvent;)V", 0), new c());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f295868o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.tariff.cpx.configure.landing.di.l.a().a((WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), s.c(this), com.avito.android.mnz_common.extensions.d.c(this, "remote_context"), new d(), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f295868o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f295871r0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final RecyclerView q5() {
        n<Object> nVar = f295862F0[5];
        return (RecyclerView) this.f295863A0.a();
    }

    public final com.avito.android.tariff.cpx.configure.landing.g r5() {
        return (com.avito.android.tariff.cpx.configure.landing.g) this.f295874u0.getValue();
    }
}
