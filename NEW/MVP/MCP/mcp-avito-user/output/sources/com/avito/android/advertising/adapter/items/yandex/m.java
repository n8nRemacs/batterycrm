package com.avito.android.advertising.adapter.items.yandex;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: YandexRichBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f87758a;

    public m(Provider<i> provider) {
        this.f87758a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f87758a.get());
    }
}
