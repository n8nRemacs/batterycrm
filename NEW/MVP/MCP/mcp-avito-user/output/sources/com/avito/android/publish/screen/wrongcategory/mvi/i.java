package com.avito.android.publish.screen.wrongcategory.mvi;

import com.avito.android.publish.screen.wrongcategory.mvi.entity.WrongCategoryState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WrongCategoryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f242608a;

    /* renamed from: b, reason: collision with root package name */
    public final d f242609b;

    /* renamed from: c, reason: collision with root package name */
    public final k f242610c;

    /* renamed from: d, reason: collision with root package name */
    public final m f242611d;

    public i(f fVar, d dVar, k kVar, m mVar) {
        this.f242608a = fVar;
        this.f242609b = dVar;
        this.f242610c = kVar;
        this.f242611d = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f242608a.get();
        c cVar = (c) this.f242609b.get();
        this.f242610c.getClass();
        j jVar = new j();
        this.f242611d.getClass();
        l lVar = new l();
        WrongCategoryState.f242597f.getClass();
        return new h("WrongCategory", WrongCategoryState.f242598g, new g(eVar, cVar, lVar, jVar));
    }
}
