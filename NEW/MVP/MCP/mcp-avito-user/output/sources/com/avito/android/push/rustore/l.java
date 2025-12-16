package com.avito.android.push.rustore;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RustorePushTokenProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f246108a;

    public l(dagger.internal.f fVar) {
        this.f246108a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((InterfaceC28373a) this.f246108a.get());
    }
}
