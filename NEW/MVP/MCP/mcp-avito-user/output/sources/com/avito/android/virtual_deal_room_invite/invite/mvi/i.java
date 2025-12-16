package com.avito.android.virtual_deal_room_invite.invite.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nO0.C44303d;

/* compiled from: InviteFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f327090a;

    /* renamed from: b, reason: collision with root package name */
    public final d f327091b;

    /* renamed from: c, reason: collision with root package name */
    public final k f327092c;

    /* renamed from: d, reason: collision with root package name */
    public final m f327093d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f327094e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f327090a = fVar;
        this.f327091b = dVar;
        this.f327092c = kVar;
        this.f327093d = mVar;
        this.f327094e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f327090a.get();
        b bVar = (b) this.f327091b.get();
        this.f327092c.getClass();
        j jVar = new j();
        l lVar = (l) this.f327093d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f327094e.get();
        C44303d.f415107l.getClass();
        return new h("Invite", C44303d.f415108m, new g(eVar, bVar, screenPerformanceTracker, lVar, jVar));
    }
}
