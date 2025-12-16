package com.avito.android.publish.details.item_wrapper;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemWrapperFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.details.item_wrapper.video.f f234786a;

    public h(com.avito.android.publish.details.item_wrapper.video.f fVar) {
        this.f234786a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f234786a);
    }
}
