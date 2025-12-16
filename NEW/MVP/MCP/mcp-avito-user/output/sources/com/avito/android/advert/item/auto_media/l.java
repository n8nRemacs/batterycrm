package com.avito.android.advert.item.auto_media;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAutoMediaPreviewRenderer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f72930a;

    /* renamed from: b, reason: collision with root package name */
    public final u f72931b;

    public l(u uVar, Provider provider) {
        this.f72930a = provider;
        this.f72931b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f72930a.get(), (com.avito.konveyor.adapter.j) this.f72931b.get());
    }
}
