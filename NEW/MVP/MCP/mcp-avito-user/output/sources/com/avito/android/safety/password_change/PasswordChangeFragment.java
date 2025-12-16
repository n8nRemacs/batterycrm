package com.avito.android.safety.password_change;

import Zd.InterfaceC19542a;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.HelpCenterUrlShowLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.password_tip.PasswordTipInput;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.safety.password_change.PasswordChangeFragment;
import com.avito.android.safety.password_change.mvi.entity.InputType;
import com.avito.android.safety.password_change.q;
import com.avito.android.ui.fragments.BaseFragment;
import com.jakewharton.rxbinding4.view.C37722i;
import java.io.Serializable;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;
import ro0.InterfaceC47696a;
import z1.AbstractC50339a;

/* compiled from: PasswordChangeFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/safety/password_change/PasswordChangeFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/deep_linking/links/w;", "<init>", "()V", "a", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PasswordChangeFragment extends BaseFragment implements InterfaceC28477j.b, w {

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public static final a f257203H0;

    /* renamed from: I0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f257204I0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257205A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257206B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257207C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257208D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257209E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257210F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257211G0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f257212n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public L f257213o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC30274a f257214p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f257215q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f257216r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f257217s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public q.a f257218t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f257219u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public Intent f257220v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257221w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257222x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257223y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f257224z0;

    /* compiled from: PasswordChangeFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/password_change/PasswordChangeFragment$a;", "", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PasswordChangeFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[InputType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InputType inputType = InputType.f257311b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f257226m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.l lVar) {
            super(0);
            this.f257226m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(PasswordChangeFragment.this, this.f257226m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PasswordChangeFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f257228l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f257228l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f257228l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f257229l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f257229l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f257229l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f257230l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f257230l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f257230l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PasswordChangeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/safety/password_change/q;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/safety/password_change/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<C23060r0, q> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final q invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            q.a aVar = PasswordChangeFragment.this.f257218t0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    static {
        Y y12 = new Y(PasswordChangeFragment.class, "contentView", "getContentView()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f257204I0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(PasswordChangeFragment.class, "scrollView", "getScrollView()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordChangeFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordChangeFragment.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordChangeFragment.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordChangeFragment.class, "oldPasswordInputContainer", "getOldPasswordInputContainer()Lcom/avito/android/lib/design/component_container/ComponentContainer;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordChangeFragment.class, "oldPasswordInput", "getOldPasswordInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordChangeFragment.class, "newPasswordInput", "getNewPasswordInput()Lcom/avito/android/password_tip/PasswordTipInput;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordChangeFragment.class, "changeButton", "getChangeButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordChangeFragment.class, "forgotPasswordAction", "getForgotPasswordAction()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(PasswordChangeFragment.class, "multiprofileLink", "getMultiprofileLink()Lcom/avito/android/remote/model/text/AttributedText;", 0, n0Var)};
        f257203H0 = new a(null);
    }

    public PasswordChangeFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f257219u0 = new O0(m0.f406844a.b(q.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f257221w0 = new C47313c(null, 1, null);
        this.f257222x0 = new C47313c(null, 1, null);
        this.f257223y0 = new C47313c(null, 1, null);
        this.f257224z0 = new C47313c(null, 1, null);
        this.f257205A0 = new C47313c(null, 1, null);
        this.f257206B0 = new C47313c(null, 1, null);
        this.f257207C0 = new C47313c(null, 1, null);
        this.f257208D0 = new C47313c(null, 1, null);
        this.f257209E0 = new C47313c(null, 1, null);
        this.f257210F0 = new C47313c(null, 1, null);
        this.f257211G0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f257216r0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 6);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1604) {
            t5(new InterfaceC47696a.C12393a(i13 == -1));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.safety_password_change_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        t5(InterfaceC47696a.f.f430173a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        final int i12 = 2;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.password_change_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        C47313c c47313c = this.f257221w0;
        kotlin.reflect.n<Object>[] nVarArr = f257204I0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.password_change_scroll_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        C47313c c47313c2 = this.f257222x0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.password_change_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c3 = this.f257224z0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[3];
        c47313c3.b(this, (TextView) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.password_change_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        C47313c c47313c4 = this.f257205A0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[4];
        c47313c4.b(this, textView);
        View viewFindViewById5 = view.findViewById(R.id.password_change_nav_bar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        C47313c c47313c5 = this.f257223y0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[2];
        c47313c5.b(this, (NavBar) viewFindViewById5);
        View viewFindViewById6 = view.findViewById(R.id.password_change_input_old_password);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById6;
        input.setInputType(144);
        C47313c c47313c6 = this.f257207C0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[6];
        c47313c6.b(this, input);
        View viewFindViewById7 = view.findViewById(R.id.password_change_container_old_password);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        C47313c c47313c7 = this.f257206B0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[5];
        c47313c7.b(this, (ComponentContainer) viewFindViewById7);
        View viewFindViewById8 = view.findViewById(R.id.password_change_input_new_password);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.password_tip.PasswordTipInput");
        }
        C47313c c47313c8 = this.f257208D0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[7];
        c47313c8.b(this, (PasswordTipInput) viewFindViewById8);
        View viewFindViewById9 = view.findViewById(R.id.password_change_button_change);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        C47313c c47313c9 = this.f257209E0;
        kotlin.reflect.n<Object> nVar9 = nVarArr[8];
        c47313c9.b(this, (Button) viewFindViewById9);
        com.avito.android.lib.design.text_view.a aVarB = q5().b(com.avito.android.printable_text.b.c(R.string.password_change_forgot_password, new Serializable[0]));
        Resources resources = aVarB.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        aVarB.setTextColor(resources.getColor(R.color.gray54, null));
        aVarB.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.safety.password_change.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PasswordChangeFragment f257243c;

            {
                this.f257243c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PasswordChangeFragment passwordChangeFragment = this.f257243c;
                switch (i12) {
                    case 0:
                        PasswordChangeFragment.a aVar = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.t5(InterfaceC47696a.g.f430174a);
                        break;
                    case 1:
                        PasswordChangeFragment.a aVar2 = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.t5(new InterfaceC47696a.c(passwordChangeFragment.r5().b()));
                        break;
                    default:
                        PasswordChangeFragment.a aVar3 = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.t5(InterfaceC47696a.d.f430171a);
                        break;
                }
            }
        });
        C47313c c47313c10 = this.f257210F0;
        kotlin.reflect.n<Object> nVar10 = nVarArr[9];
        c47313c10.b(this, aVarB);
        AttributedText attributedText = new AttributedText(view.getRootView().getResources().getString(R.string.password_self_change_passport_description), Collections.singletonList(new DeepLinkAttribute("full_attribute", view.getRootView().getResources().getString(R.string.password_self_change_passport_description_attribute), new HelpCenterUrlShowLink("articles/2716"), null, null, null, 56, null)), 1);
        attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 20));
        C47313c c47313c11 = this.f257211G0;
        kotlin.reflect.n<Object> nVar11 = nVarArr[10];
        c47313c11.b(this, attributedText);
        ScreenPerformanceTracker screenPerformanceTracker = this.f257217s0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, (q) this.f257219u0.getValue(), new com.avito.android.safety.password_change.d(1, this, PasswordChangeFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeOneTimeEvent;)V", 0), new com.avito.android.safety.password_change.e(1, this, PasswordChangeFragment.class, "renderState", "renderState(Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeState;)V", 0));
        com.avito.android.lib.design.input.n.c(s5(), new com.avito.android.safety.password_change.h(this));
        C43175k.K(new C43197r1(new i(this, null), y.a(com.avito.android.lib.design.input.n.a(s5(), 5))), C22984Q.a(getViewLifecycleOwner()));
        C43175k.K(new C43197r1(new j(this, null), new com.avito.android.safety.password_change.f(y.a(C37722i.c(s5())))), C22984Q.a(getViewLifecycleOwner()));
        final int i13 = 0;
        s5().setRightIconListener(new View.OnClickListener(this) { // from class: com.avito.android.safety.password_change.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PasswordChangeFragment f257243c;

            {
                this.f257243c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PasswordChangeFragment passwordChangeFragment = this.f257243c;
                switch (i13) {
                    case 0:
                        PasswordChangeFragment.a aVar = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.t5(InterfaceC47696a.g.f430174a);
                        break;
                    case 1:
                        PasswordChangeFragment.a aVar2 = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.t5(new InterfaceC47696a.c(passwordChangeFragment.r5().b()));
                        break;
                    default:
                        PasswordChangeFragment.a aVar3 = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.t5(InterfaceC47696a.d.f430171a);
                        break;
                }
            }
        });
        C43175k.K(new C43197r1(new k(this, null), y.a(r5().getOnFocused())), C22984Q.a(getViewLifecycleOwner()));
        com.avito.android.lib.design.input.n.c(r5().f213951b, new l(this));
        C43175k.K(new C43197r1(new m(this, null), y.a(r5().getDoneCallbacks())), C22984Q.a(getViewLifecycleOwner()));
        kotlin.reflect.n<Object> nVar12 = nVarArr[8];
        final int i14 = 1;
        ((Button) c47313c9.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.safety.password_change.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PasswordChangeFragment f257243c;

            {
                this.f257243c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PasswordChangeFragment passwordChangeFragment = this.f257243c;
                switch (i14) {
                    case 0:
                        PasswordChangeFragment.a aVar = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.t5(InterfaceC47696a.g.f430174a);
                        break;
                    case 1:
                        PasswordChangeFragment.a aVar2 = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.t5(new InterfaceC47696a.c(passwordChangeFragment.r5().b()));
                        break;
                    default:
                        PasswordChangeFragment.a aVar3 = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.t5(InterfaceC47696a.d.f430171a);
                        break;
                }
            }
        });
        q5().c(R.attr.ic_arrowBack24, new com.avito.android.safety.password_change.g(this));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f257217s0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Intent intent;
        PasswordChangeParams passwordChangeParams;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            intent = (Intent) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("up_intent", Intent.class) : arguments.getParcelable("up_intent"));
        } else {
            intent = null;
        }
        this.f257220v0 = intent;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            passwordChangeParams = (PasswordChangeParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments2.getParcelable("params", PasswordChangeParams.class) : arguments2.getParcelable("params"));
        } else {
            passwordChangeParams = null;
        }
        com.avito.android.safety.password_change.di.a.a().a((com.avito.android.safety.password_change.di.c) C29972i.a(C29972i.b(this), com.avito.android.safety.password_change.di.c.class), cv.c.b(this), requireActivity(), com.avito.android.analytics.screens.s.c(this), getResources(), passwordChangeParams, bundle != null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f257217s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f257217s0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).e();
    }

    public final NavBar q5() {
        C47313c c47313c = this.f257223y0;
        kotlin.reflect.n<Object> nVar = f257204I0[2];
        return (NavBar) c47313c.a();
    }

    public final PasswordTipInput r5() {
        C47313c c47313c = this.f257208D0;
        kotlin.reflect.n<Object> nVar = f257204I0[7];
        return (PasswordTipInput) c47313c.a();
    }

    public final Input s5() {
        C47313c c47313c = this.f257207C0;
        kotlin.reflect.n<Object> nVar = f257204I0[6];
        return (Input) c47313c.a();
    }

    public final void t5(InterfaceC47696a interfaceC47696a) {
        ((q) this.f257219u0.getValue()).accept(interfaceC47696a);
    }

    public final boolean u5(InputType inputType) {
        int iOrdinal = inputType.ordinal();
        if (iOrdinal == 0) {
            final int i12 = 0;
            return s5().postDelayed(new Runnable(this) { // from class: com.avito.android.safety.password_change.c

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ PasswordChangeFragment f257245c;

                {
                    this.f257245c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PasswordChangeFragment passwordChangeFragment = this.f257245c;
                    switch (i12) {
                        case 0:
                            PasswordChangeFragment.a aVar = PasswordChangeFragment.f257203H0;
                            passwordChangeFragment.s5().v();
                            C47313c c47313c = passwordChangeFragment.f257222x0;
                            kotlin.reflect.n<Object> nVar = PasswordChangeFragment.f257204I0[1];
                            ((View) c47313c.a()).setScrollY(passwordChangeFragment.s5().getTop());
                            break;
                        default:
                            PasswordChangeFragment.a aVar2 = PasswordChangeFragment.f257203H0;
                            passwordChangeFragment.r5().e();
                            C47313c c47313c2 = passwordChangeFragment.f257222x0;
                            kotlin.reflect.n<Object> nVar2 = PasswordChangeFragment.f257204I0[1];
                            ((View) c47313c2.a()).setScrollY(passwordChangeFragment.r5().getTop());
                            break;
                    }
                }
            }, 100L);
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        final int i13 = 1;
        return r5().postDelayed(new Runnable(this) { // from class: com.avito.android.safety.password_change.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PasswordChangeFragment f257245c;

            {
                this.f257245c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PasswordChangeFragment passwordChangeFragment = this.f257245c;
                switch (i13) {
                    case 0:
                        PasswordChangeFragment.a aVar = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.s5().v();
                        C47313c c47313c = passwordChangeFragment.f257222x0;
                        kotlin.reflect.n<Object> nVar = PasswordChangeFragment.f257204I0[1];
                        ((View) c47313c.a()).setScrollY(passwordChangeFragment.s5().getTop());
                        break;
                    default:
                        PasswordChangeFragment.a aVar2 = PasswordChangeFragment.f257203H0;
                        passwordChangeFragment.r5().e();
                        C47313c c47313c2 = passwordChangeFragment.f257222x0;
                        kotlin.reflect.n<Object> nVar2 = PasswordChangeFragment.f257204I0[1];
                        ((View) c47313c2.a()).setScrollY(passwordChangeFragment.r5().getTop());
                        break;
                }
            }
        }, 100L);
    }
}
