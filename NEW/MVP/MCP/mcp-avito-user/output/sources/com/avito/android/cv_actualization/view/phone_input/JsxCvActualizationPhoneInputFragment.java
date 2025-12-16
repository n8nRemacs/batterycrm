package com.avito.android.cv_actualization.view.phone_input;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
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
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment;
import com.avito.android.cv_actualization.view.phone_input.di.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.text.j;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import tt.AbstractC48713a;
import ut.C49108a;
import ut.C49109b;
import z1.AbstractC50339a;

/* compiled from: JsxCvActualizationPhoneInputFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/JsxCvActualizationPhoneInputFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JsxCvActualizationPhoneInputFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f131227A0 = {m0.f406844a.e(new Y(JsxCvActualizationPhoneInputFragment.class, "openParams", "getOpenParams()Lcom/avito/android/cv_actualization/view/phone_input/JsxCvActualizationPhoneInputOpenParams;", 0))};

    /* renamed from: z0, reason: collision with root package name */
    @k
    public static final a f131228z0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public C49109b f131229n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f131230o0;

    /* renamed from: p0, reason: collision with root package name */
    public View f131231p0;

    /* renamed from: q0, reason: collision with root package name */
    public Toolbar f131232q0;

    /* renamed from: r0, reason: collision with root package name */
    public ComponentContainer f131233r0;

    /* renamed from: s0, reason: collision with root package name */
    public Input f131234s0;

    /* renamed from: t0, reason: collision with root package name */
    public Button f131235t0;

    /* renamed from: u0, reason: collision with root package name */
    public View f131236u0;

    /* renamed from: v0, reason: collision with root package name */
    public TextView f131237v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f131238w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final C35968w3 f131239x0;

    /* renamed from: y0, reason: collision with root package name */
    @k
    public final O0 f131240y0;

    /* compiled from: JsxCvActualizationPhoneInputFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/JsxCvActualizationPhoneInputFragment$a;", "", "<init>", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JsxCvActualizationPhoneInputFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/e;", "invoke", "()Lcom/avito/android/cv_actualization/view/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.cv_actualization.view.e> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.cv_actualization.view.e invoke() {
            return (com.avito.android.cv_actualization.view.e) JsxCvActualizationPhoneInputFragment.this.l1();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f131242l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f131242l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f131242l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return JsxCvActualizationPhoneInputFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f131244l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f131244l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f131244l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f131245l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f131245l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f131245l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f131246l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f131246l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f131246l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: JsxCvActualizationPhoneInputFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lut/a;", "kotlin.jvm.PlatformType", "invoke", "()Lut/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<C49108a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final C49108a invoke() {
            C49109b c49109b = JsxCvActualizationPhoneInputFragment.this.f131229n0;
            if (c49109b == null) {
                c49109b = null;
            }
            return (C49108a) c49109b.get();
        }
    }

    public JsxCvActualizationPhoneInputFragment() {
        super(R.layout.jsx_cv_actualization_phone_input_fragment);
        this.f131238w0 = C42727D.c(new b());
        this.f131239x0 = new C35968w3(this);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f131240y0 = new O0(m0.f406844a.b(C49108a.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f131230o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        final int i12 = 1;
        final int i13 = 0;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.phone_input_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f131231p0 = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.phone_input_toolbar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f131232q0 = (Toolbar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.phone_input_field_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f131233r0 = (ComponentContainer) viewFindViewById3;
        this.f131234s0 = (Input) view.findViewById(R.id.phone_input_field);
        View viewFindViewById4 = view.findViewById(R.id.phone_input_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f131235t0 = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.phone_input_progress);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f131236u0 = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.disclaimer);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f131237v0 = (TextView) viewFindViewById6;
        int i14 = ((JsxCvActualizationPhoneInputOpenParams) this.f131239x0.getValue(this, f131227A0[0])).f131248b ? R.attr.ic_close24 : R.attr.ic_arrowBack24;
        Toolbar toolbar = this.f131232q0;
        if (toolbar == null) {
            toolbar = null;
        }
        Context context = getContext();
        toolbar.setNavigationIcon(context != null ? C35835l0.h(i14, context) : null);
        TextView textView = this.f131237v0;
        if (textView == null) {
            textView = null;
        }
        j.c(textView, new AttributedText(getString(R.string.jsx_cv_actualization_disclaimer_text), Collections.singletonList(new LinkAttribute(getString(R.string.jsx_cv_actualization_disclaimer_link_name), getString(R.string.jsx_cv_actualization_disclaimer_link_text), getString(R.string.jsx_cv_actualization_disclaimer_link_url), C42745f0.U(FontParameter.UnderlineParameter.INSTANCE, new FontParameter.ColorParameter(null, null, "gray54")))), 1), null);
        TextView textView2 = this.f131237v0;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        Toolbar toolbar2 = this.f131232q0;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cv_actualization.view.phone_input.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ JsxCvActualizationPhoneInputFragment f131250c;

            {
                this.f131250c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = this.f131250c;
                switch (i13) {
                    case 0:
                        JsxCvActualizationPhoneInputFragment.a aVar = JsxCvActualizationPhoneInputFragment.f131228z0;
                        jsxCvActualizationPhoneInputFragment.q5().accept(AbstractC48713a.b.f439618a);
                        break;
                    default:
                        JsxCvActualizationPhoneInputFragment.a aVar2 = JsxCvActualizationPhoneInputFragment.f131228z0;
                        C49108a c49108aQ5 = jsxCvActualizationPhoneInputFragment.q5();
                        Input input = jsxCvActualizationPhoneInputFragment.f131234s0;
                        if (input == null) {
                            input = null;
                        }
                        c49108aQ5.accept(new AbstractC48713a.C12689a(String.valueOf(input.m53getText())));
                        break;
                }
            }
        });
        Button button = this.f131235t0;
        if (button == null) {
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cv_actualization.view.phone_input.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ JsxCvActualizationPhoneInputFragment f131250c;

            {
                this.f131250c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = this.f131250c;
                switch (i12) {
                    case 0:
                        JsxCvActualizationPhoneInputFragment.a aVar = JsxCvActualizationPhoneInputFragment.f131228z0;
                        jsxCvActualizationPhoneInputFragment.q5().accept(AbstractC48713a.b.f439618a);
                        break;
                    default:
                        JsxCvActualizationPhoneInputFragment.a aVar2 = JsxCvActualizationPhoneInputFragment.f131228z0;
                        C49108a c49108aQ5 = jsxCvActualizationPhoneInputFragment.q5();
                        Input input = jsxCvActualizationPhoneInputFragment.f131234s0;
                        if (input == null) {
                            input = null;
                        }
                        c49108aQ5.accept(new AbstractC48713a.C12689a(String.valueOf(input.m53getText())));
                        break;
                }
            }
        });
        Input input = this.f131234s0;
        if (input == null) {
            input = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.cv_actualization.view.phone_input.b(this, null), y.a(com.avito.android.lib.design.input.n.a(input, 6))), C22984Q.a(getViewLifecycleOwner()));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.cv_actualization.view.phone_input.c(this, null), 3);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.cv_actualization.view.phone_input.d(this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f131230o0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.cv_actualization.view.phone_input.di.a.a();
        com.avito.android.cv_actualization.view.phone_input.di.c cVar = (com.avito.android.cv_actualization.view.phone_input.di.c) C29972i.a(C29972i.b(this), com.avito.android.cv_actualization.view.phone_input.di.c.class);
        Resources resources = getResources();
        JsxCvActualizationPhoneInputOpenParams jsxCvActualizationPhoneInputOpenParams = (JsxCvActualizationPhoneInputOpenParams) this.f131239x0.getValue(this, f131227A0[0]);
        aVarA.a(cVar, this, resources, jsxCvActualizationPhoneInputOpenParams.f131248b, s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f131230o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final C49108a q5() {
        return (C49108a) this.f131240y0.getValue();
    }
}
