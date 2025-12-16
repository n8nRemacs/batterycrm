package com.avito.android.certificate_pinning.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UnsafeNetworkOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.certificate_pinning.resources.c f117842a;

    public l(com.avito.android.certificate_pinning.resources.c cVar) {
        this.f117842a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f117842a.getClass();
        return new k(new com.avito.android.certificate_pinning.resources.b());
    }
}
