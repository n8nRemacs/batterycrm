package com.avito.android.vas_union.mvi;

import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import qM0.C47322c;

/* compiled from: VasUnionV2FeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f323231a;

    /* renamed from: b, reason: collision with root package name */
    public final b f323232b;

    /* renamed from: c, reason: collision with root package name */
    public final i f323233c;

    /* renamed from: d, reason: collision with root package name */
    public final k f323234d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f323235e;

    /* renamed from: f, reason: collision with root package name */
    public final l f323236f;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider, l lVar) {
        this.f323231a = dVar;
        this.f323232b = bVar;
        this.f323233c = iVar;
        this.f323234d = kVar;
        this.f323235e = provider;
        this.f323236f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f323231a.get();
        a aVar = (a) this.f323232b.get();
        this.f323233c.getClass();
        h hVar = new h();
        j jVar = (j) this.f323234d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f323235e.get();
        boolean zBooleanValue = ((Boolean) this.f323236f.f393949a).booleanValue();
        C47322c.f429223r.getClass();
        return new f("VasUnionV2", C47322c.a(C47322c.f429224s, zBooleanValue, false, null, null, zBooleanValue ? R.drawable.ic_close_24 : R.drawable.ic_back_24, null, null, null, null, null, null, null, null, null, false, null, 65518), new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
