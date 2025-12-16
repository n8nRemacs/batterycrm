package com.avito.android.advert.item.auto_picker_banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoPickerBannerPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f72989a;

    /* renamed from: b, reason: collision with root package name */
    public final u f72990b;

    public i(u uVar, Provider provider) {
        this.f72989a = provider;
        this.f72990b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f72989a.get(), (a) this.f72990b.get());
    }
}
