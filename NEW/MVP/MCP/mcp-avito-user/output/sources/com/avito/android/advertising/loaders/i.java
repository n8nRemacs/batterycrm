package com.avito.android.advertising.loaders;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BitmapBgProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f88387a;

    public i(Provider<InterfaceC35745a5> provider) {
        this.f88387a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f88387a.get());
    }
}
