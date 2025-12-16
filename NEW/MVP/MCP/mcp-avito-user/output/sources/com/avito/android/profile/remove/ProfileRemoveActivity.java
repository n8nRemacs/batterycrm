package com.avito.android.profile.remove;

import K90.a;
import K90.b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MainScreenLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.profile.remove.confirm.ProfileRemoveConfirmFragment;
import com.avito.android.profile.remove.m;
import com.avito.android.profile.remove.screen.ProfileRemoveItemsFragment;
import com.avito.android.profile.remove.screen.get_money.HowToReturnMoneyFragment;
import com.avito.android.profile.remove.screen.get_money.HowToReturnMoneyParams;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.L5;
import java.io.Serializable;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileRemoveActivity.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/profile/remove/ProfileRemoveActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/K;", "Lcom/avito/android/profile/remove/di/b;", "Lcom/avito/android/profile/remove/o;", "Lcom/avito/android/profile/remove/m;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileRemoveActivity extends com.avito.android.ui.activity.a implements K<com.avito.android.profile.remove.di.b>, o, m, InterfaceC28477j.b {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f223757s = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public i f223758m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f223759n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f223760o;

    /* renamed from: p, reason: collision with root package name */
    public com.avito.android.profile.remove.di.b f223761p;

    /* renamed from: q, reason: collision with root package name */
    public NavBar f223762q;

    /* renamed from: r, reason: collision with root package name */
    public C42670a f223763r;

    /* compiled from: ProfileRemoveActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ProfileRemoveActivity.this.onBackPressed();
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileRemoveActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return ProfileRemoveActivity.this.findViewById(R.id.fragment_container);
        }
    }

    /* compiled from: ProfileRemoveActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<K90.b, G0> {
        public final void f(@Y61.k K90.b bVar) {
            ProfileRemoveActivity profileRemoveActivity = (ProfileRemoveActivity) this.receiver;
            int i12 = ProfileRemoveActivity.f223757s;
            profileRemoveActivity.getClass();
            if (bVar instanceof b.e) {
                L5.b(profileRemoveActivity, ((b.e) bVar).f9291a, 0);
                return;
            }
            if (bVar instanceof b.C0557b) {
                ProfileRemoveItemsFragment.a aVar = ProfileRemoveItemsFragment.f223972w0;
                String str = ((b.C0557b) bVar).f9288a;
                aVar.getClass();
                profileRemoveActivity.a2(ProfileRemoveItemsFragment.a.a(str), str);
                return;
            }
            if (bVar instanceof b.a) {
                HowToReturnMoneyFragment.a aVar2 = HowToReturnMoneyFragment.f224046r0;
                b.a aVar3 = (b.a) bVar;
                HowToReturnMoneyParams howToReturnMoneyParams = aVar3.f9287b;
                aVar2.getClass();
                profileRemoveActivity.a2(HowToReturnMoneyFragment.a.a(howToReturnMoneyParams), aVar3.f9286a);
                return;
            }
            if (bVar instanceof b.c) {
                com.avito.android.profile.remove.di.b bVar2 = profileRemoveActivity.f223761p;
                com.avito.android.lib.util.g.a(new com.avito.android.profile.remove.confirm.c(profileRemoveActivity, bVar2 != null ? bVar2 : null, ((b.c) bVar).f9289a, new com.avito.android.profile.remove.a(profileRemoveActivity, bVar)));
            } else if (bVar instanceof b.d) {
                ProfileRemoveConfirmFragment.a aVar4 = ProfileRemoveConfirmFragment.f223786x0;
                DeepLink deepLink = ((b.d) bVar).f9290a.f132866c;
                aVar4.getClass();
                profileRemoveActivity.a2(ProfileRemoveConfirmFragment.a.a(deepLink), null);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(K90.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileRemoveActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<K90.c, G0> {
        public final void f(@Y61.k K90.c cVar) {
            ProfileRemoveActivity profileRemoveActivity = (ProfileRemoveActivity) this.receiver;
            int i12 = ProfileRemoveActivity.f223757s;
            profileRemoveActivity.getClass();
            if (cVar.f9294b) {
                C42670a c42670a = profileRemoveActivity.f223763r;
                C42670a.d(c42670a != null ? c42670a : null);
            } else if (!cVar.f9295c) {
                C42670a c42670a2 = profileRemoveActivity.f223763r;
                (c42670a2 != null ? c42670a2 : null).b();
            } else {
                C42670a c42670a3 = profileRemoveActivity.f223763r;
                if (c42670a3 == null) {
                    c42670a3 = null;
                }
                c42670a3.c(null, new com.avito.android.profile.remove.b(profileRemoveActivity));
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(K90.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.profile.remove.o
    public final void G() {
        finish();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f223759n;
        if (aVar == null) {
            aVar = null;
        }
        MainScreenLink mainScreenLink = new MainScreenLink(getString(R.string.profile_removed_notification_text), null, false, 6, null);
        Bundle bundle = new Bundle();
        bundle.putBoolean("with_activity_task", true);
        G0 g02 = G0.f406611a;
        b.a.a(aVar, mainScreenLink, null, bundle, 2);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.profile_remove_activity;
    }

    @Override // com.avito.android.profile.remove.o
    public final void N0(@Y61.k String str) {
        if (str.length() == 0) {
            str = getString(R.string.profile_remove_error_text);
        }
        View viewFindViewById = findViewById(R.id.fragment_container);
        f.c.f125255c.getClass();
        com.avito.android.component.toast.b.b(viewFindViewById, str, 0, null, 0, null, 0, ToastBarPosition.f181046d, f.c.a.b(), null, 130878);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.profile.remove.di.b bVarA = com.avito.android.profile.remove.di.a.a().a(this, (com.avito.android.profile.remove.di.c) C29972i.a(C29972i.b(this), com.avito.android.profile.remove.di.c.class), cv.c.a(this), s.a(this));
        this.f223761p = bVarA;
        bVarA.Zf(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f223760o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final void a2(BaseFragment baseFragment, String str) {
        androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, baseFragment, str);
        hE2.c(str);
        hE2.e();
    }

    @Override // com.avito.android.profile.remove.o
    public final void n1() {
        getSupportFragmentManager().b0(-1, 1, null);
        i iVar = this.f223758m;
        (iVar != null ? iVar : null).accept(a.d.f9285a);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().L() > 1) {
            getSupportFragmentManager().Y();
        } else {
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f223760o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        NavBar navBar = (NavBar) findViewById(R.id.nav_bar);
        navBar.c(R.attr.ic_arrowBack24, new a());
        this.f223762q = navBar;
        this.f223763r = new C42670a((ViewGroup) findViewById(R.id.progress_container), new b(), 0, 4, null);
        if (bundle != null) {
            i iVar = this.f223758m;
            if (iVar == null) {
                iVar = null;
            }
            if (iVar.getState().getValue().f9296d.isEmpty() && getSupportFragmentManager().L() > 0) {
                getSupportFragmentManager().b0(-1, 1, null);
            }
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f223760o;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        i iVar2 = this.f223758m;
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker3, iVar2 != null ? iVar2 : null, new c(1, this, ProfileRemoveActivity.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveOneTimeEvent;)V", 0), new d(1, this, ProfileRemoveActivity.class, "render", "render(Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f223760o;
        (screenPerformanceTracker4 != null ? screenPerformanceTracker4 : null).d();
    }

    @Override // com.avito.android.profile.remove.m
    public final void p1(@Y61.l m.a aVar) {
        G0 g02;
        if (aVar != null) {
            NavBar navBar = this.f223762q;
            if (navBar == null) {
                navBar = null;
            }
            com.avito.android.lib.design.text_view.a aVarB = navBar.b(com.avito.android.printable_text.b.c(R.string.profile_remove_password_reset_action, new Serializable[0]));
            aVarB.setTextColor(C35835l0.d(R.attr.gray54, this));
            aVarB.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(3, this, aVar));
            NavBar navBar2 = this.f223762q;
            if (navBar2 == null) {
                navBar2 = null;
            }
            navBar2.setActions(aVarB);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            NavBar navBar3 = this.f223762q;
            (navBar3 != null ? navBar3 : null).setActions(new View[0]);
        }
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.profile.remove.di.b bVar = this.f223761p;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
    }
}
