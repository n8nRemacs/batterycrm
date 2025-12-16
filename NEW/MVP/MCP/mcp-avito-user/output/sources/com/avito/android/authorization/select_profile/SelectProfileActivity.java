package com.avito.android.authorization.select_profile;

import android.os.Bundle;
import android.view.View;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.select_profile.j;
import com.avito.android.di.C29972i;
import com.avito.android.util.G;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectProfileActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/select_profile/SelectProfileActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/authorization/select_profile/j$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectProfileActivity extends com.avito.android.ui.activity.a implements j.a, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public j f94222m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f94223n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f94224o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f94225p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public Zd.i f94226q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f94227r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f94228s;

    public final void a2() {
        Zd.i iVar = this.f94226q;
        if (iVar == null) {
            iVar = null;
        }
        InterfaceC28373a interfaceC28373a = this.f94225p;
        startActivity(iVar.a(Zd.n.b(this, interfaceC28373a != null ? interfaceC28373a : null), Zd.f.b(this), Zd.f.a(this), false));
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.authorization.select_profile.di.a.a().a((com.avito.android.authorization.select_profile.di.c) C29972i.a(C29972i.b(this), com.avito.android.authorization.select_profile.di.c.class), cv.c.a(this), this, getResources(), bundle != null ? G.a(bundle, "presenter_state") : null, getIntent().getStringExtra("hash"), com.avito.android.analytics.screens.s.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f94227r;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f94227r;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.e();
        setContentView(R.layout.registration_duplicate_fragment);
        j jVar = this.f94222m;
        if (jVar == null) {
            jVar = null;
        }
        View viewFindViewById = findViewById(android.R.id.content);
        com.avito.konveyor.adapter.a aVar = this.f94223n;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.a aVar3 = this.f94224o;
        com.avito.konveyor.a aVar4 = aVar3 != null ? aVar3 : null;
        InterfaceC28373a interfaceC28373a = this.f94225p;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.android.util.text.a aVar5 = this.f94228s;
        jVar.a(new x(viewFindViewById, aVar2, aVar4, interfaceC28373a2, aVar5 != null ? aVar5 : null));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f94227r;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        j jVar = this.f94222m;
        if (jVar == null) {
            jVar = null;
        }
        jVar.e0();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        j jVar = this.f94222m;
        if (jVar == null) {
            jVar = null;
        }
        G.c(bundle, "presenter_state", jVar.d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        j jVar = this.f94222m;
        if (jVar == null) {
            jVar = null;
        }
        jVar.b(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        j jVar = this.f94222m;
        if (jVar == null) {
            jVar = null;
        }
        jVar.c0();
        super.onStop();
    }
}
