package com.avito.android.advert.item.contactbar;

import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsContactBarPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f74883a;

    public f(Provider<InterfaceC28265d> provider) {
        this.f74883a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f74883a.get());
    }
}
