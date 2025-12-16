package com.avito.android.safety.password_change.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.safety.password_change.mvi.entity.PasswordChangeState;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PasswordChangeFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final l f257383a;

    /* renamed from: b, reason: collision with root package name */
    public final e f257384b;

    /* renamed from: c, reason: collision with root package name */
    public final v f257385c;

    /* renamed from: d, reason: collision with root package name */
    public final x f257386d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f257387e;

    public o(l lVar, e eVar, v vVar, x xVar, Provider provider) {
        this.f257383a = lVar;
        this.f257384b = eVar;
        this.f257385c = vVar;
        this.f257386d = xVar;
        this.f257387e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f257383a.get();
        d dVar = (d) this.f257384b.get();
        u uVar = (u) this.f257385c.get();
        this.f257386d.getClass();
        w wVar = new w();
        ScreenPerformanceTracker screenPerformanceTracker = this.f257387e.get();
        PasswordChangeState.f257338h.getClass();
        return new n("PasswordChange", PasswordChangeState.f257339i, new m(kVar, dVar, screenPerformanceTracker, wVar, uVar));
    }
}
