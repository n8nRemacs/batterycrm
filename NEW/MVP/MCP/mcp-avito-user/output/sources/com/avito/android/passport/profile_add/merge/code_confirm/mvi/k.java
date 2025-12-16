package com.avito.android.passport.profile_add.merge.code_confirm.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CodeConfirmFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final d f212766a;

    /* renamed from: b, reason: collision with root package name */
    public final m f212767b;

    /* renamed from: c, reason: collision with root package name */
    public final h f212768c;

    /* renamed from: d, reason: collision with root package name */
    public final f f212769d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f212770e;

    public k(d dVar, m mVar, h hVar, f fVar, Provider provider) {
        this.f212766a = dVar;
        this.f212767b = mVar;
        this.f212768c = hVar;
        this.f212769d = fVar;
        this.f212770e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f212766a.get();
        l lVar = (l) this.f212767b.get();
        this.f212768c.getClass();
        g gVar = new g();
        return new j("CodeConfirm", new b60.c(null, null, false, 7, null), new i((e) this.f212769d.get(), bVar, this.f212770e.get(), lVar, gVar));
    }
}
