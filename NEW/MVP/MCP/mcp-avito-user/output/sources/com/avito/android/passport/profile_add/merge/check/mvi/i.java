package com.avito.android.passport.profile_add.merge.check.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckMergePossibilityFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f212673a;

    /* renamed from: b, reason: collision with root package name */
    public final b f212674b;

    /* renamed from: c, reason: collision with root package name */
    public final k f212675c;

    /* renamed from: d, reason: collision with root package name */
    public final m f212676d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f212677e;

    public i(f fVar, b bVar, k kVar, m mVar, Provider provider) {
        this.f212673a = fVar;
        this.f212674b = bVar;
        this.f212675c = kVar;
        this.f212676d = mVar;
        this.f212677e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f212673a.get();
        a aVar = (a) this.f212674b.get();
        this.f212675c.getClass();
        j jVar = new j();
        this.f212676d.getClass();
        l lVar = new l();
        return new h("Check", new a60.c(false, false, 3, null), new g(eVar, aVar, this.f212677e.get(), lVar, jVar));
    }
}
