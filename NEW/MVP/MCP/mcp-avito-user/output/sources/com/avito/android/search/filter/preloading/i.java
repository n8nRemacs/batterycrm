package com.avito.android.search.filter.preloading;

import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.search.filter.FiltersMode;
import com.avito.android.search.filter.r1;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersTreePreloadable_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f263785a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f263786b;

    /* renamed from: c, reason: collision with root package name */
    public final u f263787c;

    /* renamed from: d, reason: collision with root package name */
    public final l f263788d;

    /* renamed from: e, reason: collision with root package name */
    public final l f263789e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.analytics.c> f263790f;

    /* renamed from: g, reason: collision with root package name */
    public final u f263791g;

    /* renamed from: h, reason: collision with root package name */
    public final u f263792h;

    public i(u uVar, Provider provider, u uVar2, l lVar, l lVar2, Provider provider2, u uVar3, u uVar4) {
        this.f263785a = uVar;
        this.f263786b = provider;
        this.f263787c = uVar2;
        this.f263788d = lVar;
        this.f263789e = lVar2;
        this.f263790f = provider2;
        this.f263791g = uVar3;
        this.f263792h = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.categories.a) this.f263785a.get(), this.f263786b.get(), dagger.internal.g.b(this.f263787c), (PresentationType) this.f263788d.f393949a, (FiltersMode) this.f263789e.f393949a, this.f263790f.get(), (com.avito.android.remote.error.f) this.f263791g.get(), (r1) this.f263792h.get());
    }
}
