package com.avito.android.login_suggests_impl;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.login_suggests_impl.m;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.G;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LoginSuggestsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/login_suggests_impl/LoginSuggestsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/login_suggests_impl/m$a;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LoginSuggestsActivity extends com.avito.android.ui.activity.a implements m.a, InterfaceC28477j.b, com.avito.android.ui.status_bar.a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f182848s = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f182849m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f182850n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public m f182851o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f182852p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f182853q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.lib.design.bottom_sheet.d f182854r;

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    public final void a2() {
        setResult(-1);
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Object[] objArr = 0;
        com.avito.android.login_suggests_impl.di.a.a().a((com.avito.android.login_suggests_impl.di.c) C29972i.a(C29972i.b(this), com.avito.android.login_suggests_impl.di.c.class), com.avito.android.analytics.screens.s.a(this), getResources(), bundle != null ? G.a(bundle, "presenter_state") : null, cv.c.a(this), com.avito.android.analytics.screens.s.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f182853q;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f182853q;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.e();
        setContentView(R.layout.login_suggests_activity);
        a.b.a(this, true);
        com.avito.android.ui.status_bar.e eVar = this.f182852p;
        if (eVar == null) {
            eVar = null;
        }
        eVar.b(this);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(this, 0, 2, objArr == true ? 1 : 0);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.E(R.layout.login_suggests_bottom_sheet, true, new C31606a(this));
        com.avito.android.lib.util.g.a(dVar);
        this.f182854r = dVar;
        dVar.s();
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f182854r;
        if (dVar2 == null) {
            dVar2 = null;
        }
        dVar2.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 23));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f182853q;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        m mVar = this.f182851o;
        if (mVar == null) {
            mVar = null;
        }
        mVar.e0();
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f182854r;
        (dVar != null ? dVar : null).r();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m mVar = this.f182851o;
        if (mVar == null) {
            mVar = null;
        }
        G.c(bundle, "presenter_state", mVar.d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        m mVar = this.f182851o;
        if (mVar == null) {
            mVar = null;
        }
        mVar.b(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        m mVar = this.f182851o;
        if (mVar == null) {
            mVar = null;
        }
        mVar.c0();
        super.onStop();
    }
}
