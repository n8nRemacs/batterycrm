package com.avito.android.advert.item.chat_history;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChatHistoryPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f74258a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f74259b;

    public f(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.advert_core.analytics.a> provider2) {
        this.f74258a = provider;
        this.f74259b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f74258a.get(), this.f74259b.get());
    }
}
