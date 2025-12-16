package com.avito.android.extended_profile_image_edit.mvi;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BannerImageEditBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f151091a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f151092b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f151093c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f151094d;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f151091a = lVar;
        this.f151092b = provider;
        this.f151093c = lVar2;
        this.f151094d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.extended_profile_image_edit.x) this.f151091a.f393949a, this.f151092b.get(), ((Boolean) this.f151093c.f393949a).booleanValue(), this.f151094d.get());
    }
}
