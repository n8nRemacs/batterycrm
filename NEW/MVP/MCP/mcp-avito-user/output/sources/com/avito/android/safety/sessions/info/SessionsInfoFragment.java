package com.avito.android.safety.sessions.info;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.auth.SessionsInfoLink;
import com.avito.android.di.C29972i;
import com.avito.android.safety.sessions.info.h;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import po0.InterfaceC47119a;

/* compiled from: SessionsInfoFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/safety/sessions/info/SessionsInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/safety/sessions/info/h$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]"})
/* loaded from: classes3.dex */
public final class SessionsInfoFragment extends BaseFragment implements h.a, InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final a f257943r0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public h f257944n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC47119a f257945o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f257946p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f257947q0;

    /* compiled from: SessionsInfoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/sessions/info/SessionsInfoFragment$a;", "", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public SessionsInfoFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f257947q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.sessions_result_fragment, viewGroup, false);
        o oVar = new o(viewInflate);
        h hVar = this.f257944n0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.a(oVar);
        h hVar2 = this.f257944n0;
        (hVar2 != null ? hVar2 : null).b(this);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        h hVar = this.f257944n0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.e0();
        h hVar2 = this.f257944n0;
        (hVar2 != null ? hVar2 : null).c0();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f257947q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        SessionsInfoLink.SessionsInfoParams sessionsInfoParams;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            sessionsInfoParams = (SessionsInfoLink.SessionsInfoParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("params", SessionsInfoLink.SessionsInfoParams.class) : arguments.getParcelable("params"));
        } else {
            sessionsInfoParams = null;
        }
        com.avito.android.safety.sessions.info.di.a.a().a(sessionsInfoParams, s.c(this), getResources(), (com.avito.android.safety.sessions.info.di.c) C29972i.a(C29972i.b(this), com.avito.android.safety.sessions.info.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f257947q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f257946p0;
            (interfaceC28373a != null ? interfaceC28373a : null).c(new ho0.g());
        }
    }

    public final void q5() {
        InterfaceC47119a interfaceC47119a = this.f257945o0;
        if (interfaceC47119a == null) {
            interfaceC47119a = null;
        }
        startActivity(InterfaceC47119a.C12288a.a(interfaceC47119a, null, 2));
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
    }
}
