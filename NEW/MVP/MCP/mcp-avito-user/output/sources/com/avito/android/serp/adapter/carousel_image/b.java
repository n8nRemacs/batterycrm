package com.avito.android.serp.adapter.carousel_image;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CarouselImageItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f269117a;

    public b(e eVar) {
        this.f269117a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f269117a.get());
    }
}
