package com.avito.android.serp.adapter.carousel_image;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CarouselImageItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f269122a;

    public e(dagger.internal.f fVar) {
        this.f269122a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(dagger.internal.g.b(this.f269122a));
    }
}
