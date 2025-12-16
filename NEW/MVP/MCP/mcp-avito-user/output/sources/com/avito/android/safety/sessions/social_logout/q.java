package com.avito.android.safety.sessions.social_logout;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.safety.sessions.social_logout.i;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SessionsSocialLogoutPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/sessions/social_logout/q;", "Lcom/avito/android/safety/sessions/social_logout/i;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f258045a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i.b f258046b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f258047c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final s f258048d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f258049e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f258050f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public w f258051g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public SessionsSocialLogoutFragment f258052h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f258053i = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public y f258054j;

    @Inject
    public q(@Y61.k d dVar, @Y61.k i.b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k s sVar, @Y61.k E e12, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f258045a = dVar;
        this.f258046b = bVar;
        this.f258047c = interfaceC35745a5;
        this.f258048d = sVar;
        this.f258049e = e12;
        this.f258050f = screenPerformanceTracker;
    }

    @Override // com.avito.android.safety.sessions.social_logout.i
    public final void a(@Y61.k SessionsSocialLogoutFragment sessionsSocialLogoutFragment) {
        this.f258052h = sessionsSocialLogoutFragment;
    }

    @Override // com.avito.android.safety.sessions.social_logout.i
    public final void b(@Y61.k w wVar) {
        d();
        this.f258051g = wVar;
        io.reactivex.rxjava3.disposables.d dVarT0 = wVar.f258068f.t0(new j(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f258053i;
        cVar.b(dVarT0);
        cVar.b(wVar.f258069g.t0(new k(this)));
        boolean zC2 = this.f258049e.c();
        wVar.f258064b.setText(zC2 ? R.string.sessions_social_logout_title_multiprofile : R.string.sessions_social_logout_title);
        wVar.f258065c.setText(zC2 ? R.string.sessions_social_logout_description_multiprofile : R.string.sessions_social_logout_description);
        wVar.f258066d.setText(zC2 ? R.string.sessions_social_logout_button_multiprofile : R.string.sessions_social_logout_button);
    }

    @Override // com.avito.android.safety.sessions.social_logout.i
    public final void c(int i12) {
        if (i12 == -1) {
            d();
            return;
        }
        SessionsSocialLogoutFragment sessionsSocialLogoutFragment = this.f258052h;
        if (sessionsSocialLogoutFragment != null) {
            L l12 = sessionsSocialLogoutFragment.f257998q0;
            if (l12 == null) {
                l12 = null;
            }
            sessionsSocialLogoutFragment.startActivity(L.a.a(l12, null, 3));
            ActivityC22955m activityC22955mL1 = sessionsSocialLogoutFragment.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
            }
        }
    }

    @Override // com.avito.android.safety.sessions.social_logout.i
    public final void c0() {
        this.f258052h = null;
    }

    public final void d() {
        SessionsSocialLogoutFragment sessionsSocialLogoutFragment;
        d dVar = this.f258045a;
        if (!dVar.b()) {
            SessionsSocialLogoutFragment sessionsSocialLogoutFragment2 = this.f258052h;
            if (sessionsSocialLogoutFragment2 != null) {
                sessionsSocialLogoutFragment2.q5();
                return;
            }
            return;
        }
        String str = this.f258046b.f258033a;
        if ((str == null || !str.equals(dVar.a())) && (sessionsSocialLogoutFragment = this.f258052h) != null) {
            sessionsSocialLogoutFragment.o8();
        }
    }

    @Override // com.avito.android.safety.sessions.social_logout.i
    public final void e0() {
        this.f258053i.e();
        y yVar = this.f258054j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f258054j = null;
        this.f258051g = null;
    }
}
