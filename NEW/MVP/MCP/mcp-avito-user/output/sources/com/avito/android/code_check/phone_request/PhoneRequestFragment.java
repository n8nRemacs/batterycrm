package com.avito.android.code_check.phone_request;

import Cd.C13243a;
import Ro.InterfaceC15066a;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.M;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_check.CodeCheckAbstractFragment;
import com.avito.android.code_check.phone_request.PhoneRequestFragment;
import com.avito.android.code_check.phone_request.a;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35966w1;
import dagger.internal.t;
import dagger.internal.u;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: PhoneRequestFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check/phone_request/PhoneRequestFragment;", "Lcom/avito/android/code_check/CodeCheckAbstractFragment;", "<init>", "()V", "a", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PhoneRequestFragment extends CodeCheckAbstractFragment {

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public static final a f119032H0;

    /* renamed from: I0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f119033I0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f119034A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f119035B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f119036C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f119037D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f119038E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final C47313c f119039F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final O0 f119040G0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public u f119041s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.code_check_public.screen.d f119042t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f119043u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.code_check.d f119044v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f119045w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f119046x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f119047y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f119048z0;

    /* compiled from: PhoneRequestFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/code_check/phone_request/PhoneRequestFragment$a;", "", "<init>", "()V", "", "ARGS_SCREEN_NAME", "Ljava/lang/String;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: PhoneRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.code_check.phone_request.PhoneRequestFragment$a$a, reason: collision with other inner class name */
        public static final class C3475a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f119049l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3475a(String str) {
                super(1);
                this.f119049l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("code_check.phone_request.screen_name", this.f119049l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static PhoneRequestFragment a(@Y61.k String str) {
            PhoneRequestFragment phoneRequestFragment = new PhoneRequestFragment();
            C35966w1.a(phoneRequestFragment, -1, new C3475a(str));
            return phoneRequestFragment;
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f119050l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f119050l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f119050l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PhoneRequestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f119052l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f119052l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f119052l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f119053l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f119053l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f119053l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f119054l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f119054l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f119054l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PhoneRequestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_request/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/code_check/phone_request/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<p> {
        public g() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final p invoke() {
            u uVar = PhoneRequestFragment.this.f119041s0;
            if (uVar == null) {
                uVar = null;
            }
            return (p) uVar.get();
        }
    }

    static {
        Y y12 = new Y(PhoneRequestFragment.class, "scrollView", "getScrollView()Landroid/widget/ScrollView;", 0);
        n0 n0Var = m0.f406844a;
        f119033I0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(PhoneRequestFragment.class, "phoneInput", "getPhoneInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneRequestFragment.class, "phoneInputContainer", "getPhoneInputContainer()Lcom/avito/android/lib/design/component_container/ComponentContainer;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneRequestFragment.class, "confirmButton", "getConfirmButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneRequestFragment.class, "additionalButton", "getAdditionalButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneRequestFragment.class, "additionalButtonSpacer", "getAdditionalButtonSpacer()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneRequestFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneRequestFragment.class, "buttonLegal", "getButtonLegal()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneRequestFragment.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PhoneRequestFragment.class, "legal", "getLegal()Landroid/widget/TextView;", 0, n0Var)};
        f119032H0 = new a(null);
    }

    public PhoneRequestFragment() {
        super(R.layout.phone_request_fragment, R.id.phone_request_scroll, R.id.phone_request_nav_bar);
        this.f119045w0 = new C47313c(null, 1, null);
        this.f119046x0 = new C47313c(null, 1, null);
        this.f119047y0 = new C47313c(null, 1, null);
        this.f119048z0 = new C47313c(null, 1, null);
        this.f119034A0 = new C47313c(null, 1, null);
        this.f119035B0 = new C47313c(null, 1, null);
        this.f119036C0 = new C47313c(null, 1, null);
        this.f119037D0 = new C47313c(null, 1, null);
        this.f119038E0 = new C47313c(null, 1, null);
        this.f119039F0 = new C47313c(null, 1, null);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f119040G0 = new O0(m0.f406844a.b(p.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C22823h0.K(requireActivity().getWindow().getDecorView(), null);
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.b();
        a.c cVar = new a.c(new k(), (com.avito.android.code_check.phone_request.c) C29972i.a(C29972i.b(this), com.avito.android.code_check.phone_request.c.class), cv.c.b(this), requireArguments().getString("code_check.phone_request.screen_name"), s.c(this), null);
        this.f119041s0 = cVar.f119067l;
        this.f119042t0 = cVar.f119059d.get();
        this.f119043u0 = cVar.f119066k.get();
        com.avito.android.code_check.d dVarVj = cVar.f119056a.Vj();
        t.c(dVarVj);
        this.f119044v0 = dVarVj;
        ScreenPerformanceTracker screenPerformanceTracker = this.f119043u0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        if (bundle == null) {
            com.avito.android.code_check_public.screen.d dVar = this.f119042t0;
            if (dVar == null) {
                dVar = null;
            }
            Y41.l<Phone, G0> lVar = dVar.f119362c;
            if (lVar != null) {
                com.avito.android.code_check.d dVar2 = this.f119044v0;
                if (dVar2 == null) {
                    dVar2 = null;
                }
                String strA = dVar2.G3().a();
                String strA2 = strA != null ? To.c.a(strA) : null;
                lVar.invoke(strA2 != null ? Phone.a(strA2) : null);
            }
        }
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    @Y61.k
    public final com.avito.android.code_check_public.screen.h q5() {
        com.avito.android.code_check_public.screen.d dVar = this.f119042t0;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    @Y61.k
    public final ScreenPerformanceTracker r5() {
        ScreenPerformanceTracker screenPerformanceTracker = this.f119043u0;
        if (screenPerformanceTracker != null) {
            return screenPerformanceTracker;
        }
        return null;
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    public final void s5() {
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.code_check.phone_request.f(this, null), 3);
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    public final void t5() {
        com.avito.android.lib.design.input.n.c(x5(), new com.avito.android.code_check.phone_request.g(this));
        C47313c c47313c = this.f119048z0;
        kotlin.reflect.n<Object>[] nVarArr = f119033I0;
        kotlin.reflect.n<Object> nVar = nVarArr[3];
        final int i12 = 0;
        ((Button) c47313c.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.code_check.phone_request.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PhoneRequestFragment f119073c;

            {
                this.f119073c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneRequestFragment phoneRequestFragment = this.f119073c;
                switch (i12) {
                    case 0:
                        PhoneRequestFragment.a aVar = PhoneRequestFragment.f119032H0;
                        phoneRequestFragment.z5().accept(new InterfaceC15066a.c(To.c.a(phoneRequestFragment.x5().getDeformattedText()), null));
                        break;
                    default:
                        PhoneRequestFragment.a aVar2 = PhoneRequestFragment.f119032H0;
                        phoneRequestFragment.z5().accept(new InterfaceC15066a.C0978a(To.c.a(phoneRequestFragment.x5().getDeformattedText()), null));
                        break;
                }
            }
        });
        C47313c c47313c2 = this.f119034A0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[4];
        final int i13 = 1;
        ((Button) c47313c2.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.code_check.phone_request.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PhoneRequestFragment f119073c;

            {
                this.f119073c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneRequestFragment phoneRequestFragment = this.f119073c;
                switch (i13) {
                    case 0:
                        PhoneRequestFragment.a aVar = PhoneRequestFragment.f119032H0;
                        phoneRequestFragment.z5().accept(new InterfaceC15066a.c(To.c.a(phoneRequestFragment.x5().getDeformattedText()), null));
                        break;
                    default:
                        PhoneRequestFragment.a aVar2 = PhoneRequestFragment.f119032H0;
                        phoneRequestFragment.z5().accept(new InterfaceC15066a.C0978a(To.c.a(phoneRequestFragment.x5().getDeformattedText()), null));
                        break;
                }
            }
        });
        C43175k.K(new C43197r1(new h(this, null), y.a(com.avito.android.lib.design.input.n.a(x5(), 6))), C22984Q.a(getViewLifecycleOwner()));
        final i iVar = new i(this);
        C22823h0.K(requireActivity().getWindow().getDecorView(), new M() { // from class: com.avito.android.code_check.phone_request.d
            @Override // androidx.core.view.M
            public final J0 h(View view, J0 j02) {
                PhoneRequestFragment.a aVar = PhoneRequestFragment.f119032H0;
                if (j02.p(8)) {
                    ((i) iVar).invoke();
                }
                return C22823h0.v(view, j02);
            }
        });
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    public final void u5(@Y61.k View view) {
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.phone_request_scroll);
        C47313c c47313c = this.f119045w0;
        kotlin.reflect.n<Object>[] nVarArr = f119033I0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, scrollView);
        Input input = (Input) view.findViewById(R.id.phone_request_input);
        com.avito.android.code_check_public.screen.d dVar = this.f119042t0;
        if (dVar == null) {
            dVar = null;
        }
        input.setHint(dVar.f119364e.f119369c.k0(input.getContext()));
        com.avito.android.code_check_public.screen.d dVar2 = this.f119042t0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        if (dVar2.f119364e.f119376j) {
            input.v();
        }
        com.avito.android.code_check_public.screen.d dVar3 = this.f119042t0;
        if (dVar3 == null) {
            dVar3 = null;
        }
        com.avito.android.code_check.u.a(input, dVar3.f119364e.f119373g);
        C47313c c47313c2 = this.f119046x0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, input);
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.phone_request_input_cc);
        C47313c c47313c3 = this.f119047y0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, componentContainer);
        View viewFindViewById = view.findViewById(R.id.phone_request_button_spacer);
        com.avito.android.code_check_public.screen.d dVar4 = this.f119042t0;
        if (dVar4 == null) {
            dVar4 = null;
        }
        viewFindViewById.setVisibility(dVar4.f119364e.f119375i != null ? 8 : 0);
        C47313c c47313c4 = this.f119035B0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[5];
        c47313c4.b(this, viewFindViewById);
        Button button = (Button) view.findViewById(R.id.phone_request_additional_button);
        com.avito.android.code_check_public.screen.d dVar5 = this.f119042t0;
        if (dVar5 == null) {
            dVar5 = null;
        }
        PrintableText printableText = dVar5.f119364e.f119375i;
        if (printableText != null) {
            button.setText(printableText.k0(button.getContext()));
        }
        button.setVisibility(printableText == null ? 8 : 0);
        C47313c c47313c5 = this.f119034A0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, button);
        Button button2 = (Button) view.findViewById(R.id.phone_request_button);
        com.avito.android.code_check_public.screen.d dVar6 = this.f119042t0;
        if (dVar6 == null) {
            dVar6 = null;
        }
        button2.setText(dVar6.f119364e.f119370d.k0(button2.getContext()));
        C47313c c47313c6 = this.f119048z0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[3];
        c47313c6.b(this, button2);
        TextView textView = (TextView) view.findViewById(R.id.phone_request_title);
        com.avito.android.code_check_public.screen.d dVar7 = this.f119042t0;
        if (dVar7 == null) {
            dVar7 = null;
        }
        textView.setText(dVar7.f119364e.f119367a.k0(textView.getContext()));
        C47313c c47313c7 = this.f119036C0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[6];
        c47313c7.b(this, textView);
        TextView textView2 = (TextView) view.findViewById(R.id.phone_request_button_legal);
        com.avito.android.code_check_public.screen.d dVar8 = this.f119042t0;
        if (dVar8 == null) {
            dVar8 = null;
        }
        textView2.setText(dVar8.f119364e.f119367a.k0(textView2.getContext()));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        com.avito.android.code_check_public.screen.d dVar9 = this.f119042t0;
        if (dVar9 == null) {
            dVar9 = null;
        }
        com.avito.android.code_check_public.c<AttributedText> cVar = dVar9.f119364e.f119374h;
        AttributedText attributedTextK0 = cVar != null ? cVar.k0(textView2.getContext()) : null;
        if (attributedTextK0 == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            com.avito.android.util.text.j.c(textView2, attributedTextK0, null);
            attributedTextK0.linkClicksV3();
            attributedTextK0.setOnDeepLinkClickListener(this);
        }
        C47313c c47313c8 = this.f119037D0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[7];
        c47313c8.b(this, textView2);
        com.avito.android.code_check_public.screen.d dVar10 = this.f119042t0;
        if (dVar10 == null) {
            dVar10 = null;
        }
        TextView textViewB = com.avito.android.code_check.u.b(this, view, R.id.phone_request_subtitle, dVar10.f119364e.f119371e);
        C47313c c47313c9 = this.f119038E0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[8];
        c47313c9.b(this, textViewB);
        com.avito.android.code_check_public.screen.d dVar11 = this.f119042t0;
        TextView textViewB2 = com.avito.android.code_check.u.b(this, view, R.id.phone_request_legal, (dVar11 != null ? dVar11 : null).f119364e.f119368b);
        C47313c c47313c10 = this.f119039F0;
        kotlin.reflect.n<Object> nVar10 = nVarArr[9];
        c47313c10.b(this, textViewB2);
    }

    public final Input x5() {
        C47313c c47313c = this.f119046x0;
        kotlin.reflect.n<Object> nVar = f119033I0[1];
        return (Input) c47313c.a();
    }

    public final ComponentContainer y5() {
        C47313c c47313c = this.f119047y0;
        kotlin.reflect.n<Object> nVar = f119033I0[2];
        return (ComponentContainer) c47313c.a();
    }

    public final p z5() {
        return (p) this.f119040G0.getValue();
    }
}
