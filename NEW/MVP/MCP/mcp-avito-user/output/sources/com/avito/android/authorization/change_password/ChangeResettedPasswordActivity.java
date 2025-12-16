package com.avito.android.authorization.change_password;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.authorization.change_password.f;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.util.G;
import he.C40923f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChangeResettedPasswordActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/change_password/ChangeResettedPasswordActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/authorization/change_password/f$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]"})
/* loaded from: classes11.dex */
public final class ChangeResettedPasswordActivity extends com.avito.android.ui.activity.a implements f.a, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public f f93321m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public l90.o f93322n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public Zd.i f93323o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f93324p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f93325q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public String f93326r;

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String strB = Zd.f.b(this);
        com.avito.android.authorization.change_password.di.e.a().a((com.avito.android.authorization.change_password.di.d) C29972i.a(C29972i.b(this), com.avito.android.authorization.change_password.di.d.class), this, getResources(), bundle != null ? G.a(bundle, "presenter_state") : null, strB, Zd.f.a(this), com.avito.android.analytics.screens.s.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f93325q;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f93325q;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.e();
        setContentView(R.layout.change_password_activity);
        s sVar = new s(findViewById(android.R.id.content), this);
        f fVar = this.f93321m;
        if (fVar == null) {
            fVar = null;
        }
        fVar.c(sVar);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra(SearchParamsConverterKt.SOURCE);
            if (L.f(stringExtra, "email")) {
                AuthSource authSource = AuthSource.f92694c;
                this.f93326r = "restore_auth";
                InterfaceC28373a interfaceC28373a = this.f93324p;
                if (interfaceC28373a == null) {
                    interfaceC28373a = null;
                }
                interfaceC28373a.c(new C40923f(strB));
            } else if (stringExtra != null) {
                this.f93326r = stringExtra;
            }
        }
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f93325q;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        f fVar = this.f93321m;
        if (fVar == null) {
            fVar = null;
        }
        fVar.e0();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onPause() {
        super.onPause();
        f fVar = this.f93321m;
        if (fVar == null) {
            fVar = null;
        }
        fVar.d(false);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        f fVar = this.f93321m;
        if (fVar == null) {
            fVar = null;
        }
        fVar.d(true);
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f fVar = this.f93321m;
        if (fVar == null) {
            fVar = null;
        }
        G.c(bundle, "presenter_state", fVar.d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        f fVar = this.f93321m;
        if (fVar == null) {
            fVar = null;
        }
        fVar.e(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        f fVar = this.f93321m;
        if (fVar == null) {
            fVar = null;
        }
        fVar.c0();
        super.onStop();
    }
}
