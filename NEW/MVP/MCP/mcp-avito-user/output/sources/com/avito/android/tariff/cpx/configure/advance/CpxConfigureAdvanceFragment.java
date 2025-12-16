package com.avito.android.tariff.cpx.configure.advance;

import Cd.C13243a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.configure.advance.CpxConfigureAdvanceFragment;
import com.avito.android.tariff.cpx.configure.advance.di.n;
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
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import lB0.C43614a;
import mB0.InterfaceC43942a;
import mB0.d;
import v50.C49166b;
import z1.AbstractC50339a;

/* compiled from: CpxConfigureAdvanceFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/CpxConfigureAdvanceFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CpxConfigureAdvanceFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f295530C0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public View f295531A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f295532B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff.cpx.configure.advance.g f295533n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f295534o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f295535p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f295536q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f295537r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f295538s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final O0 f295539t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public ConstraintLayout f295540u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public ProgressBarRe23 f295541v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public Button f295542w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public Button f295543x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public Button f295544y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public xZ.e f295545z0;

    /* compiled from: CpxConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/CpxConfigureAdvanceFragment$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CpxConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff/cpx/configure/advance/CpxConfigureAdvanceFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            return (ViewGroup) CpxConfigureAdvanceFragment.this.requireView().findViewById(R.id.cpx_configure_advance_container);
        }
    }

    /* compiled from: CpxConfigureAdvanceFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<mB0.d, G0> {
        @Override // Y41.l
        public final G0 invoke(mB0.d dVar) {
            mB0.d dVar2 = dVar;
            CpxConfigureAdvanceFragment cpxConfigureAdvanceFragment = (CpxConfigureAdvanceFragment) this.receiver;
            a aVar = CpxConfigureAdvanceFragment.f295530C0;
            cpxConfigureAdvanceFragment.getClass();
            if (dVar2 instanceof d.a) {
                ActivityC22955m activityC22955mL1 = cpxConfigureAdvanceFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else if (dVar2 instanceof d.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = cpxConfigureAdvanceFragment.f295537r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                d.b bVar = (d.b) dVar2;
                String str = bVar.f414379b;
                aVar2.r6(str != null ? com.avito.android.actions_sheet.a.m("key_cpx_configure_advance", str) : null, bVar.f414378a, str != null ? "key_cpx_configure_advance_request" : null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CpxConfigureAdvanceFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<mB0.e, G0> {
        @Override // Y41.l
        public final G0 invoke(mB0.e eVar) throws Resources.NotFoundException {
            G0 g02;
            mB0.c cVar;
            Float f12;
            mB0.e eVar2 = eVar;
            CpxConfigureAdvanceFragment cpxConfigureAdvanceFragment = (CpxConfigureAdvanceFragment) this.receiver;
            a aVar = CpxConfigureAdvanceFragment.f295530C0;
            cpxConfigureAdvanceFragment.getClass();
            ApiError apiError = eVar2.f414387g;
            if (apiError != null) {
                View view = cpxConfigureAdvanceFragment.f295531A0;
                if (view != null) {
                    D6.w(view);
                }
                ConstraintLayout constraintLayout = cpxConfigureAdvanceFragment.f295540u0;
                if (constraintLayout != null) {
                    D6.H(constraintLayout);
                }
                Button button = cpxConfigureAdvanceFragment.f295542w0;
                if (button != null) {
                    D6.w(button);
                }
                Button button2 = cpxConfigureAdvanceFragment.f295543x0;
                if (button2 != null) {
                    D6.w(button2);
                }
                xZ.e eVar3 = cpxConfigureAdvanceFragment.f295545z0;
                if (eVar3 != null) {
                    eVar3.d(z.k(apiError));
                }
            } else if (eVar2.f414388h) {
                ConstraintLayout constraintLayout2 = cpxConfigureAdvanceFragment.f295540u0;
                if (constraintLayout2 != null) {
                    D6.w(constraintLayout2);
                }
                View view2 = cpxConfigureAdvanceFragment.f295531A0;
                if (view2 != null) {
                    D6.H(view2);
                }
                xZ.e eVar4 = cpxConfigureAdvanceFragment.f295545z0;
                if (eVar4 != null) {
                    eVar4.c();
                }
            } else {
                CharSequence charSequenceC = null;
                attributedText = null;
                AttributedText attributedText = null;
                mB0.b bVar = eVar2.f414382b;
                if (bVar == null || (f12 = bVar.f414373a) == null) {
                    g02 = null;
                } else {
                    float fFloatValue = f12.floatValue();
                    ProgressBarRe23 progressBarRe23 = cpxConfigureAdvanceFragment.f295541v0;
                    if (progressBarRe23 != null) {
                        progressBarRe23.setProgress(fFloatValue);
                    }
                    D6.H(cpxConfigureAdvanceFragment.f295541v0);
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    D6.w(cpxConfigureAdvanceFragment.f295541v0);
                }
                com.avito.konveyor.adapter.d dVar = cpxConfigureAdvanceFragment.f295536q0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l(eVar2.f414383c, null);
                Button button3 = cpxConfigureAdvanceFragment.f295542w0;
                if (button3 != null) {
                    ButtonAction buttonAction = eVar2.f414385e;
                    String title = buttonAction != null ? buttonAction.getTitle() : null;
                    String style = buttonAction != null ? buttonAction.getStyle() : null;
                    com.avito.android.lib.design.button.b.a(button3, title, false);
                    Integer numA = com.avito.android.mnz_common.extensions.c.a(button3.getContext(), style);
                    if (numA != null) {
                        button3.setAppearance(numA.intValue());
                    }
                }
                Button button4 = cpxConfigureAdvanceFragment.f295542w0;
                if (button4 != null) {
                    button4.setLoading(eVar2.f414389i);
                }
                Button button5 = cpxConfigureAdvanceFragment.f295543x0;
                if (button5 != null) {
                    ButtonAction buttonAction2 = eVar2.f414386f;
                    String title2 = buttonAction2 != null ? buttonAction2.getTitle() : null;
                    String style2 = buttonAction2 != null ? buttonAction2.getStyle() : null;
                    com.avito.android.lib.design.button.b.a(button5, title2, false);
                    Integer numA2 = com.avito.android.mnz_common.extensions.c.a(button5.getContext(), style2);
                    if (numA2 != null) {
                        button5.setAppearance(numA2.intValue());
                    }
                }
                Context context = cpxConfigureAdvanceFragment.getContext();
                if (context != null) {
                    com.avito.android.util.text.a aVar2 = cpxConfigureAdvanceFragment.f295538s0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    if (bVar != null && (cVar = bVar.f414374b) != null) {
                        attributedText = cVar.f414375a;
                    }
                    charSequenceC = aVar2.c(context, attributedText);
                }
                Button button6 = cpxConfigureAdvanceFragment.f295544y0;
                if (button6 != null) {
                    com.avito.android.lib.design.button.b.a(button6, charSequenceC, false);
                }
                View view3 = cpxConfigureAdvanceFragment.f295531A0;
                if (view3 != null) {
                    D6.w(view3);
                }
                ConstraintLayout constraintLayout3 = cpxConfigureAdvanceFragment.f295540u0;
                if (constraintLayout3 != null) {
                    D6.H(constraintLayout3);
                }
                xZ.e eVar5 = cpxConfigureAdvanceFragment.f295545z0;
                if (eVar5 != null) {
                    eVar5.b();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CpxConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<String, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = CpxConfigureAdvanceFragment.f295530C0;
            CpxConfigureAdvanceFragment.this.q5().accept(new InterfaceC43942a.C11816a(str));
            return G0.f406611a;
        }
    }

    /* compiled from: CpxConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<DeepLink, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CpxConfigureAdvanceFragment.f295530C0;
            CpxConfigureAdvanceFragment.this.q5().accept(new InterfaceC43942a.h(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: CpxConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<DeepLink, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CpxConfigureAdvanceFragment.f295530C0;
            CpxConfigureAdvanceFragment.this.q5().accept(new InterfaceC43942a.c(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f295550l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f295550l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f295550l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CpxConfigureAdvanceFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f295552l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f295552l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f295552l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f295553l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f295553l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f295553l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f295554l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f295554l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f295554l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CpxConfigureAdvanceFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff/cpx/configure/advance/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.tariff.cpx.configure.advance.f> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff.cpx.configure.advance.f invoke() {
            com.avito.android.tariff.cpx.configure.advance.g gVar = CpxConfigureAdvanceFragment.this.f295533n0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.tariff.cpx.configure.advance.f) gVar.get();
        }
    }

    public CpxConfigureAdvanceFragment() {
        super(R.layout.cpx_configure_advance_fragment);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f295539t0 = new O0(m0.f406844a.b(com.avito.android.tariff.cpx.configure.advance.f.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 12);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new b(activityC22955mRequireActivity);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f295534o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f295534o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new c(1, this, CpxConfigureAdvanceFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceOneTimeEvent;)V", 0), new d(1, this, CpxConfigureAdvanceFragment.class, "render", "render(Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceState;)V", 0));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i12 = 0;
        ((Toolbar) view.findViewById(R.id.mnz_toolbar)).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.advance.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureAdvanceFragment f295557c;

            {
                this.f295557c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxConfigureAdvanceFragment cpxConfigureAdvanceFragment = this.f295557c;
                switch (i12) {
                    case 0:
                        CpxConfigureAdvanceFragment.a aVar = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.b.f414365a);
                        break;
                    case 1:
                        CpxConfigureAdvanceFragment.a aVar2 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.e.f414368a);
                        break;
                    case 2:
                        CpxConfigureAdvanceFragment.a aVar3 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.i.f414372a);
                        break;
                    case 3:
                        CpxConfigureAdvanceFragment.a aVar4 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.d.f414367a);
                        break;
                    default:
                        CpxConfigureAdvanceFragment.a aVar5 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.f.f414369a);
                        break;
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cpx_configure_advance_list);
        com.avito.konveyor.adapter.d dVar = this.f295536q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new C43614a(), -1);
        this.f295540u0 = (ConstraintLayout) view.findViewById(R.id.cpx_configure_advance_content);
        this.f295541v0 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        Button button = (Button) view.findViewById(R.id.cpx_configure_advance_next_button);
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.advance.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureAdvanceFragment f295557c;

            {
                this.f295557c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxConfigureAdvanceFragment cpxConfigureAdvanceFragment = this.f295557c;
                switch (i13) {
                    case 0:
                        CpxConfigureAdvanceFragment.a aVar = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.b.f414365a);
                        break;
                    case 1:
                        CpxConfigureAdvanceFragment.a aVar2 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.e.f414368a);
                        break;
                    case 2:
                        CpxConfigureAdvanceFragment.a aVar3 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.i.f414372a);
                        break;
                    case 3:
                        CpxConfigureAdvanceFragment.a aVar4 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.d.f414367a);
                        break;
                    default:
                        CpxConfigureAdvanceFragment.a aVar5 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.f.f414369a);
                        break;
                }
            }
        });
        this.f295542w0 = button;
        Button button2 = (Button) view.findViewById(R.id.cpx_configure_advance_skip_button);
        final int i14 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.advance.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureAdvanceFragment f295557c;

            {
                this.f295557c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxConfigureAdvanceFragment cpxConfigureAdvanceFragment = this.f295557c;
                switch (i14) {
                    case 0:
                        CpxConfigureAdvanceFragment.a aVar = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.b.f414365a);
                        break;
                    case 1:
                        CpxConfigureAdvanceFragment.a aVar2 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.e.f414368a);
                        break;
                    case 2:
                        CpxConfigureAdvanceFragment.a aVar3 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.i.f414372a);
                        break;
                    case 3:
                        CpxConfigureAdvanceFragment.a aVar4 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.d.f414367a);
                        break;
                    default:
                        CpxConfigureAdvanceFragment.a aVar5 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.f.f414369a);
                        break;
                }
            }
        });
        this.f295543x0 = button2;
        Button button3 = (Button) view.findViewById(R.id.mnz_help_button);
        final int i15 = 3;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.advance.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureAdvanceFragment f295557c;

            {
                this.f295557c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxConfigureAdvanceFragment cpxConfigureAdvanceFragment = this.f295557c;
                switch (i15) {
                    case 0:
                        CpxConfigureAdvanceFragment.a aVar = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.b.f414365a);
                        break;
                    case 1:
                        CpxConfigureAdvanceFragment.a aVar2 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.e.f414368a);
                        break;
                    case 2:
                        CpxConfigureAdvanceFragment.a aVar3 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.i.f414372a);
                        break;
                    case 3:
                        CpxConfigureAdvanceFragment.a aVar4 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.d.f414367a);
                        break;
                    default:
                        CpxConfigureAdvanceFragment.a aVar5 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.f.f414369a);
                        break;
                }
            }
        });
        this.f295544y0 = button3;
        this.f295531A0 = this.f295532B0 ? view.findViewById(R.id.cpx_cards_shimmer_layout) : view.findViewById(R.id.cpx_chips_shimmer_layout);
        final int i16 = 4;
        this.f295545z0 = new xZ.e(this.f295540u0, new View.OnClickListener(this) { // from class: com.avito.android.tariff.cpx.configure.advance.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxConfigureAdvanceFragment f295557c;

            {
                this.f295557c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxConfigureAdvanceFragment cpxConfigureAdvanceFragment = this.f295557c;
                switch (i16) {
                    case 0:
                        CpxConfigureAdvanceFragment.a aVar = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.b.f414365a);
                        break;
                    case 1:
                        CpxConfigureAdvanceFragment.a aVar2 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.e.f414368a);
                        break;
                    case 2:
                        CpxConfigureAdvanceFragment.a aVar3 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.i.f414372a);
                        break;
                    case 3:
                        CpxConfigureAdvanceFragment.a aVar4 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.d.f414367a);
                        break;
                    default:
                        CpxConfigureAdvanceFragment.a aVar5 = CpxConfigureAdvanceFragment.f295530C0;
                        cpxConfigureAdvanceFragment.q5().accept(InterfaceC43942a.f.f414369a);
                        break;
                }
            }
        }, null, 4, null);
        ScreenPerformanceTracker screenPerformanceTracker = this.f295534o0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        this.f295532B0 = com.avito.android.mnz_common.extensions.d.a(this, "key_is_extended_cards");
        n.a().a((WA0.b) C29972i.a(C29972i.b(this), WA0.b.class), cv.c.b(this), s.c(this), com.avito.android.mnz_common.extensions.d.c(this, "remote_context"), this.f295532B0, new e(), new f(), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f295534o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f295537r0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.tariff.cpx.configure.advance.f q5() {
        return (com.avito.android.tariff.cpx.configure.advance.f) this.f295539t0.getValue();
    }
}
