package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.util.L0;
import javax.inject.Provider;

/* compiled from: PhotoInteractorWrapper_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class v implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f102084a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<L0> f102085b;

    public v(Provider<com.avito.android.photo_cache.b> provider, Provider<L0> provider2) {
        this.f102084a = provider;
        this.f102085b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f102084a.get(), this.f102085b.get());
    }
}
