package com.avito.android.advertising.adapter.items.yandex;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: YandexListBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f87739a;

    public h(Provider<i> provider) {
        this.f87739a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f87739a.get());
    }
}
