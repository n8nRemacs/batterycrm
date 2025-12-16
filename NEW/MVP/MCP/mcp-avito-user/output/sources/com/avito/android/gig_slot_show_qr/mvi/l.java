package com.avito.android.gig_slot_show_qr.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigSlotShowQrOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f160909a;

    public l(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f160909a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f160909a.get());
    }
}
