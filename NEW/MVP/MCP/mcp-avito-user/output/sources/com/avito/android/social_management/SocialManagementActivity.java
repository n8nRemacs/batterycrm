package com.avito.android.social_management;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.social.SocialType;
import com.avito.android.social_management.r;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SocialManagementActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/social_management/SocialManagementActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/social_management/r$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SocialManagementActivity extends com.avito.android.ui.activity.a implements r.a, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public l90.o f284467m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f284468n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public r f284469o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f284470p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.social.M f284471q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f284472r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f284473s;

    /* compiled from: SocialManagementActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            r rVar = SocialManagementActivity.this.f284469o;
            if (rVar == null) {
                rVar = null;
            }
            rVar.d();
            return G0.f406611a;
        }
    }

    public final void f(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f284472r;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 6);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        SocialType socialType;
        K2.c(this);
        if (i12 != 1) {
            super.onActivityResult(i12, i13, intent);
            return;
        }
        if (i13 != -1) {
            if (i13 != 1) {
                return;
            }
            r rVar = this.f284469o;
            (rVar != null ? rVar : null).a();
            return;
        }
        String stringExtra = intent != null ? intent.getStringExtra("extra_social_token") : null;
        if (intent != null) {
            socialType = (SocialType) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_social_type", SocialType.class) : intent.getParcelableExtra("extra_social_type"));
        } else {
            socialType = null;
        }
        if (stringExtra == null || socialType == null) {
            r rVar2 = this.f284469o;
            (rVar2 != null ? rVar2 : null).a();
            return;
        }
        r rVar3 = this.f284469o;
        if (rVar3 == null) {
            rVar3 = null;
        }
        com.avito.android.social.M m12 = this.f284471q;
        rVar3.c((m12 != null ? m12 : null).d(socialType), stringExtra);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onBackPressed() {
        r rVar = this.f284469o;
        if (rVar == null) {
            rVar = null;
        }
        rVar.i0();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        com.avito.android.social_management.di.b.a().a((com.avito.android.social_management.di.f) C29972i.a(C29972i.b(this), com.avito.android.social_management.di.f.class), cv.c.a(this), this, getResources(), bundle != null ? com.avito.android.util.G.a(bundle, "presenter_state") : null, com.avito.android.analytics.screens.s.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f284473s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f284473s;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.e();
        setContentView(R.layout.activity_social_management);
        r rVar = this.f284469o;
        if (rVar == null) {
            rVar = null;
        }
        View viewFindViewById = findViewById(android.R.id.content);
        com.avito.konveyor.adapter.j jVar = this.f284468n;
        if (jVar == null) {
            jVar = null;
        }
        InterfaceC28373a interfaceC28373a = this.f284470p;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        rVar.b(new Q(viewFindViewById, jVar, interfaceC28373a));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f284473s;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.d();
        a aVar = new a();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f284472r;
        (aVar2 != null ? aVar2 : null).d9().N(C35035b.f284565b).t0(new C35036c(aVar));
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        r rVar = this.f284469o;
        if (rVar == null) {
            rVar = null;
        }
        rVar.e0();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        r rVar = this.f284469o;
        if (rVar == null) {
            rVar = null;
        }
        com.avito.android.util.G.c(bundle, "presenter_state", rVar.d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        r rVar = this.f284469o;
        if (rVar == null) {
            rVar = null;
        }
        rVar.e(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        r rVar = this.f284469o;
        if (rVar == null) {
            rVar = null;
        }
        rVar.c0();
        super.onStop();
    }
}
