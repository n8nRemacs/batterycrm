package com.avito.android.extended_profile_image_edit.mvi;

import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import w80.C49468b;

/* compiled from: BannerImageEditActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f151070a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f151071b;

    /* renamed from: c, reason: collision with root package name */
    public final C49468b f151072c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f151073d;

    public i(dagger.internal.l lVar, Provider provider, C49468b c49468b, Provider provider2) {
        this.f151070a = lVar;
        this.f151071b = provider;
        this.f151072c = c49468b;
        this.f151073d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.extended_profile_image_edit.x) this.f151070a.f393949a, this.f151071b.get(), (SharedPhotosStorage) this.f151072c.get(), this.f151073d.get());
    }
}
