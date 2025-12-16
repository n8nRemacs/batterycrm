package com.avito.android.favorites.adapter.promo;

/* compiled from: FavoritesPromoWidgetListenerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f156670a;

    public r(dagger.internal.u uVar) {
        this.f156670a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f156670a.get();
        q qVar = new q();
        qVar.f156669a = aVar;
        return qVar;
    }
}
