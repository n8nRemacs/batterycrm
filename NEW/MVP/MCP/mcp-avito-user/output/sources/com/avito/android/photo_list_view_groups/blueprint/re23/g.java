package com.avito.android.photo_list_view_groups.blueprint.re23;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhotoItemGroupsRe23PresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_list_view_groups.g> f218530a;

    public g(Provider<com.avito.android.photo_list_view_groups.g> provider) {
        this.f218530a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f218530a.get());
    }
}
