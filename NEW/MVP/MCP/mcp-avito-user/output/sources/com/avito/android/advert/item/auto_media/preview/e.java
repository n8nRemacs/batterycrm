package com.avito.android.advert.item.auto_media.preview;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoMediaPreviewPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f72953a;

    /* renamed from: b, reason: collision with root package name */
    public final u f72954b;

    public e(u uVar, Provider provider) {
        this.f72953a = provider;
        this.f72954b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f72953a.get(), (com.avito.android.advert.item.auto_media.a) this.f72954b.get());
    }
}
