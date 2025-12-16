package com.avito.android.rating.user_contacts.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserContactsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f247840a;

    /* renamed from: b, reason: collision with root package name */
    public final e f247841b;

    /* renamed from: c, reason: collision with root package name */
    public final t f247842c;

    /* renamed from: d, reason: collision with root package name */
    public final r f247843d;

    /* renamed from: e, reason: collision with root package name */
    public final u f247844e;

    public m(j jVar, e eVar, t tVar, r rVar, u uVar) {
        this.f247840a = jVar;
        this.f247841b = eVar;
        this.f247842c = tVar;
        this.f247843d = rVar;
        this.f247844e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f247840a.get();
        d dVar = (d) this.f247841b.get();
        s sVar = (s) this.f247842c.get();
        q qVar = (q) this.f247843d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f247844e.get();
        com.avito.android.rating.user_contacts.mvi.entity.b.f247808f.getClass();
        return new l("UserContacts", com.avito.android.rating.user_contacts.mvi.entity.b.f247809g, new k(fVar, dVar, screenPerformanceTracker, sVar, qVar));
    }
}
