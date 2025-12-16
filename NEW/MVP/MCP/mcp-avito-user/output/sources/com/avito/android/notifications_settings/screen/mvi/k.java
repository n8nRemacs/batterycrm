package com.avito.android.notifications_settings.screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationsSettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f208149a;

    /* renamed from: b, reason: collision with root package name */
    public final f f208150b;

    /* renamed from: c, reason: collision with root package name */
    public final r f208151c;

    /* renamed from: d, reason: collision with root package name */
    public final t f208152d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f208153e;

    public k(h hVar, f fVar, r rVar, t tVar, Provider provider) {
        this.f208149a = hVar;
        this.f208150b = fVar;
        this.f208151c = rVar;
        this.f208152d = tVar;
        this.f208153e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f208149a.get();
        e eVar = (e) this.f208150b.get();
        this.f208151c.getClass();
        q qVar = new q();
        s sVar = (s) this.f208152d.get();
        return new j("NotificationsSettings", new NotificationsSettingsState(false, true, null, null, null), new i(gVar, eVar, this.f208153e.get(), sVar, qVar));
    }
}
