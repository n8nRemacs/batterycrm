package com.avito.android.serp.adapter.images_and_links_item.item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImageWithLinkItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f270195a;

    public b(e eVar) {
        this.f270195a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f270195a.get());
    }
}
