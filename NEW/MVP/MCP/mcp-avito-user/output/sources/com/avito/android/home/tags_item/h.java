package com.avito.android.home.tags_item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionTagsItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<js0.b> f162506a;

    public h(Provider<js0.b> provider) {
        this.f162506a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f162506a.get());
    }
}
