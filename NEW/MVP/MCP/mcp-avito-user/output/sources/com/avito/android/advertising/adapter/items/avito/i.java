package com.avito.android.advertising.adapter.items.avito;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoNetworkImageRichBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f87156a;

    public i(Provider<c> provider) {
        this.f87156a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f87156a.get());
    }
}
