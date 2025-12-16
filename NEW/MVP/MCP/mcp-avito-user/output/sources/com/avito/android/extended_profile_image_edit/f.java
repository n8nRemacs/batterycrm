package com.avito.android.extended_profile_image_edit;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: BannerImageEditMviViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_image_edit.mvi.n f151010a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f151011b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f151012c;

    public f(com.avito.android.extended_profile_image_edit.mvi.n nVar, Provider provider, Provider provider2) {
        this.f151010a = nVar;
        this.f151011b = provider;
        this.f151012c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.extended_profile_image_edit.mvi.m) this.f151010a.get(), this.f151011b.get(), this.f151012c.get());
    }
}
