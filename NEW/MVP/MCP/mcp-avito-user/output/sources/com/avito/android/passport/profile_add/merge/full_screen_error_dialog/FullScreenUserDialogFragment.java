package com.avito.android.passport.profile_add.merge.full_screen_error_dialog;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.PrintableTextUserDialog;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.passport.profile_add.merge.full_screen_error_dialog.a;
import com.avito.android.remote.model.Action;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47313c;

/* compiled from: FullScreenUserDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/full_screen_error_dialog/FullScreenUserDialogFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FullScreenUserDialogFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f213050u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f213051v0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public k f213052n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f213053o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213054p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213055q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213056r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213057s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213058t0;

    /* compiled from: FullScreenUserDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/full_screen_error_dialog/FullScreenUserDialogFragment$a;", "", "<init>", "()V", "", "ARGS_USER_DIALOG", "Ljava/lang/String;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: FullScreenUserDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.passport.profile_add.merge.full_screen_error_dialog.FullScreenUserDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C6375a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ PrintableTextUserDialog f213059l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6375a(PrintableTextUserDialog printableTextUserDialog) {
                super(1);
                this.f213059l = printableTextUserDialog;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("profile_add.merge.full_screen_error_dialog.user_dialog", this.f213059l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static FullScreenUserDialogFragment a(@Y61.k PrintableTextUserDialog printableTextUserDialog) {
            FullScreenUserDialogFragment fullScreenUserDialogFragment = new FullScreenUserDialogFragment();
            C35966w1.a(fullScreenUserDialogFragment, -1, new C6375a(printableTextUserDialog));
            return fullScreenUserDialogFragment;
        }

        public a() {
        }
    }

    static {
        Y y12 = new Y(FullScreenUserDialogFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f213051v0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(FullScreenUserDialogFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(FullScreenUserDialogFragment.class, "description", "getDescription()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(FullScreenUserDialogFragment.class, "closeButton", "getCloseButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(FullScreenUserDialogFragment.class, "actionButton", "getActionButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f213050u0 = new a(null);
    }

    public FullScreenUserDialogFragment() {
        super(R.layout.full_screen_user_dialog_fragment);
        this.f213054p0 = new C47313c(null, 1, null);
        this.f213055q0 = new C47313c(null, 1, null);
        this.f213056r0 = new C47313c(null, 1, null);
        this.f213057s0 = new C47313c(null, 1, null);
        this.f213058t0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f213053o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        Object next;
        super.onViewCreated(view, bundle);
        Bundle bundleRequireArguments = requireArguments();
        PrintableTextUserDialog printableTextUserDialog = (PrintableTextUserDialog) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("profile_add.merge.full_screen_error_dialog.user_dialog", PrintableTextUserDialog.class) : bundleRequireArguments.getParcelable("profile_add.merge.full_screen_error_dialog.user_dialog"));
        NavBar navBar = (NavBar) view.findViewById(R.id.full_screen_user_dialog_nav_bar);
        navBar.c(R.attr.ic_close24, new d(this));
        C47313c c47313c = this.f213054p0;
        n<Object>[] nVarArr = f213051v0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, navBar);
        View viewFindViewById = view.findViewById(R.id.full_screen_user_dialog_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c2 = this.f213055q0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, (TextView) viewFindViewById);
        n<Object> nVar3 = nVarArr[1];
        I5.a((TextView) c47313c2.a(), printableTextUserDialog.f133590b.k0(requireContext()), false);
        View viewFindViewById2 = view.findViewById(R.id.full_screen_user_dialog_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        C47313c c47313c3 = this.f213056r0;
        n<Object> nVar4 = nVarArr[2];
        c47313c3.b(this, (TextView) viewFindViewById2);
        n<Object> nVar5 = nVarArr[2];
        I5.a((TextView) c47313c3.a(), printableTextUserDialog.f133591c.k0(requireContext()), false);
        View viewFindViewById3 = view.findViewById(R.id.full_screen_user_dialog_close_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        C47313c c47313c4 = this.f213057s0;
        n<Object> nVar6 = nVarArr[3];
        c47313c4.b(this, (Button) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.full_screen_user_dialog_action_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        C47313c c47313c5 = this.f213058t0;
        n<Object> nVar7 = nVarArr[4];
        c47313c5.b(this, (Button) viewFindViewById4);
        n<Object> nVar8 = nVarArr[3];
        ((Button) c47313c4.a()).setOnClickListener(new com.avito.android.order.feature.c(this, 11));
        List<Action> list = printableTextUserDialog.f133592d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (!(((Action) next).getDeepLink() instanceof NoMatchLink)) {
                        break;
                    }
                }
            }
            Action action = (Action) next;
            if (action != null) {
                n<Object> nVar9 = nVarArr[4];
                ((Button) c47313c5.a()).setVisibility(0);
                n<Object> nVar10 = nVarArr[4];
                ((Button) c47313c5.a()).setText(action.getTitle());
                n<Object> nVar11 = nVarArr[4];
                ((Button) c47313c5.a()).setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(2, this, action));
            }
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f213053o0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.b();
        a.c cVar = new a.c((c) C29972i.a(C29972i.b(this), c.class), cv.c.b(this), s.c(this), getF42820b(), this, null);
        this.f213052n0 = cVar.f213064e.get();
        ScreenPerformanceTracker screenPerformanceTracker = cVar.f213067h.get();
        this.f213053o0 = screenPerformanceTracker;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }
}
