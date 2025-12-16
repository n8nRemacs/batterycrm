package com.avito.android.personal_filters.filters_change_dialog.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonalFiltersChangeDialogFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f215757a;

    /* renamed from: b, reason: collision with root package name */
    public final m f215758b;

    /* renamed from: c, reason: collision with root package name */
    public final k f215759c;

    public i(f fVar, m mVar, k kVar) {
        this.f215757a = fVar;
        this.f215758b = mVar;
        this.f215759c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f215757a.get();
        this.f215758b.getClass();
        l lVar = new l();
        this.f215759c.getClass();
        j jVar = new j();
        g70.d.f396332b.getClass();
        return new h("PersonalFiltersChangeDialog", g70.d.f396333c, new g(eVar, lVar, jVar));
    }
}
