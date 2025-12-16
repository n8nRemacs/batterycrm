package com.avito.android.publish.slots.job_premoderation.item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobPremoderationItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f244451a;

    public h(u uVar) {
        this.f244451a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.deeplink_handler.handler.composite.a) this.f244451a.get());
    }
}
