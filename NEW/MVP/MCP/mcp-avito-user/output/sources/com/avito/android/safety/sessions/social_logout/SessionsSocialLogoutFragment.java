package com.avito.android.safety.sessions.social_logout;

import Zd.InterfaceC19542a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.safety.sessions.social_logout.i;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SessionsSocialLogoutFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/safety/sessions/social_logout/SessionsSocialLogoutFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/safety/sessions/social_logout/i$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]"})
/* loaded from: classes3.dex */
public final class SessionsSocialLogoutFragment extends BaseFragment implements i.a, InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f257994u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public i f257995n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f257996o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f257997p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public L f257998q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.safety.sessions.g f257999r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f258000s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public Intent f258001t0;

    /* compiled from: SessionsSocialLogoutFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/sessions/social_logout/SessionsSocialLogoutFragment$a;", "", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public SessionsSocialLogoutFragment() {
        super(0, 1, null);
    }

    public final void o8() {
        Intent intent = this.f258001t0;
        if (intent != null) {
            startActivity(intent);
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1) {
            i iVar = this.f257995n0;
            if (iVar == null) {
                iVar = null;
            }
            iVar.c(i13);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f258000s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.sessions_social_logout_fragment, viewGroup, false);
        w wVar = new w(viewInflate);
        i iVar = this.f257995n0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.a(this);
        i iVar2 = this.f257995n0;
        (iVar2 != null ? iVar2 : null).b(wVar);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        i iVar = this.f257995n0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.e0();
        i iVar2 = this.f257995n0;
        (iVar2 != null ? iVar2 : null).c0();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f258000s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Intent intent;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            intent = (Intent) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("up_intent", Intent.class) : arguments.getParcelable("up_intent"));
        } else {
            intent = null;
        }
        this.f258001t0 = intent;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("user_id") : null;
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("device_id") : null;
        Bundle arguments4 = getArguments();
        String string3 = arguments4 != null ? arguments4.getString("session_id_hash") : null;
        Bundle arguments5 = getArguments();
        String string4 = arguments5 != null ? arguments5.getString("login_type") : null;
        Bundle arguments6 = getArguments();
        String string5 = arguments6 != null ? arguments6.getString(SearchParamsConverterKt.SOURCE) : null;
        Bundle arguments7 = getArguments();
        com.avito.android.safety.sessions.social_logout.di.a.a().a((com.avito.android.safety.sessions.social_logout.di.c) C29972i.a(C29972i.b(this), com.avito.android.safety.sessions.social_logout.di.c.class), getResources(), new i.b(string, string2, string3, arguments7 != null ? arguments7.getBoolean("is_from_safety_screen_param") : false, string4, string5), com.avito.android.analytics.screens.s.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f258000s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f257996o0;
            InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
            if (string5 == null) {
                string5 = "";
            }
            interfaceC28373a2.c(new ho0.h(string5));
        }
    }

    public final void q5() {
        InterfaceC19542a interfaceC19542a = this.f257997p0;
        if (interfaceC19542a == null) {
            interfaceC19542a = null;
        }
        startActivityForResult(interfaceC19542a.a(AuthSource.f92724r), 1);
    }
}
