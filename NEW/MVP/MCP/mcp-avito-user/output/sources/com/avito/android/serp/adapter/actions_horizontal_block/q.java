package com.avito.android.serp.adapter.actions_horizontal_block;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActionsHorizontalBlockItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f268692a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f268693b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f268694c;

    public q(dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider) {
        this.f268692a = fVar;
        this.f268693b = fVar2;
        this.f268694c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((u) this.f268692a.get(), dagger.internal.g.b(this.f268693b), this.f268694c.get());
    }
}
