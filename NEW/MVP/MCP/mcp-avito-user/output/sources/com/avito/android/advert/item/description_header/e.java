package com.avito.android.advert.item.description_header;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: AdvertDetailsDescriptionHeaderPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f75161a;

    public e(Provider<InterfaceC49101b> provider) {
        this.f75161a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f75161a.get());
    }
}
