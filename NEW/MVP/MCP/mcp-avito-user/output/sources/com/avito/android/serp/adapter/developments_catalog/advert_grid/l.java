package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentItemGridPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final u f269830a;

    public l(u uVar) {
        this.f269830a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.deeplink_handler.handler.composite.a) this.f269830a.get());
    }
}
