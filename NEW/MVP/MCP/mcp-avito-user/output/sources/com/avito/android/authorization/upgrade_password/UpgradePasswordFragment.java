package com.avito.android.authorization.upgrade_password;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.upgrade_password.h;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.G;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UpgradePasswordFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/upgrade_password/UpgradePasswordFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/authorization/upgrade_password/h$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpgradePasswordFragment extends BaseFragment implements h.a, InterfaceC28477j.b {

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final a f94767q0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public h f94768n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f94769o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f94770p0;

    /* compiled from: UpgradePasswordFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/upgrade_password/UpgradePasswordFragment$a;", "", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public UpgradePasswordFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f94770p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.upgrade_password_fragment, viewGroup, false);
        E e12 = new E(viewInflate, requireActivity());
        h hVar = this.f94768n0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.b(this);
        h hVar2 = this.f94768n0;
        (hVar2 != null ? hVar2 : null).a(e12);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        h hVar = this.f94768n0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.e0();
        h hVar2 = this.f94768n0;
        (hVar2 != null ? hVar2 : null).c0();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        h hVar = this.f94768n0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.d(false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        h hVar = this.f94768n0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.d(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        h hVar = this.f94768n0;
        if (hVar == null) {
            hVar = null;
        }
        G.c(bundle, "presenter_state", hVar.d0());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f94770p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        UpgradePasswordArguments upgradePasswordArguments = arguments != null ? (UpgradePasswordArguments) arguments.getParcelable("arguments") : null;
        if (upgradePasswordArguments == null) {
            throw new IllegalArgumentException("Arguments must be specified");
        }
        com.avito.android.authorization.upgrade_password.di.b.a().a((com.avito.android.authorization.upgrade_password.di.f) C29972i.a(C29972i.b(this), com.avito.android.authorization.upgrade_password.di.f.class), requireActivity(), com.avito.android.analytics.screens.s.c(this), bundle != null ? G.a(bundle, "presenter_state") : null, upgradePasswordArguments.f94764b, upgradePasswordArguments.f94765c, upgradePasswordArguments.f94766d, getResources(), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f94770p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f94769o0;
            (interfaceC28373a != null ? interfaceC28373a : null).c(new he.s());
        }
    }

    public final void q5(boolean z12) {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        if (z12) {
            activityC22955mRequireActivity.setResult(-1);
        } else {
            activityC22955mRequireActivity.setResult(0);
        }
        activityC22955mRequireActivity.finish();
    }
}
