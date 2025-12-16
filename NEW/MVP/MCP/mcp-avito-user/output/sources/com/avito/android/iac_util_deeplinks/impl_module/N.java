package com.avito.android.iac_util_deeplinks.impl_module;

/* compiled from: RunMultipleLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class N implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f169128a;

    public N(dagger.internal.f fVar) {
        this.f169128a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new M((com.avito.android.deeplink_handler.handler.composite.a) this.f169128a.get());
    }
}
