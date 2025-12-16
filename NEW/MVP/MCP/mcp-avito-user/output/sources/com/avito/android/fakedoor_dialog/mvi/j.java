package com.avito.android.fakedoor_dialog.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FakeDoorDialogOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f155147a;

    public j(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f155147a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f155147a.get());
    }
}
