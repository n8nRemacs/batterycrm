package com.avito.android.serp.adapter.carousel_widget;

import com.avito.android.util.Kundle;

/* compiled from: ItemsCarouselWidgetPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f269312a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f269313b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f269314c;

    public S(dagger.internal.l lVar, dagger.internal.f fVar, dagger.internal.u uVar) {
        this.f269312a = lVar;
        this.f269313b = fVar;
        this.f269314c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new Q((Kundle) this.f269312a.f393949a, dagger.internal.g.b(this.f269313b), (D) this.f269314c.get());
    }
}
