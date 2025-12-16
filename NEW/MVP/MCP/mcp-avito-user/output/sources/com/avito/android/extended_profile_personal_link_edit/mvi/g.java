package com.avito.android.extended_profile_personal_link_edit.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_personal_link_edit.mvi.entity.PersonalLinkEditState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PersonalLinkEditFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f151542a;

    /* renamed from: b, reason: collision with root package name */
    public final b f151543b;

    /* renamed from: c, reason: collision with root package name */
    public final i f151544c;

    /* renamed from: d, reason: collision with root package name */
    public final k f151545d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f151546e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f151542a = dVar;
        this.f151543b = bVar;
        this.f151544c = iVar;
        this.f151545d = kVar;
        this.f151546e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f151542a.get();
        a aVar = (a) this.f151543b.get();
        this.f151544c.getClass();
        h hVar = new h();
        j jVar = (j) this.f151545d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f151546e.get();
        PersonalLinkEditState.f151532f.getClass();
        return new f("PersonalLinkEdit", PersonalLinkEditState.f151533g, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
