package com.avito.android.photo_list_view_groups.blueprint;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhotoItemGroupsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_list_view_groups.g> f218503a;

    public h(Provider<com.avito.android.photo_list_view_groups.g> provider) {
        this.f218503a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f218503a.get());
    }
}
