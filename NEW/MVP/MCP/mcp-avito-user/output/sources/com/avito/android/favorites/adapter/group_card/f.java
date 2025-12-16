package com.avito.android.favorites.adapter.group_card;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupCardItemListenerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f156579a;

    public f(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f156579a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f156579a.get();
        e eVar = new e();
        eVar.f156578a = aVar;
        return eVar;
    }
}
