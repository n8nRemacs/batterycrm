package com.avito.android.certificate_pinning.resources;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UnsafeNetworkResourceProviderImpl_Factory.java */
@e
@x
@y
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* compiled from: UnsafeNetworkResourceProviderImpl_Factory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f117855a = new c();
    }

    public static c a() {
        return a.f117855a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b();
    }
}
