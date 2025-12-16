package com.avito.android.deeplink_events.registry;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeepLinkEventsRelay_Factory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes12.dex */
public final class b implements h<com.avito.android.deeplink_events.registry.a> {

    /* compiled from: DeepLinkEventsRelay_Factory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f134152a = new b();
    }

    public static b a() {
        return a.f134152a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.deeplink_events.registry.a();
    }
}
