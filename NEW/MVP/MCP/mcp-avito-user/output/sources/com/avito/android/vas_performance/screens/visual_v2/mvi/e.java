package com.avito.android.vas_performance.screens.visual_v2.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualVasV2Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f321262a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f321263b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.visual_v2.domain.b f321264c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.visual_v2.domain.d f321265d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.visual_v2.domain.f f321266e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f321267f;

    public e(dagger.internal.l lVar, dagger.internal.l lVar2, com.avito.android.vas_performance.screens.visual_v2.domain.b bVar, com.avito.android.vas_performance.screens.visual_v2.domain.d dVar, com.avito.android.vas_performance.screens.visual_v2.domain.f fVar, Provider provider) {
        this.f321262a = lVar;
        this.f321263b = lVar2;
        this.f321264c = bVar;
        this.f321265d = dVar;
        this.f321266e = fVar;
        this.f321267f = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(((Long) this.f321262a.f393949a).longValue(), (String) this.f321263b.f393949a, (com.avito.android.vas_performance.screens.visual_v2.domain.a) this.f321264c.get(), (com.avito.android.vas_performance.screens.visual_v2.domain.c) this.f321265d.get(), (com.avito.android.vas_performance.screens.visual_v2.domain.e) this.f321266e.get(), this.f321267f.get());
    }
}
