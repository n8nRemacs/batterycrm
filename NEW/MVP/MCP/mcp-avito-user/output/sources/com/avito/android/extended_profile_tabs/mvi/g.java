package com.avito.android.extended_profile_tabs.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsArguments;
import com.avito.android.extended_profile_tabs.mvi.entity.a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileTabsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final b f153253a;

    /* renamed from: b, reason: collision with root package name */
    public final i f153254b;

    /* renamed from: c, reason: collision with root package name */
    public final k f153255c;

    /* renamed from: d, reason: collision with root package name */
    public final d f153256d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f153257e;

    /* renamed from: f, reason: collision with root package name */
    public final l f153258f;

    public g(b bVar, i iVar, k kVar, d dVar, Provider provider, l lVar) {
        this.f153253a = bVar;
        this.f153254b = iVar;
        this.f153255c = kVar;
        this.f153256d = dVar;
        this.f153257e = provider;
        this.f153258f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f153253a.get();
        this.f153254b.getClass();
        h hVar = new h();
        this.f153255c.getClass();
        j jVar = new j();
        c cVar = (c) this.f153256d.get();
        return new f("ExtendedProfileTabs", new com.avito.android.extended_profile_tabs.mvi.entity.a(null, false, null, null, new a.C4472a(((ExtendedProfileTabsArguments) this.f153258f.f393949a).f153126b, false), 15, null), new e(aVar, this.f153257e.get(), jVar, hVar, cVar));
    }
}
