package com.avito.android.publish.slots.universal_beduin;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalBeduinSlotResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Resources> f245043a;

    public c(Provider<Resources> provider) {
        this.f245043a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f245043a.get());
    }
}
