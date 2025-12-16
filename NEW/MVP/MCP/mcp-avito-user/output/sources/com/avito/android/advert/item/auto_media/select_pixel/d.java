package com.avito.android.advert.item.auto_media.select_pixel;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: AdvertDetailsAutoMediaSelectPixelPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l<SimpleTestGroupWithNone>> f72969a;

    public d(Provider<l<SimpleTestGroupWithNone>> provider) {
        this.f72969a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f72969a.get());
    }
}
