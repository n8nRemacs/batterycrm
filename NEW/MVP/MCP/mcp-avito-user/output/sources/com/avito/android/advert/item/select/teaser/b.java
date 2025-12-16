package com.avito.android.advert.item.select.teaser;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectTeaserBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f79645a;

    public b(e eVar) {
        this.f79645a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f79645a.get());
    }
}
