package com.avito.android.authorization.select_profile.social_login;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.SocialRegistrationSuggestsParams;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.authorization.select_profile.social_login.d;
import com.avito.android.authorization.select_profile.social_login.di.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.G;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SocialRegistrationSuggestsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/select_profile/social_login/SocialRegistrationSuggestsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/authorization/select_profile/social_login/d$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SocialRegistrationSuggestsFragment extends BaseFragment implements d.a, InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f94342u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public d f94343n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f94344o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f94345p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f94346q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public Zd.i f94347r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f94348s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f94349t0;

    /* compiled from: SocialRegistrationSuggestsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/select_profile/social_login/SocialRegistrationSuggestsFragment$a;", "", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SocialRegistrationSuggestsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "requestKey", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<String, Bundle, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (str.equals("fragment_result_key")) {
                d dVar = SocialRegistrationSuggestsFragment.this.f94343n0;
                if (dVar == null) {
                    dVar = null;
                }
                ParsingPermissionFragment.f93867D0.getClass();
                dVar.b(ParsingPermissionFragment.a.a(bundle2), ParsingPermissionFragment.a.b(bundle2));
            }
            return G0.f406611a;
        }
    }

    public SocialRegistrationSuggestsFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        return new com.avito.android.navigation.e(this, new d.a(this));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C22960s.b(this, "fragment_result_key", new b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f94348s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.registration_duplicate_fragment, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        com.avito.konveyor.adapter.a aVar = this.f94344o0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f94345p0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        p pVar = new p(viewGroup2, aVar2, aVar);
        d dVar = this.f94343n0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c(pVar);
        d dVar2 = this.f94343n0;
        (dVar2 != null ? dVar2 : null).a(this);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        d dVar = this.f94343n0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e0();
        d dVar2 = this.f94343n0;
        (dVar2 != null ? dVar2 : null).c0();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        d dVar = this.f94343n0;
        if (dVar == null) {
            dVar = null;
        }
        G.c(bundle, "presenter_state", dVar.d0());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f94348s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        SocialRegistrationSuggestsParams socialRegistrationSuggestsParams;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.authorization.select_profile.social_login.di.a.a();
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            socialRegistrationSuggestsParams = (SocialRegistrationSuggestsParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("extra_srs_params", SocialRegistrationSuggestsParams.class) : arguments.getParcelable("extra_srs_params"));
        } else {
            socialRegistrationSuggestsParams = null;
        }
        if (socialRegistrationSuggestsParams == null) {
            throw new IllegalArgumentException("Title must not be null");
        }
        aVarA.a(activityC22955mRequireActivity, socialRegistrationSuggestsParams, getResources(), s.c(this), bundle != null ? G.a(bundle, "presenter_state") : null, (com.avito.android.authorization.select_profile.social_login.di.c) C29972i.a(C29972i.b(this), com.avito.android.authorization.select_profile.social_login.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f94348s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final void q5(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f94346q0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 6);
    }

    public final void r5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        InterfaceC28373a interfaceC28373a = this.f94349t0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        Intent intentPutExtra = Zd.n.b(activityC22955mRequireActivity, interfaceC28373a).putExtra("result", -1).putExtra("isRegistered", true);
        intentPutExtra.setFlags(603979776);
        activityC22955mRequireActivity.startActivity(intentPutExtra);
        activityC22955mRequireActivity.finish();
    }
}
